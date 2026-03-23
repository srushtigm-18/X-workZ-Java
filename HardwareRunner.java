class HardwareRunner {
    public static void main(String[] args) {
       
        Keyboard keyboard = new Keyboard();
        keyboard.setType("Mechanical Keyboard");
        System.out.println(keyboard.getHardwareInfo());
    }
}