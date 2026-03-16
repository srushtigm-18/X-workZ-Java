class Service {
    int serviceId;
    String treatment;
    String duration;
    double price;
    String specialist;

    public void getServiceDetails() {
        System.out.println("Service ID: " + this.serviceId);
        System.out.println("Treatment: " + this.treatment);
        System.out.println("Duration: " + this.duration);
        System.out.println("Price: " + this.price);
        System.out.println("Specialist: " + this.specialist);
    }
}
