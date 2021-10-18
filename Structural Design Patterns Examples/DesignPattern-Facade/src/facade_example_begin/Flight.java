package facade_example_begin;

import java.time.LocalDate;

public class Flight {
	
	public void bookOutwardJourney(LocalDate start) {
		System.out.println("Outbound flight booked for " + start);
	}
	
	public void bookReturnJourney(LocalDate end) {
		System.out.println("Outbound flight booked for " + end);
	}
}
