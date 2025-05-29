package com.medialibrary.domain;

public abstract class Person {
    private final String name;
    private final String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person [Name: " + this.name +
                "\nID: " + this.id +
                "]";
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
