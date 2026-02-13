class VoltageProtectorExecutor {
    public static void main(String[] args) {
        double price = VoltageProtector.getPrice();
        String connectorType = VoltageProtector.getConnectorType();
        String plugType = VoltageProtector.getPlugType();
        String specificationMet = VoltageProtector.getSpecificationMet();
        
        String manufacturer = VoltageProtector.getManufacturer();
        String model = VoltageProtector.getModel();
        String productDimensions = VoltageProtector.getProductDimensions();
        String itemModelNumber = VoltageProtector.getItemModelNumber();
        
        String compatibleDevices = VoltageProtector.getCompatibleDevices();
        int numberOfItems = VoltageProtector.getNumberOfItems();
        String powerSource = VoltageProtector.getPowerSource();
        String batteriesIncluded = VoltageProtector.getBatteriesIncluded();
        
        String batteriesRequired = VoltageProtector.getBatteriesRequired();
        String formFactor = VoltageProtector.getFormFactor();
        String mountingType = VoltageProtector.getMountingType();
        String hasAutoFocus = VoltageProtector.getHasAutoFocus();
        
        String programmableButtons = VoltageProtector.getProgrammableButtons();
        String countryOfOrigin = VoltageProtector.getCountryOfOrigin();
        String itemWeight = VoltageProtector.getItemWeight();

        System.out.println("Voltage Protector price is: " + price);
        System.out.println("Connector Type: " + connectorType);
        System.out.println("Plug Type: " + plugType);
        System.out.println("Specification Met: " + specificationMet);
        
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Product Dimensions: " + productDimensions);
        System.out.println("Item model number: " + itemModelNumber);
        
        System.out.println("Compatible Devices: " + compatibleDevices);
        System.out.println("Number of items: " + numberOfItems);
        System.out.println("Power Source: " + powerSource);
        System.out.println("Batteries Included: " + batteriesIncluded);
        
        System.out.println("Batteries Required: " + batteriesRequired);
        System.out.println("Form Factor: " + formFactor);
        System.out.println("Mounting Type: " + mountingType);
        System.out.println("Has Auto Focus: " + hasAutoFocus);
        
        System.out.println("Programmable Buttons: " + programmableButtons);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Item Weight: " + itemWeight);
    }
}
