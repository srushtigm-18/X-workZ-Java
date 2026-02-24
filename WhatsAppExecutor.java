class WhatsAppExecutor {
    public static void main(String[] args) {
        System.out.println("=== WhatsApp Login  ===");
        String phone = "+919876543210";
        System.out.println(WhatsApp.login(phone));
        
        phone = "+918901234567";
        System.out.println(WhatsApp.login(phone));
        
        phone = "+917777777777";
        System.out.println(WhatsApp.login(phone));
        
        System.out.println(" ");
        System.out.println("=== WhatsApp Multi-Chat ===");
        System.out.println(WhatsApp.login("+919876543210", 35));
        System.out.println(WhatsApp.login("+918901234567", 22));
        System.out.println(WhatsApp.login("+917777777777", 15));
    }
}
