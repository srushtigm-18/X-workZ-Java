class ACExecutor {
    public static void main(String[] onoff) {
        AirConditioner.switchPower();
        System.out.println("Power status: " + AirConditioner.powerStatus);
        AirConditioner.increaseCooling(); 
        AirConditioner.increaseCooling();
        AirConditioner.decreaseCooling();
        System.out.println("Final cooling: " + AirConditioner.currentCooling);
    }
}