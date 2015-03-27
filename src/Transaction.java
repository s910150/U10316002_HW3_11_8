import java.util.Date;


public class Transaction {

	//declare variables
	private Date date;
	private char type;
	
	private double amount;
	private double balance ;
	private String description;
	
	//constructor
	public Transaction(char type,double amount,double balance,String description) {
		
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}
	
	//accessor description
		public String getDescription() {
			return description;
		}

	
	
	
	
	
	
}
