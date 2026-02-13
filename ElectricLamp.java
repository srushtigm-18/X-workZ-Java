class ElectricLamp {
    static boolean isConnected;
    static int maxBrightness = 6;
    static int currentBrightness;
    
    static boolean switchPower() {
        isConnected = !isConnected;
        if (isConnected) {
            System.out.println("The lamp is on:");
        } else {
            System.out.println("The lamp is Off:");
            currentBrightness = 0;
        }
        return isConnected;
    }
    
    static boolean increaseBrightness() {
        if (!isConnected) {
            System.out.println("Please turn on the lamp first");
            return false;
        }
        if (currentBrightness < maxBrightness) {
            currentBrightness = currentBrightness + 1;
            return true;
        } else {
            System.out.println("Maximum brightness (6) reached");
            return false;
        }
    }
    
    static boolean decreaseBrightness() {
        if (!isConnected) {
            System.out.println("Please turn on the lamp first");
            return false;
        }
        if (currentBrightness > 0) {
            currentBrightness = currentBrightness - 1;
            return true;
        } else {
            System.out.println("Minimum brightness reached");
            return false;
        }
    }
    
    public static void main(String[] args) {
        switchPower();
        increaseBrightness();
        increaseBrightness();
        System.out.println("Status - Active: " + isConnected + ", Brightness: " + currentBrightness);
    }
}

