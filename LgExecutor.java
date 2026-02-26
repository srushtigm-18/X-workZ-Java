class LgExecutor {
    public static void main(String[] args) {
        System.out.println("Test 1 LG Refrigerator Creation");
        boolean created1 = Lg.createrefrigerator("GL-H427BPZX", 
                                               "420 L", 
                                               "Side by Side", 
                                               "Inverter Linear", 
                                               5, 
                                               "Smart Inverter", 
                                               78990.0, 
                                               "Shiny Steel", 
                                               "10 Years Compressor", 
                                               "DoorCooling Plus, Hygiene Fresh");
        
        if (created1) {
            System.out.println("LG Refrigerator created successfully");
            Lg.getRefrigeratorDetails();
        } else {
            System.out.println("LG Refrigerator creation failed");
        }

        System.out.println("Test 2 Another LG Refrigerator");
        boolean created2 = Lg.createrefrigerator("GF-B520FPZS", 
                                               "520 L", 
                                               "Frost Free", 
                                               "5 Star", 
                                               4, 
                                               "Smart Inverter", 
                                               65990.0, 
                                               "Platinum Silver", 
                                               "1 Year Product 10 Years Compressor", 
                                               "Multi Air Flow, Express Freeze");
        
        if (created2) {
            System.out.println("Second LG Refrigerator created successfully");
            Lg.getRefrigeratorDetails();
        } else {
            System.out.println("Second LG Refrigerator creation failed");
        }

        System.out.println("All refrigerator tests completed");
    }
}
