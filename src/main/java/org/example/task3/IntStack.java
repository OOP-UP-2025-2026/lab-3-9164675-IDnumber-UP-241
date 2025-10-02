package org.example.task3;

public class IntStack {

    private int[] stack;   // внутрішній масив (не видно зовні)
    private int top;       // індекс вершини стека
    private static final int INITIAL_CAPACITY = 10; // початковий розмір масиву

    // Конструктор без параметрів
    public IntStack() {
        stack = new int[INITIAL_CAPACITY];
        top = 0; // стек порожній
    }

    // Додати елемент у стек
    public void push(int value) {
        // якщо масив заповнений — подвоїмо розмір
        if (top == stack.length) {
            resize();
        }
        stack[top] = value;
        top++;
    }

    // Вилучити елемент зі стека
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Стек порожній! Неможливо виконати pop().");
        }
        top--;
        return stack[top];
    }

    // Переглянути верхній елемент
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Стек порожній! Неможливо виконати peek().");
        }
        return stack[top - 1];
    }

    // Кількість елементів у стеку
    public int size() {
        return top;
    }

    // Перевірка чи стек порожній
    public boolean isEmpty() {
        return top == 0;
    }

    // Очистити стек
    public void clear() {
        top = 0;
        // за бажанням можна очистити масив, але не обов'язково
        // for (int i = 0; i < stack.length; i++) stack[i] = 0;
    }

    // Приватний метод для збільшення масиву
    private void resize() {
        int newCapacity = stack.length * 2;
        int[] newStack = new int[newCapacity];
        System.arraycopy(stack, 0, newStack, 0, stack.length);
        stack = newStack;
    }
}