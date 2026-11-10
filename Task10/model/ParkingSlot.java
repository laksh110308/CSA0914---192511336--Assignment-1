
package Task10.model;

public class ParkingSlot {
    private int slotNumber;
    private boolean occupied;

    public ParkingSlot(int slotNumber) {
        setSlotNumber(slotNumber);
        this.occupied = false;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setSlotNumber(int slotNumber) {
        if (slotNumber <= 0) {
            throw new IllegalArgumentException(
                "Slot number must be positive."
            );
        }
        this.slotNumber = slotNumber;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
