class Furniture {
    private String name;
    
    Furniture() {
        System.out.println("Furniture created");
    }
    
    public void setName(String name) {
        this.name = name; 
    }
  
    public String getFurnitureInfo() {
        return name;
    }
}
