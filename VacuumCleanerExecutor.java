class VacuumCleanerExecutor {
    public static void main(String[] status) {
        VacuumCleaner.switchPower();
        System.out.println("Power status: " + VacuumCleaner.powerSupply);
        VacuumCleaner.increaseSuction(); 
        VacuumCleaner.increaseSuction();
        VacuumCleaner.decreaseSuction();
        System.out.println("Final suction: " + VacuumCleaner.currentSuction);
    }
}
