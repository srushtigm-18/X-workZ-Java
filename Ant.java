class Ant {
    int antId;
    String antType;
    String colonyName; 
    
   
    public Ant() {
        this.antId = 0;
        this.antType = null;
        this.colonyName = null;
    }
    
   
    public Ant(int antId, String antType, String colonyName) {
        this.antId = antId;
        this.antType = antType;
        this.colonyName = colonyName;
    }
}
