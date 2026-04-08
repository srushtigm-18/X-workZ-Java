class SwiggyRunner {

    public static void main(String[] food) {
	
        Swiggy swiggy = new Swiggy();

        SwiggyAccount userOne = new SwiggyAccount();
        userOne.setId("SWIGGY_001");
        userOne.setName("Meghana");
        userOne.setMobileNumber("9876543210");
        userOne.setOtp("123456");
        userOne.setEmail("meghana.swiggy@gmail.com");
        userOne.setAddress("Hennur, Bengaluru");

        boolean m1 = swiggy.createUserAccount(userOne);
        System.out.println(m1);
        System.out.println();

        SwiggyAccount userTwo = new SwiggyAccount();
        userTwo.setId("SWIGGY_002");
        userTwo.setName("Shreya");
        userTwo.setMobileNumber("9876543211");
        userTwo.setOtp("654321");
        userTwo.setEmail("shreya.swiggy@gmail.com");
        userTwo.setAddress("Koramangala, Bengaluru");

        boolean s1 = swiggy.createUserAccount(userTwo);
        System.out.println(s1);
        System.out.println();

        SwiggyAccount userThree = new SwiggyAccount();
        userThree.setId("SWIGGY_003");
        userThree.setName("Bhagya");
        userThree.setMobileNumber("9876543212");
        userThree.setOtp("112233");
        userThree.setEmail("bhagya.swiggy@gmail.com");
        userThree.setAddress("Vimanapura, Bengaluru");

        boolean b1 = swiggy.createUserAccount(userThree);
        System.out.println(b1);
        System.out.println();

        SwiggyAccount userFour = new SwiggyAccount();
        userFour.setId("SWIGGY_004");
        userFour.setName("Shashi");
        userFour.setMobileNumber("9876543213");
        userFour.setOtp("445566");
        userFour.setEmail("shashi.swiggy@gmail.com");
        userFour.setAddress("Indiranagar, Bengaluru");

        boolean sh1 = swiggy.createUserAccount(userFour);
        System.out.println(sh1);
        System.out.println();

        SwiggyAccount userFive = new SwiggyAccount();
        userFive.setId("SWIGGY_005");
        userFive.setName("Srushti");
        userFive.setMobileNumber("9876543214");
        userFive.setOtp("778899");
        userFive.setEmail("srushti.swiggy@gmail.com");
        userFive.setAddress("Electronic City, Bengaluru");

        boolean sr1 = swiggy.createUserAccount(userFive);
        System.out.println(sr1);
        swiggy.getUserDetails();
        System.out.println();
    }
}