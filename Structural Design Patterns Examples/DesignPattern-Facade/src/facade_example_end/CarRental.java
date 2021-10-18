package facade_example_end;

import java.time.LocalDate;

public class CarRental {

	public void book(LocalDate start, LocalDate end) {
		System.out.println("Booking car for " + start + " to " + end);
	}
}
