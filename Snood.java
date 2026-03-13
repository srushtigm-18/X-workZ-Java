class Snood {
    String style;
    String material;
    String color;
    String size;
    int price;
    int length;
    int thickness;
    double width;
    double height;
    double weight;
    boolean antiMicrobial;
    boolean seamless;
    
    Snood(String style, String material, String color, String size) {
        this.style = style;
        this.material = material;
        this.color = color;
        this.size = size;
    }
    
    Snood(int price, int length, int thickness) {
        this.price = price;
        this.length = length;
        this.thickness = thickness;
    }
    
    Snood(boolean antiMicrobial, boolean seamless) {
        this.antiMicrobial = antiMicrobial;
        this.seamless = seamless;
    }
    
    Snood(double width, double height, double weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
}


