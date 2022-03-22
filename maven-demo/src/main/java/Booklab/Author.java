package Booklab;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "author_table")
public class Author {
	//@Id
	@Column(name = "au_id")
	private int authorId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "middle_name")
	private String middleName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "ph_no")
	private double phoneNo;
	Author(){
		
	}
	Author( int id, String firstname, String middlename, String lastname, long phoneno){
		super();
		this.authorId=id;
		this.firstName=firstname;
		this.middleName=middlename;
		this.lastName=lastname;
		this.phoneNo=phoneno;
	}
		public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", phoneNo=" + phoneNo + "]";
	}

	

}
