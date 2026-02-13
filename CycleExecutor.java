class CycleExecutor {
    public static void main(String[] args) {
        double price = Cycle.getPrice();
        String bikeType = Cycle.getBikeType();
        String ageRange = Cycle.getAgeRange();
        String brand = Cycle.getBrand();
        
        String numberOfSpeeds = Cycle.getNumberOfSpeeds();
        String colour = Cycle.getColour();

        System.out.println("Cycle price is: " + price);
        System.out.println("Bike Type: " + bikeType);
        System.out.println("Age Range (Description): " + ageRange);
        System.out.println("Brand: " + brand);
        
        System.out.println("Number of Speeds: " + numberOfSpeeds);
        System.out.println("Colour: " + colour);
    }
}
