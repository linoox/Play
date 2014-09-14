package controllers;

import java.util.Set;

import models.Product;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.products.list;
import views.html.products.show;

public class Products extends Controller{
	
	private static final Form<Product> productForm = Form.form(Product.class);
	
	// list all products
	public static Result list() {
		Set<Product> products = Product.findAll();
		return ok(list.render(products));
	}
	
	// show a blank page
	public static Result showBlank() {
		return ok(show.render(productForm));
	}
	
	public static Result show(Long ean) {
		return TODO;
	}
	
	// save the product
	public static Result save() {
		Form<Product> boundForm = productForm.bindFromRequest();
		Product product = boundForm.get();
		Product.add(product);
		return ok(String.format("saved product %s", product));
	}
}
