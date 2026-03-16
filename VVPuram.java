class VVPuram {
    String streetName;
    int streetId;
    String location;
    String timing;
    FoodStreet stall;

    public void getStreetDetails() {
        System.out.println("Street: " + this.streetName);
        System.out.println("ID: " + this.streetId);
        System.out.println("Location: " + this.location);
        System.out.println("Timing: " + this.timing);
        this.stall.getStallDetails();
        System.out.println("\n");
    }
}

