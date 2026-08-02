package Assignment3;

class Restaurant {

    static int totalOrders = 0;

    double calculateBill(double foodAmount) {
        totalOrders++;
        return foodAmount;
    }

    double calculateBill(double foodAmount, double packingCharge) {
        totalOrders++;
        return foodAmount + packingCharge;
    }

    double calculateBill(double foodAmount, double packingCharge, double deliveryCharge) {
        totalOrders++;
        return foodAmount + packingCharge + deliveryCharge;
    }

    static void showOrders() {
        System.out.println("Total Orders = " + totalOrders);
    }
}

public class RestaurantBilling {

    public static void main(String[] args) {

        Restaurant r = new Restaurant();

        System.out.println("Dine-In Bill = ₹" + r.calculateBill(500));
        System.out.println("Takeaway Bill = ₹" + r.calculateBill(500, 20));
        System.out.println("Delivery Bill = ₹" + r.calculateBill(500, 20, 50));

        Restaurant.showOrders();
    }
}
