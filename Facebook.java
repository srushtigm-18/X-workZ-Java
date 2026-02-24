class Facebook {
    public static String login(String email) {
        String status = "Login Successful";
        if(email=="mark@fb.com") {
            return status + " for Meta Employee";
        } else if(email=="user1@fb.com") {
            return status + " for Regular User";
        } else if(email=="admin@fb.com") {
            return status + " for Admin";
        }
        System.out.println("Email not registered");
        return "Login Failed";
    }
    
    public static String login(String email, int devices) {
        if(email=="mark@fb.com") {
            return "Meta Employee - " + devices + " devices active";
        } else if(email=="user1@fb.com") {
            return "Regular User - " + devices + " devices";
        } else if(email=="admin@fb.com") {
            return "Admin - " + devices + " admin sessions";
        }
        System.out.println("Email not registered");
        return "Login Failed";
    }
}
