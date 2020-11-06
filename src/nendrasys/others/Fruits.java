package nendrasys.others;

public class Fruits
{
    String name;
    int quantity;
    int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Fruits(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
