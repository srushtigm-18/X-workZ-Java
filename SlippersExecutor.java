class SlippersExecutor {
    public static void main(String[] args) {
        Slippers slippers1 = new Slippers("Open Toe", "EVA", "Black");
        
        Slippers slippers2 = new Slippers(8, 450, 1);
        
        Slippers slippers3 = new Slippers(true, true, true);
        
        Slippers slippers4 = new Slippers(1.2, 0.15, 0.8);
        
        System.out.println("Slippers Style: " + slippers1.style);
        System.out.println("Slippers Size: " + slippers2.size);
        System.out.println("Slippers AntiSlip: " + slippers3.antiSlip);
        System.out.println("Slippers SoleThickness: " + slippers4.soleThickness);
        System.out.println("Slippers Material: " + slippers1.material);
        System.out.println("Slippers Price: " + slippers2.price);
        System.out.println("Slippers ArchSupport: " + slippers3.archSupport);
        System.out.println("Slippers Weight: " + slippers4.weight);
        System.out.println("Slippers Color: " + slippers1.color);
        System.out.println("Slippers PairCount: " + slippers2.pairCount);
        System.out.println("Slippers Washable: " + slippers3.washable);
        System.out.println("Slippers CushionHeight: " + slippers4.cushionHeight);
        System.out.println("");
    }
}
