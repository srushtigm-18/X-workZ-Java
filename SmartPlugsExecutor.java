class SmartPlugsExecutor {
    public static void main(String[] args) {
        double price = SmartPlugs.getPrice();
        String brand = SmartPlugs.getBrand();
        String colour = SmartPlugs.getColour();
        String totalPowerOutlets = SmartPlugs.getTotalPowerOutlets();
        
        String voltage = SmartPlugs.getVoltage();
        String specialFeature = SmartPlugs.getSpecialFeature();

        System.out.println("Smart Plugs price is: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Colour: " + colour);
        System.out.println("Total Power Outlets: " + totalPowerOutlets);
        
        System.out.println("Voltage: " + voltage);
        System.out.println("Special Feature: " + specialFeature);
    }
}
