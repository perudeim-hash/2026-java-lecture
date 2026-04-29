package ch11.compare.Answer;

public class Product implements Comparable<Product> {

    private String Name;
    private int price;

    public Product(String name, int price) {
        Name = name;
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Name='" + Name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.price, o.price); //이건 오름차순

    }
}
