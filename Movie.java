public class Movie {

  public static final int  CHILDRENS = 2;
  public static final int  REGULAR = 0;
  public static final int  NEW_RELEASE = 1;

  private String _title;
  private Price _price;

  public Movie(String title, int priceCode) {
      _title = title;
      setPriceCode(priceCode);
  }

  public int getPriceCode() {
      return _price.getPriceCode();
  }

  public void setPriceCode(int arg) {
	  switch (arg) {
      case REGULAR:
         _price = new RegularPrice();
         break;
      case CHILDRENS:
         _price = new ChildrensPrice();
         break;
      case NEW_RELEASE:
         _price = new NewReleasePrice();
         break;
      default:
         throw new IllegalArgumentException("Incorrect Price Code");
      }
  }

  public String getTitle (){
      return _title;
  }
  
  public double getCharge(int daysRented) {
  	double thisCharge = 0;
   	switch (_price.getPriceCode()) {
   	  case REGULAR:
   	     thisCharge += 2;
   	     if (daysRented > 2)
   	        thisCharge += (daysRented - 2) * 1.5;
   	     break;
   	  case NEW_RELEASE:
   	     thisCharge += daysRented * 3;
   	     break;	
   	  case CHILDRENS:
   	     thisCharge += 1.5;
   	     if (daysRented > 3)
   	        thisCharge += (daysRented - 3) * 1.5;
   	     break;
   	 }
   	 return thisCharge;
  }
  
  public int getFrequentRenterPoints(int daysRented) { 
  	if ((_price.getPriceCode() == NEW_RELEASE) && daysRented > 1) {
  		return 2;
  	}else {
  		return 1;
  	}
  }
}