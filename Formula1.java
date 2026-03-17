class Formula1 {
    String teamName;
    int teamId;
    String baseLocation;
    String enginePartner;
    Franchise franchise;

    public Formula1(int teamId, String teamName, String baseLocation, String enginePartner, Franchise franchise) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.baseLocation = baseLocation;
        this.enginePartner = enginePartner;
        this.franchise = franchise;
    }

    public void getTeamDetails() {
        System.out.println("Team: " + this.teamName);
        System.out.println("ID: " + this.teamId);
        System.out.println("Base: " + this.baseLocation);
        System.out.println("Engine: " + this.enginePartner);
        this.franchise.getFranchiseDetails();
        System.out.println("\n");
    }
}
