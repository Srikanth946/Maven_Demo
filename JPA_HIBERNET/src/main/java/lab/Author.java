package lab;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {
	@Id
	private int authorId;
	private fullName name;
	private double no;
	public int getAuthorId() {
		return authorId;
	}
	Author(){
		
	}
	Author(int id, fullName name, double no){
		this.authorId=id;
		this.name=name;
		this.no=no;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public fullName getName() {
		return name;
	}
	public void setName(fullName name) {
		this.name = name;
	}
	public double getNo() {
		return no;
	}
	public void setNo(double no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", name=" + name + ", no=" + no + "]";
	}
	

}
