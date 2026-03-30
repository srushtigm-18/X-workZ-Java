class SteelExecutor {
    public static void main(String[] args) {
        Steel steel = new Steel();

        steel.addSteel("Mild Steel");
        steel.addSteel("Stainless Steel");
        steel.addSteel("Carbon Steel");
        steel.addSteel("Tool Steel");
        steel.addSteel("Alloy Steel");
        steel.addSteel("Structural Steel");
        steel.addSteel("High-Speed Steel");
        steel.addSteel("Cast Steel");
        steel.addSteel("Rebar Steel");
        steel.addSteel("Weathering Steel");
        steel.addSteel("Spring Steel");

        steel.getSteels();
        System.out.println();

        int index = 3;
        String s = steel.getSteelByIndex(index);
        System.out.println("Steel at index " + index + " is: " + s);
        System.out.println();

        String searchName = "Stainless Steel";
        int i = steel.getIndexBySteelName(searchName);
        System.out.println("Steel '" + searchName + "' is at index: " + i);
        System.out.println();

        String updated = "Stainless Steel (Grade 304)";
        boolean ref = steel.updateSteel("Stainless Steel", updated);
        steel.getSteels();
        System.out.println();

        String deleting = "Spring Steel";
        boolean reff = steel.deleteSteel(deleting);
        steel.getSteels();
    }
}
