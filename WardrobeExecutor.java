class WardrobeExecutor {
    public static void main(String[] args) {
        Wardrobe wardrobe1 = new Wardrobe("Modern", "Sliding", "Walnut");
        
        Wardrobe wardrobe2 = new Wardrobe(5, 18500, 3);
        
        Wardrobe wardrobe3 = new Wardrobe(true, true, false);
        
        Wardrobe wardrobe4 = new Wardrobe(78.0, 54.0, 24.0);
        
        System.out.println("Wardrobe Design: " + wardrobe1.design);
        System.out.println("Wardrobe Shelves: " + wardrobe2.shelves);
        System.out.println("Wardrobe Mirror: " + wardrobe3.mirror);
        System.out.println("Wardrobe Height: " + wardrobe4.height);
        System.out.println("Wardrobe DoorType: " + wardrobe1.doorType);
        System.out.println("Wardrobe Price: " + wardrobe2.price);
        System.out.println("Wardrobe Lockable: " + wardrobe3.lockable);
        System.out.println("Wardrobe Width: " + wardrobe4.width);
        System.out.println("Wardrobe Color: " + wardrobe1.color);
        System.out.println("Wardrobe Drawers: " + wardrobe2.drawers);
        System.out.println("Wardrobe Lights: " + wardrobe3.lights);
        System.out.println("Wardrobe Depth: " + wardrobe4.depth);
        System.out.println("");
    }
}
