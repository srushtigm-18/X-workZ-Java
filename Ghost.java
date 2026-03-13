class Ghost {
    String type;
    String hauntLocation;
    String appearance;
    String behavior;
    boolean friendly;
    boolean visible;
    boolean makesNoise;
    boolean possesses;
    int age;
    int strength;
    int sightings;
    int scareFactor;
    
    Ghost(String type, String hauntLocation, String appearance, String behavior) {
        this.type = type;
        this.hauntLocation = hauntLocation;
        this.appearance = appearance;
        this.behavior = behavior;
    }
    
    Ghost(boolean friendly, boolean visible, boolean makesNoise, boolean possesses) {
        this.friendly = friendly;
        this.visible = visible;
        this.makesNoise = makesNoise;
        this.possesses = possesses;
    }
    
    Ghost(int age, int strength, int sightings, int scareFactor) {
        this.age = age;
        this.strength = strength;
        this.sightings = sightings;
        this.scareFactor = scareFactor;
    }
}

