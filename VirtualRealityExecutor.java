class VirtualRealityExecutor {
    public static void main(String[] args) {
        double price = VirtualReality.getPrice();
        String batteries = VirtualReality.getBatteries();
        String packageDimensions = VirtualReality.getPackageDimensions();
        String asin = VirtualReality.getASIN();
        
        String manufacturer = VirtualReality.getManufacturer();
        String itemWeight = VirtualReality.getItemWeight();
        String includedComponents = VirtualReality.getIncludedComponents();

        System.out.println("Virtual Reality price is: " + price);
        System.out.println("Batteries: " + batteries);
        System.out.println("Package Dimensions: " + packageDimensions);
        System.out.println("ASIN: " + asin);
        
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Item Weight: " + itemWeight);
        System.out.println("Included Components: " + includedComponents);
    }
}
