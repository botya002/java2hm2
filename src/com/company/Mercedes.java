package com.company;

public class Mercedes extends Car implements Printable{

    private int volume;

    public Mercedes(String name, int volume) {
        super(name);
        this.volume = volume;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Объем: " + volume);
    }
}
