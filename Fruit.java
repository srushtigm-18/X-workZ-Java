class Fruit {
    private String name;
    
    Fruit() {
        System.out.println("Fruit created");
    }
    
    public void setName(String name) {
        this.name = name; 
    }
  
    public String getFruitInfo() {
        return name;
    }
}

