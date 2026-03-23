class Toy {
    private String name;
    
    Toy() {
        System.out.println("Toy created");
    }
    
    public void setName(String name) {
        this.name = name; 
    }
  
    public String getToyInfo() {
        return name;
    }
}
