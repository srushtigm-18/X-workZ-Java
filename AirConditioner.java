class AirConditioner {
    static boolean powerStatus;
    static int maxCooling = 6;
    static int currentCooling;
    
    static boolean switchPower() {
        powerStatus = !powerStatus;
        if (powerStatus) {
            System.out.println("The AC is on:");
        } else {
            System.out.println("The AC is Off:");
            currentCooling = 0;
        }
        return powerStatus;
    }
    
    static boolean increaseCooling() {
        if (!powerStatus) {
            System.out.println("Please turn on the AC first");
            return false;
        }
        if (currentCooling < maxCooling) {
            currentCooling = currentCooling + 1;
            return true;
        } else {
            System.out.println("Maximum cooling (6) reached");
            return false;
        }
    }
    
    static boolean decreaseCooling() {
        if (!powerStatus) {
            System.out.println("Please turn on the AC first");
            return false;
        }
        if (currentCooling > 0) {
            currentCooling = currentCooling - 1;
            return true;
        } else {
            System.out.println("Minimum cooling reached");
            return false;
        }
    }
    
    public static void main(String[] args) {
        switchPower();
        increaseCooling();
        increaseCooling();
        System.out.println("Status - Active: " + powerStatus + ", Cooling: " + currentCooling);
    }
}


