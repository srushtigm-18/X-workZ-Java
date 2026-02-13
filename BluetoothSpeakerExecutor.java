class BluetoothSpeakerExecutor {
    public static void main(String[] args) {
        double price = BluetoothSpeaker.getPrice();
        String mountingType = BluetoothSpeaker.getMountingType();
        String modelName = BluetoothSpeaker.getModelName();
        String speakerType = BluetoothSpeaker.getSpeakerType();
        
        String specialFeature = BluetoothSpeaker.getSpecialFeature();
        String recommendedUses = BluetoothSpeaker.getRecommendedUses();
        String compatibleDevices = BluetoothSpeaker.getCompatibleDevices();
        String subwooferDiameter = BluetoothSpeaker.getSubwooferDiameter();
        
        String surroundSound = BluetoothSpeaker.getSurroundSound();
        String colour = BluetoothSpeaker.getColour();
        String includedComponents = BluetoothSpeaker.getIncludedComponents();
        String productDimensions = BluetoothSpeaker.getProductDimensions();
        
        String itemWeight = BluetoothSpeaker.getItemWeight();
        String isWaterproof = BluetoothSpeaker.getIsWaterproof();
        String warrantyType = BluetoothSpeaker.getWarrantyType();
        int numberOfItems = BluetoothSpeaker.getNumberOfItems();
        
        String controlMethod = BluetoothSpeaker.getControlMethod();
        String wirelessTech = BluetoothSpeaker.getWirelessCommunicationTechnology();
        String speakerSize = BluetoothSpeaker.getSpeakerSize();
        String powerSource = BluetoothSpeaker.getPowerSource();

        System.out.println("Bluetooth Speaker price is: " + price);
        System.out.println("Mounting Type: " + mountingType);
        System.out.println("Model Name: " + modelName);
        System.out.println("Speaker Type: " + speakerType);
        
        System.out.println("Special Feature: " + specialFeature);
        System.out.println("Recommended Uses For Product: " + recommendedUses);
        System.out.println("Compatible Devices: " + compatibleDevices);
        System.out.println("Subwoofer Diameter: " + subwooferDiameter);
        
        System.out.println("Surround Sound Channel Configuration: " + surroundSound);
        System.out.println("Colour: " + colour);
        System.out.println("Included Components: " + includedComponents);
        System.out.println("Product Dimensions: " + productDimensions);
        
        System.out.println("Item Weight: " + itemWeight);
        System.out.println("Is Waterproof: " + isWaterproof);
        System.out.println("Warranty Type: " + warrantyType);
        System.out.println("Number of Items: " + numberOfItems);
        
        System.out.println("Control Method: " + controlMethod);
        System.out.println("Wireless Communication Technology: " + wirelessTech);
        System.out.println("Speaker Size: " + speakerSize);
        System.out.println("Power Source: " + powerSource);
    }
}
