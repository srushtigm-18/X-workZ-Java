class PaperCups {
    String brandName;
    String productName;
    double price;
    String size;
    String variant;
    String capacity;
    int quantity;
    String expiryDate;
    String manufacturingDate;
    String batchNumber;
    String packagingType;
    double thickness;
    double rating;
    String primaryMaterial;
    String secondaryMaterial;
    String thirdMaterial;
    String fourthMaterial;
    String manufacturer;
    String countryOfOrigin;

    public PaperCups(String brandName, String productName, double price, String size, String variant,
                    String capacity, int quantity, String expiryDate, String manufacturingDate,
                    String batchNumber, String packagingType, double thickness, 
                    double rating, String primaryMaterial, String secondaryMaterial,
                    String thirdMaterial, String fourthMaterial, String manufacturer, 
                    String countryOfOrigin) {
        this.brandName = brandName;
        this.productName = productName;
        this.price = price;
        this.size = size;
        this.variant = variant;
        this.capacity = capacity;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.manufacturingDate = manufacturingDate;
        this.batchNumber = batchNumber;
        this.packagingType = packagingType;
        this.thickness = thickness;
        this.rating = rating;
        this.primaryMaterial = primaryMaterial;
        this.secondaryMaterial = secondaryMaterial;
        this.thirdMaterial = thirdMaterial;
        this.fourthMaterial = fourthMaterial;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
    }

    public PaperCups() {
        this("EcoCup", "Disposable Paper Cups", 120.0, "7oz", "Plain White", "200ml", 1000, 
             "2026-06-30", "2025-03-01", "PC001", "Bulk Pack", 0.25, 4.5,
             "Food Grade Paper", "PE Coating", "Waterproof Liner", "Eco Ink", "EcoCup Ltd", "India");
    }

    public void displayProductInfo() {
        System.out.println("Brand: " + brandName);
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Variant: " + variant);
        System.out.println("Capacity: " + capacity);
        System.out.println("Quantity: " + quantity);
        System.out.println("Expiry: " + expiryDate);
        System.out.println("Mfg Date: " + manufacturingDate);
        System.out.println("Batch: " + batchNumber);
        System.out.println("Packaging: " + packagingType);
        System.out.println("Thickness: " + thickness + "mm");
        System.out.println("Rating: " + rating + "/5");
        System.out.println("Materials: " + primaryMaterial + ", " + secondaryMaterial + 
                          ", " + thirdMaterial + ", " + fourthMaterial);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country: " + countryOfOrigin);
        System.out.println("\n");
    }
}
