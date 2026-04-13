class IceCreamCnstrRunner {

    public static void main(String[] cream) {

        Flavor flavor = new Flavor();
        flavor.flavorId = 503;
        flavor.flavorName = "Alphonso Mango";
        flavor.baseType = "Fruit";
        flavor.price = 60.0;
        flavor.ingredients = "Alphonso Pulp + Saffron";
		
        IceCream iceCream = new IceCream(3, flavor);
        iceCream.getDetails();

}
}