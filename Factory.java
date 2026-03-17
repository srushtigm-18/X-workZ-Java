class Factory {
    String factoryName;
    int factoryId;
    String location;
    String industry;
    Machine machine;

    public Factory(int factoryId,String factoryName,  String location, String industry, Machine machine) {
        this.factoryName = factoryName;
        this.factoryId = factoryId;
        this.location = location;
        this.industry = industry;
        this.machine = machine;
    }

    public void getFactoryDetails() {
        System.out.println("Factory: " + this.factoryName);
        System.out.println("ID: " + this.factoryId);
        System.out.println("Location: " + this.location);
        System.out.println("Industry: " + this.industry);
        this.machine.getMachineDetails();
        System.out.println("\n");
    }
}
