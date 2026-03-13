class Cloud {
    String type;
    String shape;
    String color;
    String location;
    String altitude;
    String density;
    String movement;
    String weather;
    boolean rain;
    boolean thunder;
    int coverage;
    int height;
    
    Cloud(String type, String shape, String color, String location, 
          String altitude, String density, String movement, String weather) {
        this.type = type;
        this.shape = shape;
        this.color = color;
        this.location = location;
        this.altitude = altitude;
        this.density = density;
        this.movement = movement;
        this.weather = weather;
    }
    
    Cloud(boolean rain, boolean thunder) {
        this.rain = rain;
        this.thunder = thunder;
    }
    
    Cloud(int coverage, int height) {
        this.coverage = coverage;
        this.height = height;
    }
}

