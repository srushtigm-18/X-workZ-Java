class CCD {
    String chainName;
    int outletId;
    String location;
    String founded;
    Coffee coffee;

    public void getCCDDetails() {
        System.out.println("Chain: " + this.chainName);
        System.out.println("Outlet ID: " + this.outletId);
        System.out.println("Location: " + this.location);
        System.out.println("Founded: " + this.founded);
        this.coffee.getCoffeeDetails();
        System.out.println("\n");
    }
}

