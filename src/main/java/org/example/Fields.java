package org.example;

public class Fields {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Buddy";
        Dog dog2 = new Dog();
        dog2.name = "Charlie";
        System.out.println(dog1.name + " + " + dog2.name);
    }
}