import java.util.ArrayList;
import java.util.Date;


public class account {
	
	//declare variables
	private int id ;
	private double balance ;
	private double annualInterestRate ;
	private Date dateCreated;
	protected String name;
	
	//set array list (Transaction)
	ArrayList<Transaction> list = new ArrayList<>();

	//no-arg constructor
	account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	//constructor
	account(int newId,double newBalance,String name){
	
		id = newId;
		balance =newBalance ;
		this.name = name;
		dateCreated = new Date();
	
	}

	//accessor id
	public int getId() {
		return id;
	}

	//mutator id
	public void setId(int id) {
		this.id = id;
	}

	//accessor balance
	public double getBalance() {
		return balance;
	}

	//mutator balance
	public void setBalance(double balance) {
		this.balance = balance;
	}

	//accessor annualInterestRate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	//mutator annualInterestRate
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	//accessor dateCreated
	public Date getDateCreated(){
		
		return dateCreated;
		
	}
	
	//accessor name
	public String getName() {
		return name;
	}
	
	//mutator name
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	//method for monthly interest rate
	public double getMonthlyInterestRate(){
		
		return annualInterestRate/12;
	}
	
	//method for monthly interest
	public double getMonthlyInterest(){
		
		double monthlyInterestRate = annualInterestRate/12/100;
		
		return balance*monthlyInterestRate;
		
		
	}

	
	//method for deposit
	public void deposit(double moneyIn){
		
		balance = balance + moneyIn ;
		
		list.add(new Transaction('D', moneyIn, balance, "deposit :"+moneyIn+"\nbalance :"+balance+"\n"));
		
	}
	
	//method to withdraw
	public void withdraw(double moneyOut) {
		
		balance = balance - moneyOut;
		
		list.add(new Transaction('W', moneyOut, balance, "withdraw :"+moneyOut+"\nbalance :"+balance+"\n"));
	}
	
	//method to print the informations (id ,balance monthly ,date)
	@Override
	public String toString(){
		
		return ("The account holder name is " + getName() + "\nThe balance is "+ getBalance() + "\nThe monthly interest is " + getMonthlyInterest() + "\n");
		
		
	}

}
