class CloudExecutor {
    public static void main(String[] args) {
        Cloud cloud1 = new Cloud("Cumulus", "Fluffy", "White", "Sky", 
                                "Low", "Light", "Slow", "Clear");
        
        Cloud cloud2 = new Cloud(true, false);
        
        Cloud cloud3 = new Cloud(70, 2000);
        
        System.out.println("Cloud Type: " + cloud1.type);
        System.out.println("Cloud Shape: " + cloud1.shape);
        System.out.println("Cloud Rain: " + cloud2.rain);
        System.out.println("Cloud Color: " + cloud1.color);
        System.out.println("Cloud Thunder: " + cloud2.thunder);
        System.out.println("Cloud Location: " + cloud1.location);
        System.out.println("Cloud Coverage: " + cloud3.coverage);
        System.out.println("Cloud Altitude: " + cloud1.altitude);
        System.out.println("Cloud Height: " + cloud3.height);
        System.out.println("Cloud Density: " + cloud1.density);
        System.out.println("Cloud Movement: " + cloud1.movement);
        System.out.println("Cloud Weather: " + cloud1.weather);
        System.out.println("");
    }
}
