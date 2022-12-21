package ibmtal.otorepair.dtos;

public class ServiceCardAddDto {
private String car;
private Boolean price;
private Boolean servicedate;
public ServiceCardAddDto() {
	super();
}
public ServiceCardAddDto(String car, Boolean price, Boolean servicedate) {
	super();
	this.car = car;
	this.price = price;
	this.servicedate = servicedate;
}
public String getCar() {
	return car;
}
public void setCar(String car) {
	this.car = car;
}
public Boolean getPrice() {
	return price;
}
public void setPrice(Boolean price) {
	this.price = price;
}
public Boolean getServicedate() {
	return servicedate;
}
public void setServicedate(Boolean servicedate) {
	this.servicedate = servicedate;
}
}
