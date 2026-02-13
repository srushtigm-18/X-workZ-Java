class SmartSwitchExecutor {
    public static void main(String[] args) {
        double price = SmartSwitch.getPrice();
        String operationMode = SmartSwitch.getOperationMode();
        String currentRating = SmartSwitch.getCurrentRating();
        String operatingVoltage = SmartSwitch.getOperatingVoltage();
        
        String contactType = SmartSwitch.getContactType();
        String connectorType = SmartSwitch.getConnectorType();

        System.out.println("Smart Switch price is: " + price);
        System.out.println("Operation Mode: " + operationMode);
        System.out.println("Current Rating: " + currentRating);
        System.out.println("Operating Voltage: " + operatingVoltage);
        
        System.out.println("Contact Type: " + contactType);
        System.out.println("Connector Type: " + connectorType);
    }
}
