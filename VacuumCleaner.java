class VacuumCleaner {
    static boolean powerSupply;
    
    static boolean powerStatus() {
        if (powerSupply == false) {
            powerSupply = true;
            System.out.println("The vacuum cleaner is on:");
        }
        else if (powerSupply == true) {
            powerSupply = false;
            System.out.println("The vacuum cleaner is Off:");
        }
        return powerSupply;
    }
}