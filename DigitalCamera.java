class DigitalCamera {
    static boolean batteryStatus;
    static int maxZoom = 6;
    static int currentZoom;
    
    static boolean switchPower() {
        batteryStatus = !batteryStatus;
        if (batteryStatus) {
            System.out.println("The digital camera is on:");
        } else {
            System.out.println("The digital camera is Off:");
            currentZoom = 0;
        }
        return batteryStatus;
    }
    
    static boolean increaseZoom() {
        if (!batteryStatus) {
            System.out.println("Please turn on the digital camera first");
            return false;
        }
        if (currentZoom < maxZoom) {
            currentZoom = currentZoom + 1;
            return true;
        } else {
            System.out.println("Maximum zoom (6) reached");
            return false;
        }
    }
    
    static boolean decreaseZoom() {
        if (!batteryStatus) {
            System.out.println("Please turn on the digital camera first");
            return false;
        }
        if (currentZoom > 0) {
            currentZoom = currentZoom - 1;
            return true;
        } else {
            System.out.println("Minimum zoom reached");
            return false;
        }
    }
    
    public static void main(String[] args) {
        switchPower();
        increaseZoom();
        increaseZoom();
        System.out.println("Status - Active: " + batteryStatus + ", Zoom: " + currentZoom);
    }
}

