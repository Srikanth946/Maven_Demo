package maven.demo.JPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "author_table")
public class AuthorTable {
	@Id
	@Column(name = "aid")
	private int id;
	@Override
	public String toString() {
		return "AuthorTable [id=" + id + ", name=" + name + "]";
	}

	@Column(name = "aname")
	private String name;
	
	public AuthorTable() {
		super();
	}

	public AuthorTable(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
}
