public class HtmlStatement extends Statement {
	String printHeader (Customer aCustomer) {
		return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
	}
	
	String showFigures(Rental thisRental) {
		return thisRental.getMovie().getTitle() + ": " + String.valueOf(thisRental.getCharge()) + "<BR>\n";
	}
	
	String printFooter(Customer aCustomer) {
		String result = "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
		result += "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + 
	    		 "</EM> frequent renter points<P>";
		return result;
	}
	 
}
