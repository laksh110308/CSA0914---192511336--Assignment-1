package Task05;

public class ParkingTicketLifecycle {

    // Static variables belong to the class
    static int nextTicketNumber = 1001;
    static int totalOccupancy = 0;

    // Static block runs once when the class is loaded
    static {
        System.out.println("Parking System Initialized");
    }

    private int ticketNumber;
    private String vehicleNumber;
    private boolean active;

    // Constructor
    public ParkingTicketLifecycle(String vehicleNumber) {
        this.ticketNumber = nextTicketNumber++;
        this.vehicleNumber = vehicleNumber;
        this.active = true;
        totalOccupancy++;
    }

    // Static method that creates and returns an object
    public static ParkingTicketLifecycle issueTicket(String vehicleNumber) {
        return new ParkingTicketLifecycle(vehicleNumber);
    }

    // Static method that receives an object
    public static void processExit(ParkingTicketLifecycle ticket) {
        if (ticket.active) {
            ticket.active = false;
            totalOccupancy--;
            System.out.println("Vehicle " + ticket.vehicleNumber + " has exited.");
        }
    }

    public void displayTicket() {
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Vehicle Number: " + vehicleNumber);
    }

    public static void main(String[] args) {

        ParkingTicketLifecycle ticket1 =
                issueTicket("TN01AB1234");

        ParkingTicketLifecycle ticket2 =
                issueTicket("TN02CD5678");

        ticket1.displayTicket();
        ticket2.displayTicket();

        System.out.println("Total Occupancy: " + totalOccupancy);

        processExit(ticket1);

        System.out.println("Total Occupancy After Exit: " + totalOccupancy);
    }
}