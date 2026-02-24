class InstagramExecutor {
    public static void main(String[] args) {
        System.out.println("=== Instagram  Login ===");
        String username = "user123";
        System.out.println(Instagram.login(username));
        
        username = "photo_lover";
        System.out.println(Instagram.login(username));
        
        username = "business456";
        System.out.println(Instagram.login(username));
        
        System.out.println(" ");
        System.out.println("=== Instagram Multi-Post  ===");
        System.out.println(Instagram.login("user123", 150));
        System.out.println(Instagram.login("photo_lover", 45));
        System.out.println(Instagram.login("business456", 200));
    }
}
