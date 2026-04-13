class IceCreamObjRefRunner {

public static void main(String[] ice) {

Flavor flavor = new Flavor();
IceCream iceCream = new IceCream(1, flavor);

flavor.flavorId = 665;
flavor.flavorName = "Vanilla";
flavor.baseType = "Cream";
flavor.price = 45.0;
flavor.ingredients = "Madagascar Vanilla Beans";
iceCream.getDetails();
}
}