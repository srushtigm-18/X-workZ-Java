class MysoreSandalSoapExecutor {
    public static void main(String[] args) {
        MysoreSandalSoap soap = new MysoreSandalSoap();
        soap.productId = 501;
        soap.price = 45.00;
        soap.isPremiumQuality = true;
        soap.inStock = true;
        soap.manufacturingDate = "01/02/2026";
        soap.expiryDate = "01/02/2028";
        soap.isExpired = false;

        System.out.println("Product ID: " + soap.productId);
        System.out.println("Price: " + soap.price);
        System.out.println("Manufacturing Date: " + soap.manufacturingDate);
        System.out.println("Expiry Date: " + soap.expiryDate);
    }
}
