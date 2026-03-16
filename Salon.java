class Salon {
    String salonName;
    int salonId;
    String location;
    String chain;
    Service service;

    public void getSalonDetails() {
        System.out.println("Salon: " + this.salonName);
        System.out.println("ID: " + this.salonId);
        System.out.println("Location: " + this.location);
        System.out.println("Chain: " + this.chain);
        this.service.getServiceDetails();
        System.out.println("\n");
    }
}

