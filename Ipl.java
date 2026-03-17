class Ipl {
    String teamName;
    int teamId;
    String homeGround;
    String captain;
    Player player;

    public Ipl(String teamName, int teamId, String homeGround, String captain, Player player) {
        this.teamName = teamName;
        this.teamId = teamId;
        this.homeGround = homeGround;
        this.captain = captain;
        this.player = player;
    }

    public void getTeamDetails() {
        System.out.println("Team: " + this.teamName);
        System.out.println("ID: " + this.teamId);
        System.out.println("Ground: " + this.homeGround);
        System.out.println("Captain: " + this.captain);
        this.player.getPlayerDetails();
        System.out.println("\n");
    }
}
