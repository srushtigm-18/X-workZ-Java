class Organ {
    int id;
    String name;
    String type;
    boolean vital;
    String location;
    String function;
    double weight;
    int bloodFlow;
    boolean transplanted;
    String donor;
    String recipient;
    boolean diseased;
    String disease;
    int size;
    double functionRate;
    String hospital;
    boolean paired;
    int survivalRate;
    double oxygenUse;
    String bloodType;
    String condition;
    String priority;
    
    Organ(int id, String name, String type, boolean vital, String location, String function, 
          double weight, int bloodFlow, boolean transplanted, String donor, 
          String recipient, boolean diseased, String disease, int size, double functionRate,
          String hospital, boolean paired, int survivalRate, double oxygenUse, 
          String bloodType, String condition, String priority) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.vital = vital;
        this.location = location;
        this.function = function;
        this.weight = weight;
        this.bloodFlow = bloodFlow;
        this.transplanted = transplanted;
        this.donor = donor;
        this.recipient = recipient;
        this.diseased = diseased;
        this.disease = disease;
        this.size = size;
        this.functionRate = functionRate;
        this.hospital = hospital;
        this.paired = paired;
        this.survivalRate = survivalRate;
        this.oxygenUse = oxygenUse;
        this.bloodType = bloodType;
        this.condition = condition;
        this.priority = priority;
    }
    
    public void getOrganDetails(){
        System.out.println("The organ id is "+this.id);
        System.out.println("The organ name is "+this.name);
        System.out.println("The organ type is "+this.type);
        System.out.println("The organ is vital?.."+this.vital);
        System.out.println("The organ location is "+this.location);
        System.out.println("The organ function is "+this.function);
        System.out.println("The organ weight is "+this.weight);
        System.out.println("The organ blood flow is "+this.bloodFlow);
        System.out.println("The organ is transplanted?.."+this.transplanted);
        System.out.println("The organ donor is "+this.donor);
        System.out.println("The organ recipient is "+this.recipient);
        System.out.println("The organ is diseased?.."+this.diseased);
        System.out.println("The organ disease is "+this.disease);
        System.out.println("The organ size is "+this.size);
        System.out.println("The organ function rate is "+this.functionRate);
        System.out.println("The organ hospital is "+this.hospital);
        System.out.println("The organ is paired?.."+this.paired);
        System.out.println("The organ survival rate is "+this.survivalRate);
        System.out.println("The organ oxygen use is "+this.oxygenUse);
        System.out.println("The organ blood type is "+this.bloodType);
        System.out.println("The organ condition is "+this.condition);
        System.out.println("The organ priority is "+this.priority);
        System.out.println("\n");
    }
}
