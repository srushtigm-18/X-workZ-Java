class BulletCameraExecutor {
    public static void main(String[] args) {
        double price = BulletCamera.getPrice();
        String mountingType = BulletCamera.getMountingType();
        String videoCaptureResolution = BulletCamera.getVideoCaptureResolution();
        String colour = BulletCamera.getColour();
        
        String numberOfItems = BulletCamera.getNumberOfItems();
        String includedComponents = BulletCamera.getIncludedComponents();
        String wirelessCommunication = BulletCamera.getWirelessCommunicationTechnology();
        String formFactor = BulletCamera.getFormFactor();
        
        String viewingAngle = BulletCamera.getViewingAngle();
        String nightVisionRange = BulletCamera.getNightVisionRange();
        String upperTempRating = BulletCamera.getUpperTemperatureRating();
        String frameRate = BulletCamera.getFrameRate();
        
        String material = BulletCamera.getMaterial();
        double wattage = BulletCamera.getWattage();
        String itemDimensions = BulletCamera.getItemDimensions();
        String waterResistance = BulletCamera.getWaterResistanceLevel();
        
        String batteriesRequired = BulletCamera.getBatteriesRequired();
        String flashMemoryType = BulletCamera.getFlashMemoryType();
        String itemWeight = BulletCamera.getItemWeight();
        String batteryPower = BulletCamera.getBatteryPower();

        System.out.println("Bullet Camera price is: " + price);
        System.out.println("Mounting Type: " + mountingType);
        System.out.println("Video Capture Resolution: " + videoCaptureResolution);
        System.out.println("Colour: " + colour);
        
        System.out.println("Number of Items: " + numberOfItems);
        System.out.println("Included Components: " + includedComponents);
        System.out.println("Wireless Communication Technology: " + wirelessCommunication);
        System.out.println("Form Factor: " + formFactor);
        
        System.out.println("Viewing Angle: " + viewingAngle);
        System.out.println("Night Vision Range: " + nightVisionRange);
        System.out.println("Upper Temperature Rating: " + upperTempRating);
        System.out.println("Frame Rate: " + frameRate);
        
        System.out.println("Material: " + material);
        System.out.println("Wattage: " + wattage + " Watts");
        System.out.println("Item dimensions: " + itemDimensions);
        System.out.println("Water Resistance Level: " + waterResistance);
        
        System.out.println("Batteries Required: " + batteriesRequired);
        System.out.println("Flash Memory Type: " + flashMemoryType);
        System.out.println("Item Weight: " + itemWeight);
        System.out.println("Battery Power: " + batteryPower);
    }
}
