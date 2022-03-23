package Booklab;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "author_table")
public class Author {

	@Id // primary key 101, 102, ...
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "au_id")
	private int eid;

	@Column(name = "first_name") // SQL - first_name
	private String firstName; // Java - firstName

	@Column(name = "salary")
	private double salary;

//	private Status status; // enum employeed, separated, retired, died 

	public Author() {
		super();
	}

	public Author(String firstName, double salary) {
		super();
		this.firstName = firstName;
		this.salary = salary;
	}

	public Author(int eid, String firstName, double salary) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
	}
}

