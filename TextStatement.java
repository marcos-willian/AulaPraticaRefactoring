
public class TextStatement extends Statement {
	String printHeader (Customer aCustomer) {
		return "Rental Record for " + aCustomer.getName() + "\n";
	}
	
	String showFigures(Rental thisRental) {
		return  "\t" + thisRental.getMovie().getTitle()+ "\t" + String.valueOf(thisRental.getCharge()) + "\n";
	}
	
	String printFooter(Customer aCustomer) {
		String result = "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
		 result += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
		         " frequent renter points";
		return result;
	}
}
