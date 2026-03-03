class MilitaryHotelExecutor {
    public static void main(String[] args) {
        MilitaryHotel bill = new MilitaryHotel();
        bill.billId = 101;
        bill.billAmount = 2500.50;
        bill.isFinalBill = true;
        bill.isLatestBill = true;
        bill.checkInDate = "01/03/2026";
        bill.checkOutDate = "05/03/2026";
        bill.isPaymentOverDue = false;

        System.out.println("The bill id is : " + bill.billId);
        System.out.println("The bill amount is : " + bill.billAmount);
        System.out.println("The check-in date : " + bill.checkInDate);
        System.out.println("The check-out date : " + bill.checkOutDate);
		
		System.out.println();
		
	 MilitaryHotel secondBill = new MilitaryHotel();
        secondBill.billId = 102;
        secondBill.billAmount = 1580.50;
       secondBill.isFinalBill = true;
        secondBill.isLatestBill = true;
       secondBill.checkInDate = "08/08/2026";
        secondBill.checkOutDate = "10/08/2026";
        secondBill.isPaymentOverDue = false;

        System.out.println("The bill id is : " + secondBill.billId);
        System.out.println("The bill amount is : " + secondBill.billAmount);
        System.out.println("The check-in date : " + secondBill.checkInDate);
        System.out.println("The check-out date : " + secondBill.checkOutDate);
			
		
		
    }
}
