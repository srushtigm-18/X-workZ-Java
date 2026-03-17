class Franchise {
    int franchiseId;
    String owner;
    double valuation;
    int championships;
    boolean active;  

    public Franchise(int franchiseId, String owner, double valuation, int championships, boolean active) {
        this.franchiseId = franchiseId;
        this.owner = owner;
        this.valuation = valuation;
        this.championships = championships;
        this.active = active;
    }

    public void getFranchiseDetails() {
        System.out.println("Franchise ID: " + this.franchiseId);
        System.out.println("Owner: " + this.owner);
        System.out.println("Valuation: $" + this.valuation + "B");
        System.out.println("Championships: " + this.championships);
        System.out.println("Status: " + (this.active ? "Active" : "Inactive"));
    }
}
