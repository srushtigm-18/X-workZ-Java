class Esp32 {
    private String brand;
    private String modelName;
    private String ramMemoryInstalledSize;
    private String cpuSpeed;
    private String connectivityTechnology;
    private long price;
    private String version;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return this.brand;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public String getModelName() {
        return this.modelName;
    }

    public void setRamMemoryInstalledSize(String ramMemoryInstalledSize) {
        this.ramMemoryInstalledSize = ramMemoryInstalledSize;
    }
    public String getRamMemoryInstalledSize() {
        return this.ramMemoryInstalledSize;
    }

    public void setCpuSpeed(String cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }
    public String getCpuSpeed() {
        return this.cpuSpeed;
    }

    public void setConnectivityTechnology(String connectivityTechnology) {
        this.connectivityTechnology = connectivityTechnology;
    }
    public String getConnectivityTechnology() {
        return this.connectivityTechnology;
    }

    public void setPrice(long price) {
        this.price = price;
    }
    public long getPrice() {
        return this.price;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    public String getVersion() {
        return this.version;
    }
}