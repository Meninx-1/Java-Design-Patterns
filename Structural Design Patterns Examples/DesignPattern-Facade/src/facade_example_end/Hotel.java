package facade_example_end;

import java.time.LocalDate;

public class Hotel {

	public void book(LocalDate checkingDate, LocalDate checkoutDate) {
		System.out.println("Booking hotel for " + checkingDate + " to " + checkoutDate);
	}
}
