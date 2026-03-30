class TurbineExecutor {
    public static void main(String[] args) {
        Turbine turbine = new Turbine();

        turbine.addTurbine("Steam Turbine");
        turbine.addTurbine("Gas Turbine");
        turbine.addTurbine("Hydro Turbine");
        turbine.addTurbine("Wind Turbine");
        turbine.addTurbine("Pelton Turbine");
        turbine.addTurbine("Francis Turbine");
        turbine.addTurbine("Kaplan Turbine");
        turbine.addTurbine("Impulse Turbine");
        turbine.addTurbine("Reaction Turbine");
        turbine.addTurbine("Marine Turbine");
        turbine.addTurbine("Aircraft Gas Turbine");

        turbine.getTurbines();
        System.out.println();

        int index = 3;
        String t = turbine.getTurbineByIndex(index);
        System.out.println("Turbine at index " + index + " is: " + t);
        System.out.println();

        String searchName = "Wind Turbine";
        int i = turbine.getIndexByTurbineName(searchName);
        System.out.println("Turbine " + searchName + " is at index: " + i);
        System.out.println();

        String updated = "Wind Turbine (Offshore)";
        boolean ref = turbine.updateTurbine("Wind Turbine", updated);
        turbine.getTurbines();
        System.out.println();

        String deleting = "Marine Turbine";
        boolean reff = turbine.deleteTurbine(deleting);

        turbine.getTurbines();
    }
}
