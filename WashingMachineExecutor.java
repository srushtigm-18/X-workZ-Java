class WashingMachineExecutor {
    public static void main(String[] onoff) {
        WashingMachine.switchPower();
        System.out.println("Power status: " + WashingMachine.isConnected);
        WashingMachine.increaseSpeed(); 
        WashingMachine.increaseSpeed();
        WashingMachine.decreaseSpeed();
        System.out.println("Final speed: " + WashingMachine.currentSpeed);
    }
}