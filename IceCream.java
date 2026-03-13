class IceCream {
    String flavor;
    String brand;
    String packaging;
    String topping;
    int price;
    int weight;
    int quantity;
    double height;
    double width;
    double sweetness;
    boolean veg;
    boolean nuts;
    
    IceCream(String flavor, String brand, String packaging, String topping) {
        this.flavor = flavor;
        this.brand = brand;
        this.packaging = packaging;
        this.topping = topping;
    }
    
    IceCream(int price, int weight, int quantity) {
        this.price = price;
        this.weight = weight;
        this.quantity = quantity;
    }
    
    IceCream(boolean veg, boolean nuts) {
        this.veg = veg;
        this.nuts = nuts;
    }
    
    IceCream(double height, double width, double sweetness) {
        this.height = height;
        this.width = width;
        this.sweetness = sweetness;
    }
}


