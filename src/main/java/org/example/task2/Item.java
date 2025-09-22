package org.example.task2;

public class Item {

    public long id;
    public String name;
    public double price;

    public Item(long _id, String _name, double _price) {
        this.id = _id;
        this.name = _name;
        this.price = _price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}' + "\n";
    }
}
