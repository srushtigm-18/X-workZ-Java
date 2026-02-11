class Oven {
    static boolean powerSupply;
    
    static boolean onOrOff() {
        if (powerSupply == false) {
            powerSupply = true;
            System.out.println("The oven is on:");
        }
        else if (powerSupply == true) {
            powerSupply = false;
            System.out.println("The oven is Off:");
        }
        return powerSupply;
    }
}