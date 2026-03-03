class BarExecutor {
    public static void main(String[] args) {
        Bar tab = new Bar();
        tab.transactionId = 405;
        tab.billAmount = 675.00;
        tab.isPaid = false;
        tab.isOpenTab = true;
        tab.orderTime = "03/03/2026 ---> 20:30";
        tab.closingTime = "03/03/2026 ---> 23:00";
        tab.isOverdue = false;

        System.out.println("Transaction ID: " + tab.transactionId);
        System.out.println("Bill Amount: " + tab.billAmount);
        System.out.println("Order Time: " + tab.orderTime);
        System.out.println("Closing Time: " + tab.closingTime);
    }
}
