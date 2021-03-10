public class Movie {

  public static final int  CHILDRENS = 2;
  public static final int  REGULAR = 0;
  public static final int  NEW_RELEASE = 1;

  private String _title;
  private int _priceCode;

  public Movie(String title, int priceCode) {
      _title = title;
      _priceCode = priceCode;
  }

  public int getPriceCode() {
      return _priceCode;
  }

  public void setPriceCode(int arg) {
      _priceCode = arg;
  }

  public String getTitle (){
      return _title;
  }
  
  public double getCharge(int daysRented) {
  	double thisCharge = 0;
   	switch (_priceCode) {
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
}