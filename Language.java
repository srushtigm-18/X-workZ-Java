class Language {
    private String name;
    
    Language() {
        System.out.println("Language created");
    }
    
    public void setName(String name) {
        this.name = name; 
    }
  
    public String getLanguageInfo() {
        return name;
    }
}

