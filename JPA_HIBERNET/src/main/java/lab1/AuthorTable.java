package lab1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity  
public class AuthorTable { 
	@Id  
	//@GeneratedValue(strategy=GenerationType.AUTO)  
	private int a_id;  
	private String a_name;
	@ManyToMany
	private List<BookTable> author = new ArrayList();
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String a_name) {
		this.a_name = a_name;
	}
	public List<BookTable> getAuthor() {
		return author;
	}
	public void setAuthor(List<BookTable> author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "AuthorTable [a_id=" + a_id + ", a_name=" + a_name + ", author=" + author + "]";
	}
	

		
	
	
}