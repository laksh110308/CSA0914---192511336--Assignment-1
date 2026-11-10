
package Task11;

class ParkingTicket {
    String registrationNumber;
    String vehicleType;
    int slotNumber;

    ParkingTicket(String registrationNumber, String vehicleType,
                  int slotNumber) {
        this.registrationNumber = registrationNumber;
        this.vehicleType = vehicleType;
        this.slotNumber = slotNumber;
    }
}

public class ParkingSystemTest {

    // Array stores active parking tickets
    ParkingTicket[] tickets = new ParkingTicket[2];

    public void parkVehicle(String regNo, String type, int slot) {

        if (!type.equalsIgnoreCase("Bike")
                && !type.equalsIgnoreCase("Car")) {
            System.out.println("Rejected: Unknown vehicle type.");
            return;
        }

        if (findTicket(regNo) != -1) {
            System.out.println("Rejected: Duplicate registration number.");
            return;
        }

        if (slot < 1 || slot > 2) {
            System.out.println("Rejected: Invalid slot number.");
            return;
        }

        for (ParkingTicket ticket : tickets) {
            if (ticket != null && ticket.slotNumber == slot) {
                System.out.println("Rejected: Slot is already occupied.");
                return;
            }
        }

        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] == null) {
                tickets[i] = new ParkingTicket(regNo, type, slot);
                System.out.println("Accepted: " + type + " " + regNo
                        + " parked in slot " + slot + ".");
                return;
            }
        }

        System.out.println("Rejected: Parking facility is full.");
    }

    private int findTicket(String regNo) {
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] != null
                    && tickets[i].registrationNumber.equals(regNo)) {
                return i;
            }
        }
        return -1;
    }

    public void exitVehicle(String regNo, int minutes) {

        int index = findTicket(regNo);

        if (index == -1) {
            System.out.println("Exit failed: Ticket not found.");
            return;
        }

        if (minutes < 0) {
            System.out.println("Exit failed: Invalid parking duration.");
            return;
        }

        ParkingTicket ticket = tickets[index];

        int hours = (minutes + 59) / 60;
        double rate = ticket.vehicleType.equalsIgnoreCase("Bike")
                ? 10.0 : 30.0;

        double fee = hours * rate;

        System.out.println("Exit successful: " + regNo);
        System.out.println("Parking duration: " + minutes + " minutes");
        System.out.println("Parking fee: Rs " + fee);

        tickets[index] = null;
    }

    public static void main(String[] args) {

        ParkingSystemTest system = new ParkingSystemTest();

        System.out.println("--- NORMAL OPERATION ---");
        system.parkVehicle("TN01A1", "Bike", 1);
        system.parkVehicle("TN02B2", "Car", 2);

        System.out.println("\n--- BOUNDARY CASES ---");
        system.parkVehicle("TN03C3", "Car", 1);
        system.exitVehicle("TN01A1", 60);

        // Slot 1 becomes free after the bike exits
        system.parkVehicle("TN03C3", "Car", 1);
        system.exitVehicle("TN03C3", 0);

        System.out.println("\n--- INVALID CASES ---");
        system.parkVehicle("TN04D4", "Bus", 1);
        system.parkVehicle("TN02B2", "Car", 1);
        system.parkVehicle("TN05E5", "Bike", 5);
    }
}
