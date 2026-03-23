class Game {
    private String name;
    
    Game() {
        System.out.println("Game created");
    }
    
    public void setName(String name) {
        this.name = name; 
    }
  
    public String getGameInfo() {
        return name;
    }
}

