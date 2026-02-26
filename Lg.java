class Lg {
    static String model;
    static String capacity;
    static String type;
    static String energyRating;
    static int coolingTech;
    static String compressor;
    static double price;
    static String color;
    static String warranty;
    static String specialFeatures;

    public static boolean createrefrigerator(String modelName, String capacityValue, String fridgeType,
                                          String energyGrade, int coolingValue, String compressorType,
                                          double fridgePrice, String fridgeColor, String warrantyPeriod,
                                          String featuresList) {
        boolean isRefrigeratorCreated = false;

        boolean isModelValid = false;
        boolean isCapacityValid = false;
        boolean isTypeValid = false;
        boolean isEnergyRatingValid = false;
        boolean isCoolingTechValid = false;
        boolean isCompressorValid = false;
        boolean isPriceValid = false;
        boolean isColorValid = false;
        boolean isWarrantyValid = false;
        boolean isFeaturesValid = false;

        if (modelName != null && !modelName.isEmpty()) {
            model = modelName;
            isModelValid = true;
        } else {
            System.out.println("The model name is not valid");
        }

        if (capacityValue != null && !capacityValue.isEmpty()) {
            capacity = capacityValue;
            isCapacityValid = true;
        } else {
            System.out.println("The capacity is not valid");
        }

        if (fridgeType != null && !fridgeType.isEmpty()) {
            type = fridgeType;
            isTypeValid = true;
        } else {
            System.out.println("The refrigerator type is not valid");
        }

        if (energyGrade != null && !energyGrade.isEmpty()) {
            energyRating = energyGrade;
            isEnergyRatingValid = true;
        } else {
            System.out.println("The energy rating is not valid");
        }

        if (coolingValue > 0) {
            coolingTech = coolingValue;
            isCoolingTechValid = true;
        } else {
            System.out.println("The cooling technology value is not valid");
        }

        if (compressorType != null && !compressorType.isEmpty()) {
            compressor = compressorType;
            isCompressorValid = true;
        } else {
            System.out.println("The compressor type is not valid");
        }

        if (fridgePrice > 0) {
            price = fridgePrice;
            isPriceValid = true;
        } else {
            System.out.println("The price is not valid");
        }

        if (fridgeColor != null && !fridgeColor.isEmpty()) {
            color = fridgeColor;
            isColorValid = true;
        } else {
            System.out.println("The color is not valid");
        }

        if (warrantyPeriod != null && !warrantyPeriod.isEmpty()) {
            warranty = warrantyPeriod;
            isWarrantyValid = true;
        } else {
            System.out.println("The warranty period is not valid");
        }

        if (featuresList != null && !featuresList.isEmpty()) {
            specialFeatures = featuresList;
            isFeaturesValid = true;
        } else {
            System.out.println("The special features are not valid");
        }

        if (isModelValid && isCapacityValid && isTypeValid && isEnergyRatingValid && 
            isCoolingTechValid && isCompressorValid && isPriceValid && isColorValid &&
            isWarrantyValid && isFeaturesValid) {
            isRefrigeratorCreated = true;
        }
        return isRefrigeratorCreated;
    }

    public static void getRefrigeratorDetails() {
        System.out.println("=== LG Refrigerator Details ===");
        System.out.println("Model " + model);
        System.out.println("Capacity " + capacity);
        System.out.println("Type " + type);
        System.out.println("Energy Rating " + energyRating);
        System.out.println("Cooling Tech " + coolingTech + " Star");
        System.out.println("Compressor " + compressor);
        System.out.println("Price Rs " + price);
        System.out.println("Color " + color);
        System.out.println("Warranty " + warranty);
        System.out.println("Features " + specialFeatures);
        System.out.println("==============================");
    }
}

