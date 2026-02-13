class ACExecutor {
    public static void main(String[] args) {
        double price = AC.getPrice();
        String brand = AC.getBrand();
        String capacity = AC.getCapacity();
        String coolingPower = AC.getCoolingPower();
        
        String specialFeature = AC.getSpecialFeature();
        String productDimensions = AC.getProductDimensions();

        System.out.println("AC price is: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity);
        System.out.println("Cooling Power: " + coolingPower);
        
        System.out.println("Special Feature: " + specialFeature);
        System.out.println("Product Dimensions: " + productDimensions);
    }
}
