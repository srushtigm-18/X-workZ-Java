class Motor {
    private String brand;
    
    Motor() {
        System.out.println("Motor created");
    }
    
    public void setBrand(String brand) {
        this.brand = brand; 
    }
  
    public String getMotorInfo() {
        return brand;
    }
}