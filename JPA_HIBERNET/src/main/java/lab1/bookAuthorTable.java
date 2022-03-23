package lab1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity(name="Library")
public class bookAuthorTable {
	@Id
	private int lib_id;
	public int getId() {
		return lib_id;
	}
	public authorTable getAuthor() {
		return author;
	}
	public void setAuthor(authorTable author) {
		this.author = author;
	}
	public bookTable getBook() {
		return book;
	}
	public void setBook(bookTable book) {
		this.book = book;
	}
	public void setId(int id) {
		this.lib_id = id;
	}
	private authorTable author;
	private bookTable book ;
	
	
	

}
