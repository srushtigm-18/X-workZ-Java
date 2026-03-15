class Brain {
    int id;
    String name;
    String lobe;
    boolean dominant;
    String function;
    String location;
    String activity;
    int neurons;
    int volume;
    int age;
    boolean damaged;
    String hemisphere;
    String region;
    boolean active;
    int frequency;
    String patient;
    String hospital;
    boolean tumor;
    int size;
    double bloodFlow;
    String condition;
    String severity;
    
    Brain(int id, String name, String lobe, boolean dominant, String function, String location, 
          String activity, int neurons, int volume, int age, boolean damaged, 
          String hemisphere, String region, boolean active, int frequency, 
          String patient, String hospital, boolean tumor, int size, double bloodFlow, 
          String condition, String severity) {
        this.id = id;
        this.name = name;
        this.lobe = lobe;
        this.dominant = dominant;
        this.function = function;
        this.location = location;
        this.activity = activity;
        this.neurons = neurons;
        this.volume = volume;
        this.age = age;
        this.damaged = damaged;
        this.hemisphere = hemisphere;
        this.region = region;
        this.active = active;
        this.frequency = frequency;
        this.patient = patient;
        this.hospital = hospital;
        this.tumor = tumor;
        this.size = size;
        this.bloodFlow = bloodFlow;
        this.condition = condition;
        this.severity = severity;
    }
    
    public void getBrainDetails(){
        System.out.println("The brain id is "+this.id);
        System.out.println("The brain name is "+this.name);
        System.out.println("The brain lobe is "+this.lobe);
        System.out.println("The brain is dominant?.."+this.dominant);
        System.out.println("The brain function is "+this.function);
        System.out.println("The brain location is "+this.location);
        System.out.println("The brain activity is "+this.activity);
        System.out.println("The brain neurons count is "+this.neurons);
        System.out.println("The brain volume is "+this.volume);
        System.out.println("The brain age is "+this.age);
        System.out.println("The brain is damaged?.."+this.damaged);
        System.out.println("The brain hemisphere is "+this.hemisphere);
        System.out.println("The brain region is "+this.region);
        System.out.println("The brain is active?.."+this.active);
        System.out.println("The brain frequency is "+this.frequency);
        System.out.println("The brain patient is "+this.patient);
        System.out.println("The brain hospital is "+this.hospital);
        System.out.println("The brain has tumor?.."+this.tumor);
        System.out.println("The brain tumor size is "+this.size);
        System.out.println("The brain blood flow is "+this.bloodFlow);
        System.out.println("The brain condition is "+this.condition);
        System.out.println("The brain severity is "+this.severity);
        System.out.println("\n");
    }
}

