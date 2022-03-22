package Booklab;

import javax.persistence.Table;

@Table(name = "book_author_table")
public class BookAuthorTable {
	private BookTable book;
	private Author author;
	
	public BookAuthorTable() {
		super();
	}

	public BookAuthorTable(BookTable book, Author author) {
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

	public Author getAuthor() {
		return author;
	}
}