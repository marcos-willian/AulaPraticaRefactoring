public class Rental {

    private Movie _movie;
    private int _daysRented;
 
    public Rental(Movie movie, int daysRented) {
       _movie = movie;
       _daysRented = daysRented;
    }
 
    public int getDaysRented() {
       return _daysRented;
    }
 
    public Movie getMovie() {
       return _movie;
    }
    
    public double getCharge() {
    	double thisCharge = 0;
	   	switch (_movie.getPriceCode()) {
	   	  case Movie.REGULAR:
	   	     thisCharge += 2;
	   	     if (_daysRented > 2)
	   	        thisCharge += (_daysRented - 2) * 1.5;
	   	     break;
	   	  case Movie.NEW_RELEASE:
	   	     thisCharge += _daysRented * 3;
	   	     break;
	   	  case Movie.CHILDRENS:
	   	     thisCharge += 1.5;
	   	     if (_daysRented > 3)
	   	        thisCharge += (_daysRented - 3) * 1.5;
	   	      break;
	   	 }
	   	 return thisCharge;
    }
 }