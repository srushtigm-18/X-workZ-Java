class Office {
    int id;
    String name;
    String type;
    boolean airConditioned;
    String location;
    String department;
    int capacity;
    int employees;
    boolean meetingRoom;
    String equipment;
    String manager;
    String building;
    boolean windowView;
    int floor;
    double area;
    String hospital;
    boolean secureAccess;
    int computers;
    double rent;
    boolean furnished;
    String status;
    String priority;
    
    Office(int id, String name, String type, boolean airConditioned, String location, 
           String department, int capacity, int employees, boolean meetingRoom, 
           String equipment, String manager, String building, boolean windowView, 
           int floor, double area, String hospital, boolean secureAccess, 
           int computers, double rent, boolean furnished, String status, String priority) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.airConditioned = airConditioned;
        this.location = location;
        this.department = department;
        this.capacity = capacity;
        this.employees = employees;
        this.meetingRoom = meetingRoom;
        this.equipment = equipment;
        this.manager = manager;
        this.building = building;
        this.windowView = windowView;
        this.floor = floor;
        this.area = area;
        this.hospital = hospital;
        this.secureAccess = secureAccess;
        this.computers = computers;
        this.rent = rent;
        this.furnished = furnished;
        this.status = status;
        this.priority = priority;
    }
    
    public void getOfficeDetails(){
        System.out.println("The office id is "+this.id);
        System.out.println("The office name is "+this.name);
        System.out.println("The office type is "+this.type);
        System.out.println("The office is air conditioned?.."+this.airConditioned);
        System.out.println("The office location is "+this.location);
        System.out.println("The office department is "+this.department);
        System.out.println("The office capacity is "+this.capacity);
        System.out.println("The office employees count is "+this.employees);
        System.out.println("The office has meeting room?.."+this.meetingRoom);
        System.out.println("The office equipment is "+this.equipment);
        System.out.println("The office manager is "+this.manager);
        System.out.println("The office building is "+this.building);
        System.out.println("The office has window view?.."+this.windowView);
        System.out.println("The office floor is "+this.floor);
        System.out.println("The office area is "+this.area);
        System.out.println("The office hospital is "+this.hospital);
        System.out.println("The office has secure access?.."+this.secureAccess);
        System.out.println("The office computers count is "+this.computers);
        System.out.println("The office rent is "+this.rent);
        System.out.println("The office is furnished?.."+this.furnished);
        System.out.println("The office status is "+this.status);
        System.out.println("The office priority is "+this.priority);
        System.out.println("\\n");
    }
}
