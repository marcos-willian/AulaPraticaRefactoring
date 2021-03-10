public abstract class Price {
	public abstract int getPriceCode();
	public double getCharge(int daysRented) {
	  	double thisCharge = 0;
	   	switch (getPriceCode()) {
	   	  case Movie.REGULAR:
	   	     thisCharge += 2;
	   	     if (daysRented > 2)
	   	        thisCharge += (daysRented - 2) * 1.5;
	   	     break;
	   	  case Movie.NEW_RELEASE:
	   	     thisCharge += daysRented * 3;
	   	     break;	
	   	  case Movie.CHILDRENS:
	   	     thisCharge += 1.5;
	   	     if (daysRented > 3)
	   	        thisCharge += (daysRented - 3) * 1.5;
	   	     break;
	   	 }
	   	 return thisCharge;
	  }
}
