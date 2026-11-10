
package Task09;

abstract class Vehicle {
    private final String regNo;

    Vehicle(String regNo) {
        this.regNo = regNo;
    }

    public String getRegNo() {
        return regNo;
    }

    // Every vehicle must provide its own fee calculation
    public abstract double calculateFee(int hours);
}

interface Chargeable {
    double chargingFee(int units);

    // Default method
    default void displayChargingMessage() {
        System.out.println("This vehicle supports battery charging.");
    }

    // Static method
    static double getRatePerUnit() {
        return 6.0;
    }
}

interface Payable {
    void makePayment(double amount);

    default void displayPaymentMessage() {
        System.out.println("Payment facility is available.");
    }
}

class ElectricCar extends Vehicle implements Chargeable, Payable {

    ElectricCar(String regNo) {
        super(regNo);
    }

    @Override
    public double calculateFee(int hours) {
        return hours * 50.0;
    }

    @Override
    public double chargingFee(int units) {
        return units * Chargeable.getRatePerUnit();
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Payment received: Rs " + amount);
    }
}

public class AbstractInterfaceDemo {
    public static void main(String[] args) {

        ElectricCar car = new ElectricCar("TN03C3");

        System.out.println("Vehicle Number: " + car.getRegNo());
        System.out.println("Parking Fee: Rs " + car.calculateFee(2));

        car.displayChargingMessage();
        System.out.println("Charging Fee: Rs " + car.chargingFee(10));

        car.displayPaymentMessage();
        car.makePayment(100.0);
    }
}
