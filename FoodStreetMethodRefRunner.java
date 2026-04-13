class FoodStreetMethodRefRunner {

    public static void main(String[] holige) {

        Stall stall = new Stall();
        stall.stallId = 202;
        stall.stallName = "Bhaskar's Mane Holige";
        stall.foodType = "Obbattu Holige";
        stall.price = 25.0;
        stall.location = "VV Puram";
        FoodStreet street = new FoodStreet(2, stall);
        street.getDetails();

    }
}