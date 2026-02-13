class SolarLightExecutor {
    public static void main(String[] args) {
        double price = SolarLight.getPrice();
        String finishType = SolarLight.getFinishType();
        String baseMaterial = SolarLight.getBaseMaterial();
        String bulbBase = SolarLight.getBulbBase();
        
        String itemWeight = SolarLight.getItemWeight();
        String lampType = SolarLight.getLampType();
        String shadeColour = SolarLight.getShadeColour();
        String shadeMaterial = SolarLight.getShadeMaterial();
        
        String switchType = SolarLight.getSwitchType();
        String style = SolarLight.getStyle();
        String brand = SolarLight.getBrand();

        System.out.println("Solar Light price is: " + price);
        System.out.println("Finish Type: " + finishType);
        System.out.println("Base Material: " + baseMaterial);
        System.out.println("Bulb Base: " + bulbBase);
        
        System.out.println("Item Weight: " + itemWeight);
        System.out.println("Lamp Type: " + lampType);
        System.out.println("Shade Colour: " + shadeColour);
        System.out.println("Shade Material: " + shadeMaterial);
        
        System.out.println("Switch Type: " + switchType);
        System.out.println("Style: " + style);
        System.out.println("Brand: " + brand);
    }
}
