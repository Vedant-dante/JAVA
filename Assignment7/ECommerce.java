package Assignment7;

interface Product {

    void displayProduct();

    double calculatePrice();
}

class ElectronicProduct implements Product {

    String name;
    double price;

    ElectronicProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Electronic Product: " + name);
        System.out.println("Price: " + price);
    }

    public double calculatePrice() {
        return price + (price * 0.18);
    }
}

class ClothingProduct implements Product {

    String name;
    double price;

    ClothingProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Clothing Product: " + name);
        System.out.println("Price: " + price);
    }

    public double calculatePrice() {
        return price + (price * 0.05);
    }
}

class GroceryProduct implements Product {

    String name;
    double price;

    GroceryProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Grocery Product: " + name);
        System.out.println("Price: " + price);
    }

    public double calculatePrice() {
        return price + (price * 0.02);
    }
}

public class ECommerce {

    public static void main(String[] args) {

        ElectronicProduct electronic =
                new ElectronicProduct("Laptop", 50000);

        ClothingProduct clothing =
                new ClothingProduct("T-Shirt", 1000);

        GroceryProduct grocery =
                new GroceryProduct("Rice", 500);

        electronic.displayProduct();
        System.out.println("Final Price: " + electronic.calculatePrice());

        System.out.println();

        clothing.displayProduct();
        System.out.println("Final Price: " + clothing.calculatePrice());

        System.out.println();

        grocery.displayProduct();
        System.out.println("Final Price: " + grocery.calculatePrice());
    }
}

