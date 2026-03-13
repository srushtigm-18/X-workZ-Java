class Bucket {
    int bucketId;
    String material;
    int capacity;
    String color;
    double price;  
    
   
    public Bucket() {
        this.bucketId = 0;
        this.material = null;
        this.capacity = 0;
        this.color = null;
        this.price = 0.0;
    }
    
  
    public Bucket(int bucketId, String material, int capacity, String color, double price) {
        this.bucketId = bucketId;
        this.material = material;
        this.capacity = capacity;
        this.color = color;
        this.price = price;
    }
}
