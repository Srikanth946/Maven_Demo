package lab1;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class bookTable {
	private int ISBN;
	private String title;
	private int price;
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "bookTable [ISBN=" + ISBN + ", title=" + title + ", price=" + price + "]";
	}
	

}
