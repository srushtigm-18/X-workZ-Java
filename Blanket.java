class Blanket {
    int blanketId;
    String blanketType;
    String material;
    String color;
    int sizeInches;
    boolean isWaterproof;

  
    public Blanket() {
        this.blanketId = 0;
        this.blanketType = null;
        this.material = null;
        this.color = null;
        this.sizeInches = 0;
        this.isWaterproof = false;
    }

   
    public Blanket(int blanketId,String blanketType,String material,
        String color,int sizeInches,boolean isWaterproof) {
        this.blanketId = blanketId;
        this.blanketType = blanketType;
        this.material = material;
        this.color = color;
        this.sizeInches = sizeInches;
        this.isWaterproof = isWaterproof;
    }
}
