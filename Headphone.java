class Headphone {
    static boolean chargeLevel;
    static int maxVolume = 6;
    static int currentVolume;
    
    static boolean switchPower() {
        chargeLevel = !chargeLevel;
        if (chargeLevel) {
            System.out.println("The headphone is on:");
        } else {
            System.out.println("The headphone is Off:");
            currentVolume = 0;
        }
        return chargeLevel;
    }
    
    static boolean increaseVolume() {
        if (!chargeLevel) {
            System.out.println("Please turn on the headphone first");
            return false;
        }
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
            return true;
        } else {
            System.out.println("Maximum volume (6) reached");
            return false;
        }
    }
    
    static boolean decreaseVolume() {
        if (!chargeLevel) {
            System.out.println("Please turn on the headphone first");
            return false;
        }
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
            return true;
        } else {
            System.out.println("Minimum volume reached");
            return false;
        }
    }
    
    public static void main(String[] args) {
        switchPower();
        increaseVolume();
        increaseVolume();
        System.out.println("Status - Active: " + chargeLevel + ", Volume: " + currentVolume);
    }
}

