class Conditioner {
    int id;
    String name;
    String type;
    boolean siliconeFree;
    String scent;
    String purpose;
    String brand;
    int volume;
    double price;
    String ingredients;
    boolean parabenFree;
    String hairType;
    boolean leaveIn;
    int shelfLife;
    String packaging;
    String manufacturer;
    boolean organic;
    int rating;
    String target;
    boolean antiFrizz;
    double phLevel;
    String quality;
    
    Conditioner(int id, String name, String type, boolean siliconeFree, String scent, String purpose, 
                String brand, int volume, double price, String ingredients, boolean parabenFree, 
                String hairType, boolean leaveIn, int shelfLife, String packaging, 
                String manufacturer, boolean organic, int rating, String target, 
                boolean antiFrizz, double phLevel, String quality) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.siliconeFree = siliconeFree;
        this.scent = scent;
        this.purpose = purpose;
        this.brand = brand;
        this.volume = volume;
        this.price = price;
        this.ingredients = ingredients;
        this.parabenFree = parabenFree;
        this.hairType = hairType;
        this.leaveIn = leaveIn;
        this.shelfLife = shelfLife;
        this.packaging = packaging;
        this.manufacturer = manufacturer;
        this.organic = organic;
        this.rating = rating;
        this.target = target;
        this.antiFrizz = antiFrizz;
        this.phLevel = phLevel;
        this.quality = quality;
    }
    
    public void getConditionerDetails(){
        System.out.println("The conditioner id is "+this.id);
        System.out.println("The conditioner name is "+this.name);
        System.out.println("The conditioner type is "+this.type);
        System.out.println("The conditioner is silicone free?.."+this.siliconeFree);
        System.out.println("The conditioner scent is "+this.scent);
        System.out.println("The conditioner purpose is "+this.purpose);
        System.out.println("The conditioner brand is "+this.brand);
        System.out.println("The conditioner volume is "+this.volume);
        System.out.println("The conditioner price is "+this.price);
        System.out.println("The conditioner ingredients are "+this.ingredients);
        System.out.println("The conditioner is paraben free?.."+this.parabenFree);
        System.out.println("The conditioner hair type is "+this.hairType);
        System.out.println("The conditioner is leave-in?.."+this.leaveIn);
        System.out.println("The conditioner shelf life is "+this.shelfLife);
        System.out.println("The conditioner packaging is "+this.packaging);
        System.out.println("The conditioner manufacturer is "+this.manufacturer);
        System.out.println("The conditioner is organic?.."+this.organic);
        System.out.println("The conditioner rating is "+this.rating);
        System.out.println("The conditioner target is "+this.target);
        System.out.println("The conditioner is anti-frizz?.."+this.antiFrizz);
        System.out.println("The conditioner pH level is "+this.phLevel);
        System.out.println("The conditioner quality is "+this.quality);
        System.out.println("\n");
    }
}


