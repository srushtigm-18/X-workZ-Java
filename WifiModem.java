class WifiModem {
    static boolean signalStatus;
    
    static boolean modemPower() {
        if (signalStatus == true) {
            signalStatus = true;
            System.out.println("The wifi modem is on:");
        }
        else if (signalStatus == false) {
            signalStatus = false;
            System.out.println("The wifi modem is Off:");
        }
        return signalStatus;
    }
}