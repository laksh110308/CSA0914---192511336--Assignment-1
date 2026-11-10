
package Task12;

class AdaptedParkingSystem {

    // Different slot counts for five floors
    private final int[] slotsPerFloor = {10, 15, 12, 20, 8};

    private final boolean[][] occupied = new boolean[5][];

    AdaptedParkingSystem() {
        for (int i = 0; i < slotsPerFloor.length; i++) {
            occupied[i] = new boolean[slotsPerFloor[i]];
        }
    }

    public void displayFloorCapacity() {
        System.out.println("--- PARKING FLOOR CAPACITY ---");

        for (int i = 0; i < slotsPerFloor.length; i++) {
            System.out.println("Floor " + (i + 1) + ": "
                    + slotsPerFloor[i] + " slots");
        }
    }

    public void parkVehicle(String regNo, int floor, int slot) {

        if (floor < 1 || floor > occupied.length) {
            System.out.println("Rejected: Invalid floor.");
            return;
        }

        if (slot < 1 || slot > slotsPerFloor[floor - 1]) {
            System.out.println("Rejected: Invalid slot.");
            return;
        }

        if (occupied[floor - 1][slot - 1]) {
            System.out.println("Rejected: Slot already occupied.");
            return;
        }

        occupied[floor - 1][slot - 1] = true;
        System.out.println("Accepted: " + regNo + " parked on Floor "
                + floor + ", Slot " + slot);
    }

    public double calculateFee(String type, int hours, int entryHour,
                               boolean oneDayPass) {

        if (oneDayPass) {
            return 100.0;
        }

        switch (type.toLowerCase()) {
            case "bike":
                return hours * 10.0;

            case "car":
                return hours * 30.0;

            case "electriccar":
                return hours * 50.0;

            case "ebike":
                return 25.0; // Flat fee

            case "deliveryvan":
                if (entryHour >= 9 && entryHour < 17) {
                    return hours * 60.0; // Double car rate
                }
                return hours * 30.0;

            default:
                System.out.println("Unknown vehicle type.");
                return -1.0;
        }
    }
}

public class DesignAdaptation {

    public static void main(String[] args) {

        AdaptedParkingSystem system = new AdaptedParkingSystem();

        system.displayFloorCapacity();

        System.out.println("\n--- NEW VEHICLE PARKING ---");
        system.parkVehicle("EB01A1", 4, 10);
        system.parkVehicle("DV02B2", 5, 3);

        System.out.println("\n--- NEW FEE TESTS ---");

        System.out.println("E-bike Fee: Rs "
                + system.calculateFee("ebike", 2, 10, false));

        System.out.println("Delivery Van Fee (10 AM): Rs "
                + system.calculateFee("deliveryvan", 2, 10, false));

        System.out.println("Delivery Van Fee (6 PM): Rs "
                + system.calculateFee("deliveryvan", 2, 18, false));

        System.out.println("Visitor One-Day Pass: Rs "
                + system.calculateFee("car", 5, 11, true));
    }
}
