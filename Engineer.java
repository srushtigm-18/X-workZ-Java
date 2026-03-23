class Engineer {
    private String name;
    
    Engineer() {
        System.out.println("Engineer created");
    }
    
    public void setName(String name) {
        this.name = name; 
    }
  
    public String getEngineerInfo() {
        return name;
    }
}

