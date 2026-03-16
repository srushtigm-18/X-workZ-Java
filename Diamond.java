class Diamond {
    int diamondId;
    String name;
    double carat;
    String color;
    double value;

    public void getDiamondDetails() {
        System.out.println("Diamond ID: " + this.diamondId);
        System.out.println("Name: " + this.name);
        System.out.println("Carat: " + this.carat);
        System.out.println("Color: " + this.color);
        System.out.println("Value: $" + this.value + "M");
    }
}