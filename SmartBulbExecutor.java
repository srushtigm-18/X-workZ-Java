class SmartBulbExecutor {
    public static void main(String[] args) {
        double price = SmartBulb.getPrice();
        String brand = SmartBulb.getBrand();
        String lightType = SmartBulb.getLightType();
        String specialFeature = SmartBulb.getSpecialFeature();
        
        String wattage = SmartBulb.getWattage();
        String bulbShapeSize = SmartBulb.getBulbShapeSize();
        String bulbBase = SmartBulb.getBulbBase();
        String incandescentEquivalentWattage = SmartBulb.getIncandescentEquivalentWattage();
        
        String lightColour = SmartBulb.getLightColour();
        String voltage = SmartBulb.getVoltage();
        String netQuantity = SmartBulb.getNetQuantity();

        System.out.println("Smart Bulb price is: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Light Type: " + lightType);
        System.out.println("Special Feature: " + specialFeature);
        
        System.out.println("Wattage: " + wattage);
        System.out.println("Bulb Shape Size: " + bulbShapeSize);
        System.out.println("Bulb Base: " + bulbBase);
        System.out.println("Incandescent Equivalent Wattage: " + incandescentEquivalentWattage);
        
        System.out.println("Light Colour: " + lightColour);
        System.out.println("Voltage: " + voltage);
        System.out.println("Net Quantity: " + netQuantity);
    }
}
