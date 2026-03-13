class Bulb {
    String shape;
    String material;
    double height;
    double width;
    String bulbType;
    String brand;
    boolean autoSwitch;
    double weight;
    String color;
    int price;
    String usage;
    boolean smart;
    
    Bulb(String shape, String material, String bulbType, String brand, String color, String usage) {
        this.shape = shape;
        this.material = material;
        this.bulbType = bulbType;
        this.brand = brand;
        this.color = color;
        this.usage = usage;
    }
    
    Bulb(double height, double width, double weight) {
        this.height = height;
        this.width = width;
        this.weight = weight;
    }
    
    Bulb(boolean autoSwitch, boolean smart) {
        this.autoSwitch = autoSwitch;
        this.smart = smart;
    }
    
    Bulb(int price) {
        this.price = price;
    }
}


