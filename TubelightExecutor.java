class TubelightExecutor {
    public static void main(String[] args) {
        Tubelight tubelight1 = new Tubelight("Straight", "Philips", "White", "Office");
        
        Tubelight tubelight2 = new Tubelight(120, 850, 20);
        
        Tubelight tubelight3 = new Tubelight(true);
        
        Tubelight tubelight4 = new Tubelight(2.5, 1.5, 0.3, 2400.0);
        
        System.out.println("Tubelight Shape: " + tubelight1.shape);
        System.out.println("Tubelight Brand: " + tubelight1.brand);
        System.out.println("Tubelight Length: " + tubelight2.length);
        System.out.println("Tubelight Color: " + tubelight1.color);
        System.out.println("Tubelight Price: " + tubelight2.price);
        System.out.println("Tubelight Wattage: " + tubelight2.wattage);
        System.out.println("Tubelight Dimmable: " + tubelight3.dimmable);
        System.out.println("Tubelight Width: " + tubelight4.width);
        System.out.println("Tubelight Height: " + tubelight4.height);
        System.out.println("Tubelight Weight: " + tubelight4.weight);
        System.out.println("Tubelight Usage: " + tubelight1.usage);
        System.out.println("Tubelight Lumen: " + tubelight4.lumen);
        System.out.println("");
    }
}