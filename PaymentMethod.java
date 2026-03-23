class PaymentMethod {
    private String type;
    
    PaymentMethod() {
        System.out.println("PaymentMethod created");
    }
    
    public void setType(String type) {
        this.type = type; 
    }
  
    public String getPaymentInfo() {
        return type;
    }
}
