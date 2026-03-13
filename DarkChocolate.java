class DarkChocolate {
    String flavor;
    String brand;
    String packaging;
    String cocoaPercentage;
    int price;
    int weight;
    int quantity;
    double height;
    double width;
    double sweetness;
    boolean veg;
    boolean nuts;
    
    DarkChocolate(String flavor, String brand, String packaging, String cocoaPercentage) {
        this.flavor = flavor;
        this.brand = brand;
        this.packaging = packaging;
        this.cocoaPercentage = cocoaPercentage;
    }
    
    DarkChocolate(int price, int weight, int quantity) {
        this.price = price;
        this.weight = weight;
        this.quantity = quantity;
    }
    
    DarkChocolate(boolean veg, boolean nuts) {
        this.veg = veg;
        this.nuts = nuts;
    }
    
    DarkChocolate(double height, double width, double sweetness) {
        this.height = height;
        this.width = width;
        this.sweetness = sweetness;
    }
}

