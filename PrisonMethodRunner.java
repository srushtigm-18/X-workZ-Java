class PrisonMethodRunner {

    public static void main(String[] crim) {

        Criminal criminal = new Criminal();
        criminal.criminalId = 7002;
        criminal.name = "Suresh M";
        criminal.crime = "Fraud";
        criminal.sentence = "7 Years";
        criminal.cellNumber = 315;
		
        Prison prison = new Prison(2, criminal);
        prison.getDetails();

    }
}