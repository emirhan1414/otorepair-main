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
@Table(name="servicePart")
public class ServicePart {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	@Column(name="id")
	private int id;
	
	@Column(name = "otoPartName")
	private String otoPartName;
	@ManyToOne()
	@JoinColumn(name="serviceCard")	
    private ServiceCard serviceCard;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "price") 
	private boolean price;
	public ServicePart() {
		super();
	}
	public ServicePart(int id, String otoPartName, ServiceCard serviceCard, int quantity, boolean price) {
		super();
		this.id = id;
		this.otoPartName = otoPartName;
		this.serviceCard = serviceCard;
		this.quantity = quantity;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOtoPartName() {
		return otoPartName;
	}
	public void setOtoPartName(String otoPartName) {
		this.otoPartName = otoPartName;
	}
	public ServiceCard getServiceCard() {
		return serviceCard;
	}
	public void setServiceCard(ServiceCard serviceCard) {
		this.serviceCard = serviceCard;
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
	
	

}
