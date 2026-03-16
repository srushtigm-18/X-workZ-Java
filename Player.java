class Player {
    int playerId;
    String playerName;
    String role;
    int jerseyNumber;
    double auctionPrice;

    public void getPlayerDetails() {
        System.out.println("Player ID: " + this.playerId);
        System.out.println("Name: " + this.playerName);
        System.out.println("Role: " + this.role);
        System.out.println("Jersey: " + this.jerseyNumber);
        System.out.println("Price: " + this.auctionPrice + "Cr");
    }
}

