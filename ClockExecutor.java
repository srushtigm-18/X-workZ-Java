class ClockExecutor {
    public static void main(String[] args) {
        Clock clock1 = new Clock("Wall", "Ajanta", "Analog", "Plastic");
        
        Clock clock2 = new Clock(850, 12, 24);
        
        Clock clock3 = new Clock(true, false);
        
        Clock clock4 = new Clock(10.5, 10.5, 0.8);
        
        System.out.println("Clock Style: " + clock1.style);
        System.out.println("Clock Brand: " + clock1.brand);
        System.out.println("Clock Price: " + clock2.price);
        System.out.println("Clock DisplayType: " + clock1.displayType);
        System.out.println("Clock Size: " + clock2.size);
        System.out.println("Clock Material: " + clock1.material);
        System.out.println("Clock BatteryLife: " + clock2.batteryLife);
        System.out.println("Clock Width: " + clock4.width);
        System.out.println("Clock Height: " + clock4.height);
        System.out.println("Clock Alarm: " + clock3.alarm);
        System.out.println("Clock Weight: " + clock4.weight);
        System.out.println("Clock Smart: " + clock3.smart);
        System.out.println("");
    }
}