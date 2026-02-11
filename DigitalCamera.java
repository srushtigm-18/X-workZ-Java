class DigitalCamera {
    static boolean batteryStatus;
    
    static boolean cameraPower() {
        if (batteryStatus == false) {
            batteryStatus = true;
            System.out.println("The digital camera is on:");
        }
        else if (batteryStatus == true) {
            batteryStatus = false;
            System.out.println("The digital camera is Off:");
        }
        return batteryStatus;
    }
}