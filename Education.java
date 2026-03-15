class Education {
    int id;
    String name;
    String level;
    boolean government;
    String board;
    String location;
    int students;
    int teachers;
    boolean accredited;
    String principal;
    String affiliation;
    boolean coed;
    String medium;
    int classrooms;
    double area;
    String hospitalAttached;
    boolean hostel;
    int batches;
    double fee;
    boolean scholarship;
    String status;
    String priority;
    
    Education(int id, String name, String level, boolean government, String board, String location, 
              int students, int teachers, boolean accredited, String principal, 
              String affiliation, boolean coed, String medium, int classrooms, double area,
              String hospitalAttached, boolean hostel, int batches, double fee, 
              boolean scholarship, String status, String priority) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.government = government;
        this.board = board;
        this.location = location;
        this.students = students;
        this.teachers = teachers;
        this.accredited = accredited;
        this.principal = principal;
        this.affiliation = affiliation;
        this.coed = coed;
        this.medium = medium;
        this.classrooms = classrooms;
        this.area = area;
        this.hospitalAttached = hospitalAttached;
        this.hostel = hostel;
        this.batches = batches;
        this.fee = fee;
        this.scholarship = scholarship;
        this.status = status;
        this.priority = priority;
    }
    
    public void getEducationDetails(){
        System.out.println("The education id is "+this.id);
        System.out.println("The institution name is "+this.name);
        System.out.println("The education level is "+this.level);
        System.out.println("The institution is government?.."+this.government);
        System.out.println("The board affiliation is "+this.board);
        System.out.println("The location is "+this.location);
        System.out.println("The student count is "+this.students);
        System.out.println("The teacher count is "+this.teachers);
        System.out.println("The institution is accredited?.."+this.accredited);
        System.out.println("The principal is "+this.principal);
        System.out.println("The affiliation is "+this.affiliation);
        System.out.println("The institution is co-ed?.."+this.coed);
        System.out.println("The medium of instruction is "+this.medium);
        System.out.println("The classroom count is "+this.classrooms);
        System.out.println("The campus area is "+this.area);
        System.out.println("The attached hospital is "+this.hospitalAttached);
        System.out.println("The hostel facility exists?.."+this.hostel);
        System.out.println("The batch count is "+this.batches);
        System.out.println("The annual fee is "+this.fee);
        System.out.println("The scholarship available?.."+this.scholarship);
        System.out.println("The current status is "+this.status);
        System.out.println("The priority level is "+this.priority);
        System.out.println("\n");
    }
}