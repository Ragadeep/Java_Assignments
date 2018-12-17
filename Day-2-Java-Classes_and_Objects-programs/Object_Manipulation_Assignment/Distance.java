
public class Distance {	
	int feet;													// variables declaration.
	double inches;
	public Distance(int feet, double inches) {					// Constructor.
		this.feet = feet;
		this.inches = inches;
	}
	public Distance() {
	}
	public void display() {										// For displaying given values in feet and inches.
		System.out.println("feet: "+feet+" Inches: "+inches);
	}
	public static Distance sum(Distance distance1, Distance distance2) {	// Method for adding inches and feet.
		Distance result = new Distance();									// For displaying given values in feet and inches.
		result.inches  = distance1.inches + distance2.inches;
		result.feet = 0;
		if(result.inches > 12.0) {											// condition to check for converting inches to feet.
			result.inches -=  12.0;
			result.feet++;
		}
		result.feet  += distance1.feet + distance2.feet;
		return result;														// Return the distance
	}
}
