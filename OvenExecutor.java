class OvenExecutor {
    public static void main(String[] onoff) {
        Oven.switchPower();
        System.out.println("Power status: " + Oven.powerSupply);
        Oven.increaseTemperature(); 
        Oven.increaseTemperature();
        Oven.decreaseTemperature();
        System.out.println("Final temperature: " + Oven.currentTemperature);
    }
}