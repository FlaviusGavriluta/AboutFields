package org.example;

public class Dog {
    String name; // This is an instance field
    static int dogCount; // This is a static field

    public Dog() {
        dogCount++;
    }
}