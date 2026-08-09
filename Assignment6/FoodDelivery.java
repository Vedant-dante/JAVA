package Assignment6;

interface DeliveryStatus {
    void updateStatus();
}

public class FoodDelivery {

    private String customerName;
    private String foodItem;
    private double price;

    FoodDelivery(String customerName, String foodItem, double price) {
        this.customerName = customerName;
        this.foodItem = foodItem;
        this.price = price;
    }

    class OrderDetails {
        void displayOrder() {
            System.out.println("Customer Name: " + customerName);
            System.out.println("Food Item: " + foodItem);
            System.out.println("Price: " + price);
        }
    }

    public static void main(String[] args) {

        FoodDelivery order = new FoodDelivery("Rahul", "Pizza", 299.00);

        FoodDelivery.OrderDetails details = order.new OrderDetails();
        details.displayOrder();

        DeliveryStatus preparing = new DeliveryStatus() {
            public void updateStatus() {
                System.out.println("Order is being prepared.");
            }
        };

        DeliveryStatus delivered = new DeliveryStatus() {
            public void updateStatus() {
                System.out.println("Order has been delivered.");
            }
        };

        preparing.updateStatus();
        delivered.updateStatus();
    }
}