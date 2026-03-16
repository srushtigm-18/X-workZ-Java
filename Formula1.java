class Formula1 {
    String teamName;
    int teamId;
    String baseLocation;
    String enginePartner;
    Franchise franchise;

    public void getTeamDetails() {
        System.out.println("Team: " + this.teamName);
        System.out.println("ID: " + this.teamId);
        System.out.println("Base: " + this.baseLocation);
        System.out.println("Engine: " + this.enginePartner);
        this.franchise.getFranchiseDetails();
        System.out.println("\n");
    }
}
