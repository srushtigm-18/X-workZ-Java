class ApexPharma {
    static String medicineName;
    static String genericName;
    static String dosageForm;
    static String strength;
    static String packSize;
    static String expiryDate;
    static double price;
    static String category;

    public static boolean createMedicine(String medName, String generic, String dosage, 
                                       String strengthVal, String packSizeVal, String expiry,
                                       double medPrice, String medCategory) {
        boolean isMedicineCreated = false;

        boolean isMedNameValid = false;
        boolean isGenericValid = false;
        boolean isDosageValid = false;
        boolean isStrengthValid = false;
        boolean isPackSizeValid = false;
        boolean isExpiryValid = false;
        boolean isPriceValid = false;
        boolean isCategoryValid = false;

        if (medName != null && !medName.isEmpty()) {
            medicineName = medName;
            isMedNameValid = true;
        } else {
            System.out.println("The medicine name is not valid");
        }

        if (generic != null && !generic.isEmpty()) {
            genericName = generic;
            isGenericValid = true;
        } else {
            System.out.println("The generic name is not valid");
        }

        if (dosage != null && !dosage.isEmpty()) {
            dosageForm = dosage;
            isDosageValid = true;
        } else {
            System.out.println("The dosage form is not valid");
        }

        if (strengthVal != null && !strengthVal.isEmpty()) {
            strength = strengthVal;
            isStrengthValid = true;
        } else {
            System.out.println("The strength is not valid");
        }

        if (packSizeVal != null && !packSizeVal.isEmpty()) {
            packSize = packSizeVal;
            isPackSizeValid = true;
        } else {
            System.out.println("The pack size is not valid");
        }

        if (expiry != null && !expiry.isEmpty()) {
            expiryDate = expiry;
            isExpiryValid = true;
        } else {
            System.out.println("The expiry date is not valid");
        }

        if (medPrice > 0) {
            price = medPrice;
            isPriceValid = true;
        } else {
            System.out.println("The price is not valid");
        }

        if (medCategory != null && !medCategory.isEmpty()) {
            category = medCategory;
            isCategoryValid = true;
        } else {
            System.out.println("The category is not valid");
        }

        if (isMedNameValid && isGenericValid && isDosageValid && isStrengthValid &&
            isPackSizeValid && isExpiryValid && isPriceValid && isCategoryValid) {
            isMedicineCreated = true;
        }
        return isMedicineCreated;
    }

    public static void getMedicine() {
        System.out.println("=== ApexPharma Medicine Details ===");
        System.out.println("Medicine " + medicineName);
        System.out.println("Generic " + genericName);
        System.out.println("Dosage Form " + dosageForm);
        System.out.println("Strength " + strength);
        System.out.println("Pack Size " + packSize);
        System.out.println("Expiry " + expiryDate);
        System.out.println("Price Rs " + price);
        System.out.println("Category " + category);
        System.out.println("================================");
    }
}

