class Oven {
    static boolean powerSupply;
    static int maxTemperature = 6;
    static int currentTemperature;
    
    static boolean switchPower() {
        powerSupply = !powerSupply;
        if (powerSupply) {
            System.out.println("The oven is on:");
        } else {
            System.out.println("The oven is Off:");
            currentTemperature = 0;
        }
        return powerSupply;
    }
    
    static boolean increaseTemperature() {
        if (!powerSupply) {
            System.out.println("Please turn on the oven first");
            return false;
        }
        if (currentTemperature < maxTemperature) {
            currentTemperature = currentTemperature + 1;
            return true;
        } else {
            System.out.println("Maximum temperature (6) reached");
            return false;
        }
    }
    
    static boolean decreaseTemperature() {
        if (!powerSupply) {
            System.out.println("Please turn on the oven first");
            return false;
        }
        if (currentTemperature > 0) {
            currentTemperature = currentTemperature - 1;
            return true;
        } else {
            System.out.println("Minimum temperature reached");
            return false;
        }
    }
    
    public static void main(String[] args) {
        switchPower();
        increaseTemperature();
        increaseTemperature();
        System.out.println("Status - Active: " + powerSupply + " Temperature: " + currentTemperature);
    }
}


