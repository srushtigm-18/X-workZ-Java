class Politician {
    int politicianId;
    Voter voter;
    
    Politician(int politicianId, Voter voter) {
        this.politicianId = politicianId;
        this.voter = voter;
    }
    
    public void getDetails() {
        System.out.println("Politician id is: " + this.politicianId);
        System.out.println("Voter id is: " + this.voter.voterId);
        System.out.println("Voter name is: " + this.voter.name);
        System.out.println("Voter constituency is: " + this.voter.constituency);
        System.out.println("Voter card no is: " + this.voter.voterCardNo);
        System.out.println("Voter address is: " + this.voter.address);
    }
}