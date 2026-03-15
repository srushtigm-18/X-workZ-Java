class Paper {
    int id;
    String name;
    String[] manufacturers;
    String type;
    boolean recycled;
    String rawMaterial;
    String grade;
    String finish;
    int price;
    int weight;
    int gsm;
    int size;
    boolean acidFree;
    String brand;
    String brightness;
    boolean watermarked;
    int opacity;
    String pulpType;
    String usage;
    boolean coated;
    int brightnessPercentage;
    double thickness;
    String color;
    
    Paper(int id, String name, String type, boolean recycled, String rawMaterial, String grade, 
          String finish, int price, int weight, int gsm, int size, boolean acidFree, 
          String brand, String brightness, boolean watermarked, int opacity, String pulpType,
          String usage, boolean coated, int brightnessPercentage, double thickness, String color,
          String[] manufacturers) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.recycled = recycled;
        this.rawMaterial = rawMaterial;
        this.grade = grade;
        this.finish = finish;
        this.price = price;
        this.weight = weight;
        this.gsm = gsm;
        this.size = size;
        this.acidFree = acidFree;
        this.brand = brand;
        this.brightness = brightness;
        this.watermarked = watermarked;
        this.opacity = opacity;
        this.pulpType = pulpType;
        this.usage = usage;
        this.coated = coated;
        this.brightnessPercentage = brightnessPercentage;
        this.thickness = thickness;
        this.color = color;
        this.manufacturers = manufacturers;
    }
    
    public void getPaperDetails(){
        System.out.println("The paper id is "+this.id);
        System.out.println("The paper name is "+this.name);
        System.out.println("The paper type is "+this.type);
        System.out.println("The paper is recycled?.."+this.recycled);
        System.out.println("The paper raw material is "+this.rawMaterial);
        System.out.println("The paper grade is "+this.grade);
        System.out.println("The paper finish is "+this.finish);
        System.out.println("The paper price is "+this.price);
        System.out.println("The paper weight is "+this.weight);
        System.out.println("The paper gsm is "+this.gsm);
        System.out.println("The paper size is "+this.size);
        System.out.println("The paper is acid free?.."+this.acidFree);
        System.out.println("The paper brand is "+this.brand);
        System.out.println("The paper brightness is "+this.brightness);
        System.out.println("The paper is watermarked?.."+this.watermarked);
        System.out.println("The paper opacity is "+this.opacity);
        System.out.println("The paper pulp type is "+this.pulpType);
        System.out.println("The paper usage is "+this.usage);
        System.out.println("The paper is coated?.."+this.coated);
        System.out.println("The paper brightness percentage is "+this.brightnessPercentage);
        System.out.println("The paper thickness is "+this.thickness);
        System.out.println("The paper color is "+this.color);
        getManufacturers(this.manufacturers);
        System.out.println("\n");
    }
    
    public void getManufacturers(String[] manufacturers){
        for(String manufacturer : manufacturers){
            System.out.println(manufacturer);
        }
    }
}


