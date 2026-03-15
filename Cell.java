class Cell {
    int id;
    String name;
    String type;
    boolean alive;
    String function;
    String location;
    int size;
    long count;
    boolean dividing;
    String phase;
    String organism;
    String tissue;
    boolean cancerous;
    int cycleTime;
    double energy;
    String patient;
    String hospital;
    boolean stem;
    int divisionRate;
    double mutationRate;
    String status;
    String risk;
    
    Cell(int id, String name, String type, boolean alive, String function, String location, 
         int size, long count, boolean dividing, String phase, String organism, 
         String tissue, boolean cancerous, int cycleTime, double energy, 
         String patient, String hospital, boolean stem, int divisionRate, 
         double mutationRate, String status, String risk) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.alive = alive;
        this.function = function;
        this.location = location;
        this.size = size;
        this.count = count;
        this.dividing = dividing;
        this.phase = phase;
        this.organism = organism;
        this.tissue = tissue;
        this.cancerous = cancerous;
        this.cycleTime = cycleTime;
        this.energy = energy;
        this.patient = patient;
        this.hospital = hospital;
        this.stem = stem;
        this.divisionRate = divisionRate;
        this.mutationRate = mutationRate;
        this.status = status;
        this.risk = risk;
    }
    
    public void getCellDetails(){
        System.out.println("The cell id is "+this.id);
        System.out.println("The cell name is "+this.name);
        System.out.println("The cell type is "+this.type);
        System.out.println("The cell is alive?.."+this.alive);
        System.out.println("The cell function is "+this.function);
        System.out.println("The cell location is "+this.location);
        System.out.println("The cell size is "+this.size);
        System.out.println("The cell count is "+this.count);
        System.out.println("The cell is dividing?.."+this.dividing);
        System.out.println("The cell phase is "+this.phase);
        System.out.println("The cell organism is "+this.organism);
        System.out.println("The cell tissue is "+this.tissue);
        System.out.println("The cell is cancerous?.."+this.cancerous);
        System.out.println("The cell cycle time is "+this.cycleTime);
        System.out.println("The cell energy is "+this.energy);
        System.out.println("The cell patient is "+this.patient);
        System.out.println("The cell hospital is "+this.hospital);
        System.out.println("The cell is stem?.."+this.stem);
        System.out.println("The cell division rate is "+this.divisionRate);
        System.out.println("The cell mutation rate is "+this.mutationRate);
        System.out.println("The cell status is "+this.status);
        System.out.println("The cell risk is "+this.risk);
        System.out.println("\n");
    }
}
