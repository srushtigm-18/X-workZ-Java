class Trophy {
    int id;
    String name;
    String type;
    boolean gold;
    String event;
    String category;
    String material;
    int weight;
    int height;
    int year;
    boolean engraved;
    String brand;
    String design;
    boolean crystal;
    int value;
    String location;
    String winner;
    boolean teamAward;
    int position;
    double price;
    String sport;
    String trophyClass;
    
    Trophy(int id, String name, String type, boolean gold, String event, String category, 
           String material, int weight, int height, int year, boolean engraved, 
           String brand, String design, boolean crystal, int value, String location,
           String winner, boolean teamAward, int position, double price, String sport, String trophyClass) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.gold = gold;
        this.event = event;
        this.category = category;
        this.material = material;
        this.weight = weight;
        this.height = height;
        this.year = year;
        this.engraved = engraved;
        this.brand = brand;
        this.design = design;
        this.crystal = crystal;
        this.value = value;
        this.location = location;
        this.winner = winner;
        this.teamAward = teamAward;
        this.position = position;
        this.price = price;
        this.sport = sport;
        this.trophyClass = trophyClass;
    }
    
    public void getTrophyDetails(){
        System.out.println("The trophy id is "+this.id);
        System.out.println("The trophy name is "+this.name);
        System.out.println("The trophy type is "+this.type);
        System.out.println("The trophy is gold?.."+this.gold);
        System.out.println("The trophy event is "+this.event);
        System.out.println("The trophy category is "+this.category);
        System.out.println("The trophy material is "+this.material);
        System.out.println("The trophy weight is "+this.weight);
        System.out.println("The trophy height is "+this.height);
        System.out.println("The trophy year is "+this.year);
        System.out.println("The trophy is engraved?.."+this.engraved);
        System.out.println("The trophy brand is "+this.brand);
        System.out.println("The trophy design is "+this.design);
        System.out.println("The trophy has crystal?.."+this.crystal);
        System.out.println("The trophy value is "+this.value);
        System.out.println("The trophy location is "+this.location);
        System.out.println("The trophy winner is "+this.winner);
        System.out.println("The trophy is team award?.."+this.teamAward);
        System.out.println("The trophy position is "+this.position);
        System.out.println("The trophy price is "+this.price);
        System.out.println("The trophy sport is "+this.sport);
        System.out.println("The trophy class is "+this.trophyClass);
        System.out.println("\n");
    }
}

