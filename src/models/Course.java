package models;

public class Course {
    public String id;
    public String name;
    public int numberOfCredits;

    @Override
    public String toString() {
        return id + ", " + name + ", " + numberOfCredits;
    }
}
