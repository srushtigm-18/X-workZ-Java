class Map {
    int id;
    String name;
    String type;
    boolean waterproof;
    String material;
    String scale;
    String purpose;
    int price;
    int width;
    int height;
    int layers;
    boolean folded;
    String brand;
    String projection;
    boolean laminated;
    int detailLevel;
    String region;
    String usage;
    boolean digitalCompatible;
    int durability;
    double sizeRatio;
    String theme;
    
    Map(int id, String name, String type, boolean waterproof, String material, String scale, 
        String purpose, int price, int width, int height, int layers, boolean folded, 
        String brand, String projection, boolean laminated, int detailLevel, String region,
        String usage, boolean digitalCompatible, int durability, double sizeRatio, String theme) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.waterproof = waterproof;
        this.material = material;
        this.scale = scale;
        this.purpose = purpose;
        this.price = price;
        this.width = width;
        this.height = height;
        this.layers = layers;
        this.folded = folded;
        this.brand = brand;
        this.projection = projection;
        this.laminated = laminated;
        this.detailLevel = detailLevel;
        this.region = region;
        this.usage = usage;
        this.digitalCompatible = digitalCompatible;
        this.durability = durability;
        this.sizeRatio = sizeRatio;
        this.theme = theme;
    }
    
    public void getMapDetails(){
        System.out.println("The map id is "+this.id);
        System.out.println("The map name is "+this.name);
        System.out.println("The map type is "+this.type);
        System.out.println("The map is waterproof?.."+this.waterproof);
        System.out.println("The map material is "+this.material);
        System.out.println("The map scale is "+this.scale);
        System.out.println("The map purpose is "+this.purpose);
        System.out.println("The map price is "+this.price);
        System.out.println("The map width is "+this.width);
        System.out.println("The map height is "+this.height);
        System.out.println("The map layers is "+this.layers);
        System.out.println("The map is folded?.."+this.folded);
        System.out.println("The map brand is "+this.brand);
        System.out.println("The map projection is "+this.projection);
        System.out.println("The map is laminated?.."+this.laminated);
        System.out.println("The map detail level is "+this.detailLevel);
        System.out.println("The map region is "+this.region);
        System.out.println("The map usage is "+this.usage);
        System.out.println("The map is digital compatible?.."+this.digitalCompatible);
        System.out.println("The map durability is "+this.durability);
        System.out.println("The map size ratio is "+this.sizeRatio);
        System.out.println("The map theme is "+this.theme);
        System.out.println("\n");
    }
}

