class Stock {
    int stockId;
    String symbol;
    double currentPrice;
    String sector;
    double marketCap;

    public void getStockDetails() {
        System.out.println("Stock ID: " + this.stockId);
        System.out.println("Symbol: " + this.symbol);
        System.out.println("Price: " + this.currentPrice);
        System.out.println("Sector: " + this.sector);
        System.out.println("Market Cap: " + this.marketCap + "L");
    }
}