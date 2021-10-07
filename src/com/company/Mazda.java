package com.company;

public class Mazda extends Car implements Printable{

    private int speed;

    public Mazda(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Скорость: " + speed);
    }
}
