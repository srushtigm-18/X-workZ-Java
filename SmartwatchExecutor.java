class SmartwatchExecutor {
    public static void main(String[] args) {
        double price = Smartwatch.getPrice();
        String brand = Smartwatch.getBrand();
        String manufacturer = Smartwatch.getManufacturer();
        String series = Smartwatch.getSeries();
        
        String colour = Smartwatch.getColour();
        String itemHeight = Smartwatch.getItemHeight();
        String itemWidth = Smartwatch.getItemWidth();
        String screenSize = Smartwatch.getScreenDisplaySize();
        
        String productDimensions = Smartwatch.getProductDimensions();
        String modelNumber = Smartwatch.getModelNumber();
        String connectivityType = Smartwatch.getConnectivityType();
        String wirelessCarrier = Smartwatch.getWirelessCarrier();
        
        String wirelessType = Smartwatch.getWirelessType();
        double wattage = Smartwatch.getWattage();
        String operatingSystem = Smartwatch.getOperatingSystem();
        String averageBatteryLife = Smartwatch.getAverageBatteryLife();
        
        String batteriesIncluded = Smartwatch.getBatteriesIncluded();
        String includedComponents = Smartwatch.getIncludedComponents();
        String countryOfOrigin = Smartwatch.getCountryOfOrigin();
        String itemWeight = Smartwatch.getItemWeight();

        System.out.println("Smartwatch price is: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Series: " + series);
        
        System.out.println("Colour: " + colour);
        System.out.println("Item height: " + itemHeight);
        System.out.println("Item width: " + itemWidth);
        System.out.println("Standing screen display size: " + screenSize);
        
        System.out.println("Product dimensions: " + productDimensions);
        System.out.println("Model number: " + modelNumber);
        System.out.println("Connectivity type: " + connectivityType);
        System.out.println("Wireless carrier: " + wirelessCarrier);
        
        System.out.println("Wireless type: " + wirelessType);
        System.out.println("Wattage: " + wattage + " Watts");
        System.out.println("Operating system: " + operatingSystem);
        System.out.println("Average battery life: " + averageBatteryLife);
        
        System.out.println("Are batteries included: " + batteriesIncluded);
        System.out.println("Included components: " + includedComponents);
        System.out.println("Country of origin: " + countryOfOrigin);
        System.out.println("Item weight: " + itemWeight);
    }
}
