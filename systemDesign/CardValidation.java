package systemDesign;

public interface CardValidation {

	boolean isValidPin(int pin); // check in a hashmap if the pin for a given card ID matches
	
	void isCardValid(AtmCard cardDetails); //is the card even valid
	
	void isCardActive(); //is it expired ?
	
	
	
}
