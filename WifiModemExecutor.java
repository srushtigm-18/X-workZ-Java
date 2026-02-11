class WifiModemExecutor {
    public static void main(String[] signal) {
        boolean active = WifiModem.modemPower();
        System.out.println(active);
    }
}