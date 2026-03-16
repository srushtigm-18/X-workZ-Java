class PeriodicTableExecutor {
    public static void main(String[] args) {
        PeriodicTable pt1 = new PeriodicTable();
        pt1.periodNumber = 1; pt1.periodName = "Period 1"; pt1.group = "Group 1"; pt1.block = "s-block";
        Element e1 = new Element(); e1.atomicNumber = 1; e1.symbol = "H"; e1.name = "Hydrogen"; e1.atomicMass = 1.008; e1.category = "Non-metal";
        pt1.element = e1; pt1.getPeriodicDetails();

        PeriodicTable pt2 = new PeriodicTable();
        pt2.periodNumber = 1; pt2.periodName = "Period 1"; pt2.group = "Group 18"; pt2.block = "s-block";
        Element e2 = new Element(); e2.atomicNumber = 2; e2.symbol = "He"; e2.name = "Helium"; e2.atomicMass = 4.0026; e2.category = "Noble Gas";
        pt2.element = e2; pt2.getPeriodicDetails();

        PeriodicTable pt3 = new PeriodicTable();
        pt3.periodNumber = 2; pt3.periodName = "Period 2"; pt3.group = "Group 1"; pt3.block = "s-block";
        Element e3 = new Element(); e3.atomicNumber = 3; e3.symbol = "Li"; e3.name = "Lithium"; e3.atomicMass = 6.94; e3.category = "Alkali Metal";
        pt3.element = e3; pt3.getPeriodicDetails();

        PeriodicTable pt4 = new PeriodicTable();
        pt4.periodNumber = 2; pt4.periodName = "Period 2"; pt4.group = "Group 17"; pt4.block = "p-block";
        Element e4 = new Element(); e4.atomicNumber = 9; e4.symbol = "F"; e4.name = "Fluorine"; e4.atomicMass = 18.998; e4.category = "Halogen";
        pt4.element = e4; pt4.getPeriodicDetails();

        PeriodicTable pt5 = new PeriodicTable();
        pt5.periodNumber = 2; pt5.periodName = "Period 2"; pt5.group = "Group 14"; pt5.block = "p-block";
        Element e5 = new Element(); e5.atomicNumber = 6; e5.symbol = "C"; e5.name = "Carbon"; e5.atomicMass = 12.011; e5.category = "Non-metal";
        pt5.element = e5; pt5.getPeriodicDetails();

        PeriodicTable pt6 = new PeriodicTable();
        pt6.periodNumber = 3; pt6.periodName = "Period 3"; pt6.group = "Group 2"; pt6.block = "s-block";
        Element e6 = new Element(); e6.atomicNumber = 12; e6.symbol = "Mg"; e6.name = "Magnesium"; e6.atomicMass = 24.305; e6.category = "Alkaline Earth";
        pt6.element = e6; pt6.getPeriodicDetails();

        PeriodicTable pt7 = new PeriodicTable();
        pt7.periodNumber = 3; pt7.periodName = "Period 3"; pt7.group = "Group 17"; pt7.block = "p-block";
        Element e7 = new Element(); e7.atomicNumber = 17; e7.symbol = "Cl"; e7.name = "Chlorine"; e7.atomicMass = 35.45; e7.category = "Halogen";
        pt7.element = e7; pt7.getPeriodicDetails();

        PeriodicTable pt8 = new PeriodicTable();
        pt8.periodNumber = 4; pt8.periodName = "Period 4"; pt8.group = "Group 7"; pt8.block = "d-block";
        Element e8 = new Element(); e8.atomicNumber = 26; e8.symbol = "Fe"; e8.name = "Iron"; e8.atomicMass = 55.845; e8.category = "Transition Metal";
        pt8.element = e8; pt8.getPeriodicDetails();

        PeriodicTable pt9 = new PeriodicTable();
        pt9.periodNumber = 4; pt9.periodName = "Period 4"; pt9.group = "Group 11"; pt9.block = "d-block";
        Element e9 = new Element(); e9.atomicNumber = 29; e9.symbol = "Cu"; e9.name = "Copper"; e9.atomicMass = 63.546; e9.category = "Transition Metal";
        pt9.element = e9; pt9.getPeriodicDetails();

        PeriodicTable pt10 = new PeriodicTable();
        pt10.periodNumber = 4; pt10.periodName = "Period 4"; pt10.group = "Group 18"; pt10.block = "p-block";
        Element e10 = new Element(); e10.atomicNumber = 36; e10.symbol = "Kr"; e10.name = "Krypton"; e10.atomicMass = 83.80; e10.category = "Noble Gas";
        pt10.element = e10; pt10.getPeriodicDetails();

        PeriodicTable pt11 = new PeriodicTable();
        pt11.periodNumber = 5; pt11.periodName = "Period 5"; pt11.group = "Group 6"; pt11.block = "d-block";
        Element e11 = new Element(); e11.atomicNumber = 42; e11.symbol = "Mo"; e11.name = "Molybdenum"; e11.atomicMass = 95.94; e11.category = "Transition Metal";
        pt11.element = e11; pt11.getPeriodicDetails();

        PeriodicTable pt12 = new PeriodicTable();
        pt12.periodNumber = 5; pt12.periodName = "Period 5"; pt12.group = "Group 16"; pt12.block = "p-block";
        Element e12 = new Element(); e12.atomicNumber = 52; e12.symbol = "Te"; e12.name = "Tellurium"; e12.atomicMass = 127.60; e12.category = "Metalloid";
        pt12.element = e12; pt12.getPeriodicDetails();

        PeriodicTable pt13 = new PeriodicTable();
        pt13.periodNumber = 6; pt13.periodName = "Period 6"; pt13.group = "Lanthanides"; pt13.block = "f-block";
        Element e13 = new Element(); e13.atomicNumber = 58; e13.symbol = "Ce"; e13.name = "Cerium"; e13.atomicMass = 140.12; e13.category = "Lanthanide";
        pt13.element = e13; pt13.getPeriodicDetails();

        PeriodicTable pt14 = new PeriodicTable();
        pt14.periodNumber = 6; pt14.periodName = "Period 6"; pt14.group = "Group 12"; pt14.block = "d-block";
        Element e14 = new Element(); e14.atomicNumber = 80; e14.symbol = "Hg"; e14.name = "Mercury"; e14.atomicMass = 200.59; e14.category = "Transition Metal";
        pt14.element = e14; pt14.getPeriodicDetails();

        PeriodicTable pt15 = new PeriodicTable();
        pt15.periodNumber = 7; pt15.periodName = "Period 7"; pt15.group = "Actinides"; pt15.block = "f-block";
        Element e15 = new Element(); e15.atomicNumber = 90; e15.symbol = "Th"; e15.name = "Thorium"; e15.atomicMass = 232.04; e15.category = "Actinide";
        pt15.element = e15; pt15.getPeriodicDetails();

        PeriodicTable pt16 = new PeriodicTable();
        pt16.periodNumber = 7; pt16.periodName = "Period 7"; pt16.group = "Group 17"; pt16.block = "p-block";
        Element e16 = new Element(); e16.atomicNumber = 117; e16.symbol = "Ts"; e16.name = "Tennessine"; e16.atomicMass = 292; e16.category = "Halogen";
        pt16.element = e16; pt16.getPeriodicDetails();

        PeriodicTable pt17 = new PeriodicTable();
        pt17.periodNumber = 6; pt17.periodName = "Period 6"; pt17.group = "Group 1"; pt17.block = "s-block";
        Element e17 = new Element(); e17.atomicNumber = 55; e17.symbol = "Cs"; e17.name = "Cesium"; e17.atomicMass = 132.91; e17.category = "Alkali Metal";
        pt17.element = e17; pt17.getPeriodicDetails();

        PeriodicTable pt18 = new PeriodicTable();
        pt18.periodNumber = 3; pt18.periodName = "Period 3"; pt18.group = "Group 13"; pt18.block = "p-block";
        Element e18 = new Element(); e18.atomicNumber = 13; e18.symbol = "Al"; e18.name = "Aluminum"; e18.atomicMass = 26.982; e18.category = "Post-transition";
        pt18.element = e18; pt18.getPeriodicDetails();

        PeriodicTable pt19 = new PeriodicTable();
        pt19.periodNumber = 5; pt19.periodName = "Period 5"; pt19.group = "Group 8"; pt19.block = "d-block";
        Element e19 = new Element(); e19.atomicNumber = 44; e19.symbol = "Ru"; e19.name = "Ruthenium"; e19.atomicMass = 101.07; e19.category = "Transition Metal";
        pt19.element = e19; pt19.getPeriodicDetails();

        PeriodicTable pt20 = new PeriodicTable();
        pt20.periodNumber = 4; pt20.periodName = "Period 4"; pt20.group = "Group 2"; pt20.block = "s-block";
        Element e20 = new Element(); e20.atomicNumber = 20; e20.symbol = "Ca"; e20.name = "Calcium"; e20.atomicMass = 40.078; e20.category = "Alkaline Earth";
        pt20.element = e20; pt20.getPeriodicDetails();
    }
}
