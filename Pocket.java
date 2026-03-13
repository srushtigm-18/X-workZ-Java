class Pocket {
    int pocketId;
    String pocketType;
    String fabric; 
    
   
    public Pocket() {
        this.pocketId = 0;
        this.pocketType = null;
        this.fabric = null;
    }
    
   
    public Pocket(int pocketId, String pocketType, String fabric) {
        this.pocketId = pocketId;
        this.pocketType = pocketType;
        this.fabric = fabric;
    }
}
