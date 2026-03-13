class GrapesExecutor {
    public static void main(String[] args) {
        Grapes grapes1 = new Grapes("Thompson", "Green", "Nashik", "Sweet", 
                                    "Winter", "Plastic Punnet");
        
        Grapes grapes2 = new Grapes(500, 120, 450, 7);
        
        Grapes grapes3 = new Grapes(true);
        
        Grapes grapes4 = new Grapes(8.5);
        
        System.out.println("Grapes Variety: " + grapes1.variety);
        System.out.println("Grapes Color: " + grapes1.color);
        System.out.println("Grapes Quantity: " + grapes2.quantity);
        System.out.println("Grapes Origin: " + grapes1.origin);
        System.out.println("Grapes Price: " + grapes2.price);
        System.out.println("Grapes Taste: " + grapes1.taste);
        System.out.println("Grapes Weight: " + grapes2.weight);
        System.out.println("Grapes Season: " + grapes1.season);
        System.out.println("Grapes ShelfLife: " + grapes2.shelfLife);
        System.out.println("Grapes Packaging: " + grapes1.packaging);
        System.out.println("Grapes Seedless: " + grapes3.seedless);
        System.out.println("Grapes Sweetness: " + grapes4.sweetness);
        System.out.println("");
    }
}