class Twitter {
    public static String login(String handle) {
        String status = "Login Successful";
        if(handle=="@elonmusk") {
            return status + " for Verified Account";
        } else if(handle=="@user123") {
            return status + " for Regular User";
        } else if(handle=="@news") {
            return status + " for News Account";
        }
        System.out.println("Handle not registered");
        return "Login Failed";
    }
    
    public static String login(String handle, int followers) {
        if(handle=="@elonmusk") {
            return "Verified - " + followers + "M followers loaded";
        } else if(handle=="@user123") {
            return "User - " + followers + " followers visible";
        } else if(handle=="@news") {
            return "News - Following " + followers + " accounts";
        }
        System.out.println("Handle not registered");
        return "Login Failed";
    }
}
