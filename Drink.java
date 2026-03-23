class Drink {
    private String type;
    
    Drink() {
        System.out.println("Drink created");
    }
    
    public void setType(String type) {
        this.type = type; 
    }
  
    public String getDrinkInfo() {
        return type;
    }
}

