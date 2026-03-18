class TheoBroma {
    String brandName;
    String productName;
    double price;
    String size;
    String variant;
    String flavor;
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

    public TheoBroma(String brandName, String productName, double price, String size, String variant,
                    String flavor, double weight, String expiryDate, String manufacturingDate,
                    String batchNumber, int quantity, String packagingType, 
                    double rating, String primaryIngredient, String secondaryIngredient,
                    String thirdIngredient, String fourthIngredient, String manufacturer, 
                    String countryOfOrigin) {
        this.brandName = brandName;
        this.productName = productName;
        this.price = price;
        this.size = size;
        this.variant = variant;
        this.flavor = flavor;
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

    public TheoBroma() {
        this("Theobroma", "55% Dark Chocolate", 150.0, "60g", "Sea Salt Almond", "Dark Chocolate", 60.0,
             "2026-09-30", "2025-03-01", "TB001", 1, "Fancy Wrapper", 4.8,
             "Cocoa 55%", "Almonds", "Sea Salt", "Sugar", "Theobroma Ltd", "India");
    }

    public void displayProductInfo() {
        System.out.println("Brand: " + brandName);
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Variant: " + variant);
        System.out.println("Flavor: " + flavor);
        System.out.println("Weight: " + weight + "g");
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


