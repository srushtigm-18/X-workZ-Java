class Google {
    int employeeID;
    String employeeName;
    String department;
    String position;
    String location;
    String project;
    String manager;
    String skills;
    String email;
    String phone;
    String joinDate;
    int salary;
    int experience;
    int age;
    boolean remoteWork;
    boolean leadershipRole;
    boolean certified;
    String[] technologies;
    String[] certifications;
    String[] languages;
    int performanceRating;
    double bonus;
    boolean promoted;
    
    Google(int employeeID, String employeeName, String department, String position, String location,
           String project, String manager, String skills, String email, String phone, String joinDate,
           int salary, int experience, int age, boolean remoteWork, boolean leadershipRole, 
           boolean certified, String[] technologies, String[] certifications, String[] languages,
           int performanceRating, double bonus, boolean promoted) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.department = department;
        this.position = position;
        this.location = location;
        this.project = project;
        this.manager = manager;
        this.skills = skills;
        this.email = email;
        this.phone = phone;
        this.joinDate = joinDate;
        this.salary = salary;
        this.experience = experience;
        this.age = age;
        this.remoteWork = remoteWork;
        this.leadershipRole = leadershipRole;
        this.certified = certified;
        this.technologies = technologies;
        this.certifications = certifications;
        this.languages = languages;
        this.performanceRating = performanceRating;
        this.bonus = bonus;
        this.promoted = promoted;
    }
    
    public void getGoogleDetails(){
        System.out.println("The Google employee id is "+this.employeeID);
        System.out.println("The Google employee name is "+this.employeeName);
        System.out.println("The Google department is "+this.department);
        System.out.println("The Google position is "+this.position);
        System.out.println("The Google location is "+this.location);
        System.out.println("The Google project is "+this.project);
        System.out.println("The Google manager is "+this.manager);
        System.out.println("The Google skills are "+this.skills);
        System.out.println("The Google email is "+this.email);
        System.out.println("The Google phone is "+this.phone);
        System.out.println("The Google join date is "+this.joinDate);
        System.out.println("The Google salary is "+this.salary);
        System.out.println("The Google experience is "+this.experience+" years");
        System.out.println("The Google age is "+this.age);
        System.out.println("The Google remote work?.."+this.remoteWork);
        System.out.println("The Google leadership role?.."+this.leadershipRole);
        System.out.println("The Google certified?.."+this.certified);
        getTechnologies(this.technologies);
        getCertifications(this.certifications);
        getLanguages(this.languages);
        System.out.println("The Google performance rating is "+this.performanceRating);
        System.out.println("The Google bonus is "+this.bonus);
        System.out.println("The Google promoted?.."+this.promoted);
        System.out.println("\n");
    }
    
    public void getTechnologies(String[] technologies){
        for(String technology : technologies) {
            System.out.println("Google technology : "+technology);
        }
    }
    
    public void getCertifications(String[] certifications){
        for(String certification : certifications) {
            System.out.println("Certificate: "+certification);
        }
    }
    
    public void getLanguages(String[] languages){
        for(String language : languages) {
            System.out.println("Language: "+language);
        }
    }
}

