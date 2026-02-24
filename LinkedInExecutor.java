class LinkedInExecutor {
    public static void main(String[] args) {
        System.out.println("=== LinkedIn Login ===");
        String email = "ceo@company.com";
        System.out.println(LinkedIn.login(email));
        
        email = "engineer@tech.com";
        System.out.println(LinkedIn.login(email));
        
        email = "student@uni.com";
        System.out.println(LinkedIn.login(email));
        
        System.out.println(" ");
        System.out.println("=== LinkedIn Multi-Connection ===");
        System.out.println(LinkedIn.login("ceo@company.com", 500));
        System.out.println(LinkedIn.login("engineer@tech.com", 120));
        System.out.println(LinkedIn.login("student@uni.com", 25));
    }
}
