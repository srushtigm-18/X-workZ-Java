class Card {
    private String type;
    
    Card() {
        System.out.println("Card created");
    }
    
    public void setType(String type) {
        this.type = type; 
    }
  
    public String getCardInfo() {
        return type;
    }
}

