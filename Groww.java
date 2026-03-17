class Groww {
    String platformName;
    int platformId;
    String founded;
    String ceo;
    Stock stock;

    public Groww(String platformName, int platformId, String founded, String ceo, Stock stock) {
        this.platformName = platformName;
        this.platformId = platformId;
        this.founded = founded;
        this.ceo = ceo;
        this.stock = stock;
    }

    public void getGrowwDetails() {
        System.out.println("Platform: " + this.platformName);
        System.out.println("ID: " + this.platformId);
        System.out.println("Founded: " + this.founded);
        System.out.println("CEO: " + this.ceo);
        this.stock.getStockDetails();
        System.out.println("\n");
    }
}
