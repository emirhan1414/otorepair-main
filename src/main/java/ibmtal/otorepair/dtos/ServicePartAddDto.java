package ibmtal.otorepair.dtos;

import ibmtal.otorepair.entity.ServiceCard;

public class ServicePartAddDto {
private String otoPartName;
private int quantity;
private boolean price;
private ServiceCard serviceCard;
public ServicePartAddDto() {
	super();
}
public ServicePartAddDto(String otoPartName, int quantity, boolean price, ServiceCard serviceCard) {
	super();
	this.otoPartName = otoPartName;
	this.quantity = quantity;
	this.price = price;
	this.serviceCard = serviceCard;
}
public String getOtoPartName() {
	return otoPartName;
}
public void setOtoPartName(String otoPartName) {
	this.otoPartName = otoPartName;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public boolean isPrice() {
	return price;
}
public void setPrice(boolean price) {
	this.price = price;
}
public ServiceCard getServiceCard() {
	return serviceCard;
}
public void setServiceCard(ServiceCard serviceCard) {
	this.serviceCard = serviceCard;
}
}
