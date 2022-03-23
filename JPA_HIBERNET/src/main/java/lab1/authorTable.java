package lab1;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class authorTable {
	private int ID;
	private String Name;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "authorTable [ID=" + ID + ", Name=" + Name + "]";
	}
	

}
