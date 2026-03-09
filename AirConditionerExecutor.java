class AirConditionerExecutor {
    public static void main(String[] args) {
        // AirConditioner 1
        AirConditioner ac1 = new AirConditioner();
        ac1.brand = "Voltas";
        ac1.model = "115V Vertis Elite";
        ac1.price = 35000.00;
        ac1.type = "Split AC";
        ac1.weight = 12.5;
        ac1.colors = "White";
        ac1.warranty = 5;
        ac1.working = true;
        
        System.out.println("AC Brand: " + ac1.brand);
        System.out.println("AC Model: " + ac1.model);
        System.out.println("AC Price: " + ac1.price);
        System.out.println("AC Type: " + ac1.type);
        System.out.println("AC Weight: " + ac1.weight);
        System.out.println("AC Colors: " + ac1.colors);
        System.out.println("AC Warranty: " + ac1.warranty);
        System.out.println("AC Working: " + ac1.working);
        System.out.println("-----------------------------");
        
        // AirConditioner 2
        AirConditioner ac2 = new AirConditioner();
        ac2.brand = "Daikin";
        ac2.model = "FTKM50";
        ac2.price = 45000.00;
        ac2.type = "Inverter Split";
        ac2.weight = 14.2;
        ac2.colors = "White/Gold";
        ac2.warranty = 10;
        ac2.working = true;
        
        System.out.println("AC Brand: " + ac2.brand);
        System.out.println("AC Model: " + ac2.model);
        System.out.println("AC Price: " + ac2.price);
        System.out.println("AC Type: " + ac2.type);
        System.out.println("AC Weight: " + ac2.weight);
        System.out.println("AC Colors: " + ac2.colors);
        System.out.println("AC Warranty: " + ac2.warranty);
        System.out.println("AC Working: " + ac2.working);
        System.out.println("-----------------------------");
        
        // AirConditioner 3
        AirConditioner ac3 = new AirConditioner();
        ac3.brand = "LG";
        ac3.model = "RS-Q19YNZE";
        ac3.price = 42000.00;
        ac3.type = "Window AC";
        ac3.weight = 28.0;
        ac3.colors = "White";
        ac3.warranty = 1;
        ac3.working = true;
        
        System.out.println("AC Brand: " + ac3.brand);
        System.out.println("AC Model: " + ac3.model);
        System.out.println("AC Price: " + ac3.price);
        System.out.println("AC Type: " + ac3.type);
        System.out.println("AC Weight: " + ac3.weight);
        System.out.println("AC Colors: " + ac3.colors);
        System.out.println("AC Warranty: " + ac3.warranty);
        System.out.println("AC Working: " + ac3.working);
        System.out.println("-----------------------------");
        
        // AirConditioner 4
        AirConditioner ac4 = new AirConditioner();
        ac4.brand = "Blue Star";
        ac4.model = "IC512EBU";
        ac4.price = 38000.00;
        ac4.type = "Split AC";
        ac4.weight = 11.8;
        ac4.colors = "Silver";
        ac4.warranty = 5;
        ac4.working = false;
        
        System.out.println("AC Brand: " + ac4.brand);
        System.out.println("AC Model: " + ac4.model);
        System.out.println("AC Price: " + ac4.price);
        System.out.println("AC Type: " + ac4.type);
        System.out.println("AC Weight: " + ac4.weight);
        System.out.println("AC Colors: " + ac4.colors);
        System.out.println("AC Warranty: " + ac4.warranty);
        System.out.println("AC Working: " + ac4.working);
        System.out.println("-----------------------------");
    }
}
