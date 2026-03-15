class GoogleExecutor{
    public static void main(String[] args){
        String[] tech1 = {"Java", "Spring", "AWS"};
        String[] cert1 = {"AWS Certified", "Oracle Java"};
        String[] lang1 = {"English", "Hindi"};
        
        String[] tech2 = {"Python", "Django", "Docker"};
        String[] cert2 = {"Google Cloud", "Python Cert"};
        String[] lang2 = {"English", "Kannada"};
        
        String[] tech3 = {"React", "Node.js", "MongoDB"};
        String[] cert3 = {"React Cert", "Node.js"};
        String[] lang3 = {"English", "Tamil"};
        
        String[] tech4 = {"Java", "Kubernetes", "GCP"};
        String[] cert4 = {"Google Cloud Professional", "Kubernetes"};
        String[] lang4 = {"English", "Malayalam"};
        
        String[] tech5 = {"Flutter", "Firebase", "Dart"};
        String[] cert5 = {"Google Associate Android", "Firebase"};
        String[] lang5 = {"English", "Marathi"};
        
        String[] tech6 = {"Go", "Microservices", "gRPC"};
        String[] cert6 = {"GCP Professional", "Go Certified"};
        String[] lang6 = {"English", "Telugu"};
        
        Google google1 = new Google(1001, "Srushti G M", "Engineering", "Software Engineer", "Bengaluru",
                                   "Search Engine", "Ravi Kumar", "Full Stack", "srushti@google.com", "9876543210",
                                   "2024-01-15", 1500000, 3, 25, true, false, true, tech1, cert1, lang1, 9, 150000.0, true);
        google1.getGoogleDetails();

        Google google2 = new Google(1002, "Amit Patel", "Cloud", "Cloud Architect", "Hyderabad",
                                   "Cloud Platform", "Priya Sharma", "Cloud Native", "amit@google.com", "9123456789",
                                   "2023-06-01", 2200000, 5, 30, false, true, true, tech2, cert2, lang2, 10, 250000.0, true);
        google2.getGoogleDetails();

        Google google3 = new Google(1003, "Neha Singh", "AI/ML", "Data Scientist", "Bengaluru",
                                   "AI Research", "Vikram Rao", "Machine Learning", "neha@google.com", "9988776655",
                                   "2022-03-10", 1800000, 4, 28, true, false, true, tech3, cert3, lang3, 8, 120000.0, false);
        google3.getGoogleDetails();
        
        Google google4 = new Google(1004, "Rahul Menon", "Product", "Product Manager", "Gurgaon",
                                   "YouTube Analytics", "Anita Desai", "Product Strategy", "rahul@google.com", "9456781230",
                                   "2021-09-20", 2500000, 7, 34, false, true, false, tech4, cert4, lang4, 9, 300000.0, true);
        google4.getGoogleDetails();
        
        Google google5 = new Google(1005, "Priyanka Joshi", "Android", "Android Developer", "Pune",
                                   "Google Maps", "Suresh Nair", "Mobile Dev", "priyanka@google.com", "9765432109",
                                   "2024-02-01", 1400000, 2, 24, true, false, true, tech5, cert5, lang5, 7, 80000.0, false);
        google5.getGoogleDetails();
        
        Google google6 = new Google(1006, "Karan Malhotra", "Security", "Security Engineer", "Delhi",
                                   "Security Ops", "Meera Gupta", "Cybersecurity", "karan@google.com", "9012345678",
                                   "2023-01-15", 2000000, 6, 32, false, false, true, tech6, cert6, lang6, 9, 180000.0, true);
        google6.getGoogleDetails();
	
        
        String[] tech7 = {"Salesforce", "Marketing Cloud", "Google Ads"};
        String[] cert7 = {"Google Ads Cert", "Salesforce"};
        String[] lang7 = {"English", "Tamil"};
        
        String[] tech8 = {"Jenkins", "Ansible", "Terraform"};
        String[] cert8 = {"AWS DevOps", "Terraform Associate"};
        String[] lang8 = {"English", "Hindi"};
        
        String[] tech9 = {"Figma", "Adobe XD", "Sketch"};
        String[] cert9 = {"Google UX Design", "Figma Expert"};
        String[] lang9 = {"English", "Marathi"};
        
        Google google7 = new Google(1007, "Sneha Reddy", "Marketing", "Marketing Manager", "Chennai",
                                   "Google Ads", "Ramesh Kumar", "Digital Marketing", "sneha@google.com", "9678901234",
                                   "2022-07-01", 1700000, 4, 29, true, true, false, tech7, cert7, lang7, 8, 110000.0, true);
        google7.getGoogleDetails();
        
        Google google8 = new Google(1008, "Vikash Yadav", "DevOps", "DevOps Engineer", "Noida",
                                   "Infrastructure", "Lakshmi N", "CI/CD", "vikash@google.com", "9543210987",
                                   "2023-11-10", 1600000, 3, 27, true, false, true, tech8, cert8, lang8, 9, 140000.0, false);
        google8.getGoogleDetails();
        
        Google google9 = new Google(1009, "Anjali Bose", "Design", "UX Designer", "Mumbai",
                                   "Material Design", "Arjun Patel", "UI/UX", "anjali@google.com", "9234567890",
                                   "2021-04-25", 1900000, 5, 31, false, false, true, tech9, cert9, lang9, 10, 200000.0, true);
        google9.getGoogleDetails();
		
		 String[] tech10 = {"Selenium", "Appium", "TestNG"};
        String[] cert10 = {"ISTQB", "Selenium Cert"};
        String[] lang10 = {"English", "Kannada"};
        
        Google google10 = new Google(1010, "Rohit Sharma", "Testing", "QA Engineer", "Bengaluru",
                                    "Quality Assurance", "Deepa Rani", "Test Automation", "rohit@google.com", "9890123456",
                                    "2024-03-01", 1300000, 1, 23, true, false, false, tech10, cert10, lang10, 8, 90000.0, false);
        google10.getGoogleDetails();
    }
}

    
