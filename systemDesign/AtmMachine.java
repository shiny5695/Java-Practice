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
	int hundreds;
	int fiveHundreds;
	int oneThousands;
	int twoThousands;
	
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
	public int getHundreds() {
		return hundreds;
	}
	public void setHundreds(int hundreds) {
		this.hundreds = hundreds;
	}
	public int getFiveHundreds() {
		return fiveHundreds;
	}
	public void setFiveHundreds(int fiveHundreds) {
		this.fiveHundreds = fiveHundreds;
	}
	public int getOneThousands() {
		return oneThousands;
	}
	public void setOneThousands(int oneThousands) {
		this.oneThousands = oneThousands;
	}
	public int getTwoThousands() {
		return twoThousands;
	}
	public void setTwoThousands(int twoThousands) {
		this.twoThousands = twoThousands;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(availableCash, city, fiveHundreds, hundreds, isCashAvailable, isMachineActive,
				isMachineUnderMaintenance, oneThousands, pincode, twoThousands, uniqueId);
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
				&& Objects.equals(city, other.city) && fiveHundreds == other.fiveHundreds && hundreds == other.hundreds
				&& isCashAvailable == other.isCashAvailable && isMachineActive == other.isMachineActive
				&& isMachineUnderMaintenance == other.isMachineUnderMaintenance && oneThousands == other.oneThousands
				&& pincode == other.pincode && twoThousands == other.twoThousands
				&& Double.doubleToLongBits(uniqueId) == Double.doubleToLongBits(other.uniqueId);
	}
	
	@Override
	public String toString() {
		return "AtmMachine [uniqueId=" + uniqueId + ", city=" + city + ", pincode=" + pincode + ", availableCash="
				+ availableCash + ", isMachineActive=" + isMachineActive + ", isCashAvailable=" + isCashAvailable
				+ ", isMachineUnderMaintenance=" + isMachineUnderMaintenance + ", hundreds=" + hundreds
				+ ", fiveHundreds=" + fiveHundreds + ", oneThousands=" + oneThousands + ", twoThousands=" + twoThousands
				+ "]";
	}
	
	
}
