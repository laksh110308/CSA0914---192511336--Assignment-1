
package Task04;

public class ParkingTicket {

    private String ticketNumber;
    private String vehicleNumber;
    private int floor;
    private int slot;

    // Constructor 1
    public ParkingTicket(String ticketNumber, String vehicleNumber) {
        this(ticketNumber, vehicleNumber, 0, 0);
    }

    // Constructor 2
    public ParkingTicket(String ticketNumber, String vehicleNumber,
                         int floor, int slot) {

        this.ticketNumber = ticketNumber;
        this.vehicleNumber = vehicleNumber;
        this.floor = floor;
        this.slot = slot;
    }

    // Display ticket details
    public void displayTicket() {
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Floor: " + floor);
        System.out.println("Slot: " + slot);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {

        ParkingTicket ticket1 =
            new ParkingTicket("T101", "TN01AB1234");

        ParkingTicket ticket2 =
            new ParkingTicket("T102", "TN02CD5678", 1, 5);

        ticket1.displayTicket();
        ticket2.displayTicket();
    }
}
