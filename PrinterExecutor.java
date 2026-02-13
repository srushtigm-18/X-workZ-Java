class PrinterExecutor {
    public static void main(String[] status) {
        Printer.switchPower();
        System.out.println("Power status: " + Printer.powerSupply);
        Printer.increasePages(); 
        Printer.increasePages();
        Printer.decreasePages();
        System.out.println("Final pages: " + Printer.currentPages);
    }
}