class MedicalShop {
    String shopName;
    String medicineName;
    double price;
    String size;
    String variant;
    String dosageForm;
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

    public MedicalShop(String shopName, String medicineName, double price, String size, String variant,
                      String dosageForm, double weight, String expiryDate, String manufacturingDate,
                      String batchNumber, int quantity, String packagingType, 
                      double rating, String primaryIngredient, String secondaryIngredient,
                      String thirdIngredient, String fourthIngredient, String manufacturer, 
                      String countryOfOrigin) {
        this.shopName = shopName;
        this.medicineName = medicineName;
        this.price = price;
        this.size = size;
        this.variant = variant;
        this.dosageForm = dosageForm;
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

    public MedicalShop() {
        this("MediCare", "Paracetamol 500mg", 15.0, "10 Tablets", "500mg", "Tablet", 10.0,
             "2026-06-30", "2025-03-01", "MS001", 100, "Strip", 4.7,
             "Paracetamol", "Starch", "Magnesium Stearate", "Talc", "MediCare Pharma", "India");
    }

    public void displayProductInfo() {
        System.out.println("Shop: " + shopName);
        System.out.println("Medicine: " + medicineName);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Variant: " + variant);
        System.out.println("Dosage Form: " + dosageForm);
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

