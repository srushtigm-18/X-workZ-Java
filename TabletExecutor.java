class TabletExecutor {
    public static void main(String[] args) {
        double price = Tablet.getPrice();
        String brand = Tablet.getBrand();
        String manufacturer = Tablet.getManufacturer();
        String series = Tablet.getSeries();
        
        String colour = Tablet.getColour();
        String itemHeight = Tablet.getItemHeight();
        String itemWidth = Tablet.getItemWidth();
        String screenSize = Tablet.getScreenDisplaySize();
        
        String screenResolution = Tablet.getScreenResolution();
        String resolution = Tablet.getResolution();
        String productDimensions = Tablet.getProductDimensions();
        String batteries = Tablet.getBatteries();
        
        String modelNumber = Tablet.getModelNumber();
        String processorBrand = Tablet.getProcessorBrand();
        double processorSpeed = Tablet.getProcessorSpeed();
        String ramSize = Tablet.getRAMSize();
        
        String graphicsCard = Tablet.getGraphicsCard();
        String connectivityType = Tablet.getConnectivityType();
        String wirelessType = Tablet.getWirelessType();
        String operatingSystem = Tablet.getOperatingSystem();
        
        String batteriesIncluded = Tablet.getBatteriesIncluded();
        String includedComponents = Tablet.getIncludedComponents();
        String countryOfOrigin = Tablet.getCountryOfOrigin();
        String itemWeight = Tablet.getItemWeight();

        System.out.println("Tablet price is: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Series: " + series);
        
        System.out.println("Colour: " + colour);
        System.out.println("Item height: " + itemHeight);
        System.out.println("Item width: " + itemWidth);
        System.out.println("Standing screen display size: " + screenSize);
        
        System.out.println("Screen resolution: " + screenResolution);
        System.out.println("Resolution: " + resolution);
        System.out.println("Product dimensions: " + productDimensions);
        System.out.println("Batteries: " + batteries);
        
        System.out.println("Model number: " + modelNumber);
        System.out.println("Processor brand: " + processorBrand);
        System.out.println("Processor speed: " + processorSpeed + " GHz");
        System.out.println("RAM size: " + ramSize);
        
        System.out.println("Graphics card description: " + graphicsCard);
        System.out.println("Connectivity type: " + connectivityType);
        System.out.println("Wireless type: " + wirelessType);
        System.out.println("Operating system: " + operatingSystem);
        
        System.out.println("Are batteries included: " + batteriesIncluded);
        System.out.println("Included components: " + includedComponents);
        System.out.println("Country of origin: " + countryOfOrigin);
        System.out.println("Item weight: " + itemWeight);
    }
}
