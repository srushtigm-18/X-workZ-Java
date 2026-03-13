class NoseringExecutor {
    public static void main(String[] args) {
        Nosering nosering1 = new Nosering("Hoop", "Titanium", "Silver", "UrbanBody");
        
        Nosering nosering2 = new Nosering(18, 450, 8);
        
        Nosering nosering3 = new Nosering(true);
        
        Nosering nosering4 = new Nosering(0.8, 0.5, 1.2, 9.5);
        
        System.out.println("Nosering Style: " + nosering1.style);
        System.out.println("Nosering Material: " + nosering1.material);
        System.out.println("Nosering Gauge: " + nosering2.gauge);
        System.out.println("Nosering Color: " + nosering1.color);
        System.out.println("Nosering Price: " + nosering2.price);
        System.out.println("Nosering Length: " + nosering2.length);
        System.out.println("Nosering Hypoallergenic: " + nosering3.hypoallergenic);
        System.out.println("Nosering Diameter: " + nosering4.diameter);
        System.out.println("Nosering Brand: " + nosering1.brand);
        System.out.println("Nosering Weight: " + nosering4.weight);
        System.out.println("Nosering Thickness: " + nosering4.thickness);
        System.out.println("Nosering Sparkle: " + nosering4.sparkleIndex);
        System.out.println("");
    }
}