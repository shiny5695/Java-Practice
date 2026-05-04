package systemDesign;

import java.util.Date;
import java.util.Objects;

public class AtmCard {

	long atmcardID;
	
	int pin;
	
	int cvv;
	
	Date expiryDate;

	public long getAtmcardID() {
		return atmcardID;
	}

	public void setAtmcardID(long atmcardID) {
		this.atmcardID = atmcardID;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(atmcardID, cvv, expiryDate, pin);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AtmCard other = (AtmCard) obj;
		return atmcardID == other.atmcardID && cvv == other.cvv && Objects.equals(expiryDate, other.expiryDate)
				&& pin == other.pin;
	}

	@Override
	public String toString() {
		return "AtmCard [atmcardID=" + atmcardID + ", pin=" + pin + ", cvv=" + cvv + ", expiryDate=" + expiryDate + "]";
	}
	
	
}
