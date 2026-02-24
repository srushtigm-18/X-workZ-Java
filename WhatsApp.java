class WhatsApp {
    public static String login(String phone) {
        String status = "Login Successful";
        if(phone=="9876543210") {
            return status + " for Business Account";
        } else if(phone=="+918901234567") {
            return status + " for Regular User";
        } else if(phone=="+917777777777") {
            return status + " for Group Admin";
        }
        System.out.println("Phone not registered");
        return "Login Failed";
    }
    
    public static String login(String phone, int chats) {
        if(phone=="9876543210") {
            return "Business - " + chats + " chats active";
        } else if(phone=="+918901234567") {
            return "User - " + chats + " chats loaded";
        } else if(phone=="+917777777777") {
            return "Admin - Managing " + chats + " group chats";
        }
        System.out.println("Phone not registered");
        return "Login Failed";
    }
}
