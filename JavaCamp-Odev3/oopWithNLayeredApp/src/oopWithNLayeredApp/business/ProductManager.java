package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;
import java.util.ListIterator;

public class ProductManager {
    private ProductDao productDao;
    private List<Logger> loggers;

    public ProductManager(ProductDao productDao,List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws  Exception{
         if(product.getUnitPrice()<10){
             throw new Exception("Ürün fiyatı 10dan küçük olamaz");
         }
         productDao.add(product);

         for(Logger logger:loggers){
             logger.Log(product.getName());
         }
    }
}
