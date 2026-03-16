class Cassino {
    int tableNumber;
    String gameType;
    int minBet;
    int maxBet;
    double rake;

    public void getCassinoDetails() {
        System.out.println("Table: " + this.tableNumber);
        System.out.println("Game: " + this.gameType);
        System.out.println("Min Bet: " + this.minBet + "K");
        System.out.println("Max Bet: " + this.maxBet + "L");
        System.out.println("Rake: " + this.rake + "%");
    }
}