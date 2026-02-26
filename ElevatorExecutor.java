class ElevatorExecutor {
    public static void main(String[] args) {
        System.out.println("Test 1 Elevator Creation");
        boolean created1 = Elevator.createElevator("Otis", 
                                                 "Gen2 Premier", 
                                                 1000, 
                                                 20, 
                                                 1.5, 
                                                 "Automatic", 
                                                 "Destination Dispatch");
        
        if (created1) {
            System.out.println("Elevator created successfully");
            Elevator.getElevatorDetails();
        } else {
            System.out.println("Elevator creation failed");
        }

        System.out.println("Test 2 Another Elevator");
        boolean created2 = Elevator.createElevator("Schindler", 
                                                 "Nexie 10", 
                                                 800, 
                                                 15, 
                                                 2.0, 
                                                 "Sliding", 
                                                 "Conventional");
        
        if (created2) {
            System.out.println("Second elevator created successfully");
            Elevator.getElevatorDetails();
        } else {
            System.out.println("Second elevator creation failed");
        }

        System.out.println("All tests completed");
    }
}
