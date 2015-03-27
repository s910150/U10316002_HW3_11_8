
//Name:林鈺閔
//ID:U10316002
//Ex:11.8
public class testAccount {
	public static void main(String[] args){
		
		//new an object of account
		account Account = new account(1122, 1000, "George");
		
		//get rate
		Account.setAnnualInterestRate(1.5);
		
		//deposit money 
		Account.deposit(30);
		Account.deposit(40);
		Account.deposit(50);
		
		//withdraw money
		Account.withdraw(5);
		Account.withdraw(4);
		Account.withdraw(2);
		
		//loop for print description ,including deposit and withdraw
		for(int i = 0;i<6;i++){
		
		System.out.print((Account.list.get(i)).getDescription());
		
		}
		
		//print information of the account
		System.out.print(Account.toString());
		
	}
}
