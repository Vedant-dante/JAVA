package Assignment8;

class Vehicle {

    String vehicleNumber;
    String vehicleType;

    Vehicle(String vehicleNumber, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
    }
}

class CarInsurance extends Vehicle {

    double insuranceAmount;

    CarInsurance(String vehicleNumber, String vehicleType, double insuranceAmount) {
        super(vehicleNumber, vehicleType);
        this.insuranceAmount = insuranceAmount;
    }

    void displayInsuranceDetails() {
        super.displayVehicleDetails();
        System.out.println("Insurance Amount: " + insuranceAmount);
    }
}

class BikeInsurance extends Vehicle {

    double insuranceAmount;

    BikeInsurance(String vehicleNumber, String vehicleType, double insuranceAmount) {
        super(vehicleNumber, vehicleType);
        this.insuranceAmount = insuranceAmount;
    }

    void displayInsuranceDetails() {
        super.displayVehicleDetails();
        System.out.println("Insurance Amount: " + insuranceAmount);
    }
}

public class VehicleInsurance {

    public static void main(String[] args) {

        CarInsurance car = new CarInsurance(
            "MH12AB1234",
            "Car",
            15000
        );

        BikeInsurance bike = new BikeInsurance(
            "MH14CD5678",
            "Bike",
            8000
        );

        System.out.println("Car Insurance Details");
        car.displayInsuranceDetails();

        System.out.println();

        System.out.println("Bike Insurance Details");
        bike.displayInsuranceDetails();
    }
}