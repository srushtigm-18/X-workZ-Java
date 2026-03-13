class DesertExecutor {
    public static void main(String[] args) {
        Desert desert1 = new Desert("Hot", "Rajasthan", "Arid");
        
        Desert desert2 = new Desert(false, true, false);
        
        Desert desert3 = new Desert(50, 200000, 1500);
        
        Desert desert4 = new Desert(500.0, 300.0, 0.1);
        
        System.out.println("Desert Type: " + desert1.type);
        System.out.println("Desert Habitable: " + desert2.habitable);
        System.out.println("Desert Temperature: " + desert3.temperature);
        System.out.println("Desert Location: " + desert1.location);
        System.out.println("Desert Sandstorms: " + desert2.sandstorms);
        System.out.println("Desert Area: " + desert3.area);
        System.out.println("Desert Climate: " + desert1.climate);
        System.out.println("Desert UndergroundWater: " + desert2.undergroundWater);
        System.out.println("Desert Dunes: " + desert3.dunes);
        System.out.println("Desert Length: " + desert4.length);
        System.out.println("Desert Width: " + desert4.width);
        System.out.println("Desert Rainfall: " + desert4.rainfall);
        System.out.println("");
    }
}
