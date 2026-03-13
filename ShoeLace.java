class ShoeLace {
    int laceId;
    String laceName;
    String material;
    String color;
    int lengthInInches;
    String style;
    String pattern;
    boolean isElastic;
    String brand;
    String countryOfOrigin;

    public ShoeLace() {
        this.laceId = 0;
        this.laceName = null;
        this.material = null;
        this.color = null;
        this.lengthInInches = 0;
        this.style = null;
        this.pattern = null;
        this.isElastic = false;
        this.brand = null;
        this.countryOfOrigin = null;
    }

    public ShoeLace(
        int laceId,
        String laceName,
        String material,
        String color,
        int lengthInInches,
        String style,
        String pattern,
        boolean isElastic,
        String brand,
        String countryOfOrigin
    ) {
        this.laceId = laceId;
        this.laceName = laceName;
        this.material = material;
        this.color = color;
        this.lengthInInches = lengthInInches;
        this.style = style;
        this.pattern = pattern;
        this.isElastic = isElastic;
        this.brand = brand;
        this.countryOfOrigin = countryOfOrigin;
    }
}
