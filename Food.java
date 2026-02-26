class Food {
    static String dishName;
    static String cuisine;
    static double price;
    static String preparationTime;
    static String spiceLevel;

    public static boolean createFood(String name, String cuisineType, double foodPrice, 
                                   String prepTime, String spice) {
        boolean isFoodCreated = false;

        boolean isDishNameValid = false;
        boolean isCuisineValid = false;
        boolean isPriceValid = false;
        boolean isPrepTimeValid = false;
        boolean isSpiceLevelValid = false;

        if (name != null && !name.isEmpty()) {
            dishName = name;
            isDishNameValid = true;
        } else {
            System.out.println("The dish name is not valid");
        }

        if (cuisineType != null && !cuisineType.isEmpty()) {
            cuisine = cuisineType;
            isCuisineValid = true;
        } else {
            System.out.println("The cuisine type is not valid");
        }

        if (foodPrice > 0) {
            price = foodPrice;
            isPriceValid = true;
        } else {
            System.out.println("The price is not valid");
        }

        if (prepTime != null && !prepTime.isEmpty()) {
            preparationTime = prepTime;
            isPrepTimeValid = true;
        } else {
            System.out.println("The preparation time is not valid");
        }

        if (spice != null && !spice.isEmpty()) {
            spiceLevel = spice;
            isSpiceLevelValid = true;
        } else {
            System.out.println("The spice level is not valid");
        }

        if (isDishNameValid && isCuisineValid && isPriceValid && 
            isPrepTimeValid && isSpiceLevelValid) {
            isFoodCreated = true;
        }
        return isFoodCreated;
    }

    public static void getFoodDetails() {
        System.out.println("=== Food Menu Details ===");
        System.out.println("Dish: " + dishName);
        System.out.println("Cuisine: " + cuisine);
        System.out.println("Price: ₹" + price);
        System.out.println("Prep Time: " + preparationTime);
        System.out.println("Spice Level: " + spiceLevel);
    }
}

