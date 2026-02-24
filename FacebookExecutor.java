class FacebookExecutor {
    public static void main(String[] args) {
        System.out.println("=== Facebook  Login  ===");
        String email = "mark@fb.com";
        System.out.println(Facebook.login(email));
        
        email = "user1@fb.com";
        System.out.println(Facebook.login(email));
        
        email = "admin@fb.com";
        System.out.println(Facebook.login(email));
        
        System.out.println(" ");
        System.out.println("=== Facebook Multi-Device  ===");
        System.out.println(Facebook.login("mark@fb.com", 3));
        System.out.println(Facebook.login("user1@fb.com", 2));
        System.out.println(Facebook.login("admin@fb.com", 5));
    }
}
