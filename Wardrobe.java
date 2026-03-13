class Wardrobe {
    String design;
    int shelves;
    boolean mirror;
    double height;
    String doorType;
    int price;
    boolean lockable;
    double width;
    String color;
    int drawers;
    boolean lights;
    double depth;
    
    Wardrobe(String design, String doorType, String color) {
        this.design = design;
        this.doorType = doorType;
        this.color = color;
    }
    
    Wardrobe(int shelves, int price, int drawers) {
        this.shelves = shelves;
        this.price = price;
        this.drawers = drawers;
    }
    
    Wardrobe(boolean mirror, boolean lockable, boolean lights) {
        this.mirror = mirror;
        this.lockable = lockable;
        this.lights = lights;
    }
    
    Wardrobe(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
}

