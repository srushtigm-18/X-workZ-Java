class Mug {
    String style;
    String material;
    String color;
    String size;
    int price;
    int capacity;
    int height;
    double width;
    double weight;
    double thickness;
    boolean microwaveSafe;
    boolean dishwasherSafe;
    
    Mug(String style, String material, String color, String size) {
        this.style = style;
        this.material = material;
        this.color = color;
        this.size = size;
    }
    
    Mug(int price, int capacity, int height) {
        this.price = price;
        this.capacity = capacity;
        this.height = height;
    }
    
    Mug(boolean microwaveSafe, boolean dishwasherSafe) {
        this.microwaveSafe = microwaveSafe;
        this.dishwasherSafe = dishwasherSafe;
    }
    
    Mug(double width, double weight, double thickness) {
        this.width = width;
        this.weight = weight;
        this.thickness = thickness;
    }
}

