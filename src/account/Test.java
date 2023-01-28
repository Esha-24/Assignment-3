package account;

public class Test {
	public static void main(String[] args) {
		
		Account a1 = new Current();
		a1.setAccountId(123456L);
		a1.setMinimumBalance(0);
		a1.setDescription("Current a/c");
		a1.display();
		
		System.out.println("____________________\n");
		
		Account a2 = new Current();
		a2.setAccountId(887659L);
		a2.setDescription("Savings a/c");
		a2.setMinimumBalance(500);
		a2.display();
	}
}
