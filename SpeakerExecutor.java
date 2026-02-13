class SpeakerExecutor {
    public static void main(String[] args) {
        Speaker.toggleConnection(); 
        System.out.println("Connection: " + Speaker.isConnected);
        Speaker.increaseVolume();    
        System.out.println("Final volume: " + Speaker.currentVolume);
    }
}
