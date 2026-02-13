class CCTVExecutor {
    public static void main(String[] args) {
        double price = CCTV.getPrice();
        String recommendedUses = CCTV.getRecommendedUses();
        String brand = CCTV.getBrand();
        String modelName = CCTV.getModelName();
        
        String connectivityTechnology = CCTV.getConnectivityTechnology();
        String specialFeature = CCTV.getSpecialFeature();
        String indoorOutdoorUsage = CCTV.getIndoorOutdoorUsage();
        String compatibleDevices = CCTV.getCompatibleDevices();
        
        String powerSource = CCTV.getPowerSource();
        String connectivityProtocol = CCTV.getConnectivityProtocol();
        String controllerType = CCTV.getControllerType();

        System.out.println("CCTV price is: " + price);
        System.out.println("Recommended Uses For Product: " + recommendedUses);
        System.out.println("Brand: " + brand);
        System.out.println("Model Name: " + modelName);
        
        System.out.println("Connectivity Technology: " + connectivityTechnology);
        System.out.println("Special Feature: " + specialFeature);
        System.out.println("Indoor/Outdoor Usage: " + indoorOutdoorUsage);
        System.out.println("Compatible Devices: " + compatibleDevices);
        
        System.out.println("Power Source: " + powerSource);
        System.out.println("Connectivity Protocol: " + connectivityProtocol);
        System.out.println("Controller Type: " + controllerType);
    }
}
