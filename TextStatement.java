import java.util.Enumeration;
public class TextStatement extends Statement {
	public String value(Customer aCustomer) {
		 Enumeration<Rental> rentals = aCustomer.getRentals();
		 String result = printHeader(aCustomer);
		 while (rentals.hasMoreElements()) {
		    Rental each = (Rental) rentals.nextElement();
		    
		    //show figures for this rental
		    result += showFigures(each);
		 }
		 //add footer lines
		 result +=  printFooter(aCustomer);
		 return result;
	}
	
	private String printHeader (Customer aCustomer) {
		return "Rental Record for " + aCustomer.getName() + "\n";
	}
	
	private String showFigures(Rental thisRental) {
		return  "\t" + thisRental.getMovie().getTitle()+ "\t" + String.valueOf(thisRental.getCharge()) + "\n";
	}
	
	private String printFooter(Customer aCustomer) {
		String result = "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
		 result += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
		         " frequent renter points";
		return result;
	}
}
