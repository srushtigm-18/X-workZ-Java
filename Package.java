class Package {
    int packageId;
    String destination;
    int days;
    String inclusions;
    double price;

    public Package(int packageId, String destination, int days, String inclusions, double price) {
        this.packageId = packageId;
        this.destination = destination;
        this.days = days;
        this.inclusions = inclusions;
        this.price = price;
    }

    public void getPackageDetails() {
        System.out.println("Package ID: " + this.packageId);
        System.out.println("Destination: " + this.destination);
        System.out.println("Days: " + this.days);
        System.out.println("Inclusions: " + this.inclusions);
        System.out.println("Price: ₹" + this.price);
    }
}
