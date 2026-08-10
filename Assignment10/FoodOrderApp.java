package Assignment10;

abstract class FoodOrder {

    double foodPrice;

    FoodOrder(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    abstract double calculateBill();

    void displayBill() {
        System.out.println("Food Price: " + foodPrice);
        System.out.println("Total Bill: " + calculateBill());
    }
}

class DineInOrder extends FoodOrder {

    DineInOrder(double foodPrice) {
        super(foodPrice);
    }

    double calculateBill() {
        return foodPrice + 50;
    }
}

class TakeAwayOrder extends FoodOrder {

    TakeAwayOrder(double foodPrice) {
        super(foodPrice);
    }

    double calculateBill() {
        return foodPrice + 30;
    }
}

public class FoodOrderApp {

    public static void main(String[] args) {

        FoodOrder dineIn = new DineInOrder(500);

        System.out.println("Dine-In Order");
        dineIn.displayBill();

        System.out.println();

        FoodOrder takeAway = new TakeAwayOrder(500);

        System.out.println("Take-Away Order");
        takeAway.displayBill();
    }
}