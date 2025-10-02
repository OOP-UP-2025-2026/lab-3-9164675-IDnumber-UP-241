package org.example.task2;

public class Order {

    private long id;
    private String customer;

    public Order(long id, String customer) {
        this.id = id;
        this.customer = customer;
    }

    public String formOrderBill(Cart cart) {

        StringBuilder builder = new StringBuilder();
        builder.append("Order number ").append(id).append(" for customer ").append(customer);
        builder.append("\n------------------\n");

        double sum = 0.0;

        Item[] items = cart.getItems();
        for (int i = 0; i < items.length; i++) {
            sum += items[i].getPrice();

            builder.append("Item id: ");
            builder.append(items[i].getId());
            builder.append(" name: ");
            builder.append(items[i].getName());
            builder.append(" price: ");
            builder.append(items[i].getPrice());
            builder.append("\n");
        }


        builder.append("------------------\n");
        builder.append("Total sum: ");
        builder.append(sum);


        return builder.toString();
    }
}
