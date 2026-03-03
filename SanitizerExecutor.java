class SanitizerExecutor {
    public static void main(String[] args) {
        Sanitizer bottle = new Sanitizer();
        bottle.bottleId = 1050;
        bottle.bottleVolume = 500.0;
        bottle.alcoholBased = true;
        bottle.sealedPack = true;
        bottle.productionDate = "15/02/2026";
        bottle.useByDate = "15/08/2026";
        bottle.withinShelfLife = true;

        System.out.println("Bottle ID: " + bottle.bottleId);
        System.out.println("Volume: " + bottle.bottleVolume + "ml");
        System.out.println("Production Date: " + bottle.productionDate);
        System.out.println("Use By Date: " + bottle.useByDate);
    }
}
