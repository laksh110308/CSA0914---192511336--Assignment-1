
package Task08;

interface Chargeable {
    double chargingFee(int kWh);
}

abstract class Vehicle {
    private final String regNo;

    Vehicle(String regNo) {
        this.regNo = regNo;
    }

    public String getRegNo() {
        return regNo;
    }

    protected abstract double ratePerHour();

    // Runtime polymorphism: subclasses provide their own rate
    public double calculateFee(int minutes) {
        int hours = (minutes + 59) / 60;
        return hours * ratePerHour();
    }

    // Compile-time polymorphism: overloaded method
    public double calculateFee(int minutes, boolean monthlyPass) {
        if (monthlyPass) {
            return 0.0;
        }
        return calculateFee(minutes);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Vehicle
                && regNo.equals(((Vehicle) o).regNo);
    }

    @Override
    public int hashCode() {
        return regNo.hashCode();
    }
}

class TwoWheeler extends Vehicle {
    TwoWheeler(String regNo) {
        super(regNo);
    }

    @Override
    protected double ratePerHour() {
        return 10.0;
    }
}

class Car extends Vehicle {
    Car(String regNo) {
        super(regNo);
    }

    @Override
    protected double ratePerHour() {
        return 30.0;
    }
}

class ElectricCar extends Vehicle implements Chargeable {
    ElectricCar(String regNo) {
        super(regNo);
    }

    @Override
    protected double ratePerHour() {
        return 50.0;
    }

    @Override
    public double chargingFee(int kWh) {
        return kWh * 6.0;
    }
}

public class FeeDemo {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new TwoWheeler("TN01A1"),
            new Car("TN02B2"),
            new ElectricCar("TN03C3")
        };

        for (Vehicle v : vehicles) {
            double fee = v.calculateFee(130);

            if (v instanceof Chargeable c) {
                fee += c.chargingFee(10);
            }

            System.out.println(
                v.getClass().getSimpleName() + " "
                + v.getRegNo() + " -> Rs " + fee
            );
        }

        // Compile-time polymorphism through method overloading
        Vehicle car = new Car("TN04D4");
        System.out.println(
            "Monthly Pass Fee: Rs " + car.calculateFee(130, true)
        );

        System.out.println(
            new Car("TN02B2").equals(
                new ElectricCar("TN02B2")
            )
        );
    }
}
