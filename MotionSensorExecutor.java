class MotionSensorExecutor {
    public static void main(String[] args) {
        double price = MotionSensor.getPrice();
        String styleName = MotionSensor.getStyleName();
        String brand = MotionSensor.getBrand();
        String colour = MotionSensor.getColour();
        
        String powerSource = MotionSensor.getPowerSource();
        String itemWeight = MotionSensor.getItemWeight();
        String maximumRange = MotionSensor.getMaximumRange();

        System.out.println("Motion Sensor price is: " + price);
        System.out.println("Style Name: " + styleName);
        System.out.println("Brand: " + brand);
        System.out.println("Colour: " + colour);
        
        System.out.println("Power Source: " + powerSource);
        System.out.println("Item Weight: " + itemWeight);
        System.out.println("Maximum Range: " + maximumRange);
    }
}