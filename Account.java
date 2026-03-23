class Account {
	private double balance;
	Account(){
		System.out.println("The bank accnt is created.");
	}
	public double getBalance(){
		return balance;
	}
	
	public void credit(double Amount){
		if(Amount > 0){
			balance = balance + Amount;
		}
		else {
			System.out.println("Invalid amout. Please enter valid number!..");
		}
	}
		
    public void debit (double amount){
		if(amount <= balance)
			balance = balance - amount;
		else{
			System.out.println("Insufficient amount. Please enter valid amount");
		}
		
	}
	
	}


