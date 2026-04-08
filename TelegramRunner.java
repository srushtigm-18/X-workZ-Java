class TelegramRunner {

    public static void main(String[] tel) {
		
        Telegram telegram = new Telegram();

        TelegramAccount userOne = new TelegramAccount();
        userOne.setMobile("9876543210");
        userOne.setOtp("123456");
        userOne.setName("Meghana");
        userOne.setUsername("meghana_tlgr");
        userOne.setContactPermission(true);
        userOne.setProfilePhoto("meghana_profile.jpg");

        boolean m = telegram.createUserAccount(userOne);
        System.out.println(m);
        System.out.println();

        TelegramAccount userTwo = new TelegramAccount();
        userTwo.setMobile("9876543211");
        userTwo.setOtp("654321");
        userTwo.setName("Shreya");
        userTwo.setUsername("shreya_tlgr");
        userTwo.setContactPermission(true);
        userTwo.setProfilePhoto("shreya_profile.jpg");

        boolean s = telegram.createUserAccount(userTwo);
        System.out.println(s);
        System.out.println();

        TelegramAccount userThree = new TelegramAccount();
        userThree.setMobile("9876543212");
        userThree.setOtp("112233");
        userThree.setName("Bhagya");
        userThree.setUsername("bhagya_tlgr");
        userThree.setContactPermission(false);
        userThree.setProfilePhoto("bhagya_profile.jpg");

        boolean b = telegram.createUserAccount(userThree);
        System.out.println(b);
        System.out.println();

        TelegramAccount userFour = new TelegramAccount();
        userFour.setMobile("9876543213");
        userFour.setOtp("445566");
        userFour.setName("Shashi");
        userFour.setUsername("shashi_tlgr");
        userFour.setContactPermission(true);
        userFour.setProfilePhoto("shashi_profile.jpg");

        boolean sh1 = telegram.createUserAccount(userFour);
        System.out.println(sh1);
        System.out.println();

        TelegramAccount userFive = new TelegramAccount();
        userFive.setMobile("9876543214");
        userFive.setOtp("778899");
        userFive.setName("Srushti");
        userFive.setUsername("srushti_tlgr");
        userFive.setContactPermission(false);
        userFive.setProfilePhoto("srushti_profile.jpg");

        boolean sr = telegram.createUserAccount(userFive);
        System.out.println(sr);
        telegram.getUserDetails();
        System.out.println();
    }
}