class Ambulance {
    String model;
    int patientCapacity;
    boolean sirenActive;
    double length;
    String hospitalName;
    int emergencyCode;
    boolean oxygenSupply;
    double fuelLevel;
    String color;
    int responseTime;
    boolean defibrillator;
    double speed;
    
    Ambulance(String model, String hospitalName, String color) {
        this.model = model;
        this.hospitalName = hospitalName;
        this.color = color;
    }
    
    Ambulance(int patientCapacity, int emergencyCode, int responseTime) {
        this.patientCapacity = patientCapacity;
        this.emergencyCode = emergencyCode;
        this.responseTime = responseTime;
    }
    
    Ambulance(boolean sirenActive, boolean oxygenSupply, boolean defibrillator) {
        this.sirenActive = sirenActive;
        this.oxygenSupply = oxygenSupply;
        this.defibrillator = defibrillator;
    }
    
    Ambulance(double length, double fuelLevel, double speed) {
        this.length = length;
        this.fuelLevel = fuelLevel;
        this.speed = speed;
    }
}


