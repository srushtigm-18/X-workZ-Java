class ElectricLampExecutor {
    public static void main(String[] onoff) {
        ElectricLamp.switchPower();
        System.out.println("Power status: " + ElectricLamp.isConnected);
        ElectricLamp.increaseBrightness(); 
        ElectricLamp.increaseBrightness();
        ElectricLamp.decreaseBrightness();
        System.out.println("Final brightness: " + ElectricLamp.currentBrightness);
    }
}
