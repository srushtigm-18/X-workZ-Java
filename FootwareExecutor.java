class FootwareExecutor {
    public static void main(String[] args) {
        double price = Footware.getPrice();
        String materialType = Footware.getMaterialType();
        String closureType = Footware.getClosureType();
        String heelType = Footware.getHeelType();
        
        String waterResistanceLevel = Footware.getWaterResistanceLevel();
        String style = Footware.getStyle();
        String strapType = Footware.getStrapType();
        String countryOfOrigin = Footware.getCountryOfOrigin();

        System.out.println("Footware price is: " + price);
        System.out.println("Material type: " + materialType);
        System.out.println("Closure type: " + closureType);
        System.out.println("Heel type: " + heelType);
        
        System.out.println("Water resistance level: " + waterResistanceLevel);
        System.out.println("Style: " + style);
        System.out.println("Strap type: " + strapType);
        System.out.println("Country of Origin: " + countryOfOrigin);
    }
}
