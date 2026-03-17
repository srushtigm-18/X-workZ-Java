class Element {
    int atomicNumber;
    String symbol;
    String name;
    double atomicMass;
    String category;

    public Element(int atomicNumber, String symbol, String name, double atomicMass, String category) {
        this.atomicNumber = atomicNumber;
        this.symbol = symbol;
        this.name = name;
        this.atomicMass = atomicMass;
        this.category = category;
    }

    public void getElementDetails() {
        System.out.println("Atomic No: " + this.atomicNumber);
        System.out.println("Symbol: " + this.symbol);
        System.out.println("Name: " + this.name);
        System.out.println("Mass: " + this.atomicMass);
        System.out.println("Category: " + this.category);
    }
}
