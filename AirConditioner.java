class AirConditioner {
    static boolean powerStatus;
    
    static boolean onOrOff() {
        if (powerStatus == true) {
            powerStatus = true;
            System.out.println("The AC is on:");
        }
        else if (powerStatus == false) {
            powerStatus = false;
            System.out.println("The AC is Off:");
        }
        return powerStatus;
    }
}