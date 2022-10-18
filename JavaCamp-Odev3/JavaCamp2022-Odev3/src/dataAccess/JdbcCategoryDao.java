package dataAccess;

import core.logging.BaseLogger;
import entities.Category;

public class JdbcCategoryDao implements  CategoryDao{
    public JdbcCategoryDao() {
    }

    @Override
    public void add(Category category) {
        System.out.println("Jdbc category eklendi");
    }
}
