class Projector {
    static boolean projectorStatus;
    static int maxBrightness = 6;
    static int currentBrightness;
    
    static boolean switchPower() {
        projectorStatus = !projectorStatus;
        if (projectorStatus) {
            System.out.println("The projector is on:");
        } else {
            System.out.println("The projector is Off:");
            currentBrightness = 0;
        }
        return projectorStatus;
    }
    
    static boolean increaseBrightness() {
        if (!projectorStatus) {
            System.out.println("Please turn on the projector first");
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
        if (!projectorStatus) {
            System.out.println("Please turn on the projector first");
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
        System.out.println("Status - Active: " + projectorStatus + ", Brightness: " + currentBrightness);
    }
}


