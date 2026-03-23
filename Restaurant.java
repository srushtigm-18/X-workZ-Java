class Restaurant {
    private String name;
    
    Restaurant() {
        System.out.println("Restaurant created");
    }
    
    public void setName(String name) {
        this.name = name; 
    }
  
    public String getRestaurantInfo() {
        return name;
    }
}
