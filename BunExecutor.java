class BunExecutor {
    public static void main(String[] args) {
        
        Bun bun1 = new Bun();
        bun1.bunId = 101;
        bun1.flavor = "Butter Bun";
        bun1.price = 15.00;
        bun1.size = "Medium";
        bun1.veg = true;
        bun1.weight = 50.0;
        bun1.shelfLife = 2;
        bun1.packaging = "Plastic";
        bun1.quantity = 100;
        bun1.discount = 10.0;
        bun1.ingredients = new String[]{"Maida", "Butter", "Sugar", "Milk"};
        bun1.outletNames = new String[]{"Bakingo", "Theobroma"};
        
        System.out.println("Bun ID: " + bun1.bunId);
        System.out.println("Bun Flavor: " + bun1.flavor);
        System.out.println("Bun Price: " + bun1.price);
        System.out.println("Bun Size: " + bun1.size);
        System.out.println("Bun Veg: " + bun1.veg);
        System.out.println("Bun Weight: " + bun1.weight);
        System.out.println("Bun ShelfLife: " + bun1.shelfLife);
        System.out.println("Bun Packaging: " + bun1.packaging);
        System.out.println("Bun Quantity: " + bun1.quantity);
        System.out.println("Bun Discount: " + bun1.discount);
        System.out.println("Bun Ingredients: Maida Butter Sugar Milk");
        System.out.println("Bun Outlets: Bakingo Theobroma");
        System.out.println("-----------------------------");
        
        // Bun 2
        Bun bun2 = new Bun();
        bun2.bunId = 102;
        bun2.flavor = "Chocolate Bun";
        bun2.price = 20.00;
        bun2.size = "Large";
        bun2.veg = true;
        bun2.weight = 75.0;
        bun2.shelfLife = 1;
        bun2.packaging = "Paper";
        bun2.quantity = 80;
        bun2.discount = 5.0;
        bun2.ingredients = new String[]{"Maida", "Chocolate", "Sugar", "Egg"};
        bun2.outletNames = new String[]{"Monginis", "JustBake"};
        
        System.out.println("Bun ID: " + bun2.bunId);
        System.out.println("Bun Flavor: " + bun2.flavor);
        System.out.println("Bun Price: " + bun2.price);
        System.out.println("Bun Size: " + bun2.size);
        System.out.println("Bun Veg: " + bun2.veg);
        System.out.println("Bun Weight: " + bun2.weight);
        System.out.println("Bun ShelfLife: " + bun2.shelfLife);
        System.out.println("Bun Packaging: " + bun2.packaging);
        System.out.println("Bun Quantity: " + bun2.quantity);
        System.out.println("Bun Discount: " + bun2.discount);
        System.out.println("Bun Ingredients: Maida Chocolate Sugar Egg");
        System.out.println("Bun Outlets: Monginis JustBake");
        System.out.println("-----------------------------");
        
        // Bun 3
        Bun bun3 = new Bun();
        bun3.bunId = 103;
        bun3.flavor = "Veg Cheese Bun";
        bun3.price = 18.00;
        bun3.size = "Medium";
        bun3.veg = true;
        bun3.weight = 60.0;
        bun3.shelfLife = 1;
        bun3.packaging = "Foil";
        bun3.quantity = 120;
        bun3.discount = 15.0;
        bun3.ingredients = new String[]{"Maida", "Cheese", "Veg", "Spices"};
        bun3.outletNames = new String[]{"Harvest Gold", "CoolBreads"};
        
        System.out.println("Bun ID: " + bun3.bunId);
        System.out.println("Bun Flavor: " + bun3.flavor);
        System.out.println("Bun Price: " + bun3.price);
        System.out.println("Bun Size: " + bun3.size);
        System.out.println("Bun Veg: " + bun3.veg);
        System.out.println("Bun Weight: " + bun3.weight);
        System.out.println("Bun ShelfLife: " + bun3.shelfLife);
        System.out.println("Bun Packaging: " + bun3.packaging);
        System.out.println("Bun Quantity: " + bun3.quantity);
        System.out.println("Bun Discount: " + bun3.discount);
        System.out.println("Bun Ingredients: Maida Cheese Veg Spices");
        System.out.println("Bun Outlets: Harvest Gold CoolBreads");
        System.out.println("-----------------------------");
        
        // Bun 4
        Bun bun4 = new Bun();
        bun4.bunId = 104;
        bun4.flavor = "Pav Bun";
        bun4.price = 12.00;
        bun4.size = "Small";
        bun4.veg = true;
        bun4.weight = 40.0;
        bun4.shelfLife = 3;
        bun4.packaging = "Plastic Bag";
        bun4.quantity = 200;
        bun4.discount = 0.0;
        bun4.ingredients = new String[]{"Maida", "Yeast", "Salt", "Sugar"};
        bun4.outletNames = new String[]{"Modern Bread", "Bakingo"};
        
        System.out.println("Bun ID: " + bun4.bunId);
        System.out.println("Bun Flavor: " + bun4.flavor);
        System.out.println("Bun Price: " + bun4.price);
        System.out.println("Bun Size: " + bun4.size);
        System.out.println("Bun Veg: " + bun4.veg);
        System.out.println("Bun Weight: " + bun4.weight);
        System.out.println("Bun ShelfLife: " + bun4.shelfLife);
        System.out.println("Bun Packaging: " + bun4.packaging);
        System.out.println("Bun Quantity: " + bun4.quantity);
        System.out.println("Bun Discount: " + bun4.discount);
        System.out.println("Bun Ingredients: Maida Yeast Salt Sugar");
        System.out.println("Bun Outlets: Modern Bread Bakingo");
        System.out.println("-----------------------------");
    }
}
