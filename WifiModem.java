class WifiModem {
    static boolean signalStatus = false;
    static int maxConnections = 10;
    static int currentConnections = 0;
    
    static boolean switchPower() {
        signalStatus = !signalStatus;
        if (signalStatus) {
            System.out.println("The wifi modem is on:");
        } else {
            System.out.println("The wifi modem is Off:");
            currentConnections = 0;
        }
        return signalStatus;
    }
    
    static boolean connectDevice() {
        if (!signalStatus) {
            System.out.println("Please turn on the wifi modem first");
            return false;
        }
        if (currentConnections < maxConnections) {
            currentConnections = currentConnections+1;
      
            return true;
        } else {
            System.out.println("Maximum connections (10) reached");
            return false;
        }
    }
    
    public static void main(String[] args) {
        switchPower();
        connectDevice();
        connectDevice();
        System.out.println("Status - Active: " + signalStatus + ", Connections: " + currentConnections);
    }
}


