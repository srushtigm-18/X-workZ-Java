class AmbulanceExecutor {
    public static void main(String[] args) {
        Ambulance ambulance1 = new Ambulance("Tata Winger", "Manipal Hospital", "White");
        
        Ambulance ambulance2 = new Ambulance(4, 108, 8);
        
        Ambulance ambulance3 = new Ambulance(true, true, true);
        
        Ambulance ambulance4 = new Ambulance(18.5, 75.0, 120.0);
        
        System.out.println("Ambulance Model: " + ambulance1.model);
        System.out.println("Ambulance Capacity: " + ambulance2.patientCapacity);
        System.out.println("Ambulance Siren: " + ambulance3.sirenActive);
        System.out.println("Ambulance Length: " + ambulance4.length);
        System.out.println("Ambulance Hospital: " + ambulance1.hospitalName);
        System.out.println("Ambulance Code: " + ambulance2.emergencyCode);
        System.out.println("Ambulance Oxygen: " + ambulance3.oxygenSupply);
        System.out.println("Ambulance Fuel: " + ambulance4.fuelLevel);
        System.out.println("Ambulance Color: " + ambulance1.color);
        System.out.println("Ambulance ResponseTime: " + ambulance2.responseTime);
        System.out.println("Ambulance Defibrillator: " + ambulance3.defibrillator);
        System.out.println("Ambulance Speed: " + ambulance4.speed);
        System.out.println("");
    }
}