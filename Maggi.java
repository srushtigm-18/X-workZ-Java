class Maggi {
    String flavor;
    String brand;
    String packaging;
    String spiceLevel;
    String expiry;
    String ingredients;
    int quantity;
    int price;
    int weight;
    int shelfLife;
    boolean veg;
    double rating;
    
    Maggi(String flavor, String brand, String packaging, String spiceLevel, 
          String expiry, String ingredients) {
        this.flavor = flavor;
        this.brand = brand;
        this.packaging = packaging;
        this.spiceLevel = spiceLevel;
        this.expiry = expiry;
        this.ingredients = ingredients;
    }
    
    Maggi(int quantity, int price, int weight, int shelfLife) {
        this.quantity = quantity;
        this.price = price;
        this.weight = weight;
        this.shelfLife = shelfLife;
    }
    
    Maggi(boolean veg) {
        this.veg = veg;
    }
    
    Maggi(double rating) {
        this.rating = rating;
    }
}


