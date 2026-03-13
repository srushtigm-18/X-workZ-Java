class Rainbow {
    String type;
    String location;
    String season;
    String visibility;
    boolean primary;
    boolean secondary;
    boolean doubleRainbow;
    boolean fullArc;
    int colors;
    int duration;
    int width;
    int height;
    
    Rainbow(String type, String location, String season, String visibility) {
        this.type = type;
        this.location = location;
        this.season = season;
        this.visibility = visibility;
    }
    
    Rainbow(boolean primary, boolean secondary, boolean doubleRainbow, boolean fullArc) {
        this.primary = primary;
        this.secondary = secondary;
        this.doubleRainbow = doubleRainbow;
        this.fullArc = fullArc;
    }
    
    Rainbow(int colors, int duration, int width, int height) {
        this.colors = colors;
        this.duration = duration;
        this.width = width;
        this.height = height;
    }
}


