class AgarbattiExecutor {
    public static void main(String[] args) {
        Agarbatti pack = new Agarbatti();
        pack.packId = 950;
        pack.packPrice = 75.50;
        pack.pureFragrance = true;
        pack.inStock = true;
        pack.packDate = "01/03/2026";
        pack.bestBefore = "01/03/2027";
        pack.isFresh = true;

        System.out.println("Pack ID: " + pack.packId);
        System.out.println("Pack Price: " + pack.packPrice);
        System.out.println("Packed Date: " + pack.packDate);
        System.out.println("Best Before: " + pack.bestBefore);
    }
}
