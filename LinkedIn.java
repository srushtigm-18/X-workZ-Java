class LinkedIn {
    public static String login(String email) {
        String status = "Login Successful";
        if(email=="ceo@company.com") {
            return status + " for Premium Recruiter";
        } else if(email=="engineer@tech.com") {
            return status + " for Professional";
        } else if(email=="student@uni.com") {
            return status + " for Student";
        }
        System.out.println("Email not in network");
        return "Login Failed";
    }
    
    public static String login(String email, int connections) {
        if(email=="ceo@company.com") {
            return "Recruiter : " + connections + "K connections";
        } else if(email=="engineer@tech.com") {
            return "Professional : " + connections + " connections";
        } else if(email=="student@uni.com") {
            return "Student :Building " + connections + " connections";
        }
        System.out.println("Email not in network");
        return "Login Failed";
    }
}
