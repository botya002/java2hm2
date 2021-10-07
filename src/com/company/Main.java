package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("BMW").print();
        createObject("Mazda").print();
        createObject("Mercedes").print();
        }
    private static Printable createObject(String name){
        Printable temp = null;
        switch (name){
            case "BMW":
                temp = new BMW("BMW", "Black");
                break;

            case "Mazda":
                temp = new Mazda("Mazda", 240);
                break;

            case "Mercedes":
                temp = new Mercedes("Mercedes",1/5);
                break;
            default:
                return temp;
        }
        return temp;

        }
    }

