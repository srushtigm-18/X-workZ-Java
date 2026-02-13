class AdaptorExecutor {
    public static void main(String[] args) {
        double price = Adaptor.getPrice();
        String productDimensions = Adaptor.getProductDimensions();
        String modelNumber = Adaptor.getModelNumber();
        String connectivityTechnologies = Adaptor.getConnectivityTechnologies();
        
        String specialFeatures = Adaptor.getSpecialFeatures();
        String otherDisplayFeatures = Adaptor.getOtherDisplayFeatures();
        String colour = Adaptor.getColour();
        String whatsInTheBox = Adaptor.getWhatsInTheBox();
        
        String manufacturer = Adaptor.getManufacturer();
        String countryOfOrigin = Adaptor.getCountryOfOrigin();
        String itemWeight = Adaptor.getItemWeight();

        System.out.println("Adaptor price is: " + price);
        System.out.println("Product Dimensions: " + productDimensions);
        System.out.println("Item model number: " + modelNumber);
        System.out.println("Connectivity technologies: " + connectivityTechnologies);
        
        System.out.println("Special features: " + specialFeatures);
        System.out.println("Other display features: " + otherDisplayFeatures);
        System.out.println("Colour: " + colour);
        System.out.println("Whats in the box: " + whatsInTheBox);
        
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Item Weight: " + itemWeight);
    }
}
