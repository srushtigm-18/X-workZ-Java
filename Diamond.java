class Diamond {
    int diamondId;
    String name;
    double carat;
    String color;
    double value;

    public Diamond(int diamondId, String name, double carat, String color, double value) {
        this.diamondId = diamondId;
        this.name = name;
        this.carat = carat;
        this.color = color;
        this.value = value;
    }

    public void getDiamondDetails() {
        System.out.println("Diamond ID: " + this.diamondId);
        System.out.println("Name: " + this.name);
        System.out.println("Carat: " + this.carat);
        System.out.println("Color: " + this.color);
        System.out.println("Value: $" + this.value + "M");
    }
}
