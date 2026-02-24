class Instagram {
    public static String login(String username) {
        String status = "Login Successful";
        if(username=="user123") {
            return status + " for Verified Influencer";
        } else if(username=="photo_lover") {
            return status + " for Regular User";
        } else if(username=="business456") {
            return status + " for Business Account";
        }
        System.out.println("Username not found");
        return "Login Failed";
    }
    
    public static String login(String username, int posts) {
        if(username=="user123") {
            return "Influencer - " + posts + " posts visible";
        } else if(username=="photo_lover") {
            return "User - " + posts + " posts loaded";
        } else if(username=="business456") {
            return "Business - " + posts + " business posts";
        }
        System.out.println("Username not found");
        return "Login Failed";
    }
}
