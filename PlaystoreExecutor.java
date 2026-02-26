class PlaystoreExecutor{
    public static void main(String[] args) {
       
        boolean created = Playstore.createApp("WhatsApp Messenger", "WhatsApp LLC", 
       "Communication", "2.24.7.15", "com.whatsapp",  5000000000L,  4.3, "Feb 20, 2026", 
      "Everyone");
        
        if (created) {
            System.out.println("App created successfully and listed on Play Store!");
            Playstore.getAppDetails();
        } else {
            System.out.println("App creation failed!");
        }

    }
	
}
