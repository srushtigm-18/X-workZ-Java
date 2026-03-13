class Jacket {
    int jacketId;
    String material;
    String size;
    String color;
    double price; 
    
    public Jacket() {
        this.jacketId = 0;
        this.material = null;
        this.size = null;
        this.color = null;
        this.price = 0.0;
    }
    
    public Jacket(int jacketId, String material, String size, String color, double price) {
        this.jacketId = jacketId;
        this.material = material;
        this.size = size;
        this.color = color;
        this.price = price;
    }
}
