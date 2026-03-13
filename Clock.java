class Clock {
    String style;
    String brand;
    String displayType;
    String material;
    int price;
    int size;
    int batteryLife;
    double width;
    double height;
    double weight;
    boolean alarm;
    boolean smart;
    
    Clock(String style, String brand, String displayType, String material) {
        this.style = style;
        this.brand = brand;
        this.displayType = displayType;
        this.material = material;
    }
    
    Clock(int price, int size, int batteryLife) {
        this.price = price;
        this.size = size;
        this.batteryLife = batteryLife;
    }
    
    Clock(boolean alarm, boolean smart) {
        this.alarm = alarm;
        this.smart = smart;
    }
    
    Clock(double width, double height, double weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
}


