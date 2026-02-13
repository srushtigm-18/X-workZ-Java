class HumiditySensorExecutor {
    public static void main(String[] args) {
        double price = HumiditySensor.getPrice();
        String brand = HumiditySensor.getBrand();
        String specialFeature = HumiditySensor.getSpecialFeature();
        String colour = HumiditySensor.getColour();
        
        String ageRange = HumiditySensor.getAgeRange();
        String includedComponents = HumiditySensor.getIncludedComponents();
        String outerMaterial = HumiditySensor.getOuterMaterial();
        String specificationMet = HumiditySensor.getSpecificationMet();
        
        String displayType = HumiditySensor.getDisplayType();
        String connectivityTechnology = HumiditySensor.getConnectivityTechnology();
        String productCareInstructions = HumiditySensor.getProductCareInstructions();
        String netQuantity = HumiditySensor.getNetQuantity();

        System.out.println("Humidity Sensor price is: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Special Feature: " + specialFeature);
        System.out.println("Colour: " + colour);
        
        System.out.println("Age Range (Description): " + ageRange);
        System.out.println("Included Components: " + includedComponents);
        System.out.println("Outer Material: " + outerMaterial);
        System.out.println("Specification Met: " + specificationMet);
        
        System.out.println("Display Type: " + displayType);
        System.out.println("Connectivity Technology: " + connectivityTechnology);
        System.out.println("Product Care Instructions: " + productCareInstructions);
        System.out.println("Net Quantity: " + netQuantity);
    }
}
