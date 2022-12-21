package ibmtal.otorepair.dtos;

public class CustomerUpdateDto {
private int id;
private String name;
private String surname;
private int phone;
public CustomerUpdateDto() {
	super();
}
public CustomerUpdateDto(int id, String name, String surname, int phone) {
	super();
	this.id = id;
	this.name = name;
	this.surname = surname;
	this.phone = phone;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
};

}
