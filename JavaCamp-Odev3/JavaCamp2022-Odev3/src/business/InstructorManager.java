package business;

import dataAccess.InstructorDao;
import entities.Instructor;

import java.util.logging.Logger;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao){
        this.instructorDao=instructorDao;

    }

    public void add(Instructor instructor){
        instructorDao.add(instructor);
    }
}
