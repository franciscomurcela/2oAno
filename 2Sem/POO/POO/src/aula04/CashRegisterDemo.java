package aula04;
import java.util.ArrayList;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int  getQuantity() {
        return quantity;
    }
}


class CashRegister {
    private ArrayList<Product> products;

    public CashRegister() {
        products = new ArrayList<Product>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public double getTotalValue() {
        double total = 0;
        for (Product p : products) {
            total += p.getTotalValue();
        }
        return total;
    }

    public String toString() { 
        String s = "";
        s = "Product    Price    Quantity    Total";
        for (Product p : products) {
            s += (String)("\r\n"+p.getName() + "   " + p.getPrice() + "   " + p.getQuantity() + "   " + p.getTotalValue());
        }
        return s;
    }
}
public class CashRegisterDemo {

    public static void main(String[] args) {

        // Cria e adiciona 5 produtos
        CashRegister cr = new CashRegister();
        cr.addProduct(new Product("Book", 9.99, 3));
        cr.addProduct(new Product("Pen", 1.99, 10));
        cr.addProduct(new Product("Headphones", 29.99, 2));
        cr.addProduct(new Product("Notebook", 19.99, 5));
        cr.addProduct(new Product("Phone case", 5.99, 1));
        System.out.println(cr);

    }
}