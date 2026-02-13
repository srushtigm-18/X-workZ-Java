class VacuumCleaner {
    static boolean powerSupply;
    static int maxSuction = 6;
    static int currentSuction;
    
    static boolean switchPower() {
        powerSupply = !powerSupply;
        if (powerSupply) {
            System.out.println("The vacuum cleaner is on:");
        } else {
            System.out.println("The vacuum cleaner is Off:");
            currentSuction = 0;
        }
        return powerSupply;
    }
    
    static boolean increaseSuction() {
        if (!powerSupply) {
            System.out.println("Please turn on the vacuum cleaner first");
            return false;
        }
        if (currentSuction < maxSuction) {
            currentSuction = currentSuction + 1;
            return true;
        } else {
            System.out.println("Maximum suction (6) reached");
            return false;
        }
    }
    
    static boolean decreaseSuction() {
        if (!powerSupply) {
            System.out.println("Please turn on the vacuum cleaner first");
            return false;
        }
        if (currentSuction > 0) {
            currentSuction = currentSuction - 1;
            return true;
        } else {
            System.out.println("Minimum suction reached");
            return false;
        }
    }
    
    public static void main(String[] args) {
        switchPower();
        increaseSuction();
        increaseSuction();
        System.out.println("Status - Active: " + powerSupply + ", Suction: " + currentSuction);
    }
}

