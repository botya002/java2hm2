package com.company;

public class BMW extends Car implements Printable{
    private String color;

    public BMW(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Цвет: " + color);
    }
}
