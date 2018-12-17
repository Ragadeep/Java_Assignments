
public class Time {
	int hours;													// variables declaration.
	int minutes;
	public Time(int hours, int minutes) {						// Constructor.
		this.hours = hours;
		this.minutes = minutes;
	}
	public Time() {
	}
	public void display() {										// For displaying Hours and Minutes.
		System.out.println(hours+" hours "+minutes+" minutes");	
	}
	public static Time sum(Time time1, Time time2) {             	// adding hours and minutes
		Time result = new Time();
		result.minutes = time1.minutes + time2.minutes;
		result.hours = result.minutes/60;							// converting minutes to hours
		result.minutes = result.minutes%60;
		result.hours += time1.hours + time2.hours;
		return result;												// return time.
	}
}
