class SmartAlarmExecutor {
    public static void main(String[] args) {
        double price = SmartAlarm.getPrice();
        String styleName = SmartAlarm.getStyleName();
        String operationMode = SmartAlarm.getOperationMode();
        String contactType = SmartAlarm.getContactType();
        
        String connectorType = SmartAlarm.getConnectorType();
        String brand = SmartAlarm.getBrand();
        String switchType = SmartAlarm.getSwitchType();

        System.out.println("Smart Alarm price is: " + price);
        System.out.println("Style Name: " + styleName);
        System.out.println("Operation Mode: " + operationMode);
        System.out.println("Contact Type: " + contactType);
        
        System.out.println("Connector Type: " + connectorType);
        System.out.println("Brand: " + brand);
        System.out.println("Switch Type: " + switchType);
    }
}