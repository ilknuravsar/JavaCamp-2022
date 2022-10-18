package business;

import dataAccess.CourseDao;
import entities.Course;

import java.util.List;
import java.util.ListResourceBundle;
import java.util.logging.Logger;

public class CourseManager {
    private CourseDao courseDao;
    private List<Logger> loggers;

    public CourseManager(CourseDao courseDao){
        this.courseDao = courseDao;

    }

    public void add(Course course) throws  Exception{
        if(course.getPrice()<0 && course.getCourseName() != course.getCourseName()){
            throw  new Exception("Kurs fiyatı 0dan küçük olamaz ve aynı kurs ismi olamaz");
        }
        courseDao.add(course);



}
}
