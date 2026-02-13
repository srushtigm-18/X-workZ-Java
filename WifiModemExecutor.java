class WifiModemExecutor {
    public static void main(String[] args) {
        WifiModem.switchPower();
        System.out.println("Signal active: " + WifiModem.signalStatus);
        WifiModem.connectDevice(); 
        WifiModem.connectDevice();
        System.out.println("Final connections: " + WifiModem.currentConnections);
    }
}