class UberRunner {
	
    public static void main(String[] args) {
        Uber uber = new Uber();

        UberAccount userOne = new UberAccount();
        userOne.setMobileNumber("9876543210");
        userOne.setOtp("123456");
        userOne.setName("Sudeep");
        userOne.setEmail("sudeep.uber@gmail.com");
        userOne.setPassword("sudeep123");
        userOne.setPaymentMode("UPI");
        userOne.setLocation("Bengaluru");
        boolean sudeep = uber.createUserAccount(userOne);
        System.out.println(sudeep);
        System.out.println();

        UberAccount userTwo = new UberAccount();
        userTwo.setMobileNumber("9876543211");
        userTwo.setOtp("654321");
        userTwo.setName("Rakshitha");
        userTwo.setEmail("rakshitha.uber@gmail.com");
        userTwo.setPassword("rakshitha@456");
        userTwo.setPaymentMode("Credit Card");
        userTwo.setLocation("Mumbai");
        boolean rakshitha = uber.createUserAccount(userTwo);
        System.out.println(rakshitha);
        System.out.println();

        UberAccount userThree = new UberAccount();
        userThree.setMobileNumber("9876543212");
        userThree.setOtp("112233");
        userThree.setName("Nishvika");
        userThree.setEmail("nishvika.uber@gmail.com");
        userThree.setPassword("nishvika789");
        userThree.setPaymentMode("Debit Card");
        userThree.setLocation("Chennai");
        boolean nishvika = uber.createUserAccount(userThree);
        System.out.println(nishvika);
        System.out.println();

        UberAccount userFour = new UberAccount();
        userFour.setMobileNumber("9876543213");
        userFour.setOtp("445566");
        userFour.setName("Prema");
        userFour.setEmail("prema.uber@gmail.com");
        userFour.setPassword("premaQ@1");
        userFour.setPaymentMode("Paytm");
        userFour.setLocation("Hyderabad");
        boolean prema = uber.createUserAccount(userFour);
        System.out.println(prema);
        System.out.println();

        UberAccount userFive = new UberAccount();
        userFive.setMobileNumber("9876543214");
        userFive.setOtp("778899");
        userFive.setName("Nishka");
        userFive.setEmail("nishka.uber@gmail.com");
        userFive.setPassword("nishkaDev@1");
        userFive.setPaymentMode("Net Banking");
        userFive.setLocation("Delhi");
        boolean nishka = uber.createUserAccount(userFive);
        System.out.println(nishka);
        System.out.println();

        UberAccount userSix = new UberAccount();
        userSix.setMobileNumber("9876543215");
        userSix.setOtp("001122");
        userSix.setName("Uday");
        userSix.setEmail("uday.uber@gmail.com");
        userSix.setPassword("uday456!");
        userSix.setPaymentMode("UPI");
        userSix.setLocation("Pune");
        boolean uday = uber.createUserAccount(userSix);
        System.out.println(uday);
        System.out.println();

        UberAccount userSeven = new UberAccount();
        userSeven.setMobileNumber("9876543216");
        userSeven.setOtp("334455");
        userSeven.setName("Tarun");
        userSeven.setEmail("tarun.uber@gmail.com");
        userSeven.setPassword("tarun789#");
        userSeven.setPaymentMode("Credit Card");
        userSeven.setLocation("Kolkata");
        boolean tarun = uber.createUserAccount(userSeven);
        System.out.println(tarun);
        System.out.println();

        UberAccount userEight = new UberAccount();
        userEight.setMobileNumber("9876543217");
        userEight.setOtp("667788");
        userEight.setName("Suraj");
        userEight.setEmail("suraj.uber@gmail.com");
        userEight.setPassword("surajDev12");
        userEight.setPaymentMode("Debit Card");
        userEight.setLocation("Ahmedabad");
        boolean suraj = uber.createUserAccount(userEight);
        System.out.println(suraj);
        System.out.println();

        UberAccount userNine = new UberAccount();
        userNine.setMobileNumber("9876543218");
        userNine.setOtp("990011");
        userNine.setName("Sahyam");
        userNine.setEmail("sahyam.uber@gmail.com");
        userNine.setPassword("sahyam@303");
        userNine.setPaymentMode("PhonePe");
        userNine.setLocation("Jaipur");
        boolean sahyam = uber.createUserAccount(userNine);
        System.out.println(sahyam);
        System.out.println();

        UberAccount userTen = new UberAccount();
        userTen.setMobileNumber("9876543219");
        userTen.setOtp("122334");
        userTen.setName("Sanjay");
        userTen.setEmail("sanjay.uber@gmail.com");
        userTen.setPassword("sanjay456$");
        userTen.setPaymentMode("Paytm");
        userTen.setLocation("Lucknow");
        boolean sanjay = uber.createUserAccount(userTen);
        System.out.println(sanjay);
        System.out.println();

        UberAccount userEleven = new UberAccount();
        userEleven.setMobileNumber("9876543220");
        userEleven.setOtp("455667");
        userEleven.setName("Rohan");
        userEleven.setEmail("rohan.uber@gmail.com");
        userEleven.setPassword("rohanPro!");
        userEleven.setPaymentMode("UPI");
        userEleven.setLocation("Indore");
        boolean rohan = uber.createUserAccount(userEleven);
        System.out.println(rohan);
        System.out.println();

        UberAccount userTwelve = new UberAccount();
        userTwelve.setMobileNumber("9876543221");
        userTwelve.setOtp("788900");
        userTwelve.setName("Prakash");
        userTwelve.setEmail("prakash.uber@gmail.com");
        userTwelve.setPassword("prakash@999");
        userTwelve.setPaymentMode("Credit Card");
        userTwelve.setLocation("Coimbatore");
        boolean prakash = uber.createUserAccount(userTwelve);
        System.out.println(prakash);
        System.out.println();

        UberAccount userThirteen = new UberAccount();
        userThirteen.setMobileNumber("9876543222");
        userThirteen.setOtp("011223");
        userThirteen.setName("Om");
        userThirteen.setEmail("om.uber@gmail.com");
        userThirteen.setPassword("omDev#2");
        userThirteen.setPaymentMode("Debit Card");
        userThirteen.setLocation("Vadodara");
        boolean om = uber.createUserAccount(userThirteen);
        System.out.println(om);
        System.out.println();

        UberAccount userFourteen = new UberAccount();
        userFourteen.setMobileNumber("9876543223");
        userFourteen.setOtp("344556");
        userFourteen.setName("Nikil");
        userFourteen.setEmail("nikil.uber@gmail.com");
        userFourteen.setPassword("nikil321@");
        userFourteen.setPaymentMode("Net Banking");
        userFourteen.setLocation("Bhopal");
        boolean nikil = uber.createUserAccount(userFourteen);
        System.out.println(nikil);
        System.out.println();

        uber.getUserDetails();  
    }
}