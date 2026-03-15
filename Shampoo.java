class Shampoo {
    int id;
    String name;
    String type;
    boolean sulfateFree;
    String scent;
    String purpose;
    String brand;
    int volume;
    double price;
    String ingredients;
    boolean parabenFree;
    String hairType;
    boolean conditioner;
    int shelfLife;
    String packaging;
    String manufacturer;
    boolean organic;
    int rating;
    String target;
    boolean antiDandruff;
    double phLevel;
    String quality;
    
    Shampoo(int id, String name, String type, boolean sulfateFree, String scent, String purpose, 
            String brand, int volume, double price, String ingredients, boolean parabenFree, 
            String hairType, boolean conditioner, int shelfLife, String packaging, 
            String manufacturer, boolean organic, int rating, String target, 
            boolean antiDandruff, double phLevel, String quality) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.sulfateFree = sulfateFree;
        this.scent = scent;
        this.purpose = purpose;
        this.brand = brand;
        this.volume = volume;
        this.price = price;
        this.ingredients = ingredients;
        this.parabenFree = parabenFree;
        this.hairType = hairType;
        this.conditioner = conditioner;
        this.shelfLife = shelfLife;
        this.packaging = packaging;
        this.manufacturer = manufacturer;
        this.organic = organic;
        this.rating = rating;
        this.target = target;
        this.antiDandruff = antiDandruff;
        this.phLevel = phLevel;
        this.quality = quality;
    }
    
    public void getShampooDetails(){
        System.out.println("The shampoo id is "+this.id);
        System.out.println("The shampoo name is "+this.name);
        System.out.println("The shampoo type is "+this.type);
        System.out.println("The shampoo is sulfate free?.."+this.sulfateFree);
        System.out.println("The shampoo scent is "+this.scent);
        System.out.println("The shampoo purpose is "+this.purpose);
        System.out.println("The shampoo brand is "+this.brand);
        System.out.println("The shampoo volume is "+this.volume);
        System.out.println("The shampoo price is "+this.price);
        System.out.println("The shampoo ingredients are "+this.ingredients);
        System.out.println("The shampoo is paraben free?.."+this.parabenFree);
        System.out.println("The shampoo hair type is "+this.hairType);
        System.out.println("The shampoo has conditioner?.."+this.conditioner);
        System.out.println("The shampoo shelf life is "+this.shelfLife);
        System.out.println("The shampoo packaging is "+this.packaging);
        System.out.println("The shampoo manufacturer is "+this.manufacturer);
        System.out.println("The shampoo is organic?.."+this.organic);
        System.out.println("The shampoo rating is "+this.rating);
        System.out.println("The shampoo target is "+this.target);
        System.out.println("The shampoo is anti-dandruff?.."+this.antiDandruff);
        System.out.println("The shampoo pH level is "+this.phLevel);
        System.out.println("The shampoo quality is "+this.quality);
        System.out.println("\n");
    }
}


