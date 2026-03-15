class Toxic {
    int id;
    String name;
    String type;
    boolean carcinogenic;
    String source;
    String exposureRoute;
    String toxicityLevel;
    int price;
    int concentration;
    int exposureLimit;
    int halfLife;
    boolean banned;
    String brand;
    String symptoms;
    boolean mutagenic;
    int ld50;
    String industry;
    String regulation;
    boolean bioaccumulative;
    int riskLevel;
    double persistence;
    String hazardClass;
    
    Toxic(int id, String name, String type, boolean carcinogenic, String source, String exposureRoute, 
          String toxicityLevel, int price, int concentration, int exposureLimit, int halfLife, boolean banned, 
          String brand, String symptoms, boolean mutagenic, int ld50, String industry,
          String regulation, boolean bioaccumulative, int riskLevel, double persistence, String hazardClass) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.carcinogenic = carcinogenic;
        this.source = source;
        this.exposureRoute = exposureRoute;
        this.toxicityLevel = toxicityLevel;
        this.price = price;
        this.concentration = concentration;
        this.exposureLimit = exposureLimit;
        this.halfLife = halfLife;
        this.banned = banned;
        this.brand = brand;
        this.symptoms = symptoms;
        this.mutagenic = mutagenic;
        this.ld50 = ld50;
        this.industry = industry;
        this.regulation = regulation;
        this.bioaccumulative = bioaccumulative;
        this.riskLevel = riskLevel;
        this.persistence = persistence;
        this.hazardClass = hazardClass;
    }
    
    public void getToxicDetails(){
        System.out.println("The toxic id is "+this.id);
        System.out.println("The toxic name is "+this.name);
        System.out.println("The toxic type is "+this.type);
        System.out.println("The toxic is carcinogenic?.."+this.carcinogenic);
        System.out.println("The toxic source is "+this.source);
        System.out.println("The toxic exposure route is "+this.exposureRoute);
        System.out.println("The toxic toxicity level is "+this.toxicityLevel);
        System.out.println("The toxic price is "+this.price);
        System.out.println("The toxic concentration is "+this.concentration);
        System.out.println("The toxic exposure limit is "+this.exposureLimit);
        System.out.println("The toxic half life is "+this.halfLife);
        System.out.println("The toxic is banned?.."+this.banned);
        System.out.println("The toxic brand is "+this.brand);
        System.out.println("The toxic symptoms are "+this.symptoms);
        System.out.println("The toxic is mutagenic?.."+this.mutagenic);
        System.out.println("The toxic ld50 is "+this.ld50);
        System.out.println("The toxic industry is "+this.industry);
        System.out.println("The toxic regulation is "+this.regulation);
        System.out.println("The toxic is bioaccumulative?.."+this.bioaccumulative);
        System.out.println("The toxic risk level is "+this.riskLevel);
        System.out.println("The toxic persistence is "+this.persistence);
        System.out.println("The toxic hazard class is "+this.hazardClass);
        System.out.println("\n");
    }
}

