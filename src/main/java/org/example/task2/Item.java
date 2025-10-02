package org.example.task2;

public class Item {

    private long id;
    private String name;
    private double price;

    private void setId(long id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID має бути > 0");
        }
        this.id = id;
    }

    private void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Назва не може бути порожньою");
        }
        this.name = name;
    }

    private void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Ціна не може бути від'ємною");
        }
        this.price = price;
    }

    public Item(long id, String name, double price) {
        this.setId(id) ;
        this.setName(name) ;
        this.setPrice(price) ;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
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
