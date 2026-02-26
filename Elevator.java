class Elevator {
    static String brand;
    static String model;
    static int capacity;
    static int floors;
    static double speed;
    static String doorType;
    static String controlType;

    public static boolean createElevator(String brandName, String modelName, int capacityValue, 
                                       int floorCount, double speedValue, String doorTypeValue, 
                                       String controlTypeValue) {
        boolean isElevatorCreated = false;

        boolean isBrandValid = false;
        boolean isModelValid = false;
        boolean isCapacityValid = false;
        boolean isFloorsValid = false;
        boolean isSpeedValid = false;
        boolean isDoorTypeValid = false;
        boolean isControlTypeValid = false;

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

        if (capacityValue > 0) {
            capacity = capacityValue;
            isCapacityValid = true;
        } else {
            System.out.println("The capacity is not valid");
        }

        if (floorCount > 0) {
            floors = floorCount;
            isFloorsValid = true;
        } else {
            System.out.println("The floors count is not valid");
        }

        if (speedValue > 0) {
            speed = speedValue;
            isSpeedValid = true;
        } else {
            System.out.println("The speed is not valid");
        }

        if (doorTypeValue != null && !doorTypeValue.isEmpty()) {
            doorType = doorTypeValue;
            isDoorTypeValid = true;
        } else {
            System.out.println("The door type is not valid");
        }

        if (controlTypeValue != null && !controlTypeValue.isEmpty()) {
            controlType = controlTypeValue;
            isControlTypeValid = true;
        } else {
            System.out.println("The control type is not valid");
        }

        if (isBrandValid && isModelValid && isCapacityValid && isFloorsValid && 
            isSpeedValid && isDoorTypeValid && isControlTypeValid) {
            isElevatorCreated = true;
        }
        return isElevatorCreated;
    }

    public static void getElevatorDetails() {
        System.out.println("Elevator Details");
        System.out.println("Brand " + brand);
        System.out.println("Model " + model);
        System.out.println("Capacity " + capacity + " kg");
        System.out.println("Floors " + floors);
        System.out.println("Speed " + speed + " mps");
        System.out.println("Door Type " + doorType);
        System.out.println("Control Type " + controlType);
        System.out.println("End of Details");
    }
}

