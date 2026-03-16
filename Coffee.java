
class Coffee {
    int coffeeId;
    String name;
    String type;
    double price;
    String size;

    public void getCoffeeDetails() {
        System.out.println("Coffee ID: " + this.coffeeId);
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Price: " + this.price);
        System.out.println("Size: " + this.size);
    }
}