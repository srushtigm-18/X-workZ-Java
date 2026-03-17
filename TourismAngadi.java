class TourismAngadi {
    int agencyId;
    String agencyName;
    String location;
    String founder;
    Package packageDeal;

    public TourismAngadi(int agencyId, String agencyName, String location, String founder, Package packageDeal) {
        this.agencyId = agencyId;
        this.agencyName = agencyName;
        this.location = location;
        this.founder = founder;
        this.packageDeal = packageDeal;
    }

    public void getAgencyDetails() {
        System.out.println("Agency: " + this.agencyName);
        System.out.println("ID: " + this.agencyId);
        System.out.println("Location: " + this.location);
        System.out.println("Founder: " + this.founder);
        this.packageDeal.getPackageDetails();
        System.out.println("\n");
    }
}