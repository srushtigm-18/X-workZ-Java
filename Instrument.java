class Instrument {
    private String name;
    
    Instrument() {
        System.out.println("Instrument created");
    }
    
    public void setName(String name) {
        this.name = name; 
    }
  
    public String getInstrumentInfo() {
        return name;
    }
}

