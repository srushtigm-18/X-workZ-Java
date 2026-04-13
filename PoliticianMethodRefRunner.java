class PoliticianMethodRefRunner {

    public static void main(String[] vot) {
	
        System.out.println("Voter details");
		
        Voter voter = new Voter();
        voter.voterId = 458;
        voter.name = "Ravi Kumar";
        voter.constituency = "Bangalore South";
        voter.voterCardNo = "KLC2345678";
        voter.address = "Jayanagar 4th Block";
        Politician politician = new Politician(2, voter);
        politician.getDetails();

    }
}