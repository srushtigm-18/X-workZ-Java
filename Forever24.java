class Forever24 {
    static String brandName;
    static String clothType;
    static String size;
    static String color;
    static String material;
    static String sleeveType;
    static String neckType;
    static String fitType;
    static double price;
    static String occasion;
    static String careInstructions;
    static String warranty;

    public static boolean createCloth(String brand, String type, String sizeVal, String colorVal, 
                                   String materialType, String sleeve, String neck, String fit,
                                   double clothPrice, String occasionType, String care, String warrantyPeriod) {
        boolean isClothCreated = false;

        boolean isBrandValid = false;
        boolean isTypeValid = false;
        boolean isSizeValid = false;
        boolean isColorValid = false;
        boolean isMaterialValid = false;
        boolean isSleeveValid = false;
        boolean isNeckValid = false;
        boolean isFitValid = false;
        boolean isPriceValid = false;
        boolean isOccasionValid = false;
        boolean isCareValid = false;
        boolean isWarrantyValid = false;

        if (brand != null && !brand.isEmpty()) {
            brandName = brand;
            isBrandValid = true;
        } else {
            System.out.println("The brand name is not valid");
        }

        if (type != null && !type.isEmpty()) {
            clothType = type;
            isTypeValid = true;
        } else {
            System.out.println("The cloth type is not valid");
        }

        if (sizeVal != null && !sizeVal.isEmpty()) {
            size = sizeVal;
            isSizeValid = true;
        } else {
            System.out.println("The size is not valid");
        }

        if (colorVal != null && !colorVal.isEmpty()) {
            color = colorVal;
            isColorValid = true;
        } else {
            System.out.println("The color is not valid");
        }

        if (materialType != null && !materialType.isEmpty()) {
            material = materialType;
            isMaterialValid = true;
        } else {
            System.out.println("The material is not valid");
        }

        if (sleeve != null && !sleeve.isEmpty()) {
            sleeveType = sleeve;
            isSleeveValid = true;
        } else {
            System.out.println("The sleeve type is not valid");
        }

        if (neck != null && !neck.isEmpty()) {
            neckType = neck;
            isNeckValid = true;
        } else {
            System.out.println("The neck type is not valid");
        }

        if (fit != null && !fit.isEmpty()) {
            fitType = fit;
            isFitValid = true;
        } else {
            System.out.println("The fit type is not valid");
        }

        if (clothPrice > 0) {
            price = clothPrice;
            isPriceValid = true;
        } else {
            System.out.println("The price is not valid");
        }

        if (occasionType != null && !occasionType.isEmpty()) {
            occasion = occasionType;
            isOccasionValid = true;
        } else {
            System.out.println("The occasion is not valid");
        }

        if (care != null && !care.isEmpty()) {
            careInstructions = care;
            isCareValid = true;
        } else {
            System.out.println("The care instructions are not valid");
        }

        if (warrantyPeriod != null && !warrantyPeriod.isEmpty()) {
            warranty = warrantyPeriod;
            isWarrantyValid = true;
        } else {
            System.out.println("The warranty is not valid");
        }

        if (isBrandValid && isTypeValid && isSizeValid && isColorValid && isMaterialValid &&
            isSleeveValid && isNeckValid && isFitValid && isPriceValid && isOccasionValid &&
            isCareValid && isWarrantyValid) {
            isClothCreated = true;
        }
        return isClothCreated;
    }

    public static void getCloth() {
        System.out.println("=== Forever24 Clothing Details ===");
        System.out.println("Brand: " + brandName);
        System.out.println("Type: " + clothType);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Sleeve: " + sleeveType);
        System.out.println("Neck: " + neckType);
        System.out.println("Fit: " + fitType);
        System.out.println("Price: ₹" + price);
        System.out.println("Occasion: " + occasion);
        System.out.println("Care: " + careInstructions);
        System.out.println("Warranty: " + warranty);
    }
}

