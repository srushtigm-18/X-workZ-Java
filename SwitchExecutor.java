class SwitchExecutor {
    public static void main(String[] args) {
        Switch switch1 = new Switch("Modular", "Anchor", "White");
        
        Switch switch2 = new Switch(16, 250, 4);
        
        Switch switch3 = new Switch(true, false, true);
        
        Switch switch4 = new Switch(5.0, 230.0, 1.2);
        
        System.out.println("Switch Type: " + switch1.type);
        System.out.println("Switch Ratings: " + switch2.ratings);
        System.out.println("Switch SmartControl: " + switch3.smartControl);
        System.out.println("Switch PowerLoad: " + switch4.powerLoad);
        System.out.println("Switch Brand: " + switch1.brand);
        System.out.println("Switch Price: " + switch2.price);
        System.out.println("Switch TwoWay: " + switch3.twoWay);
        System.out.println("Switch Voltage: " + switch4.voltage);
        System.out.println("Switch Color: " + switch1.color);
        System.out.println("Switch Count: " + switch2.switchCount);
        System.out.println("Switch TouchSensitive: " + switch3.touchSensitive);
        System.out.println("Switch Height: " + switch4.installationHeight);
        System.out.println("");
    }
}