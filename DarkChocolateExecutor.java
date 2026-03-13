class DarkChocolateExecutor {
    public static void main(String[] args) {
        DarkChocolate darkchocolate1 = new DarkChocolate("70% Cocoa", "Cadbury", "Bar", "70%");
        
        DarkChocolate darkchocolate2 = new DarkChocolate(80, 50, 1);
        
        DarkChocolate darkchocolate3 = new DarkChocolate(true, false);
        
        DarkChocolate darkchocolate4 = new DarkChocolate(10.0, 4.0, 3.5);
        
        System.out.println("DarkChocolate Flavor: " + darkchocolate1.flavor);
        System.out.println("DarkChocolate Brand: " + darkchocolate1.brand);
        System.out.println("DarkChocolate Price: " + darkchocolate2.price);
        System.out.println("DarkChocolate Packaging: " + darkchocolate1.packaging);
        System.out.println("DarkChocolate Weight: " + darkchocolate2.weight);
        System.out.println("DarkChocolate CocoaPercentage: " + darkchocolate1.cocoaPercentage);
        System.out.println("DarkChocolate Quantity: " + darkchocolate2.quantity);
        System.out.println("DarkChocolate Height: " + darkchocolate4.height);
        System.out.println("DarkChocolate Width: " + darkchocolate4.width);
        System.out.println("DarkChocolate Veg: " + darkchocolate3.veg);
        System.out.println("DarkChocolate Nuts: " + darkchocolate3.nuts);
        System.out.println("DarkChocolate Sweetness: " + darkchocolate4.sweetness);
        System.out.println("");
    }
}
