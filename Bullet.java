class Bullet {
    String caliber;
    int weightGrains;
    boolean jacketed;
    double diameter;
    String material;
    int velocity;
    boolean hollowPoint;
    double length;
    String manufacturer;
    int count;
    boolean armorPiercing;
    double pricePerRound;
    
    Bullet(String caliber, String material, String manufacturer) {
        this.caliber = caliber;
        this.material = material;
        this.manufacturer = manufacturer;
    }
    
    Bullet(int weightGrains, int velocity, int count) {
        this.weightGrains = weightGrains;
        this.velocity = velocity;
        this.count = count;
    }
    
    Bullet(boolean jacketed, boolean hollowPoint, boolean armorPiercing) {
        this.jacketed = jacketed;
        this.hollowPoint = hollowPoint;
        this.armorPiercing = armorPiercing;
    }
    
    Bullet(double diameter, double length, double pricePerRound) {
        this.diameter = diameter;
        this.length = length;
        this.pricePerRound = pricePerRound;
    }
}


