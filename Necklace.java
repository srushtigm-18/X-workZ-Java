class Necklace {
    int necklaceId;
    String necklaceName;
    String material;
    String metalType;
    String stoneType;
    double weightInGrams;
    int lengthInMM;
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
    int priceInInr;
    String warrantyStatus;
    boolean isLimitedEdition;

    public Necklace() {
        this.necklaceId = 0;
        this.necklaceName = null;
        this.material = null;
        this.metalType = null;
        this.stoneType = null;
        this.weightInGrams = 0.0;
        this.lengthInMM = 0;
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
        this.priceInInr = 0;
        this.warrantyStatus = null;
        this.isLimitedEdition = false;
    }

    public Necklace(
        int necklaceId,
        String necklaceName,
        String material,
        String metalType,
        String stoneType,
        double weightInGrams,
        int lengthInMM,
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
        int priceInInr,
        String warrantyStatus,
        boolean isLimitedEdition
    ) {
        this.necklaceId = necklaceId;
        this.necklaceName = necklaceName;
        this.material = material;
        this.metalType = metalType;
        this.stoneType = stoneType;
        this.weightInGrams = weightInGrams;
        this.lengthInMM = lengthInMM;
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
        this.priceInInr = priceInInr;
        this.warrantyStatus = warrantyStatus;
        this.isLimitedEdition = isLimitedEdition;
    }
}
