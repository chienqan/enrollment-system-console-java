package models;

public class Student {
    public String id;
    public String name;
    public int age;

    @Override
    public String toString() {
        return id + ", " + name + ", " + age;
    }
}
