class SweaterExecutor {
    public static void main(String[] args) {
        Sweater sweater1 = new Sweater("Pullover", "Wool", "Navy", "M", 
                                      "Monte Carlo", "Full Sleeve");
        
        Sweater sweater2 = new Sweater(1200, 40, 26, 350);
        
        Sweater sweater3 = new Sweater(true);
        
        Sweater sweater4 = new Sweater(9.2);
        
        System.out.println("Sweater Style: " + sweater1.style);
        System.out.println("Sweater Material: " + sweater1.material);
        System.out.println("Sweater Price: " + sweater2.price);
        System.out.println("Sweater Color: " + sweater1.color);
        System.out.println("Sweater ChestSize: " + sweater2.chestSize);
        System.out.println("Sweater Size: " + sweater1.size);
        System.out.println("Sweater Length: " + sweater2.length);
        System.out.println("Sweater Brand: " + sweater1.brand);
        System.out.println("Sweater Weight: " + sweater2.weight);
        System.out.println("Sweater SleeveType: " + sweater1.sleeveType);
        System.out.println("Sweater Wool: " + sweater3.wool);
        System.out.println("Sweater Warmth: " + sweater4.warmthRating);
        System.out.println("");
    }
}
