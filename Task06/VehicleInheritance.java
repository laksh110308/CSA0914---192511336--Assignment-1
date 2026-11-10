
package Task06;

class Vehicle {
    protected String vehicleNumber;

    Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        System.out.println("Vehicle constructor called");
    }

    void display() {
        System.out.println("Vehicle Number: " + vehicleNumber);
    }
}

class Car extends Vehicle {
    protected String carType;

    Car(String vehicleNumber, String carType) {
        super(vehicleNumber);
        this.carType = carType;
        System.out.println("Car constructor called");
    }

    void displayCar() {
        System.out.println("Car Type: " + carType);
    }
}

class ElectricCar extends Car {
    private int batteryCapacity;

    ElectricCar(String vehicleNumber, String carType, int batteryCapacity) {
        super(vehicleNumber, carType);
        this.batteryCapacity = batteryCapacity;
        System.out.println("ElectricCar constructor called");
    }

    void displayElectricCar() {
        display();
        displayCar();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

public class VehicleInheritance {
    public static void main(String[] args) {

        ElectricCar ev = new ElectricCar("TN01AB1234", "Sedan", 60);

        System.out.println("\n--- Electric Car Details ---");
        ev.displayElectricCar();
    }
}
