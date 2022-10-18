package entities;

import java.util.logging.LogRecord;

public class Course {
    int id;
    String instructor;
    String courseName;
    double price;

    public Course(int id, String instructor, String courseName, double price) {
        this.id = id;
        this.instructor = instructor;
        this.courseName = courseName;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    public Course() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

}
