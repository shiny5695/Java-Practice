package systemDesign;

import java.util.Objects;

public class AtmMachine {


	double uniqueId;
	String city;
	int pincode;
	double availableCash;
	boolean isMachineActive;
	boolean isCashAvailable;
	boolean isMachineUnderMaintenance;
	
	public double getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(double uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public double getAvailableCash() {
		return availableCash;
	}
	public void setAvailableCash(double availableCash) {
		this.availableCash = availableCash;
	}
	public boolean isMachineActive() {
		return isMachineActive;
	}
	public void setMachineActive(boolean isMachineActive) {
		this.isMachineActive = isMachineActive;
	}
	public boolean isCashAvailable() {
		return isCashAvailable;
	}
	public void setCashAvailable(boolean isCashAvailable) {
		this.isCashAvailable = isCashAvailable;
	}
	public boolean isMachineUnderMaintenance() {
		return isMachineUnderMaintenance;
	}
	public void setMachineUnderMaintenance(boolean isMachineUnderMaintenance) {
		this.isMachineUnderMaintenance = isMachineUnderMaintenance;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(availableCash, city, isCashAvailable, isMachineActive, isMachineUnderMaintenance, pincode,
				uniqueId);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AtmMachine other = (AtmMachine) obj;
		return Double.doubleToLongBits(availableCash) == Double.doubleToLongBits(other.availableCash)
				&& Objects.equals(city, other.city) && isCashAvailable == other.isCashAvailable
				&& isMachineActive == other.isMachineActive
				&& isMachineUnderMaintenance == other.isMachineUnderMaintenance && pincode == other.pincode
				&& Double.doubleToLongBits(uniqueId) == Double.doubleToLongBits(other.uniqueId);
	}
	
	@Override
	public String toString() {
		return "AtmMachine [uniqueId=" + uniqueId + ", city=" + city + ", pincode=" + pincode + ", availableCash="
				+ availableCash + ", isMachineActive=" + isMachineActive + ", isCashAvailable=" + isCashAvailable
				+ ", isMachineUnderMaintenance=" + isMachineUnderMaintenance + "]";
	}
	
	
	
	
}
