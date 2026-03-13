class Racket {
    int racketId;
    String playerName;
    String brand;
    String model;
    int matchesPlayed;
    double avgScore;
    String gripSize;
    String stringTension;
    String weightCategory;
    String balancePoint;
    String material;
    int price;
    String headShape;
    double durability;
    String color;
    int shaftFlex;
    String playerLevel;
    double swingSpeed;
    String frameType;
    int warrantyYears;  
    
    public Racket() {
        this.racketId = 0;
        this.playerName = null;
        this.brand = null;
        this.model = null;
        this.matchesPlayed = 0;
        this.avgScore = 0.0;
        this.gripSize = null;
        this.stringTension = null;
        this.weightCategory = null;
        this.balancePoint = null;
        this.material = null;
        this.price = 0;
        this.headShape = null;
        this.durability = 0.0;
        this.color = null;
        this.shaftFlex = 0;
        this.playerLevel = null;
        this.swingSpeed = 0.0;
        this.frameType = null;
        this.warrantyYears = 0;
    }
    
    public Racket(int racketId, String playerName, String brand, String model, int matchesPlayed, 
                  double avgScore, String gripSize, String stringTension, String weightCategory,
                  String balancePoint, String material, int price, String headShape, double durability,
                  String color, int shaftFlex, String playerLevel, double swingSpeed, String frameType,
                  int warrantyYears) {
        this.racketId = racketId;
        this.playerName = playerName;
        this.brand = brand;
        this.model = model;
        this.matchesPlayed = matchesPlayed;
        this.avgScore = avgScore;
        this.gripSize = gripSize;
        this.stringTension = stringTension;
        this.weightCategory = weightCategory;
        this.balancePoint = balancePoint;
        this.material = material;
        this.price = price;
        this.headShape = headShape;
        this.durability = durability;
        this.color = color;
        this.shaftFlex = shaftFlex;
        this.playerLevel = playerLevel;
        this.swingSpeed = swingSpeed;
        this.frameType = frameType;
        this.warrantyYears = warrantyYears;
    }
}
