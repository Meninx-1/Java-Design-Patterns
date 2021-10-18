package composite_example;

/*
 * When to use the composite pattern:
 * 1- You want to treat single objects and groups of objects the same way
 * 2- You have code that is very similar/identical to handle different types of objects.
 */
public class ExpensesPrayerMain {

	public static void main(String[] args) {
		Manager jane = new Manager("Jane");
		Salesperson bob = new Salesperson("Bob", jane);
		Salesperson sue = new Salesperson("Sue", jane);		
		
		SalesTeam team = new SalesTeam();
		team.addTeamMember(jane);
		team.addTeamMember(bob);
		team.addTeamMember(sue);
		
		payPayee(jane, 100);
		payPayee(bob, 300);
		payPayee(team, 200);
		
	}

	private static void payPayee(Payee payee, int amount) {
		System.out.println("Expenses have been requested");
		payee.payExpenses(amount);
		System.out.println("Expenses have been paid");
	}
	
}
