class BulbExecutor {
    public static void main(String[] args) {
        Bulb bulb1 = new Bulb("Round", "Glass", "LED", "Philips", "White", "Living Room");
        
        Bulb bulb2 = new Bulb(6.0, 4.0, 0.05);
        
        Bulb bulb3 = new Bulb(true, false);
        
        Bulb bulb4 = new Bulb(250);
        
        System.out.println("Bulb Shape: " + bulb1.shape);
        System.out.println("Bulb Material: " + bulb1.material);
        System.out.println("Bulb Height: " + bulb2.height);
        System.out.println("Bulb Width: " + bulb2.width);
        System.out.println("Bulb Type: " + bulb1.bulbType);
        System.out.println("Bulb Brand: " + bulb1.brand);
        System.out.println("Bulb AutoSwitch: " + bulb3.autoSwitch);
        System.out.println("Bulb Weight: " + bulb2.weight);
        System.out.println("Bulb Color: " + bulb1.color);
        System.out.println("Bulb Price: " + bulb4.price);
        System.out.println("Bulb Usage: " + bulb1.usage);
        System.out.println("Bulb Smart: " + bulb3.smart);
        System.out.println("");
    }
}