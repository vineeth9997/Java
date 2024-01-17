package BasicPrograms;

public class Product {
    private double price;
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public double getPrice(int quantity) {
        return price * quantity;
    }
    public static void main(String[] args) {

        Product product = new Product();

        product.setPrice(10.0);

        System.out.println("Price for a single quantity: $" + product.getPrice());

        System.out.println("Total price for three products " + product.getPrice(3));
    }
}
