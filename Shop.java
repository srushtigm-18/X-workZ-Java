class Shop {
    private String name;
    
    Shop() {
        System.out.println("Shop created");
    }
    
    public void setName(String name) {
        this.name = name; 
    }
  
    public String getShopInfo() {
        return name;
    }
}

