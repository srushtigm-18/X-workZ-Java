class PeriodicTableExecutor {
    public static void main(String[] args) {
        Element e1 = new Element(1, "H", "Hydrogen", 1.008, "Non-metal");
        PeriodicTable pt1 = new PeriodicTable(1, "Period 1", "Group 1", "s-block", e1);
        pt1.getPeriodicDetails();

        Element e2 = new Element(2, "He", "Helium", 4.0026, "Noble Gas");
        PeriodicTable pt2 = new PeriodicTable(1, "Period 1", "Group 18", "s-block", e2);
        pt2.getPeriodicDetails();

        Element e3 = new Element(3, "Li", "Lithium", 6.94, "Alkali Metal");
        PeriodicTable pt3 = new PeriodicTable(2, "Period 2", "Group 1", "s-block", e3);
        pt3.getPeriodicDetails();

        Element e4 = new Element(9, "F", "Fluorine", 18.998, "Halogen");
        PeriodicTable pt4 = new PeriodicTable(2, "Period 2", "Group 17", "p-block", e4);
        pt4.getPeriodicDetails();

        Element e5 = new Element(6, "C", "Carbon", 12.011, "Non-metal");
        PeriodicTable pt5 = new PeriodicTable(2, "Period 2", "Group 14", "p-block", e5);
        pt5.getPeriodicDetails();

        Element e6 = new Element(12, "Mg", "Magnesium", 24.305, "Alkaline Earth");
        PeriodicTable pt6 = new PeriodicTable(3, "Period 3", "Group 2", "s-block", e6);
        pt6.getPeriodicDetails();

        Element e7 = new Element(17, "Cl", "Chlorine", 35.45, "Halogen");
        PeriodicTable pt7 = new PeriodicTable(3, "Period 3", "Group 17", "p-block", e7);
        pt7.getPeriodicDetails();

        Element e8 = new Element(26, "Fe", "Iron", 55.845, "Transition Metal");
        PeriodicTable pt8 = new PeriodicTable(4, "Period 4", "Group 7", "d-block", e8);
        pt8.getPeriodicDetails();

        Element e9 = new Element(29, "Cu", "Copper", 63.546, "Transition Metal");
        PeriodicTable pt9 = new PeriodicTable(4, "Period 4", "Group 11", "d-block", e9);
        pt9.getPeriodicDetails();

        Element e10 = new Element(36, "Kr", "Krypton", 83.80, "Noble Gas");
        PeriodicTable pt10 = new PeriodicTable(4, "Period 4", "Group 18", "p-block", e10);
        pt10.getPeriodicDetails();

        Element e11 = new Element(42, "Mo", "Molybdenum", 95.94, "Transition Metal");
        PeriodicTable pt11 = new PeriodicTable(5, "Period 5", "Group 6", "d-block", e11);
        pt11.getPeriodicDetails();

        Element e12 = new Element(52, "Te", "Tellurium", 127.60, "Metalloid");
        PeriodicTable pt12 = new PeriodicTable(5, "Period 5", "Group 16", "p-block", e12);
        pt12.getPeriodicDetails();

        Element e13 = new Element(58, "Ce", "Cerium", 140.12, "Lanthanide");
        PeriodicTable pt13 = new PeriodicTable(6, "Period 6", "Lanthanides", "f-block", e13);
        pt13.getPeriodicDetails();

        Element e14 = new Element(80, "Hg", "Mercury", 200.59, "Transition Metal");
        PeriodicTable pt14 = new PeriodicTable(6, "Period 6", "Group 12", "d-block", e14);
        pt14.getPeriodicDetails();

        Element e15 = new Element(90, "Th", "Thorium", 232.04, "Actinide");
        PeriodicTable pt15 = new PeriodicTable(7, "Period 7", "Actinides", "f-block", e15);
        pt15.getPeriodicDetails();

        Element e16 = new Element(117, "Ts", "Tennessine", 292, "Halogen");
        PeriodicTable pt16 = new PeriodicTable(7, "Period 7", "Group 17", "p-block", e16);
        pt16.getPeriodicDetails();

        Element e17 = new Element(55, "Cs", "Cesium", 132.91, "Alkali Metal");
        PeriodicTable pt17 = new PeriodicTable(6, "Period 6", "Group 1", "s-block", e17);
        pt17.getPeriodicDetails();

        Element e18 = new Element(13, "Al", "Aluminum", 26.982, "Post-transition");
        PeriodicTable pt18 = new PeriodicTable(3, "Period 3", "Group 13", "p-block", e18);
        pt18.getPeriodicDetails();

        Element e19 = new Element(44, "Ru", "Ruthenium", 101.07, "Transition Metal");
        PeriodicTable pt19 = new PeriodicTable(5, "Period 5", "Group 8", "d-block", e19);
        pt19.getPeriodicDetails();

        Element e20 = new Element(20, "Ca", "Calcium", 40.078, "Alkaline Earth");
        PeriodicTable pt20 = new PeriodicTable(4, "Period 4", "Group 2", "s-block", e20);
        pt20.getPeriodicDetails();
    }
}
