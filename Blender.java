class Blender {
    static boolean motorStatus;
    
    static boolean blenderPower() {
        if (motorStatus == true) {
            motorStatus = true;
            System.out.println("The blender is on:");
        }
        else if (motorStatus == false) {
            motorStatus = false;
            System.out.println("The blender is Off:");
        }
        return motorStatus;
    }
}