class PowerBankExecutor {
    public static void main(String[] args) {
        double price = PowerBank.getPrice();
        String packageDimensions = PowerBank.getPackageDimensions();
        String batteries = PowerBank.getBatteries();
        String modelNumber = PowerBank.getModelNumber();
        
        String specialFeatures = PowerBank.getSpecialFeatures();
        String displayFeatures = PowerBank.getDisplayFeatures();
        String colour = PowerBank.getColour();
        
        String batteryPowerRating = PowerBank.getBatteryPowerRating();
        String whatsInTheBox = PowerBank.getWhatsInTheBox();
        String manufacturer = PowerBank.getManufacturer();
        
        String origin = PowerBank.getOrigin();
        String weight = PowerBank.getWeight();

        System.out.println("Power Bank price is: " + price);
        System.out.println("Package dimensions: " + packageDimensions);
        System.out.println("Batteries: " + batteries);
        System.out.println("Model number: " + modelNumber);
        
        System.out.println("Special features: " + specialFeatures);
        System.out.println("Display features: " + displayFeatures);
        System.out.println("Colour: " + colour);
        
        System.out.println("Battery power rating: " + batteryPowerRating);
        System.out.println("What's in the box: " + whatsInTheBox);
        System.out.println("Manufacturer: " + manufacturer);
        
        System.out.println("Country of origin: " + origin);
        System.out.println("Item weight: " + weight);
    }
}
