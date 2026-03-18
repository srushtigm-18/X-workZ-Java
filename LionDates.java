class LionDates {
    String brandName;
    String productName;
    double price;
    String size;
    String variant;
    String packaging;
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

    public LionDates(String brandName, String productName, double price, String size, String variant,
                    String packaging, double weight, String expiryDate, String manufacturingDate,
                    String batchNumber, int quantity, String packagingType, 
                    double rating, String primaryIngredient, String secondaryIngredient,
                    String thirdIngredient, String fourthIngredient, String manufacturer, 
                    String countryOfOrigin) {
        this.brandName = brandName;
        this.productName = productName;
        this.price = price;
        this.size = size;
        this.variant = variant;
        this.packaging = packaging;
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

    public LionDates() {
        this("Lion Brand", "Premium Lion Dates", 450.0, "500g", "Seedless", "Resealable Pouch", 500.0,
             "2026-09-30", "2025-03-01", "LD001", 1, "Box Pack", 4.9,
             "Lion Dates", "Golden Syrup", "Natural Sugar", "Vitamin Rich", "Lion Dates Ltd", "India");
    }

    public void displayProductInfo() {
        System.out.println("Brand: " + brandName);
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Variant: " + variant);
        System.out.println("Packaging: " + packaging);
        System.out.println("Weight: " + weight + "g");
        System.out.println("Expiry: " + expiryDate);
        System.out.println("Mfg Date: " + manufacturingDate);
        System.out.println("Batch: " + batchNumber);
        System.out.println("Quantity: " + quantity);
        System.out.println("Pack Type: " + packagingType);
        System.out.println("Rating: " + rating + "/5");
        System.out.println("Ingredients: " + primaryIngredient + ", " + secondaryIngredient + 
                          ", " + thirdIngredient + ", " + fourthIngredient);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country: " + countryOfOrigin);
        System.out.println("\n");
    }
}

