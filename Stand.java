class Stand {
    int id;
    String name;
    int[] partners;  
    String type;
    boolean adjustable;
    String material;
    String color;
    String usage;
    int price;
    int height;
    int weight;
    int loadCapacity;
    boolean foldable;
    String brand;
    String finish;
    boolean rustProof;
    int width;
    String assemblyType;
    String roomType;
    boolean swivelBase;
    int shelfCount;
    double stabilityRating;
    String designStyle;
    
    Stand(int id, String name, String type, boolean adjustable, String material, String color, 
          String usage, int price, int height, int weight, int loadCapacity, boolean foldable, 
          String brand, String finish, boolean rustProof, int width, String assemblyType,
          String roomType, boolean swivelBase, int shelfCount, double stabilityRating, String designStyle,
          int[] partners) {
        this.id = id;
        this.name = name;
        this.partners = partners;
        this.type = type;
        this.adjustable = adjustable;
        this.material = material;
        this.color = color;
        this.usage = usage;
        this.price = price;
        this.height = height;
        this.weight = weight;
        this.loadCapacity = loadCapacity;
        this.foldable = foldable;
        this.brand = brand;
        this.finish = finish;
        this.rustProof = rustProof;
        this.width = width;
        this.assemblyType = assemblyType;
        this.roomType = roomType;
        this.swivelBase = swivelBase;
        this.shelfCount = shelfCount;
        this.stabilityRating = stabilityRating;
        this.designStyle = designStyle;
    }
    
    public void getStandDetails(){
        System.out.println("The stand id is "+this.id);
        System.out.println("The stand name is "+this.name);
        System.out.println("The stand type is "+this.type);
        System.out.println("The stand is adjustable?.."+this.adjustable);
        System.out.println("The stand material is "+this.material);
        System.out.println("The stand color is "+this.color);
        System.out.println("The stand usage is "+this.usage);
        System.out.println("The stand price is "+this.price);
        System.out.println("The stand height is "+this.height);
        System.out.println("The stand weight is "+this.weight);
        System.out.println("The stand load capacity is "+this.loadCapacity);
        System.out.println("The stand is foldable?.."+this.foldable);
        System.out.println("The stand brand is "+this.brand);
        System.out.println("The stand finish is "+this.finish);
        System.out.println("The stand is rust proof?.."+this.rustProof);
        System.out.println("The stand width is "+this.width);
        System.out.println("The stand assembly type is "+this.assemblyType);
        System.out.println("The stand room type is "+this.roomType);
        System.out.println("The stand is swivel base?.."+this.swivelBase);
        System.out.println("The stand shelf count is "+this.shelfCount);
        System.out.println("The stand stability rating is "+this.stabilityRating);
        System.out.println("The stand design style is "+this.designStyle);
        getPartners(this.partners);
        System.out.println("\n");
    }
    
    public void getPartners(int[] partners){
        for(int partner : partners){
            System.out.println("Partner ID: " + partner);
        }
    }
}

