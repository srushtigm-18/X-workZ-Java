class Pepper {
    int id;
    String name;
    String[] varieties;
    String color;
    boolean organic;
    String origin;
    String type;
    String packaging;
    int price;
    int weight;
    int quantity;
    int shelfLife;
    boolean bold;
    String brand;
    String aroma;
    boolean droughtResistant;
    int piperineContent;
    String cultivation;
    String region;
    boolean diseaseResistant;
    int yield;
    double oleoresin;
    String qualityGrade;
    
    Pepper(int id, String name, String color, boolean organic, String origin, String type, 
           String packaging, int price, int weight, int quantity, int shelfLife, boolean bold, 
           String brand, String aroma, boolean droughtResistant, int piperineContent, String cultivation,
           String region, boolean diseaseResistant, int yield, double oleoresin, String qualityGrade,
           String[] varieties) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.organic = organic;
        this.origin = origin;
        this.type = type;
        this.packaging = packaging;
        this.price = price;
        this.weight = weight;
        this.quantity = quantity;
        this.shelfLife = shelfLife;
        this.bold = bold;
        this.brand = brand;
        this.aroma = aroma;
        this.droughtResistant = droughtResistant;
        this.piperineContent = piperineContent;
        this.cultivation = cultivation;
        this.region = region;
        this.diseaseResistant = diseaseResistant;
        this.yield = yield;
        this.oleoresin = oleoresin;
        this.qualityGrade = qualityGrade;
        this.varieties = varieties;
    }
    
    public void getPepperDetails(){
        System.out.println("The pepper id is "+this.id);
        System.out.println("The pepper name is "+this.name);
        System.out.println("The pepper color is "+this.color);
        System.out.println("The pepper is organic?.."+this.organic);
        System.out.println("The pepper origin is "+this.origin);
        System.out.println("The pepper type is "+this.type);
        System.out.println("The pepper packaging is "+this.packaging);
        System.out.println("The pepper price is "+this.price);
        System.out.println("The pepper weight is "+this.weight);
        System.out.println("The pepper quantity is "+this.quantity);
        System.out.println("The pepper shelf life is "+this.shelfLife);
        System.out.println("The pepper is bold?.."+this.bold);
        System.out.println("The pepper brand is "+this.brand);
        System.out.println("The pepper aroma is "+this.aroma);
        System.out.println("The pepper is drought resistant?.."+this.droughtResistant);
        System.out.println("The pepper piperine content is "+this.piperineContent);
        System.out.println("The pepper cultivation is "+this.cultivation);
        System.out.println("The pepper region is "+this.region);
        System.out.println("The pepper is disease resistant?.."+this.diseaseResistant);
        System.out.println("The pepper yield is "+this.yield);
        System.out.println("The pepper oleoresin is "+this.oleoresin);
        System.out.println("The pepper quality grade is "+this.qualityGrade);
        getVarieties(this.varieties);
        System.out.println("\n");
    }
    
    public void getVarieties(String[] varieties){
        for(String variety : varieties){
            System.out.println(variety);
        }
    }
}

