class Tigers {
    String species;
    String habitat;
    String color;
    String diet;
    int age;
    int weight;
    int speed;
    double length;
    double height;
    double roarVolume;
    boolean endangered;
    boolean nocturnal;
    
    Tigers(String species, String habitat, String color, String diet) {
        this.species = species;
        this.habitat = habitat;
        this.color = color;
        this.diet = diet;
    }
    
    Tigers(int age, int weight, int speed) {
        this.age = age;
        this.weight = weight;
        this.speed = speed;
    }
    
    Tigers(boolean endangered, boolean nocturnal) {
        this.endangered = endangered;
        this.nocturnal = nocturnal;
    }
    
    Tigers(double length, double height, double roarVolume) {
        this.length = length;
        this.height = height;
        this.roarVolume = roarVolume;
    }
}


