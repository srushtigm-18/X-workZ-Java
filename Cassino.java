class Cassino {
    int tableNumber;
    String gameType;
    int minBet;
    int maxBet;
    double rake;

    public Cassino(int tableNumber, String gameType, int minBet, int maxBet, double rake) {
        this.tableNumber = tableNumber;
        this.gameType = gameType;
        this.minBet = minBet;
        this.maxBet = maxBet;
        this.rake = rake;
    }

    public void getCassinoDetails() {
        System.out.println("Table: " + this.tableNumber);
        System.out.println("Game: " + this.gameType);
        System.out.println("Min Bet: " + this.minBet + "K");
        System.out.println("Max Bet: " + this.maxBet + "L");
        System.out.println("Rake: " + this.rake + "%");
    }
}
