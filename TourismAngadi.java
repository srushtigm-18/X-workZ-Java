class TourismAngadi {
    String agencyName;
    int agencyId;
    String location;
    String founder;
    Package packageDeal;

    public void getAgencyDetails() {
        System.out.println("Agency: " + this.agencyName);
        System.out.println("ID: " + this.agencyId);
        System.out.println("Location: " + this.location);
        System.out.println("Founder: " + this.founder);
        this.packageDeal.getPackageDetails();
        System.out.println("\n");
    }
}

