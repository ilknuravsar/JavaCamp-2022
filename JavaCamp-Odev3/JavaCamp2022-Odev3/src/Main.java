import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.BaseLogger;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.MailLogger;
import dataAccess.HibernateInstructerDao;
import dataAccess.JdbcCategoryDao;
import dataAccess.JdbcCourseDao;
import dataAccess.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;


import java.util.logging.Logger;

public class Main {
    public static void main (String[] args) throws Exception {
        Course course = new Course(1,"Engin Demiroğ", "Java",4500);

        CourseManager courseManager=new CourseManager(new JdbcCourseDao());
        courseManager.add(course);


        Category category1= new Category(1,"Yazılım Geliştirme-OOP");

        CategoryManager categoryManager= new CategoryManager(new JdbcCategoryDao());
        categoryManager.add(category1);

        Instructor ınstructor1= new Instructor(1,"Engin Demiroğ");

        InstructorManager instructorManager= new InstructorManager (new HibernateInstructerDao());
        instructorManager.add(ınstructor1);
    }
}