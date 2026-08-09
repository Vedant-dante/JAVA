package Assignment6;

interface VehicleAction {
    void start();
}

public class Vehicle {

    private String vehicleName;
    private String vehicleNumber;

    Vehicle(String vehicleName, String vehicleNumber) {
        this.vehicleName = vehicleName;
        this.vehicleNumber = vehicleNumber;
    }

    class VehicleDetails {
        void displayDetails() {
            System.out.println("Vehicle Name: " + vehicleName);
            System.out.println("Vehicle Number: " + vehicleNumber);
        }
    }

    public static void main(String[] args) {

        Vehicle v = new Vehicle("Toyota", "MH12AB1234");

        VehicleDetails details = v.new VehicleDetails();
        details.displayDetails();

        VehicleAction action = new VehicleAction() {
            public void start() {
                System.out.println("Vehicle is starting...");
            }
        };

        action.start();
    }
}