class OrderDetails{

    private int orderId;
    private String customerName;
    private String productName;
    private String orderDate;
    private String deliveryAddress;
    private double price;
    private String status;

    public void setOrderId(int orderId){
        this.orderId = orderId;
    }
    public int getOrderId(){
        return this.orderId;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return this.customerName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }
    public String getProductName(){
        return this.productName;
    }

    public void setOrderDate(String orderDate){
        this.orderDate = orderDate;
    }
    public String getOrderDate(){
        return this.orderDate;
    }

    public void setDeliveryAddress(String deliveryAddress){
        this.deliveryAddress = deliveryAddress;
    }
    public String getDeliveryAddress(){
        return this.deliveryAddress;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }

    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
}