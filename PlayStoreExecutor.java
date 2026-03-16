class PlayStoreExecutor {
    public static void main(String[] args) {
        PlayStore ps1 = new PlayStore();
        ps1.storeId = 1; ps1.storeName = "Google Play India"; ps1.developer = "WhatsApp LLC"; ps1.category = "Communication";
        Application a1 = new Application(); a1.appId = 101; a1.appName = "WhatsApp Messenger"; a1.version = "2.24.8.85"; a1.downloadCount = 5000L; a1.rating = 4.3; a1.sizeMB = 198;
        ps1.application = a1; ps1.getStoreDetails();

        PlayStore ps2 = new PlayStore();
        ps2.storeId = 2; ps2.storeName = "Google Play India"; ps2.developer = "Instagram"; ps2.category = "Social";
        Application a2 = new Application(); a2.appId = 102; a2.appName = "Instagram"; a2.version = "312.0.0.42.156"; a2.downloadCount = 2500L; a2.rating = 4.2; a2.sizeMB = 168;
        ps2.application = a2; ps2.getStoreDetails();

        PlayStore ps3 = new PlayStore();
        ps3.storeId = 3; ps3.storeName = "Google Play India"; ps3.developer = "Google LLC"; ps3.category = "Productivity";
        Application a3 = new Application(); a3.appId = 103; a3.appName = "Google"; a3.version = "16.3.28.28.70"; a3.downloadCount = 10000L; a3.rating = 4.4; a3.sizeMB = 245;
        ps3.application = a3; ps3.getStoreDetails();

        PlayStore ps4 = new PlayStore();
        ps4.storeId = 4; ps4.storeName = "Google Play India"; ps4.developer = "MX Media"; ps4.category = "Entertainment";
        Application a4 = new Application(); a4.appId = 104; a4.appName = "MX Player"; a4.version = "1.82.6"; a4.downloadCount = 1800L; a4.rating = 4.1; a4.sizeMB = 89;
        ps4.application = a4; ps4.getStoreDetails();

        PlayStore ps5 = new PlayStore();
        ps5.storeId = 5; ps5.storeName = "Google Play India"; ps5.developer = "Truecaller"; ps5.category = "Communication";
        Application a5 = new Application(); a5.appId = 105; a5.appName = "Truecaller"; a5.version = "12.9.5"; a5.downloadCount = 1200L; a5.rating = 4.3; a5.sizeMB = 156;
        ps5.application = a5; ps5.getStoreDetails();

        PlayStore ps6 = new PlayStore();
        ps6.storeId = 6; ps6.storeName = "Google Play India"; ps6.developer = "InShot Inc."; ps6.category = "Video Players";
        Application a6 = new Application(); a6.appId = 106; a6.appName = "InShot"; a6.version = "2.010.1456"; a6.downloadCount = 900L; a6.rating = 4.6; a6.sizeMB = 134;
        ps6.application = a6; ps6.getStoreDetails();

        PlayStore ps7 = new PlayStore();
        ps7.storeId = 7; ps7.storeName = "Google Play India"; ps7.developer = "Microsoft Corporation"; ps7.category = "Productivity";
        Application a7 = new Application(); a7.appId = 107; a7.appName = "Microsoft Word"; a7.version = "16.0.16827.20102"; a7.downloadCount = 650L; a7.rating = 4.5; a7.sizeMB = 789;
        ps7.application = a7; ps7.getStoreDetails();

        PlayStore ps8 = new PlayStore();
        ps8.storeId = 8; ps8.storeName = "Google Play India"; ps8.developer = "Subway Surfers"; ps8.category = "Action";
        Application a8 = new Application(); a8.appId = 108; a8.appName = "Subway Surfers"; a8.version = "3.33.1"; a8.downloadCount = 3000L; a8.rating = 4.4; a8.sizeMB = 212;
        ps8.application = a8; ps8.getStoreDetails();

        PlayStore ps9 = new PlayStore();
        ps9.storeId = 9; ps9.storeName = "Google Play India"; ps9.developer = "PicsArt"; ps9.category = "Photography";
        Application a9 = new Application(); a9.appId = 109; a9.appName = "Picsart Photo Editor"; a9.version = "25.2.8"; a9.downloadCount = 1100L; a9.rating = 4.2; a9.sizeMB = 167;
        ps9.application = a9; ps9.getStoreDetails();

        PlayStore ps10 = new PlayStore();
        ps10.storeId = 10; ps10.storeName = "Google Play India"; ps10.developer = "Canva"; ps10.category = "Design";
        Application a10 = new Application(); a10.appId = 110; a10.appName = "Canva"; a10.version = "2.305.0"; a10.downloadCount = 450L; a10.rating = 4.7; a10.sizeMB = 89;
        ps10.application = a10; ps10.getStoreDetails();

        PlayStore ps11 = new PlayStore();
        ps11.storeId = 11; ps11.storeName = "Google Play India"; ps11.developer = "Zomato"; ps11.category = "Food & Drink";
        Application a11 = new Application(); a11.appId = 111; a11.appName = "Zomato"; a11.version = "25.2.3"; a11.downloadCount = 800L; a11.rating = 4.3; a11.sizeMB = 123;
        ps11.application = a11; ps11.getStoreDetails();

        PlayStore ps12 = new PlayStore();
        ps12.storeId = 12; ps12.storeName = "Google Play India"; ps12.developer = "PhonePe"; ps12.category = "Finance";
        Application a12 = new Application(); a12.appId = 112; a12.appName = "PhonePe"; a12.version = "24.4.24"; a12.downloadCount = 950L; a12.rating = 4.4; a12.sizeMB = 145;
        ps12.application = a12; ps12.getStoreDetails();

        PlayStore ps13 = new PlayStore();
        ps13.storeId = 13; ps13.storeName = "Google Play India"; ps13.developer = "Paytm"; ps13.category = "Finance";
        Application a13 = new Application(); a13.appId = 113; a13.appName = "Paytm"; a13.version = "10.26.1"; a13.downloadCount = 1100L; a13.rating = 4.2; a13.sizeMB = 189;
        ps13.application = a13; ps13.getStoreDetails();

        PlayStore ps14 = new PlayStore();
        ps14.storeId = 14; ps14.storeName = "Google Play India"; ps14.developer = "UCWeb"; ps14.category = "Communication";
        Application a14 = new Application(); a14.appId = 114; a14.appName = "UC Browser"; a14.version = "13.4.5.1360"; a14.downloadCount = 2000L; a14.rating = 4.1; a14.sizeMB = 89;
        ps14.application = a14; ps14.getStoreDetails();

        PlayStore ps15 = new PlayStore();
        ps15.storeId = 15; ps15.storeName = "Google Play India"; ps15.developer = "Airtel"; ps15.category = "Communication";
        Application a15 = new Application(); a15.appId = 115; a15.appName = "Airtel Thanks"; a15.version = "4.45.1"; a15.downloadCount = 350L; a15.rating = 4.0; a15.sizeMB = 156;
        ps15.application = a15; ps15.getStoreDetails();

        PlayStore ps16 = new PlayStore();
        ps16.storeId = 16; ps16.storeName = "Google Play India"; ps16.developer = "Jio Platforms"; ps16.category = "Communication";
        Application a16 = new Application(); a16.appId = 116; a16.appName = "MyJio"; a16.version = "7.5.05"; a16.downloadCount = 420L; a16.rating = 4.1; a16.sizeMB = 123;
        ps16.application = a16; ps16.getStoreDetails();

        PlayStore ps17 = new PlayStore();
        ps17.storeId = 17; ps17.storeName = "Google Play India"; ps17.developer = "Swiggy"; ps17.category = "Food & Drink";
        Application a17 = new Application(); a17.appId = 117; a17.appName = "Swiggy"; a17.version = "5.9.63"; a17.downloadCount = 280L; a17.rating = 4.4; a17.sizeMB = 167;
        ps17.application = a17; ps17.getStoreDetails();

        PlayStore ps18 = new PlayStore();
        ps18.storeId = 18; ps18.storeName = "Google Play India"; ps18.developer = "Flipkart"; ps18.category = "Shopping";
        Application a18 = new Application(); a18.appId = 118; a18.appName = "Flipkart"; a18.version = "8.73.3"; a18.downloadCount = 750L; a18.rating = 4.5; a18.sizeMB = 234;
        ps18.application = a18; ps18.getStoreDetails();

        PlayStore ps19 = new PlayStore();
        ps19.storeId = 19; ps19.storeName = "Google Play India"; ps19.developer = "Amazon"; ps19.category = "Shopping";
        Application a19 = new Application(); a19.appId = 119; a19.appName = "Amazon Shopping"; a19.version = "25.12.03.00.2"; a19.downloadCount = 650L; a19.rating = 4.3; a19.sizeMB = 289;
        ps19.application = a19; ps19.getStoreDetails();

        PlayStore ps20 = new PlayStore();
        ps20.storeId = 20; ps20.storeName = "Google Play India"; ps20.developer = "Dream Games"; ps20.category = "Casual";
        Application a20 = new Application(); a20.appId = 120; a20.appName = "Royal Match"; a20.version = "24856"; a20.downloadCount = 320L; a20.rating = 4.6; a20.sizeMB = 145;
        ps20.application = a20; ps20.getStoreDetails();
    }
}
