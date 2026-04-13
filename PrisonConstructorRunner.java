class PrisonConstructorRunner {

    public static void main(String[] args) {


        Criminal criminal = new Criminal();
        criminal.criminalId = 7003;
        criminal.name = "Anita R";
        criminal.crime = "Cheque Bounce";
        criminal.sentence = "3 Years";
        criminal.cellNumber = 112;
		
        Prison prison = new Prison(3, criminal);
        prison.getDetails();

    }
}