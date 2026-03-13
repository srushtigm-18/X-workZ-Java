class MaggiExecutor {
    public static void main(String[] args) {
        Maggi maggi1 = new Maggi("Classic", "Nestle", "Single Pack", "Medium", 
                                "2026-06-01", "Noodles,Spices,Oil");
        
        Maggi maggi2 = new Maggi(2, 25, 70, 12);
        
        Maggi maggi3 = new Maggi(true);
        
        Maggi maggi4 = new Maggi(4.5);
        
        System.out.println("Maggi Flavor: " + maggi1.flavor);
        System.out.println("Maggi Brand: " + maggi1.brand);
        System.out.println("Maggi Quantity: " + maggi2.quantity);
        System.out.println("Maggi Packaging: " + maggi1.packaging);
        System.out.println("Maggi Price: " + maggi2.price);
        System.out.println("Maggi SpiceLevel: " + maggi1.spiceLevel);
        System.out.println("Maggi Weight: " + maggi2.weight);
        System.out.println("Maggi Expiry: " + maggi1.expiry);
        System.out.println("Maggi ShelfLife: " + maggi2.shelfLife);
        System.out.println("Maggi Ingredients: " + maggi1.ingredients);
        System.out.println("Maggi Veg: " + maggi3.veg);
        System.out.println("Maggi Rating: " + maggi4.rating);
        System.out.println("");
    }
}