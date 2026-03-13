class Bracelet {
    int braceletId;
    String braceletName;
    String material;
    String metalType;
    String stoneType;
    double weightInGrams;
    int sizeInMM;
    String color;
    String brand;
    String countryOfOrigin;
    boolean isAdjustable;
    boolean isWaterproof;
    boolean isHypoallergenic;
    String designTheme;
    String style;             
    String claspType;
    String finish;            
    int priceInRs;
    String warrantyStatus;
    boolean isLimitedEdition;

   public Bracelet() {
        this.braceletId = 0;
        this.braceletName = null;
        this.material = null;
        this.metalType = null;
        this.stoneType = null;
        this.weightInGrams = 0.0;
        this.sizeInMM = 0;
        this.color = null;
        this.brand = null;
        this.countryOfOrigin = null;
        this.isAdjustable = false;
        this.isWaterproof = false;
        this.isHypoallergenic = false;
        this.designTheme = null;
        this.style = null;
        this.claspType = null;
        this.finish = null;
        this.priceInRs = 0;
        this.warrantyStatus = null;
        this.isLimitedEdition = false;
    }

    public Bracelet(
        int braceletId,
        String braceletName,
        String material,
        String metalType,
        String stoneType,
        double weightInGrams,
        int sizeInMM,
        String color,
        String brand,
        String countryOfOrigin,
        boolean isAdjustable,
        boolean isWaterproof,
        boolean isHypoallergenic,
        String designTheme,
        String style,
        String claspType,
        String finish,
        int priceInRs,
        String warrantyStatus,
        boolean isLimitedEdition
    ) {
        this.braceletId = braceletId;
        this.braceletName = braceletName;
        this.material = material;
        this.metalType = metalType;
        this.stoneType = stoneType;
        this.weightInGrams = weightInGrams;
        this.sizeInMM = sizeInMM;
        this.color = color;
        this.brand = brand;
        this.countryOfOrigin = countryOfOrigin;
        this.isAdjustable = isAdjustable;
        this.isWaterproof = isWaterproof;
        this.isHypoallergenic = isHypoallergenic;
        this.designTheme = designTheme;
        this.style = style;
        this.claspType = claspType;
        this.finish = finish;
        this.priceInRs = priceInRs;
        this.warrantyStatus = warrantyStatus;
        this.isLimitedEdition = isLimitedEdition;
    }
}
