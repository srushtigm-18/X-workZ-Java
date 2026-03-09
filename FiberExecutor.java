class FiberExecutor {
    public static void main(String[] args) {
        Fiber fiber1 = new Fiber();
        fiber1.name = "JioFiber";
        fiber1.length = 1500.5;
        fiber1.vendors = "Reliance Jio";
        
        System.out.println("Fiber Name: " + fiber1.name);
        System.out.println("Fiber Length: " + fiber1.length);
        System.out.println("Fiber Vendors: " + fiber1.vendors);
        System.out.println("-----------------------------");
        
        Fiber fiber2 = new Fiber();
        fiber2.name = "Airtel Xstream";
        fiber2.length = 1200.0;
        fiber2.vendors = "Bharti Airtel";
        
        System.out.println("Fiber Name: " + fiber2.name);
        System.out.println("Fiber Length: " + fiber2.length);
        System.out.println("Fiber Vendors: " + fiber2.vendors);
        System.out.println("-----------------------------");
        
        Fiber fiber3 = new Fiber();
        fiber3.name = "ACT Fibernet";
        fiber3.length = 1800.75;
        fiber3.vendors = "Atria Convergence";
        
        System.out.println("Fiber Name: " + fiber3.name);
        System.out.println("Fiber Length: " + fiber3.length);
        System.out.println("Fiber Vendors: " + fiber3.vendors);
        System.out.println("-----------------------------");
        
        Fiber fiber4 = new Fiber();
        fiber4.name = "Hathway Fiber";
        fiber4.length = 950.25;
        fiber4.vendors = "Hathway Cable";
        
        System.out.println("Fiber Name: " + fiber4.name);
        System.out.println("Fiber Length: " + fiber4.length);
        System.out.println("Fiber Vendors: " + fiber4.vendors);
        System.out.println("-----------------------------");
    }
}
