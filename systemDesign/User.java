package systemDesign;

import java.util.Objects;

public class User {

	String name;
	double uniqueID;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(double uniqueID) {
		this.uniqueID = uniqueID;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, uniqueID);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(uniqueID) == Double.doubleToLongBits(other.uniqueID);
	}
	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", uniqueID=" + uniqueID + "]";
	}
	
	
	
	
	
}
