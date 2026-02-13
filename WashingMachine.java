class WashingMachine {
    static boolean isConnected ;
    static int maxSpeed = 6;
    static int currentSpeed ;
    
    static boolean switchPower() {
        isConnected = !isConnected;
        if (isConnected) {
            System.out.println("The washing machine is on:");
        } else {
            System.out.println("The washing machine is Off:");
            currentSpeed = 0;
        }
        return isConnected;
    }
    
    static boolean increaseSpeed() {
        if (!isConnected) {
            System.out.println("Please turn on the washing machine first");
            return false;
        }
        if (currentSpeed < maxSpeed) {
            currentSpeed=currentSpeed+1;
           
            return true;
        } else {
            System.out.println("Maximum speed (6) reached");
            return false;
        }
    }
    
    static boolean decreaseSpeed() {
        if (!isConnected) {
            System.out.println("Please turn on the washing machine first");
            return false;
        }
        if (currentSpeed > 0) {
            currentSpeed=currentSpeed-1;
            
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
        System.out.println("Status - Active: " + isConnected + ", Speed: " + currentSpeed);
    }
}


