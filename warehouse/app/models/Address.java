package models;

import javax.persistence.*;

@Entity
public class Address {

	@Id
	public Long id;
	
	@OneToOne(mappedBy = "address")
	public Warehouse warehouse;
	
	public String street;
	public String number;
	public String postalCode;
	public String city;
	public String country;
}
