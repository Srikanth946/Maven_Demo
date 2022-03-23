package lab1;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class BookTable {

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)  
	private int isbn;
	private String title;
	private double price;
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookTable [isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}
	
	 
			 
	 
	 
}