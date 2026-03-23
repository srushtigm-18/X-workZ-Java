class Planet {
    private String name;
    
    Planet() {
        System.out.println("Planet created");
    }
    
    public void setName(String name) {
        this.name = name; 
    }
  
    public String getPlanetInfo() {
        return name;
    }
}

