class Sweater {
    String style;
    String material;
    String color;
    String size;
    String brand;
    String sleeveType;
    int price;
    int chestSize;
    int length;
    int weight;
    boolean wool;
    double warmthRating;
    
    Sweater(String style, String material, String color, String size, 
            String brand, String sleeveType) {
        this.style = style;
        this.material = material;
        this.color = color;
        this.size = size;
        this.brand = brand;
        this.sleeveType = sleeveType;
    }
    
    Sweater(int price, int chestSize, int length, int weight) {
        this.price = price;
        this.chestSize = chestSize;
        this.length = length;
        this.weight = weight;
    }
    
    Sweater(boolean wool) {
        this.wool = wool;
    }
    
    Sweater(double warmthRating) {
        this.warmthRating = warmthRating;
    }
}

