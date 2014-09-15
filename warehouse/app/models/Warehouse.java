package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import play.db.ebean.Model;

@Entity
public class Warehouse {

	@Id
	public Long id;
	public String name;
	
	@OneToOne
	public Address address;
	
	@OneToMany
	public List<StockItem> stock = new ArrayList<StockItem>();
	
	@ManyToMany
	public List<Employee> employees;
	
	public String toString() {
		return name;
	}
}
