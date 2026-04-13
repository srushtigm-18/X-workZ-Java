class IceCream {
    int iceCreamId;
    Flavor flavor;
    
    IceCream(int iceCreamId, Flavor flavor) {
        this.iceCreamId = iceCreamId;
        this.flavor = flavor;
    }
    
    public void getDetails() {
        System.out.println("IceCream id is: " + this.iceCreamId);
        System.out.println("Flavor id is: " + this.flavor.flavorId);
        System.out.println("Flavor name is: " + this.flavor.flavorName);
        System.out.println("Flavor baseType is: " + this.flavor.baseType);
        System.out.println("Flavor price is: ₹" + this.flavor.price);
        System.out.println("Flavor ingredients is: " + this.flavor.ingredients);
    }
}