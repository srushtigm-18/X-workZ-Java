class FoodStreet {
    int stallId;
    String dishName;
    String specialty;
    double price;
    String ingredients;

    public void getStallDetails() {
        System.out.println("Stall ID: " + this.stallId);
        System.out.println("Dish: " + this.dishName);
        System.out.println("Specialty: " + this.specialty);
        System.out.println("Price: " + this.price);
        System.out.println("Key Ingredients: " + this.ingredients);
    }
}
