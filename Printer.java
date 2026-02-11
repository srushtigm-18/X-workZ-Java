class Printer {
    static boolean powerSupply;
    static boolean printStatus;
    
    static boolean operatePrinter() {
        if (powerSupply == true) {
            powerSupply = true;
            printStatus = true;
            System.out.println("Printer power connected:");
            System.out.println("Printer is ready to print:");
            System.out.println("Paper tray loaded:");
        }
        else if (powerSupply == false) {
            powerSupply = false;
            printStatus = false;
            System.out.println("Printer power disconnected:");
            System.out.println("Printer is off:");
            System.out.println("No printing possible:");
        }
        System.out.println("Printer operation completed.");
        return printStatus;
    }
}