class Salon {
    int salonId;
    String salonName;
    String location;
    String chain;
    Service service;

    public Salon(int salonId, String salonName, String location, String chain, Service service) {
        this.salonId = salonId;
        this.salonName = salonName;
        this.location = location;
        this.chain = chain;
        this.service = service;
    }

    public void getSalonDetails() {
        System.out.println("Salon: " + this.salonName);
        System.out.println("ID: " + this.salonId);
        System.out.println("Location: " + this.location);
        System.out.println("Chain: " + this.chain);
        this.service.getServiceDetails();
        System.out.println("\n");
    }
}
