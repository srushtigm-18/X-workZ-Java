class Blender {
    static boolean motorStatus;
    static int maxSpeed = 6;
    static int currentSpeed;
    
    static boolean switchPower() {
        motorStatus = !motorStatus;
        if (motorStatus) {
            System.out.println("The blender is on:");
        } else {
            System.out.println("The blender is Off:");
            currentSpeed = 0;
        }
        return motorStatus;
    }
    
    static boolean increaseSpeed() {
        if (!motorStatus) {
            System.out.println("Please turn on the blender first");
            return false;
        }
        if (currentSpeed < maxSpeed) {
            currentSpeed = currentSpeed + 1;
            return true;
        } else {
            System.out.println("Maximum speed (6) reached");
            return false;
        }
    }
    
    static boolean decreaseSpeed() {
        if (!motorStatus) {
            System.out.println("Please turn on the blender first");
            return false;
        }
        if (currentSpeed > 0) {
            currentSpeed = currentSpeed - 1;
            return true;
        } else {
            System.out.println("Minimum speed reached");
            return false;
        }
    }
    
    public static void main(String[] args) {
        switchPower();
        increaseSpeed();
        increaseSpeed();
        System.out.println("Status - Active: " + motorStatus + ", Speed: " + currentSpeed);
    }
}


