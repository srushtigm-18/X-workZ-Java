class CoffeeMakerExecutor {
    public static void main(String[] args) {
        double price = CoffeeMaker.getPrice();
        String brand = CoffeeMaker.getBrand();
        String capacity = CoffeeMaker.getCapacity();
        String colour = CoffeeMaker.getColour();
        
        String productDimensions = CoffeeMaker.getProductDimensions();
        String specialFeature = CoffeeMaker.getSpecialFeature();
        String coffeeMakerType = CoffeeMaker.getCoffeeMakerType();
        String material = CoffeeMaker.getMaterial();
        
        String style = CoffeeMaker.getStyle();
        String specificUses = CoffeeMaker.getSpecificUses();

        System.out.println("Coffee Maker price is: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity);
        System.out.println("Colour: " + colour);
        
        System.out.println("Product Dimensions: " + productDimensions);
        System.out.println("Special Feature: " + specialFeature);
        System.out.println("Coffee Maker Type: " + coffeeMakerType);
        System.out.println("Material: " + material);
        
        System.out.println("Style: " + style);
        System.out.println("Specific Uses For Product: " + specificUses);
    }
}