class CeilingFanExecutor {
    public static void main(String[] args) {
        double price = CeilingFan.getPrice();
        String brand = CeilingFan.getBrand();
        String colour = CeilingFan.getColour();
        String electricFanDesign = CeilingFan.getElectricFanDesign();
        
        String powerSource = CeilingFan.getPowerSource();
        String style = CeilingFan.getStyle();
        String productDimensions = CeilingFan.getProductDimensions();
        String roomType = CeilingFan.getRoomType();
        
        String specialFeature = CeilingFan.getSpecialFeature();
        String mountingType = CeilingFan.getMountingType();
        String controllerType = CeilingFan.getControllerType();

        System.out.println("Ceiling Fan price is: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Colour: " + colour);
        System.out.println("Electric fan design: " + electricFanDesign);
        
        System.out.println("Power Source: " + powerSource);
        System.out.println("Style: " + style);
        System.out.println("Product Dimensions: " + productDimensions);
        System.out.println("Room Type: " + roomType);
        
        System.out.println("Special Feature: " + specialFeature);
        System.out.println("Mounting Type: " + mountingType);
        System.out.println("Controller Type: " + controllerType);
    }
}
