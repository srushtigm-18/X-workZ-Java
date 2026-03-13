class Desert {
    String type;
    String location;
    String climate;
    boolean habitable;
    boolean sandstorms;
    boolean undergroundWater;
    int temperature;
    int area;
    int dunes;
    double length;
    double width;
    double rainfall;
    
    Desert(String type, String location, String climate) {
        this.type = type;
        this.location = location;
        this.climate = climate;
    }
    
    Desert(boolean habitable, boolean sandstorms, boolean undergroundWater) {
        this.habitable = habitable;
        this.sandstorms = sandstorms;
        this.undergroundWater = undergroundWater;
    }
    
    Desert(int temperature, int area, int dunes) {
        this.temperature = temperature;
        this.area = area;
        this.dunes = dunes;
    }
    
    Desert(double length, double width, double rainfall) {
        this.length = length;
        this.width = width;
        this.rainfall = rainfall;
    }
}

