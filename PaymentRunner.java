class PaymentRunner {
    public static void main(String[] args) {
       
        CreditCard creditcard = new CreditCard();
        creditcard.setType("Visa Platinum");
        System.out.println(creditcard.getPaymentInfo());
    }
}
