class Browse {
    private String browser;
    
    Browse() {
        System.out.println("Browse created");
    }
    
    public void setBrowser(String browser) {
        this.browser = browser; 
    }
  
    public String getBrowseInfo() {
        return browser;
    }
}

