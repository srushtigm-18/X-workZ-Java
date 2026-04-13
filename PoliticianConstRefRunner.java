class PoliticianConstRefRunner {

    public static void main(String[] vot) {
	
        System.out.println("Voter details :");
        Voter voter = new Voter();
        voter.voterId = 345;
        voter.name = "Priya Sharma";
        voter.constituency = "Bangalore North";
        voter.voterCardNo = "KLC3456789";
        voter.address = "HRBR Layout, Kalyan Nagar";
        Politician politician = new Politician(3, voter);
        politician.getDetails();


  }
}