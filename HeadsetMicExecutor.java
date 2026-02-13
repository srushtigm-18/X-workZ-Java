class HeadsetMicExecutor {
    public static void main(String[] args) {
        double price = HeadsetMic.getPrice();
        String brand = HeadsetMic.getBrand();
        String itemDimensions = HeadsetMic.getItemDimensions();
        String connectivityTechnology = HeadsetMic.getConnectivityTechnology();
        
        String colour = HeadsetMic.getColour();
        String compatibleDevices = HeadsetMic.getCompatibleDevices();

        System.out.println("Headset Mic price is: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Item dimensions : " + itemDimensions);
        System.out.println("Connectivity Technology: " + connectivityTechnology);
        
        System.out.println("Colour: " + colour);
        System.out.println("Compatible Devices: " + compatibleDevices);
    }
}
