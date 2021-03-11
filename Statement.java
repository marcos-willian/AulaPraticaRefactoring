import java.util.Enumeration;
public abstract class Statement {
	
	abstract String printHeader (Customer aCustomer);
	abstract String showFigures(Rental thisRental);
	abstract String printFooter(Customer aCustomer);

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
}
