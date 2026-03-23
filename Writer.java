class Writer {
    private String name;
    
    Writer() {
        System.out.println("Writer created");
    }
    
    public void setName(String name) {
        this.name = name; 
    }
  
    public String getWriterInfo() {
        return name;
    }
}
