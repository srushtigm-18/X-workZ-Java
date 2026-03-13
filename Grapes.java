class Grapes {
    String variety;
    String color;
    String origin;
    String taste;
    String season;
    String packaging;
    int quantity;
    int price;
    int weight;
    int shelfLife;
    boolean seedless;
    double sweetness;
    
    Grapes(String variety, String color, String origin, String taste, 
           String season, String packaging) {
        this.variety = variety;
        this.color = color;
        this.origin = origin;
        this.taste = taste;
        this.season = season;
        this.packaging = packaging;
    }
    
    Grapes(int quantity, int price, int weight, int shelfLife) {
        this.quantity = quantity;
        this.price = price;
        this.weight = weight;
        this.shelfLife = shelfLife;
    }
    
    Grapes(boolean seedless) {
        this.seedless = seedless;
    }
    
    Grapes(double sweetness) {
        this.sweetness = sweetness;
    }
}


