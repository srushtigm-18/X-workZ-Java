class AirFryerExecutor {
    public static void main(String[] args) {
        double price = AirFryer.getPrice();
        String specialFeature = AirFryer.getSpecialFeature();
        String productDimensions = AirFryer.getProductDimensions();
        String colour = AirFryer.getColour();
        
        String capacity = AirFryer.getCapacity();
        String material = AirFryer.getMaterial();

        System.out.println("Air Fryer price is: " + price);
        System.out.println("Special Feature: " + specialFeature);
        System.out.println("Product Dimensions: " + productDimensions);
        System.out.println("Colour: " + colour);
        
        System.out.println("Capacity: " + capacity);
        System.out.println("Material: " + material);
    }
}
