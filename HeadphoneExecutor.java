class HeadphoneExecutor {
    public static void main(String[] audio) {
        Headphone.switchPower();
        System.out.println("Power status: " + Headphone.chargeLevel);
        Headphone.increaseVolume(); 
        Headphone.increaseVolume();
        Headphone.decreaseVolume();
        System.out.println("Final volume: " + Headphone.currentVolume);
    }
}
