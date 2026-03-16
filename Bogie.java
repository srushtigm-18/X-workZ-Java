class Bogie {
    int bogieNumber;
    String type;
    int capacity;
    String controller;
    boolean ac;

    public void getBogieDetails() {
        System.out.println("Bogie Number: " + this.bogieNumber);
        System.out.println("Type: " + this.type);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Controller: " + this.controller);
        System.out.println("AC: " + (this.ac ? "Yes" : "No"));
    }
}
