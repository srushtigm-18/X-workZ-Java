class Bogie {
    int bogieNumber;
    String type;
    int capacity;
    String controller;

    public Bogie(int bogieNumber, String type, int capacity, String controller) {
        this.bogieNumber = bogieNumber;
        this.type = type;
        this.capacity = capacity;
        this.controller = controller;
    }

    public void getBogieDetails() {
        System.out.println("Bogie No: " + this.bogieNumber);
        System.out.println("Type: " + this.type);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Controller: " + this.controller);
    }
}
