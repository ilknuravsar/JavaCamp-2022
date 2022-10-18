package business;

import dataAccess.CategoryDao;
import entities.Category;

import java.util.logging.Logger;

public class CategoryManager {
private CategoryDao categoryDao;
private Logger[] loggers;
    public CategoryManager(CategoryDao categoryDao){
        this.categoryDao = categoryDao;
    }
    public void add(Category category) throws  Exception{
        if(category.getCategoryName() != category.getCategoryName()){
            throw  new Exception("Kategori adı aynı olmamalı.");
        }
        categoryDao.add(category);
    }
    }

