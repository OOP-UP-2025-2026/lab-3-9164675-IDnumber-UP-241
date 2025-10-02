package org.example.task2;

import java.util.Arrays;

public class Cart {

    private Item[] contents;
    private int index;

    public Cart(int capacity) {
        this.contents = new Item[capacity];
        this.index = 0;
    }

    public void removeById(long itemId) {

        if (index == 0)
            return;

        int foundItemIndex = findItemIndexById(itemId);

        if (foundItemIndex == -1)
            return;

        if (foundItemIndex == index - 1) {
            contents[index - 1] = null;
            index--;
            return;
        }

        shiftArray(foundItemIndex);
    }

    private void shiftArray(int itemIndex) {
        for (int i = itemIndex; i < index - 1; i++) {
            contents[i] = contents[i + 1];
        }
        contents[index - 1] = null;
        index--;
    }

    private int findItemIndexById(long itemId) {
        for (int i = 0; i < index; i++) {
            if (contents[i].getId() == itemId) {
                return i;
            }
        }
        return -1;
    }

    public void add(Item item) {
        if (isCartFull())
            return;

        this.contents[this.index] = item;
        this.index++;
    }

    public boolean isCartFull() {
        return index == contents.length;
    }

    public Item[] getItems() {
        return Arrays.copyOf(contents, index);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "contents=" + Arrays.toString(contents) +
                '}' + "\n";
    }
}
