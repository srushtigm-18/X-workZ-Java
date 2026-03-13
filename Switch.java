class Switch {
    String type;
    int ratings;
    boolean smartControl;
    double powerLoad;
    String brand;
    int price;
    boolean twoWay;
    double voltage;
    String color;
    int switchCount;
    boolean touchSensitive;
    double installationHeight;
    
    Switch(String type, String brand, String color) {
        this.type = type;
        this.brand = brand;
        this.color = color;
    }
    
    Switch(int ratings, int price, int switchCount) {
        this.ratings = ratings;
        this.price = price;
        this.switchCount = switchCount;
    }
    
    Switch(boolean smartControl, boolean twoWay, boolean touchSensitive) {
        this.smartControl = smartControl;
        this.twoWay = twoWay;
        this.touchSensitive = touchSensitive;
    }
    
    Switch(double powerLoad, double voltage, double installationHeight) {
        this.powerLoad = powerLoad;
        this.voltage = voltage;
        this.installationHeight = installationHeight;
    }
}


