class Hardware {
    private String type;
    
    Hardware() {
        System.out.println("Hardware created");
    }
    
    public void setType(String type) {
        this.type = type; 
    }
  
    public String getHardwareInfo() {
        return type;
    }
}
