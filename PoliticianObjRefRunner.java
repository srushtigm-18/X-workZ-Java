class PoliticianObjRefRunner {

    public static void main(String[] vot) {

        Voter voter = new Voter();
        Politician politician = new Politician(1, voter);
        voter.voterId = 35438;
        voter.name = "Ram Prasad";
        voter.constituency = "Bangalore Central";
        voter.voterCardNo = "KLC1234567";
        voter.address = "Jayanagar, Bengaluru";
        politician.getDetails();

    }
}