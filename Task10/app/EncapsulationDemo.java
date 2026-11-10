
package Task10.app;

import Task10.model.ParkingSlot;

public class EncapsulationDemo {
    public static void main(String[] args) {

        ParkingSlot slot = new ParkingSlot(5);

        System.out.println("Slot Number: " + slot.getSlotNumber());
        System.out.println("Initially Occupied: " + slot.isOccupied());

        slot.setOccupied(true);

        System.out.println("After Allocation: " + slot.isOccupied());

        try {
            slot.setSlotNumber(-2);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation: " + e.getMessage());
        }

        // Wrapper class and autoboxing example
        Integer number1 = 1000;
        Integer number2 = 1000;

        System.out.println("Using == : " + (number1 == number2));
        System.out.println("Using equals(): " + number1.equals(number2));
    }
}
