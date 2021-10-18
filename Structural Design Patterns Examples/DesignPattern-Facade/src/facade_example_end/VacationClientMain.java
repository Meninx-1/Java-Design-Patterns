package facade_example_end;

import java.time.LocalDate;

//Simply put, a facade encapsulates a complex subsystem behind a simple interface.
//It hides much of the complexity and makes the subsystem easy to use.
// A facade is used to allow the user to perform complex processes with simple actions
public class VacationClientMain {

	public static void main(String[] args) {
		LocalDate startDate = LocalDate.of(2021, 8, 1);
		LocalDate endDate = LocalDate.of(2021, 8, 15);
		
		// Using the Facade Class to hide the complexity
		VacationFacade vacationFacade = new VacationFacade();
		vacationFacade.book(startDate, endDate);
		
	}
}
