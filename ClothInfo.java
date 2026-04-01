class ClothInfo {
    private int id;
    private String clothName;
    private String size;
    private String brand;
    private String material;
    private double price;
    private String color;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setClothName(String clothName) {
        this.clothName = clothName;
    }
    public String getClothName() {
        return this.clothName;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public String getSize() {
        return this.size;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return this.brand;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return this.material;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return this.price;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
}