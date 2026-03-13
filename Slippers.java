class Slippers {
    String style;
    int size;
    boolean antiSlip;
    double soleThickness;
    String material;
    int price;
    boolean archSupport;
    double weight;
    String color;
    int pairCount;
    boolean washable;
    double cushionHeight;
    
    Slippers(String style, String material, String color) {
        this.style = style;
        this.material = material;
        this.color = color;
    }
    
    Slippers(int size, int price, int pairCount) {
        this.size = size;
        this.price = price;
        this.pairCount = pairCount;
    }
    
    Slippers(boolean antiSlip, boolean archSupport, boolean washable) {
        this.antiSlip = antiSlip;
        this.archSupport = archSupport;
        this.washable = washable;
    }
    
    Slippers(double soleThickness, double weight, double cushionHeight) {
        this.soleThickness = soleThickness;
        this.weight = weight;
        this.cushionHeight = cushionHeight;
    }
}

