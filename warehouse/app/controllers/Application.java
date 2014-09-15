package controllers;

import java.util.LinkedList;
import java.util.List;

import com.avaje.ebean.Ebean;

import models.Product;
import models.StockItem;
import models.Warehouse;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class Application extends Controller {

    public static Result index() {

    	Product product = Product.find().byId(1L);
    	Logger.info(String.format("Product name: %s", product.name));
    	Logger.info(String.format("StockItems: %d",
    	product.stockItems.size()));
        
        return ok(index.render("your new application is ready."));
    }

}