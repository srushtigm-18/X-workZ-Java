class Earth {
    int planetId;
    String position;
    double diameterKM;
    String atmosphere;
    double ageBillions;

    public Earth(int planetId, String position, double diameterKM, String atmosphere, double ageBillions) {
        this.planetId = planetId;
        this.position = position;
        this.diameterKM = diameterKM;
        this.atmosphere = atmosphere;
        this.ageBillions = ageBillions;
    }

    public void getEarthDetails() {
        System.out.println("Planet ID: " + this.planetId);
        System.out.println("Position: " + this.position);
        System.out.println("Diameter: " + this.diameterKM + " km");
        System.out.println("Atmosphere: " + this.atmosphere);
        System.out.println("Age: " + this.ageBillions + " billion years");
    }
}