class HappyDentExecutor {
    public static void main(String[] args) {
        HappyDent happydent1 = new HappyDent();
        happydent1.flavor = "Fresh Mint";
        happydent1.price = 20.00;
        happydent1.pieces = 12;
        happydent1.packaging = "Strip";
        happydent1.weight = 14.0;
        happydent1.expiry = "2026-12-01";
        happydent1.ingredients = new String[]{"Sugar", "Menthol", "Sorbitol"};
        happydent1.nutrition = new int[]{50, 10, 2};
        
        System.out.println("HappyDent Flavor: " + happydent1.flavor);
        System.out.println("HappyDent Price: " + happydent1.price);
        System.out.println("HappyDent Pieces: " + happydent1.pieces);
        System.out.println("HappyDent Packaging: " + happydent1.packaging);
        System.out.println("HappyDent Weight: " + happydent1.weight + "g");
        System.out.println("HappyDent Expiry: " + happydent1.expiry);
        System.out.println("HappyDent Ingredients: Sugar Menthol Sorbitol");
        System.out.println("HappyDent Nutrition: 50 10 2 cal");
        System.out.println("-----------------------------");
        
        HappyDent happydent2 = new HappyDent();
        happydent2.flavor = "Fruit Blast";
        happydent2.price = 22.00;
        happydent2.pieces = 14;
        happydent2.packaging = "Pack";
        happydent2.weight = 16.5;
        happydent2.expiry = "2026-11-15";
        happydent2.ingredients = new String[]{"Sugar", "Fruit Extract", "Gum Base"};
        happydent2.nutrition = new int[]{55, 12, 3};
        
        System.out.println("HappyDent Flavor: " + happydent2.flavor);
        System.out.println("HappyDent Price: " + happydent2.price);
        System.out.println("HappyDent Pieces: " + happydent2.pieces);
        System.out.println("HappyDent Packaging: " + happydent2.packaging);
        System.out.println("HappyDent Weight: " + happydent2.weight + "g");
        System.out.println("HappyDent Expiry: " + happydent2.expiry);
        System.out.println("HappyDent Ingredients: Sugar Fruit Extract Gum Base");
        System.out.println("HappyDent Nutrition: 55 12 3 cal");
        System.out.println("-----------------------------");
        
        HappyDent happydent3 = new HappyDent();
        happydent3.flavor = "Double Mint";
        happydent3.price = 25.00;
        happydent3.pieces = 10;
        happydent3.packaging = "Box";
        happydent3.weight = 12.0;
        happydent3.expiry = "2026-10-30";
        happydent3.ingredients = new String[]{"Xylitol", "Menthol", "Spearmint"};
        happydent3.nutrition = new int[]{40, 8, 1};
        
        System.out.println("HappyDent Flavor: " + happydent3.flavor);
        System.out.println("HappyDent Price: " + happydent3.price);
        System.out.println("HappyDent Pieces: " + happydent3.pieces);
        System.out.println("HappyDent Packaging: " + happydent3.packaging);
        System.out.println("HappyDent Weight: " + happydent3.weight + "g");
        System.out.println("HappyDent Expiry: " + happydent3.expiry);
        System.out.println("HappyDent Ingredients: Xylitol Menthol Spearmint");
        System.out.println("HappyDent Nutrition: 40 8 1 cal");
        System.out.println("-----------------------------");
        
        HappyDent happydent4 = new HappyDent();
        happydent4.flavor = "Ice Cool";
        happydent4.price = 18.00;
        happydent4.pieces = 15;
        happydent4.packaging = "Strip";
        happydent4.weight = 18.0;
        happydent4.expiry = "2026-12-20";
        happydent4.ingredients = new String[]{"Sorbitol", "Menthol", "Coolant"};
        happydent4.nutrition = new int[]{45, 9, 2};
        
        System.out.println("HappyDent Flavor: " + happydent4.flavor);
        System.out.println("HappyDent Price: " + happydent4.price);
        System.out.println("HappyDent Pieces: " + happydent4.pieces);
        System.out.println("HappyDent Packaging: " + happydent4.packaging);
        System.out.println("HappyDent Weight: " + happydent4.weight + "g");
        System.out.println("HappyDent Expiry: " + happydent4.expiry);
        System.out.println("HappyDent Ingredients: Sorbitol Menthol Coolant");
        System.out.println("HappyDent Nutrition: 45 9 2 cal");
        System.out.println("-----------------------------");
    }
}
