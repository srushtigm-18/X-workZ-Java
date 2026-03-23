class AccountRunner{

public static void main(String[] rupee){

Account account = new Account();

account.credit(2590.00);
double availableBalance = account.getBalance();
System.out.println("The current balance is "+availableBalance+" Rs");

account.debit(200.00);
availableBalance = account.getBalance();
System.out.println("The current balance is "+availableBalance+" Rs");

}


}

