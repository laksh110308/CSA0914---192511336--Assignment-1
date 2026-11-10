
package Task07;

class Vehicle {
    private final String regNo;

    Vehicle(String regNo) {
        this.regNo = regNo;
    }

    public final String getRegNo() {
        return regNo;
    }

    public double calculateFee(int hours) {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Vehicle Registration Number: " + regNo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Vehicle)) {
            return false;
        }

        Vehicle other = (Vehicle) obj;
        return regNo.equals(other.regNo);
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
    public double calculateFee(int hours) {
        return hours * 10.0;
    }
}

class Car extends Vehicle {
    Car(String regNo) {
        super(regNo);
    }

    @Override
    public double calculateFee(int hours) {
        return hours * 30.0;
    }
}

class ElectricCar extends Vehicle {
    ElectricCar(String regNo) {
        super(regNo);
    }

    @Override
    public double calculateFee(int hours) {
        return hours * 50.0;
    }
}

public class VehicleFeeOverriding {
    public static void main(String[] args) {

        Vehicle bike = new TwoWheeler("TN01A1");
        Vehicle car = new Car("TN02B2");
        Vehicle electricCar = new ElectricCar("TN03C3");

        System.out.println(bike);
        System.out.println("Two-Wheeler Fee: Rs " + bike.calculateFee(2));

        System.out.println(car);
        System.out.println("Car Fee: Rs " + car.calculateFee(2));

        System.out.println(electricCar);
        System.out.println("Electric Car Fee: Rs " + electricCar.calculateFee(2));

        Car car1 = new Car("TN04D4");
        ElectricCar car2 = new ElectricCar("TN04D4");

        System.out.println("Are both vehicles equal? " + car1.equals(car2));
        System.out.println("Hash codes are equal? " +
                (car1.hashCode() == car2.hashCode()));
    }
}
