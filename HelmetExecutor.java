class HelmetExecutor {
    public static void main(String[] args) {
        Helmet h1 = new Helmet();
        h1.helmetId = 1;
        h1.helmetType = "Full Face";
        h1.safetyStandard = "IS 4151";

        Helmet h2 = new Helmet();
        h2.helmetId = 2;
        h2.helmetType = "Open Face";
        h2.safetyStandard = "IS 4151";

        Helmet h3 = new Helmet();
        h3.helmetId = 3;
        h3.helmetType = "Modular";
        h3.safetyStandard = "ECE R22";

        System.out.println("Helmet h1  ID: " + h1.helmetId +
                           " Type: " + h1.helmetType +
                           " Standard: " + h1.safetyStandard);

        System.out.println("Helmet h2  ID: " + h2.helmetId +
                           " Type: " + h2.helmetType +
                           " Standard: " + h2.safetyStandard);

        System.out.println("Helmet h3 ID: " + h3.helmetId +
                           " Type: " + h3.helmetType +
                           " Standard: " + h3.safetyStandard);

        System.out.println("----------------------------------------------------------");

        Helmet p1 = new Helmet(1, "Full Face", "IS 4151");
        Helmet p2 = new Helmet(2, "Open Face", "IS 4151");
        Helmet p3 = new Helmet(3, "Modular", "ECE R22");

        System.out.println("Helmet p1  ID: " + p1.helmetId +
                           " Type: " + p1.helmetType +
                           " Standard: " + p1.safetyStandard);

        System.out.println("Helmet p2  ID: " + p2.helmetId +
                           " Type: " + p2.helmetType +
                           " Standard: " + p2.safetyStandard);

        System.out.println("Helmet p3  ID: " + p3.helmetId +
                           " Type: " + p3.helmetType +
                           " Standard: " + p3.safetyStandard);

        System.out.println("----------------------------------------------------------");
    }
}
