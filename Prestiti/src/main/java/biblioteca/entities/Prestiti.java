package biblioteca.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Prestiti implements Comparable<Prestiti>{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String orderId;
	private String customer;
	private String libro;
	
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getLibro() {
		return libro;
	}
	public void setLibri(String libro) {
		this.libro = libro;
	}
	@Override
	public String toString() {
		return "Prestito [orderId=" + orderId + ", customer=" + customer + ", libro=" + libro + " + ]";
	}
	@Override
	public int compareTo(Prestiti p) {
		// TODO Auto-generated method stub
		return this.customer.compareTo(p.customer);
	}
	
}
