class Cylinder {
    String brandName;
    String productName;
    double price;
    String size;
    String variant;
    String material;
    double weight;
    String expiryDate;
    String manufacturingDate;
    String batchNumber;
    int quantity;
    String packagingType;
    double rating;
    String primaryMaterial;
    String secondaryMaterial;
    String thirdMaterial;
    String fourthMaterial;
    String manufacturer;
    String countryOfOrigin;

    public Cylinder(String brandName, String productName, double price, String size, String variant,
                   String material, double weight, String expiryDate, String manufacturingDate,
                   String batchNumber, int quantity, String packagingType, 
                   double rating, String primaryMaterial, String secondaryMaterial,
                   String thirdMaterial, String fourthMaterial, String manufacturer, 
                   String countryOfOrigin) {
        this.brandName = brandName;
        this.productName = productName;
        this.price = price;
        this.size = size;
        this.variant = variant;
        this.material = material;
        this.weight = weight;
        this.expiryDate = expiryDate;
        this.manufacturingDate = manufacturingDate;
        this.batchNumber = batchNumber;
        this.quantity = quantity;
        this.packagingType = packagingType;
        this.rating = rating;
        this.primaryMaterial = primaryMaterial;
        this.secondaryMaterial = secondaryMaterial;
        this.thirdMaterial = thirdMaterial;
        this.fourthMaterial = fourthMaterial;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
    }

    public Cylinder() {
        this("GasTech", "LPG Cylinder", 1200.0, "14.2kg", "Domestic", "Steel", 15.0,
             "2026-12-31", "2025-03-01", "CY001", 1, "Valve Fitted", 4.8,
             "Steel", "Carbon Steel", "Valve Brass", "Safety Cap", "GasTech Ltd", "India");
    }

    public void displayProductInfo() {
        System.out.println("Brand: " + brandName);
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Variant: " + variant);
        System.out.println("Material: " + material);
        System.out.println("Weight: " + weight + "kg");
        System.out.println("Expiry: " + expiryDate);
        System.out.println("Mfg Date: " + manufacturingDate);
        System.out.println("Batch: " + batchNumber);
        System.out.println("Quantity: " + quantity);
        System.out.println("Packaging: " + packagingType);
        System.out.println("Rating: " + rating + "/5");
        System.out.println("Materials: " + primaryMaterial + ", " + secondaryMaterial + 
                          ", " + thirdMaterial + ", " + fourthMaterial);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country: " + countryOfOrigin);
        System.out.println("\n");
    }
}
