class HandbagExecutor {
    public static void main(String[] args) {
        Handbag handbag1 = new Handbag("Tote", "Leather", "Black", "Large", 
                                      "Lavie", "Adjustable");
        
        Handbag handbag2 = new Handbag(2500, 15, 35, 800);
        
        Handbag handbag3 = new Handbag(true);
        
        Handbag handbag4 = new Handbag(4.8);
        
        System.out.println("Handbag Style: " + handbag1.style);
        System.out.println("Handbag Material: " + handbag1.material);
        System.out.println("Handbag Price: " + handbag2.price);
        System.out.println("Handbag Color: " + handbag1.color);
        System.out.println("Handbag Capacity: " + handbag2.capacity);
        System.out.println("Handbag Size: " + handbag1.size);
        System.out.println("Handbag Length: " + handbag2.length);
        System.out.println("Handbag Brand: " + handbag1.brand);
        System.out.println("Handbag Weight: " + handbag2.weight);
        System.out.println("Handbag StrapType: " + handbag1.strapType);
        System.out.println("Handbag Waterproof: " + handbag3.waterproof);
        System.out.println("Handbag Quality: " + handbag4.qualityRating);
        System.out.println("");
    }
}