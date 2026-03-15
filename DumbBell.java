class DumbBell {
    int id;
    String name;
    String type;
    boolean adjustable;
    String material;
    String grip;
    int weight;
    int diameter;
    int length;
    boolean rubber;
    String brand;
    String color;
    boolean hexagonal;
    int price;
    String usage;
    String gym;
    String athlete;
    boolean pair;
    int reps;
    double maxLift;
    String exercise;
    String quality;
    
    DumbBell(int id, String name, String type, boolean adjustable, String material, 
             String grip, int weight, int diameter, int length, boolean rubber, 
             String brand, String color, boolean hexagonal, int price, String usage,
             String gym, String athlete, boolean pair, int reps, double maxLift, 
             String exercise, String quality) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.adjustable = adjustable;
        this.material = material;
        this.grip = grip;
        this.weight = weight;
        this.diameter = diameter;
        this.length = length;
        this.rubber = rubber;
        this.brand = brand;
        this.color = color;
        this.hexagonal = hexagonal;
        this.price = price;
        this.usage = usage;
        this.gym = gym;
        this.athlete = athlete;
        this.pair = pair;
        this.reps = reps;
        this.maxLift = maxLift;
        this.exercise = exercise;
        this.quality = quality;
    }
    
    public void getDumbBellDetails(){
        System.out.println("The dumbbell id is "+this.id);
        System.out.println("The dumbbell name is "+this.name);
        System.out.println("The dumbbell type is "+this.type);
        System.out.println("The dumbbell is adjustable?.."+this.adjustable);
        System.out.println("The dumbbell material is "+this.material);
        System.out.println("The dumbbell grip is "+this.grip);
        System.out.println("The dumbbell weight is "+this.weight);
        System.out.println("The dumbbell diameter is "+this.diameter);
        System.out.println("The dumbbell length is "+this.length);
        System.out.println("The dumbbell has rubber?.."+this.rubber);
        System.out.println("The dumbbell brand is "+this.brand);
        System.out.println("The dumbbell color is "+this.color);
        System.out.println("The dumbbell is hexagonal?.."+this.hexagonal);
        System.out.println("The dumbbell price is "+this.price);
        System.out.println("The dumbbell usage is "+this.usage);
        System.out.println("The dumbbell gym is "+this.gym);
        System.out.println("The dumbbell athlete is "+this.athlete);
        System.out.println("The dumbbell is pair?.."+this.pair);
        System.out.println("The dumbbell reps is "+this.reps);
        System.out.println("The dumbbell max lift is "+this.maxLift);
        System.out.println("The dumbbell exercise is "+this.exercise);
        System.out.println("The dumbbell quality is "+this.quality);
        System.out.println("\n");
    }
}


