package maven.demo.JPA;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "book_author_table")
public class BookAuthorTable {
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