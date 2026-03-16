class Element {
    int atomicNumber;
    String symbol;
    String name;
    double atomicMass;
    String category;

    public void getElementDetails() {
        System.out.println("Atomic No: " + this.atomicNumber);
        System.out.println("Symbol: " + this.symbol);
        System.out.println("Name: " + this.name);
        System.out.println("Mass: " + this.atomicMass);
        System.out.println("Category: " + this.category);
    }
}
