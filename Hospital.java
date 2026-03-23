class Hospital {
    private String name;
    
    Hospital() {
        System.out.println("Hospital created");
    }
    
    public void setName(String name) {
        this.name = name; 
    }
  
    public String getHospitalInfo() {
        return name;
    }
}
