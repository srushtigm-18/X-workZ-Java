class Garlic {
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
    int cloves;
    int shelfLife;
    boolean desi;
    String brand;
    String pungency;
    boolean hillGarlic;
    int allicinContent;
    String cultivation;
    String region;
    boolean exportQuality;
    int bulbSize;
    double moisture;
    String qualityGrade;
    
    Garlic(int id, String name, String color, boolean organic, String origin, String type, 
           String packaging, int price, int weight, int cloves, int shelfLife, boolean desi, 
           String brand, String pungency, boolean hillGarlic, int allicinContent, String cultivation,
           String region, boolean exportQuality, int bulbSize, double moisture, String qualityGrade,
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
        this.cloves = cloves;
        this.shelfLife = shelfLife;
        this.desi = desi;
        this.brand = brand;
        this.pungency = pungency;
        this.hillGarlic = hillGarlic;
        this.allicinContent = allicinContent;
        this.cultivation = cultivation;
        this.region = region;
        this.exportQuality = exportQuality;
        this.bulbSize = bulbSize;
        this.moisture = moisture;
        this.qualityGrade = qualityGrade;
        this.varieties = varieties;
    }
    
    public void getGarlicDetails(){
        System.out.println("The garlic id is "+this.id);
        System.out.println("The garlic name is "+this.name);
        System.out.println("The garlic color is "+this.color);
        System.out.println("The garlic is organic?.."+this.organic);
        System.out.println("The garlic origin is "+this.origin);
        System.out.println("The garlic type is "+this.type);
        System.out.println("The garlic packaging is "+this.packaging);
        System.out.println("The garlic price is "+this.price);
        System.out.println("The garlic weight is "+this.weight);
        System.out.println("The garlic cloves count is "+this.cloves);
        System.out.println("The garlic shelf life is "+this.shelfLife);
        System.out.println("The garlic is desi?.."+this.desi);
        System.out.println("The garlic brand is "+this.brand);
        System.out.println("The garlic pungency is "+this.pungency);
        System.out.println("The garlic is hill garlic?.."+this.hillGarlic);
        System.out.println("The garlic allicin content is "+this.allicinContent);
        System.out.println("The garlic cultivation is "+this.cultivation);
        System.out.println("The garlic region is "+this.region);
        System.out.println("The garlic is export quality?.."+this.exportQuality);
        System.out.println("The garlic bulb size is "+this.bulbSize);
        System.out.println("The garlic moisture is "+this.moisture);
        System.out.println("The garlic quality grade is "+this.qualityGrade);
        getVarieties(this.varieties);
        System.out.println("\n");
    }
    
    public void getVarieties(String[] varieties){
        for(String variety : varieties){
            System.out.println(variety);
        }
    }
}

