class Lotion {
    int id;
    String name;
    String type;
    boolean medicated;
    String scent;
    String purpose;
    String brand;
    int volume;
    double price;
    String ingredients;
    boolean parabenFree;
    String skinType;
    boolean moisturizing;
    int shelfLife;
    String packaging;
    String pharmacy;
    boolean prescription;
    int rating;
    String target;
    boolean hypoallergenic;
    double phLevel;
    String quality;
    
    Lotion(int id, String name, String type, boolean medicated, String scent, String purpose, 
           String brand, int volume, double price, String ingredients, boolean parabenFree, 
           String skinType, boolean moisturizing, int shelfLife, String packaging, 
           String pharmacy, boolean prescription, int rating, String target, 
           boolean hypoallergenic, double phLevel, String quality) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.medicated = medicated;
        this.scent = scent;
        this.purpose = purpose;
        this.brand = brand;
        this.volume = volume;
        this.price = price;
        this.ingredients = ingredients;
        this.parabenFree = parabenFree;
        this.skinType = skinType;
        this.moisturizing = moisturizing;
        this.shelfLife = shelfLife;
        this.packaging = packaging;
        this.pharmacy = pharmacy;
        this.prescription = prescription;
        this.rating = rating;
        this.target = target;
        this.hypoallergenic = hypoallergenic;
        this.phLevel = phLevel;
        this.quality = quality;
    }
    
    public void getLotionDetails(){
        System.out.println("The lotion id is "+this.id);
        System.out.println("The lotion name is "+this.name);
        System.out.println("The lotion type is "+this.type);
        System.out.println("The lotion is medicated?.."+this.medicated);
        System.out.println("The lotion scent is "+this.scent);
        System.out.println("The lotion purpose is "+this.purpose);
        System.out.println("The lotion brand is "+this.brand);
        System.out.println("The lotion volume is "+this.volume);
        System.out.println("The lotion price is "+this.price);
        System.out.println("The lotion ingredients are "+this.ingredients);
        System.out.println("The lotion is paraben free?.."+this.parabenFree);
        System.out.println("The lotion skin type is "+this.skinType);
        System.out.println("The lotion is moisturizing?.."+this.moisturizing);
        System.out.println("The lotion shelf life is "+this.shelfLife);
        System.out.println("The lotion packaging is "+this.packaging);
        System.out.println("The lotion pharmacy is "+this.pharmacy);
        System.out.println("The lotion requires prescription?.."+this.prescription);
        System.out.println("The lotion rating is "+this.rating);
        System.out.println("The lotion target is "+this.target);
        System.out.println("The lotion is hypoallergenic?.."+this.hypoallergenic);
        System.out.println("The lotion pH level is "+this.phLevel);
        System.out.println("The lotion quality is "+this.quality);
        System.out.println("\\n");
    }
}
