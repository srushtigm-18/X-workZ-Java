class Speaker {
    static boolean isConnected;
    static int maxVolume = 5;
    static int currentVolume;
    static int minVolume;
    
    static boolean toggleConnection() {
        isConnected = !isConnected;
        if (isConnected) {
            System.out.println("The speaker is on:");
        } else {
            System.out.println("The speaker is Off:");
        }
        return isConnected;
    }
    
    static void increaseVolume() {
        if (!isConnected) {
            System.out.println("Please switch on the speaker");
            return;
        }
        if (currentVolume < maxVolume) {
            currentVolume++;
            System.out.println("Volume increased to: " + currentVolume);
        } else {
            System.out.println("Maximum volume reached");
        }
    }
    
    public static void main(String[] args) {
        toggleConnection();
        increaseVolume();
        System.out.println("Current state - Connected: " + isConnected + ", Volume: " + currentVolume);
    }
}

