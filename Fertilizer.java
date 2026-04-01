class Fertilizer {
    private int id;
    private String name;
    private String expiryDate;
    private String manufactureDate;
    private String brand;
    private String use;
    private String manufactureBy;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
    public String getExpiryDate() {
        return this.expiryDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    public String getManufactureDate() {
        return this.manufactureDate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return this.brand;
    }

    public void setUse(String use) {
        this.use = use;
    }
    public String getUse() {
        return this.use;
    }

    public void setManufactureBy(String manufactureBy) {
        this.manufactureBy = manufactureBy;
    }
    public String getManufactureBy() {
        return this.manufactureBy;
    }
}