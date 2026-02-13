class MixerGrinderExecutor {
    public static void main(String[] args) {
        double price = MixerGrinder.getPrice();
        String brand = MixerGrinder.getBrand();
        String colour = MixerGrinder.getColour();
        String specialFeature = MixerGrinder.getSpecialFeature();
        
        String capacity = MixerGrinder.getCapacity();
        String productDimensions = MixerGrinder.getProductDimensions();
        String material = MixerGrinder.getMaterial();
        String includedComponents = MixerGrinder.getIncludedComponents();
        
        String style = MixerGrinder.getStyle();
        String recommendedUses = MixerGrinder.getRecommendedUses();
        String powerSource = MixerGrinder.getPowerSource();

        System.out.println("Mixer Grinder price is: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Colour: " + colour);
        System.out.println("Special Feature: " + specialFeature);
        
        System.out.println("Capacity: " + capacity);
        System.out.println("Product Dimensions: " + productDimensions);
        System.out.println("Material: " + material);
        System.out.println("Included Components: " + includedComponents);
        
        System.out.println("Style: " + style);
        System.out.println("Recommended Uses For Product: " + recommendedUses);
        System.out.println("Power Source: " + powerSource);
    }
}
