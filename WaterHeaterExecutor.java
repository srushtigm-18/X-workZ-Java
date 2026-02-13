class WaterHeaterExecutor {
    public static void main(String[] args) {
        double price = WaterHeater.getPrice();
        String brand = WaterHeater.getBrand();
        String capacity = WaterHeater.getCapacity();
        String powerSource = WaterHeater.getPowerSource();
        
        String specialFeature = WaterHeater.getSpecialFeature();
        String colour = WaterHeater.getColour();

        System.out.println("Water Heater price is: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity);
        System.out.println("Power Source: " + powerSource);
        
        System.out.println("Special Feature: " + specialFeature);
        System.out.println("Colour: " + colour);
    }
}