package maven.demo.JPA;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "book_author_table")
public class BookAuthorTable {
	@Id
	private int l_id;
	public int getL_id() {
		return l_id;
	}

	public void setL_id(int l_id) {
		this.l_id = l_id;
	}

	public void setAuthor(AuthorTable author) {
		this.author = author;
	}

	private BookTable book;
	private AuthorTable author;
	
	public BookAuthorTable() {
		super();
	}

	public BookAuthorTable(BookTable book, AuthorTable author) {
		super();
		this.book = book;
		this.author = author;
	}

	public BookTable getBook() {
		return book;
	}

	public void setBook(BookTable book) {
		this.book = book;
	}

	public AuthorTable getAuthor() {
		return author;
	}
}