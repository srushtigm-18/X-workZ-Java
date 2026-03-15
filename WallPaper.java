class WallPaper {
    int id;
    String name;
    String[] manufacturers;
    String color;
    boolean washable;
    String material;
    String pattern;
    String finish;
    int price;
    int width;
    int height;
    int rollLength;
    boolean peelable;
    String brand;
    String texture;
    boolean ecoFriendly;
    int thickness;
    String applicationType;
    String roomType;
    boolean selfAdhesive;
    int coverageArea;
    double qualityRating;
    String designStyle;
    
    WallPaper(int id, String name, String color, boolean washable, String material, String pattern, 
              String finish, int price, int width, int height, int rollLength, boolean peelable, 
              String brand, String texture, boolean ecoFriendly, int thickness, String applicationType,
              String roomType, boolean selfAdhesive, int coverageArea, double qualityRating, 
              String designStyle, String[] manufacturers) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.washable = washable;
        this.material = material;
        this.pattern = pattern;
        this.finish = finish;
        this.price = price;
        this.width = width;
        this.height = height;
        this.rollLength = rollLength;
        this.peelable = peelable;
        this.brand = brand;
        this.texture = texture;
        this.ecoFriendly = ecoFriendly;
        this.thickness = thickness;
        this.applicationType = applicationType;
        this.roomType = roomType;
        this.selfAdhesive = selfAdhesive;
        this.coverageArea = coverageArea;
        this.qualityRating = qualityRating;
        this.designStyle = designStyle;
        this.manufacturers = manufacturers;
    }
    
    public void getWallPaperDetails(){
        System.out.println("The wallpaper id is "+this.id);
        System.out.println("The wallpaper name is "+this.name);
        System.out.println("The wallpaper color is "+this.color);
        System.out.println("The wallpaper is washable?.."+this.washable);
        System.out.println("The wallpaper material is "+this.material);
        System.out.println("The wallpaper pattern is "+this.pattern);
        System.out.println("The wallpaper finish is "+this.finish);
        System.out.println("The wallpaper price is "+this.price);
        System.out.println("The wallpaper width is "+this.width);
        System.out.println("The wallpaper height is "+this.height);
        System.out.println("The wallpaper roll length is "+this.rollLength);
        System.out.println("The wallpaper is peelable?.."+this.peelable);
        System.out.println("The wallpaper brand is "+this.brand);
        System.out.println("The wallpaper texture is "+this.texture);
        System.out.println("The wallpaper is eco friendly?.."+this.ecoFriendly);
        System.out.println("The wallpaper thickness is "+this.thickness);
        System.out.println("The wallpaper application type is "+this.applicationType);
        System.out.println("The wallpaper room type is "+this.roomType);
        System.out.println("The wallpaper is self adhesive?.."+this.selfAdhesive);
        System.out.println("The wallpaper coverage area is "+this.coverageArea);
        System.out.println("The wallpaper quality rating is "+this.qualityRating);
        System.out.println("The wallpaper design style is "+this.designStyle);
        getManufacturers(this.manufacturers);
        System.out.println("\n");
    }
    
    public void getManufacturers(String[] manufacturers){
        for(String manufacturer : manufacturers){
            System.out.println(manufacturer);
        }
    }
}


