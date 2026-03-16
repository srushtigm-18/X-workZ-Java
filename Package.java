class Package {
    int packageId;
    String destination;
    int days;
    String inclusions;
    double price;

    public void getPackageDetails() {
        System.out.println("Package ID: " + this.packageId);
        System.out.println("Destination: " + this.destination);
        System.out.println("Duration: " + this.days + " days");
        System.out.println("Inclusions: " + this.inclusions);
        System.out.println("Price: " + this.price + "Rs/person");
    }
}
