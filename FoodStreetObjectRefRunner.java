class FoodStreetObjectRefRunner {

    public static void main(String[] food) {

        Stall stall = new Stall();
        FoodStreet street = new FoodStreet(1, stall);
        stall.stallId = 201;
        stall.stallName = "Rameshwaram Cafe";
        stall.foodType = "Ghee Podi Dosa";
        stall.price = 80.0;
        stall.location = "VV Puram";
        street.getDetails();

    }
}