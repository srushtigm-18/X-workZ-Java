class CloudService {
    private String provider;
    
    CloudService() {
        System.out.println("CloudService created");
    }
    
    public void setProvider(String provider) {
        this.provider = provider; 
    }
  
    public String getCloudInfo() {
        return provider;
    }
}


