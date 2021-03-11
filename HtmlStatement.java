import java.util.Enumeration;
public class HtmlStatement extends Statement {
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
		return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
	}
	
	private String showFigures(Rental thisRental) {
		return thisRental.getMovie().getTitle() + ": " + String.valueOf(thisRental.getCharge()) + "<BR>\n";
	}
	
	private String printFooter(Customer aCustomer) {
		String result = "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
		result += "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + 
	    		 "</EM> frequent renter points<P>";
		return result;
	}
	 
}
