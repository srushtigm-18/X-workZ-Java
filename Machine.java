class Machine {
    int machineId;
    String machineType;
    int capacity;
    String manufacturer;
    double cost;

    public Machine(int machineId, String machineType, int capacity, String manufacturer, double cost) {
        this.machineId = machineId;
        this.machineType = machineType;
        this.capacity = capacity;
        this.manufacturer = manufacturer;
        this.cost = cost;
    }

    public void getMachineDetails() {
        System.out.println("Machine ID: " + this.machineId);
        System.out.println("Type: " + this.machineType);
        System.out.println("Capacity: " + this.capacity + " units/hr");
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Cost: " + this.cost + "Cr");
    }
}
