class Appliance {
    private String brand;
    
    Appliance() {
        System.out.println("Appliance created");
    }
    
    public void setBrand(String brand) {
        this.brand = brand; 
    }
  
    public String getApplianceInfo() {
        return brand;
    }
}


