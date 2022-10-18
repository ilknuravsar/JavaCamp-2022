package dataAccess;

import entities.Instructor;

public class HibernateInstructerDao implements  InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor Hibernate eklendi");
    }
}
