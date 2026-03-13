class Handbag {
    String style;
    String material;
    String color;
    String size;
    String brand;
    String strapType;
    int price;
    int capacity;
    int length;
    int weight;
    boolean waterproof;
    double qualityRating;
    
    Handbag(String style, String material, String color, String size, 
            String brand, String strapType) {
        this.style = style;
        this.material = material;
        this.color = color;
        this.size = size;
        this.brand = brand;
        this.strapType = strapType;
    }
    
    Handbag(int price, int capacity, int length, int weight) {
        this.price = price;
        this.capacity = capacity;
        this.length = length;
        this.weight = weight;
    }
    
    Handbag(boolean waterproof) {
        this.waterproof = waterproof;
    }
    
    Handbag(double qualityRating) {
        this.qualityRating = qualityRating;
    }
}


