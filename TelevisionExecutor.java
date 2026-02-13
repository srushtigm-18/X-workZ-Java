class TelevisionExecutor {
    public static void main(String[] args) {
        double price = Television.getPrice();
        String brand = Television.getBrand();
        String manufacturer = Television.getManufacturer();
        String model = Television.getModel();
        
        String modelName = Television.getModelName();
        String modelYear = Television.getModelYear();
        String productDimensions = Television.getProductDimensions();
        String itemModelNumber = Television.getItemModelNumber();
        
        String memoryStorage = Television.getMemoryStorageCapacity();
        String operatingSystem = Television.getOperatingSystem();
        String hardwareInterface = Television.getHardwareInterface();
        String tunerTechnology = Television.getTunerTechnology();

        System.out.println("Television price is: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        
        System.out.println("Model Name: " + modelName);
        System.out.println("Model Year: " + modelYear);
        System.out.println("Product Dimensions: " + productDimensions);
        System.out.println("Item model number: " + itemModelNumber);
        
        System.out.println("Memory Storage Capacity: " + memoryStorage);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Hardware Interface: " + hardwareInterface);
        System.out.println("Tuner Technology: " + tunerTechnology);
    }
}
