class Camera {
    static String brand;
    static String model;
    static String sensorType;
    static int megapixels;
    static String lensType;
    static String imageStabilization;
    static String videoResolution;
    static double price;
    static String color;
    static String warrantyPeriod;
    static String connectivity;
    static String batteryType;

    public static boolean createCamera(String brandName, String modelName, String sensor, int mp, String lens,
                                       String stabilization, String videoRes, double camPrice, String camColor,
                                       String warranty, String connect, String battery) {
        boolean isCameraCreated = false;

        boolean isBrandValid = false;
        boolean isModelValid = false;
        boolean isSensorValid = false;
        boolean isMpValid = false;
        boolean isLensValid = false;
        boolean isStabilizationValid = false;
        boolean isVideoResValid = false;
        boolean isPriceValid = false;
        boolean isColorValid = false;
        boolean isWarrantyValid = false;
        boolean isConnectivityValid = false;
        boolean isBatteryValid = false;

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

        if (sensor != null && !sensor.isEmpty()) {
            sensorType = sensor;
            isSensorValid = true;
        } else {
            System.out.println("The sensor type is not valid");
        }

        if (mp > 0) {
            megapixels = mp;
            isMpValid = true;
        } else {
            System.out.println("The megapixels value is not valid");
        }

        if (lens != null && !lens.isEmpty()) {
            lensType = lens;
            isLensValid = true;
        } else {
            System.out.println("The lens type is not valid");
        }

        if (stabilization != null && !stabilization.isEmpty()) {
            imageStabilization = stabilization;
            isStabilizationValid = true;
        } else {
            System.out.println("The image stabilization is not valid");
        }

        if (videoRes != null && !videoRes.isEmpty()) {
            videoResolution = videoRes;
            isVideoResValid = true;
        } else {
            System.out.println("The video resolution is not valid");
        }

        if (camPrice > 0) {
            price = camPrice;
            isPriceValid = true;
        } else {
            System.out.println("The price is not valid");
        }

        if (camColor != null && !camColor.isEmpty()) {
            color = camColor;
            isColorValid = true;
        } else {
            System.out.println("The color is not valid");
        }

        if (warranty != null && !warranty.isEmpty()) {
            warrantyPeriod = warranty;
            isWarrantyValid = true;
        } else {
            System.out.println("The warranty period is not valid");
        }

        if (connect != null && !connect.isEmpty()) {
            connectivity = connect;
            isConnectivityValid = true;
        } else {
            System.out.println("The connectivity is not valid");
        }

        if (battery != null && !battery.isEmpty()) {
            batteryType = battery;
            isBatteryValid = true;
        } else {
            System.out.println("The battery type is not valid");
        }

        if (isBrandValid && isModelValid && isSensorValid && isMpValid && isLensValid &&
            isStabilizationValid && isVideoResValid && isPriceValid && isColorValid &&
            isWarrantyValid && isConnectivityValid && isBatteryValid) {
            isCameraCreated = true;
        }
        return isCameraCreated;
    }

    public static void getCameraDetails() {
        System.out.println("The Camera Details are:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Sensor Type: " + sensorType);
        System.out.println("Megapixels: " + megapixels + " MP");
        System.out.println("Lens Type: " + lensType);
        System.out.println("Image Stabilization: " + imageStabilization);
        System.out.println("Video Resolution: " + videoResolution);
        System.out.println("Price: ₹" + price);
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warrantyPeriod);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Battery Type: " + batteryType);
    }
}

