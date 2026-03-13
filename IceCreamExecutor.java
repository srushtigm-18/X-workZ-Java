class IceCreamExecutor {
    public static void main(String[] args) {
        IceCream icecream1 = new IceCream("Vanilla", "Kwality Walls", "Cone", "Chocolate");
        
        IceCream icecream2 = new IceCream(50, 75, 1);
        
        IceCream icecream3 = new IceCream(true, false);
        
        IceCream icecream4 = new IceCream(5.0, 4.0, 8.2);
        
        System.out.println("IceCream Flavor: " + icecream1.flavor);
        System.out.println("IceCream Brand: " + icecream1.brand);
        System.out.println("IceCream Price: " + icecream2.price);
        System.out.println("IceCream Packaging: " + icecream1.packaging);
        System.out.println("IceCream Weight: " + icecream2.weight);
        System.out.println("IceCream Topping: " + icecream1.topping);
        System.out.println("IceCream Quantity: " + icecream2.quantity);
        System.out.println("IceCream Height: " + icecream4.height);
        System.out.println("IceCream Width: " + icecream4.width);
        System.out.println("IceCream Veg: " + icecream3.veg);
        System.out.println("IceCream Nuts: " + icecream3.nuts);
        System.out.println("IceCream Sweetness: " + icecream4.sweetness);
        System.out.println("");
    }
}