class TediBarLotion {
    String brandName;
    String productName;
    double price;
    String size;
    String variant;
    String fragrance;
    double weight;
    String expiryDate;
    String manufacturingDate;
    String batchNumber;
    int quantity;
    String packagingType;
    double rating;
    String primaryIngredient;
    String secondaryIngredient;
    String thirdIngredient;
    String fourthIngredient;
    String manufacturer;
    String countryOfOrigin;

    public TediBarLotion(String brandName, String productName, double price, String size, String variant,
                        String fragrance, double weight, String expiryDate, String manufacturingDate,
                        String batchNumber, int quantity, String packagingType, 
                        double rating, String primaryIngredient, String secondaryIngredient,
                        String thirdIngredient, String fourthIngredient, String manufacturer, 
                        String countryOfOrigin) {
        this.brandName = brandName;
        this.productName = productName;
        this.price = price;
        this.size = size;
        this.variant = variant;
        this.fragrance = fragrance;
        this.weight = weight;
        this.expiryDate = expiryDate;
        this.manufacturingDate = manufacturingDate;
        this.batchNumber = batchNumber;
        this.quantity = quantity;
        this.packagingType = packagingType;
        this.rating = rating;
        this.primaryIngredient = primaryIngredient;
        this.secondaryIngredient = secondaryIngredient;
        this.thirdIngredient = thirdIngredient;
        this.fourthIngredient = fourthIngredient;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
    }

    public TediBarLotion() {
        this("TediBar", "TediBar Daily Lotion", 139.0, "100ml", "Regular", "AloeVera", 100.0,
             "2026-12-31", "2025-03-01", "TB001", 1, "Plastic Bottle", 4.5,
             "Aloe Vera", "Vitamin E", "Shea Butter", "Coconut Oil", "TediBar Ltd", "India");
    }

    public void displayProductInfo() {
        System.out.println("Brand: " + brandName);
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Variant: " + variant);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Weight: " + weight + "ml");
        System.out.println("Expiry: " + expiryDate);
        System.out.println("Mfg Date: " + manufacturingDate);
        System.out.println("Batch: " + batchNumber);
        System.out.println("Quantity: " + quantity);
        System.out.println("Packaging: " + packagingType);
        System.out.println("Rating: " + rating + "/5");
        System.out.println("Ingredients: " + primaryIngredient + ", " + secondaryIngredient + 
                          ", " + thirdIngredient + ", " + fourthIngredient);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country: " + countryOfOrigin);
        System.out.println("\n");
    }
}
