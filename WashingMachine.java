class WashingMachine {
    static boolean isConnected;
    
    static boolean onOrOff() {
        if (isConnected == true) {
            isConnected = true;
            System.out.println("The washing machine is on:");
        }
        else if (isConnected == false) {
            isConnected = false;
            System.out.println("The washing machine is Off:");
        }
        return isConnected;
    }
}