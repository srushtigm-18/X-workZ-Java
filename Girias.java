class Girias {
    static String brand;
    static String model;
    static String capacity;
    static String type;
    static int rpm;
    static String energyRating;
    static double price;
    static String color;
    static String warranty;
    static String specialFeatures;

    public static boolean createWashingMachine(String brandName, String modelName, String capacityValue, 
                                             String machineType, int spinSpeed, String energyGrade, 
                                             double machinePrice, String machineColor, String warrantyPeriod, 
                                             String features) {
        boolean isWashingMachineCreated = false;

        boolean isBrandValid = false;
        boolean isModelValid = false;
        boolean isCapacityValid = false;
        boolean isTypeValid = false;
        boolean isRpmValid = false;
        boolean isEnergyRatingValid = false;
        boolean isPriceValid = false;
        boolean isColorValid = false;
        boolean isWarrantyValid = false;
        boolean isFeaturesValid = false;

 
        if (brandName != null && !brandName.isEmpty()) {
            brand = brandName;
            isBrandValid = true;
        } else {
            System.out.println("The brand name is not valid");
        }

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

        if (machineType != null && !machineType.isEmpty()) {
            type = machineType;
            isTypeValid = true;
        } else {
            System.out.println("The washing machine type is not valid");
        }

        if (spinSpeed > 0) {
            rpm = spinSpeed;
            isRpmValid = true;
        } else {
            System.out.println("The RPM value is not valid");
        }

        if (energyGrade != null && !energyGrade.isEmpty()) {
            energyRating = energyGrade;
            isEnergyRatingValid = true;
        } else {
            System.out.println("The energy rating is not valid");
        }

        if (machinePrice > 0) {
            price = machinePrice;
            isPriceValid = true;
        } else {
            System.out.println("The price is not valid");
        }

        if (machineColor != null && !machineColor.isEmpty()) {
            color = machineColor;
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

        if (features != null && !features.isEmpty()) {
            specialFeatures = features;
            isFeaturesValid = true;
        } else {
            System.out.println("The special features are not valid");
        }

        if (isBrandValid && isModelValid && isCapacityValid && isTypeValid && isRpmValid &&
            isEnergyRatingValid && isPriceValid && isColorValid && isWarrantyValid && isFeaturesValid) {
            isWashingMachineCreated = true;
        }
        return isWashingMachineCreated;
    }

    public static void getWashingMachineDetails() {
        System.out.println("---Girias Washing Machine Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Capacity: " + capacity);
        System.out.println("Type: " + type);
        System.out.println("Spin Speed: " + rpm + " RPM");
        System.out.println("Energy Rating: " + energyRating);
        System.out.println("Price: ₹" + price);
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warranty);
        System.out.println("Special Features: " + specialFeatures);
    }
}

