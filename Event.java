class Event {
    private String name;
    
    Event() {
        System.out.println("Event created");
    }
    
    public void setName(String name) {
        this.name = name; 
    }
  
    public String getEventInfo() {
        return name;
    }
}

