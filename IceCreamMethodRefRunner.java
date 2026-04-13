class IceCreamMethodRefRunner {

    public static void main(String[] cream) {

        Flavor flavor = new Flavor();
        flavor.flavorId = 502;
        flavor.flavorName = "Belgian Chocolate";
        flavor.baseType = "Dark Chocolate";
        flavor.price = 55.0;
        flavor.ingredients = "70% Cocoa & Hazelnut";
		
        IceCream iceCream = new IceCream(2, flavor);
		
        iceCream.getDetails();
    }
}