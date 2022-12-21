package ibmtal.otorepair.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class Car {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	@Column(name="id")
	private int id;
	@Column(name = "plaka")
	private String plaka;
	@Column(name = "brand")
	private int brand;
	@Column(name = "model")
	private String model;
	@Column(name = "color")
	private String color;
	@ManyToOne()
	@JoinColumn(name="customer")
	private Customer customer;
	public Car() {
		super();
	}
	public Car(int id, String plaka, int brand, String model, String color, Customer customer) {
		super();
		this.id = id;
		this.plaka = plaka;
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlaka() {
		return plaka;
	}
	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}
	public int getBrand() {
		return brand;
	}
	public void setBrand(int brand) {
		this.brand = brand;
	}
	public String getModel(String string) {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor(String string) {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Car get() {
		// TODO Auto-generated method stub
		return null;
	}
	
	}
	
	

