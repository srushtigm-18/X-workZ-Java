class PrisonObjectRunner {

    public static void main(String[] crime) {

        Criminal criminal = new Criminal();
        Prison prison = new Prison(1, criminal);
        criminal.criminalId = 32;
        criminal.name = "Ramesh K";
        criminal.crime = "Theft";
        criminal.sentence = "5 Years";
        criminal.cellNumber = 204;
        prison.getDetails();

    }
}