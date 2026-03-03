class WaterBillExecutor{

public static void main(String[] water){

WaterBill bill = new WaterBill();
bill.billId = 1;
bill.billAmount = 999.99;
bill.isFinalBill = true;
bill.isLatestBill = true;
bill.issueDate = "02/03/2026";
bill.dueDate = "03/04/2026";
bill.isBillOverDue = false;

System.out.println("The bill id is : "+bill.billId);
System.out.println("The bill amount is : "+bill.billAmount);
System.out.println("The bill issue date : "+bill.issueDate);
System.out.println("The bill due date is : "+bill.dueDate );


}
}