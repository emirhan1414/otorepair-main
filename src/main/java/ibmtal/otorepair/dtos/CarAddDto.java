package ibmtal.otorepair.dtos;

import ibmtal.otorepair.entity.Customer;

public class CarAddDto {
private String plaka;
private int brand;
private String model;
private String color;
private Customer customer;
public CarAddDto() {
	super();
}
public CarAddDto(String plaka, int brand, String model, String color, Customer customer) {
	super();
	this.plaka = plaka;
	this.brand = brand;
	this.model = model;
	this.color = color;
	this.customer = customer;
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
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getColor() {
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

}
