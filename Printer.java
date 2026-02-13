class Printer {
    static boolean powerSupply;
    static int maxPages = 6;
    static int currentPages;
    
    static boolean switchPower() {
        powerSupply = !powerSupply;
        if (powerSupply) {
            System.out.println("The printer is on:");
        } else {
            System.out.println("The printer is Off:");
            currentPages = 0;
        }
        return powerSupply;
    }
    
    static boolean increasePages() {
        if (!powerSupply) {
            System.out.println("Please turn on the printer first");
            return false;
        }
        if (currentPages < maxPages) {
            currentPages = currentPages + 1;
            return true;
        } else {
            System.out.println("Maximum pages (6) reached");
            return false;
        }
    }
    
    static boolean decreasePages() {
        if (!powerSupply) {
            System.out.println("Please turn on the printer first");
            return false;
        }
        if (currentPages > 0) {
            currentPages = currentPages - 1;
            return true;
        } else {
            System.out.println("Minimum pages reached");
            return false;
        }
    }
    
    public static void main(String[] args) {
        switchPower();
        increasePages();
        increasePages();
        System.out.println("Status - Active: " + powerSupply + ", Pages: " + currentPages);
    }
}


