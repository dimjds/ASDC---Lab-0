import java.io.BufferedReader;
import java.io.IOException;
import java.util.Formatter;

public class Products {
    private String id;
    private String name;
    private String price;
    private String brand;
    private int quantity;

    public Products() {
        id = "None";
        name = "None";
        price = "None";
        brand = "None";
        quantity = 0;
    }

    public Products(Products other) {
        id = other.id;
        name = other.name;
        price = other.price;
        brand = other.brand;
        quantity = other.quantity;
    }

    public Products clone() {
        return new Products(this);
    }

    public boolean equal(Products other) {
        return (id.equals(other.id) &&
                name.equals(other.name) &&
                price.equals(other.price) &&
                brand.equals(other.brand) &&
                quantity == other.quantity);
    }

    public void readingFile(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        String[] fields = line.split(",");

        id = fields[0];
        name = fields[1];
        price = fields[2];
        brand = fields[3];
        quantity = Integer.parseInt(fields[4]);
    }

    public void writeElement() {
        System.out.println(id + ", " +
                name + ", " +
                price + ", " +
                brand + ", " +
                quantity + ", ");
    }

    public void writeTable(Formatter formatter) {
        formatter.format("%-15s %-15s %-15s %-15s %-10d\n", id, name, price, brand, quantity);
    }
}
