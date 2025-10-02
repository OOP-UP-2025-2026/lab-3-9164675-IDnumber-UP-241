package org.example.task3;

public class Main {
    public static void main(String[] args) {

        IntStack stack = new IntStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Розмір стека: " + stack.size()); // 3
        System.out.println("Верхній елемент: " + stack.peek()); // 30

        int popped = stack.pop();
        System.out.println("Витягнутий елемент: " + popped); // 30

        System.out.println("Верхній елемент після pop: " + stack.peek()); // 20
        System.out.println("Розмір стека після pop: " + stack.size()); // 2

        System.out.println("Чи порожній стек? " + stack.isEmpty()); // false

        stack.clear();
        System.out.println("Стек очищено.");
        System.out.println("Чи порожній стек? " + stack.isEmpty()); // true

        try {
            stack.pop();
        } catch (RuntimeException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        try {
            stack.peek();
        } catch (RuntimeException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
