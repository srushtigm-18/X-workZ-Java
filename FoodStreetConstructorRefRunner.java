class FoodStreetConstructorRefRunner {

    public static void main(String[] chat) {
	

        Stall stall = new Stall();
        stall.stallId = 203;
        stall.stallName = "Karnataka Bhel House";
        stall.foodType = "Masala Puri";
        stall.price = 30.0;
        stall.location = "VV Puram";
        FoodStreet street = new FoodStreet(3, stall);
        street.getDetails();

    }
}