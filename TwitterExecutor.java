class TwitterExecutor {
    public static void main(String[] args) {
        System.out.println("=== Twitter Login  ===");
        String handle = "@elonmusk";
        System.out.println(Twitter.login(handle));
        
        handle = "@user123";
        System.out.println(Twitter.login(handle));
        
        handle = "@news";
        System.out.println(Twitter.login(handle));
        
        System.out.println(" ");
        System.out.println("=== Twitter Multi-Follower ===");
        System.out.println(Twitter.login("@elonmusk", 100));
        System.out.println(Twitter.login("@user123", 250));
        System.out.println(Twitter.login("@news", 500));
    }
}
