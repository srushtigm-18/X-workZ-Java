class EducationExecutor{
    public static void main(String[] args){
        Education edu1 = new Education(1, "RV College Engineering", "UG Engineering", false, "VTU", 
                                     "Bengaluru", 4500, 300, true, "Dr. Kumar", 
                                     "AICTE Approved", true, "English", 60, 52.0, 
                                     "Narayana Health", false, 8, 250000.0, 
                                     true, "Excellent", "High");
        edu1.getEducationDetails();

        Education edu2 = new Education(2, "National Hill View School", "High School", false, "CBSE", 
                                     "Bengaluru", 2500, 120, true, "Mrs. Sharma", 
                                     "CBSE Affiliated", true, "English", 45, 12.0, 
                                     "Manipal Hospital", true, 5, 120000.0, 
                                     true, "Outstanding", "High");
        edu2.getEducationDetails();

        Education edu3 = new Education(3, "Srushti Coding Academy", "Programming", false, "Internal", 
                                     "Koramangala", 200, 15, true, "Srushti G M", 
                                     "Java Certification", true, "English", 10, 2.0, 
                                     "NIMHANS", false, 10, 50000.0, 
                                     true, "Top Rated", "Critical");
        edu3.getEducationDetails();

        Education edu4 = new Education(4, "Christ University", "PG Management", false, "UGC", 
                                     "Hosur Road", 21000, 1200, true, "Fr. Thomas", 
                                     "NAAC A+", true, "English", 120, 100.0, 
                                     "Apollo Hospital", true, 15, 350000.0, 
                                     true, "World Class", "High");
        edu4.getEducationDetails();

        Education edu5 = new Education(5, "IIM Bengaluru", "MBA", false, "AIU", 
                                     "Bannerghatta Road", 1200, 150, true, "Prof. Anita", 
                                     "Triple Accredited", true, "English", 25, 120.0, 
                                     "Narayana Health", true, 4, 2500000.0, 
                                     true, "Elite", "Critical");
        edu5.getEducationDetails();

        Education edu6 = new Education(6, "PES University", "Engineering", false, "VTU", 
                                     "Ring Road", 12000, 800, true, "Dr. Rao", 
                                     "QS Ranked", true, "English", 90, 45.0, 
                                     "Fortis Hospital", false, 12, 300000.0, 
                                     true, "Excellent", "High");
        edu6.getEducationDetails();

        Education edu7 = new Education(7, "St. Joseph's College", "UG Science", false, "Autonomous", 
                                     "Langford Road", 3500, 200, true, "Fr. Davis", 
                                     "Autonomous College", true, "English", 35, 15.0, 
                                     "Manipal Hospital", false, 6, 80000.0, 
                                     true, "Historic", "High");
        edu7.getEducationDetails();

        Education edu8 = new Education(8, "IIIT Bengaluru", "Tech Research", false, "UGC", 
                                     "Electronics City", 1800, 120, true, "Prof. Reddy", 
                                     "Research Institute", true, "English", 20, 25.0, 
                                     "Sakra Hospital", false, 5, 400000.0, 
                                     true, "Innovation Hub", "Critical");
        edu8.getEducationDetails();

        Education edu9 = new Education(9, "BMS College Engineering", "UG PG", false, "VTU", 
                                     "Basavanagudi", 5000, 350, true, "Dr. Mohan", 
                                     "Autonomous", true, "English", 70, 30.0, 
                                     "NIMHANS", false, 10, 220000.0, 
                                     true, "Legacy", "High");
        edu9.getEducationDetails();

        Education edu10 = new Education(10, "Srushti Java Institute", "Professional", false, "Internal", 
                                      "Indiranagar", 500, 25, true, "Srushti G M", 
                                      "Stepler Certification", true, "English", 15, 3.0, 
                                      "Apollo Clinic", false, 12, 75000.0, 
                                      true, "Coding Excellence", "Critical");
        edu10.getEducationDetails();
    }
}
