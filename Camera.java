class Camera {
    private String brand;
    
    Camera() {
        System.out.println("Camera created");
    }
    
    public void setBrand(String brand) {
        this.brand = brand; 
    }
  
    public String getCameraInfo() {
        return brand;
    }
}

