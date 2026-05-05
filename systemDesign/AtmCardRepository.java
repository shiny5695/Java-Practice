package systemDesign;

public interface AtmCardRepository {

	void insertCard();
	
	double checkBalance();
	
	double withDrawCash();
	
	boolean changePin();
}
