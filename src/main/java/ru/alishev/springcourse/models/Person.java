package ru.alishev.springcourse.models;

public class Person {
    private int id;
    private String name;

    public Person(int i, String name) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
