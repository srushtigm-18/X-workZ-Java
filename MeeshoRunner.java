class MeeshoRunner {
	
    public static void main(String[] product) {
        Meesho meesho = new Meesho();

        UserAccount2 userOne = new UserAccount2();
        userOne.setUserId(500);
        userOne.setUserName("Riya");
        userOne.setUserEmail("riya@meesho.com");
        userOne.setUserOtp("872246");
        userOne.setUserPhoneNo("9051834738");
        userOne.setUserLocation("Bangalore");
        boolean riya = meesho.createUserAccount(userOne);
        System.out.println(riya);
        //meesho.getUserDetails();
        System.out.println();

        UserAccount2 userTwo = new UserAccount2();
        userTwo.setUserId(501);
        userTwo.setUserName("Amit");
        userTwo.setUserEmail("amit@meesho.com");
        userTwo.setUserOtp("246316");
        userTwo.setUserPhoneNo("9299737631");
        userTwo.setUserLocation("Hyderabad");
       
	   boolean amit = meesho.createUserAccount(userTwo);
        System.out.println(amit);
        //meesho.getUserDetails();
        System.out.println();

        UserAccount2 userThree = new UserAccount2();
        userThree.setUserId(502);  
        userThree.setUserName("Meera");
        userThree.setUserEmail("meera@meesho.com");
        userThree.setUserOtp("207473");
        userThree.setUserPhoneNo("9624731781");
        userThree.setUserLocation("Chennai");
        boolean meera = meesho.createUserAccount(userThree);
        System.out.println(meera);
        //meesho.getUserDetails();
        System.out.println();

        UserAccount2 userFour = new UserAccount2();
        userFour.setUserId(503);  
        userFour.setUserName("Ananya");
        userFour.setUserEmail("ananya@meesho.com");
        userFour.setUserOtp("876646");
        userFour.setUserPhoneNo("9360260647");
        userFour.setUserLocation("Pune");
        boolean ananya = meesho.createUserAccount(userFour);
        System.out.println(ananya);
        //meesho.getUserDetails();
        System.out.println();

        UserAccount2 userFive = new UserAccount2();
        userFive.setUserId(504); 
        userFive.setUserName("Vikas");
        userFive.setUserEmail("vikas@meesho.com");
        userFive.setUserOtp("809570");
        userFive.setUserPhoneNo("9820812191");
        userFive.setUserLocation("Chandigarh");
        boolean vikas = meesho.createUserAccount(userFive);
        System.out.println(vikas);
        //meesho.getUserDetails();
        System.out.println();

        UserAccount2 userSix = new UserAccount2();
        userSix.setUserId(505);
        userSix.setUserName("Priya");
        userSix.setUserEmail("priya@meesho.com");
        userSix.setUserOtp("112233");
        userSix.setUserPhoneNo("9876543215");
        userSix.setUserLocation("Delhi");
        boolean priya = meesho.createUserAccount(userSix);
        System.out.println(priya);
        System.out.println();

        UserAccount2 userSeven = new UserAccount2();
        userSeven.setUserId(506);
        userSeven.setUserName("Arjun");
        userSeven.setUserEmail("arjun@meesho.com");
        userSeven.setUserOtp("445566");
        userSeven.setUserPhoneNo("9876543216");
        userSeven.setUserLocation("Mumbai");
        boolean arjun = meesho.createUserAccount(userSeven);
        System.out.println(arjun);
        System.out.println();

        UserAccount2 userEight = new UserAccount2();
        userEight.setUserId(507);
        userEight.setUserName("Sneha");
        userEight.setUserEmail("sneha@meesho.com");
        userEight.setUserOtp("778899");
        userEight.setUserPhoneNo("9876543217");
        userEight.setUserLocation("Bangalore");
        boolean sneha = meesho.createUserAccount(userEight);
        System.out.println(sneha);
        System.out.println();

        UserAccount2 userNine = new UserAccount2();
        userNine.setUserId(508);
        userNine.setUserName("Rahul");
        userNine.setUserEmail("rahul@meesho.com");
        userNine.setUserOtp("001122");
        userNine.setUserPhoneNo("9876543218");
        userNine.setUserLocation("Kolkata");
       
	   boolean rahul = meesho.createUserAccount(userNine);
        System.out.println(rahul);
        System.out.println();

        UserAccount2 userTen = new UserAccount2();
        userTen.setUserId(509);
        userTen.setUserName("Divya");
        userTen.setUserEmail("divya@meesho.com");
        userTen.setUserOtp("334455");
        userTen.setUserPhoneNo("9876543219");
        userTen.setUserLocation("Ahmedabad");
        boolean divya = meesho.createUserAccount(userTen);
        System.out.println(divya);
        System.out.println();

        UserAccount2 userEleven = new UserAccount2();
        userEleven.setUserId(510);
        userEleven.setUserName("Kiran");
        userEleven.setUserEmail("kiran@meesho.com");
        userEleven.setUserOtp("667788");
        userEleven.setUserPhoneNo("9876543220");
        userEleven.setUserLocation("Jaipur");
        
		boolean kiran = meesho.createUserAccount(userEleven);
        System.out.println(kiran);
        System.out.println();

        UserAccount2 userTwelve = new UserAccount2();
        userTwelve.setUserId(511);
        userTwelve.setUserName("Nisha");
        userTwelve.setUserEmail("nisha@meesho.com");
        userTwelve.setUserOtp("990011");
        userTwelve.setUserPhoneNo("9876543221");
        userTwelve.setUserLocation("Lucknow");
        boolean nisha = meesho.createUserAccount(userTwelve);
        System.out.println(nisha);
        System.out.println();

        UserAccount2 userThirteen = new UserAccount2();
        userThirteen.setUserId(512);
        userThirteen.setUserName("Tejas");
        userThirteen.setUserEmail("tejas@meesho.com");
        userThirteen.setUserOtp("122334");
        userThirteen.setUserPhoneNo("9876543222");
        userThirteen.setUserLocation("Indore");
        boolean tejas = meesho.createUserAccount(userThirteen);
        System.out.println(tejas);
        System.out.println();

        UserAccount2 userFourteen = new UserAccount2();
        userFourteen.setUserId(513);
        userFourteen.setUserName("Lakshmi");
        userFourteen.setUserEmail("lakshmi@meesho.com");
        userFourteen.setUserOtp("455667");
        userFourteen.setUserPhoneNo("9876543223");
        userFourteen.setUserLocation("Coimbatore");

boolean lakshmi = meesho.createUserAccount(userFourteen);
        System.out.println(lakshmi);
        System.out.println();

        UserAccount2 userFifteen = new UserAccount2();
        userFifteen.setUserId(514);
        userFifteen.setUserName("Sameer");
        userFifteen.setUserEmail("sameer@meesho.com");
        userFifteen.setUserOtp("788900");
        userFifteen.setUserPhoneNo("9876543224");
        userFifteen.setUserLocation("Vadodara");
        
		boolean sameer = meesho.createUserAccount(userFifteen);
        System.out.println(sameer);
        System.out.println();

        UserAccount2 userSixteen = new UserAccount2();
        userSixteen.setUserId(515);
        userSixteen.setUserName("Shruti");
        userSixteen.setUserEmail("shruti@meesho.com");
        userSixteen.setUserOtp("011223");
        userSixteen.setUserPhoneNo("9876543225");
        userSixteen.setUserLocation("Bhopal");
        boolean shruti = meesho.createUserAccount(userSixteen);
        System.out.println(shruti);
        System.out.println();

        UserAccount2 userSeventeen = new UserAccount2();
        userSeventeen.setUserId(516);
        userSeventeen.setUserName("Ankit");
        userSeventeen.setUserEmail("ankit@meesho.com");
        userSeventeen.setUserOtp("344556");
        userSeventeen.setUserPhoneNo("9876543226");
        userSeventeen.setUserLocation("Visakhapatnam");
        boolean ankit = meesho.createUserAccount(userSeventeen);
        System.out.println(ankit);

        System.out.println();

        UserAccount2 userEighteen = new UserAccount2();
        userEighteen.setUserId(517);
        userEighteen.setUserName("Neha");
        userEighteen.setUserEmail("neha@meesho.com");
        userEighteen.setUserOtp("677889");
        userEighteen.setUserPhoneNo("9876543227");
        userEighteen.setUserLocation("Surat");
        boolean neha = meesho.createUserAccount(userEighteen);
        System.out.println(neha);
        System.out.println();

        UserAccount2 userNineteen = new UserAccount2();
        userNineteen.setUserId(518);
        userNineteen.setUserName("Rohan");
        userNineteen.setUserEmail("rohan@meesho.com");
        userNineteen.setUserOtp("900112");
        userNineteen.setUserPhoneNo("9876543228");
        userNineteen.setUserLocation("Nagpur");
       
	   boolean rohan = meesho.createUserAccount(userNineteen);
        System.out.println(rohan);
        System.out.println();

        meesho.getUserDetails();  
    }
}