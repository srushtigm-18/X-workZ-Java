class Factory {
    String factoryName;
    int factoryId;
    String location;
    String industry;
    Machine machine;

    public void getFactoryDetails() {
        System.out.println("Factory: " + this.factoryName);
        System.out.println("ID: " + this.factoryId);
        System.out.println("Location: " + this.location);
        System.out.println("Industry: " + this.industry);
        this.machine.getMachineDetails();
        System.out.println("\n");
    }
}

