class GiriasExecutor {
    public static void main(String[] args) {
        System.out.println("=== Samsung Washing Machine ===");
        boolean created1 = Girias.createWashingMachine("Samsung","WW90T554DAN", "9 Kg", "Front Load",  1400, "5 Star", 42990.0, 
        "Silver", "3 Years", "Eco Bubble, AddWash");
        
        if (created1) {
            System.out.println("Washing Machine created successfully at Girias!");
            Girias.getWashingMachineDetails();
        } else {
            System.out.println("Washing Machine creation failed!");
        }

     
        boolean created2 = Girias.createWashingMachine("LG","FHV1409ZBMN","9 Kg", "Front Load",1200, "5 Star", 45990.0,  "Black", "10 Years Motor","AI DD, Steam+");
        
        if (created2) {
            System.out.println("LG Washing Machine created successfully at Girias!");
            Girias.getWashingMachineDetails();
        } else {
            System.out.println("LG Washing Machine creation failed!");
        }

    }
}
