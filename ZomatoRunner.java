class ZomatoRunner {

    public static void main(String[] food) {
	
        Zomato zomato = new Zomato();

        ZomatoAccount userOne = new ZomatoAccount();
        userOne.setMobileNumber("9876543210");
        userOne.setOtp("123456");
        userOne.setName("Meghana");
        userOne.setEmail("meghana.zomato@gmail.com");
        userOne.setAddress("Hennur, Bengaluru");
        userOne.setLocation("Karnataka");

        boolean m = zomato.createUserAccount(userOne);
        System.out.println(m);
        zomato.getUserDetails();
        System.out.println();

        ZomatoAccount userTwo = new ZomatoAccount();
        userTwo.setMobileNumber("9876543211");
        userTwo.setOtp("654321");
        userTwo.setName("Shreya");
        userTwo.setEmail("shreya.zomato@gmail.com");
        userTwo.setAddress("Koramangala, Bengaluru");
        userTwo.setLocation("Karnataka");

        boolean s = zomato.createUserAccount(userTwo);
        System.out.println(s);
        zomato.getUserDetails();
        System.out.println();

        ZomatoAccount userThree = new ZomatoAccount();
        userThree.setMobileNumber("9876543212");
        userThree.setOtp("112233");
        userThree.setName("Bhagya");
        userThree.setEmail("bhagya.zomato@gmail.com");
        userThree.setAddress("Vimanapura, Bengaluru");
        userThree.setLocation("Karnataka");

        boolean b = zomato.createUserAccount(userThree);
        System.out.println(b);
        zomato.getUserDetails();
        System.out.println();

        ZomatoAccount userFour = new ZomatoAccount();
        userFour.setMobileNumber("9876543213");
        userFour.setOtp("445566");
        userFour.setName("Shashi");
        userFour.setEmail("shashi.zomato@gmail.com");
        userFour.setAddress("Indiranagar, Bengaluru");
        userFour.setLocation("Karnataka");

        boolean sh = zomato.createUserAccount(userFour);
        System.out.println(sh);
        zomato.getUserDetails();
        System.out.println();

        ZomatoAccount userFive = new ZomatoAccount();
        userFive.setMobileNumber("9876543214");
        userFive.setOtp("778899");
        userFive.setName("Srushti");
        userFive.setEmail("srushti.zomato@gmail.com");
        userFive.setAddress("Electronic City, Bengaluru");
        userFive.setLocation("Karnataka");

        boolean sr = zomato.createUserAccount(userFive);
        System.out.println(sr);
        zomato.getUserDetails();
        System.out.println();
	
        ZomatoAccount userSix = new ZomatoAccount();
        userSix.setMobileNumber("9876543215");
        userSix.setOtp("223344");
        userSix.setName("Priya");
        userSix.setEmail("priya.zomato@gmail.com");
        userSix.setAddress("Whitefield, Bengaluru");
        userSix.setLocation("Karnataka");
        boolean priya = zomato.createUserAccount(userSix);
        System.out.println(priya);
        System.out.println();

        ZomatoAccount userSeven = new ZomatoAccount();
        userSeven.setMobileNumber("9876543216");
        userSeven.setOtp("556677");
        userSeven.setName("Anita");
        userSeven.setEmail("anita.zomato@gmail.com");
        userSeven.setAddress("Jayanagar, Bengaluru");
        userSeven.setLocation("Karnataka");
        boolean anita = zomato.createUserAccount(userSeven);
        System.out.println(anita);
        System.out.println();

        ZomatoAccount userEight = new ZomatoAccount();
        userEight.setMobileNumber("9876543217");
        userEight.setOtp("889900");
        userEight.setName("Divya");
        userEight.setEmail("divya.zomato@gmail.com");
        userEight.setAddress("Marathahalli, Bengaluru");
        userEight.setLocation("Karnataka");
        boolean divya = zomato.createUserAccount(userEight);
        System.out.println(divya);
        System.out.println();

        ZomatoAccount userNine = new ZomatoAccount();
        userNine.setMobileNumber("9876543218");
        userNine.setOtp("001122");
        userNine.setName("Sneha");
        userNine.setEmail("sneha.zomato@gmail.com");
        userNine.setAddress("HSR Layout, Bengaluru");
        userNine.setLocation("Karnataka");
        boolean sn = zomato.createUserAccount(userNine);
        System.out.println(sn);
        System.out.println();

        ZomatoAccount userTen = new ZomatoAccount();
        userTen.setMobileNumber("9876543219");
        userTen.setOtp("334455");
        userTen.setName("Lakshmi");
        userTen.setEmail("lakshmi.zomato@gmail.com");
        userTen.setAddress("Malleswaram, Bengaluru");
        userTen.setLocation("Karnataka");
        boolean lakshmi = zomato.createUserAccount(userTen);
        System.out.println(lakshmi);
        System.out.println();

        ZomatoAccount userEleven = new ZomatoAccount();
        userEleven.setMobileNumber("9876543220");
        userEleven.setOtp("667788");
        userEleven.setName("Rohit");
        userEleven.setEmail("rohit.zomato@gmail.com");
        userEleven.setAddress("Banashankari, Bengaluru");
        userEleven.setLocation("Karnataka");
        boolean rohit = zomato.createUserAccount(userEleven);
        System.out.println(rohit);
        System.out.println();

        ZomatoAccount userTwelve = new ZomatoAccount();
        userTwelve.setMobileNumber("9876543221");
        userTwelve.setOtp("990011");
        userTwelve.setName("Arjun");
        userTwelve.setEmail("arjun.zomato@gmail.com");
        userTwelve.setAddress("Rajajinagar, Bengaluru");
        userTwelve.setLocation("Karnataka");
        boolean aj = zomato.createUserAccount(userTwelve);
        System.out.println(aj);
        System.out.println();

        ZomatoAccount userThirteen = new ZomatoAccount();
        userThirteen.setMobileNumber("9876543222");
        userThirteen.setOtp("122334");
        userThirteen.setName("Rahul");
        userThirteen.setEmail("rahul.zomato@gmail.com");
        userThirteen.setAddress("Yelahanka, Bengaluru");
        userThirteen.setLocation("Karnataka");
        boolean rh = zomato.createUserAccount(userThirteen);
        System.out.println(rh);
        System.out.println();

        ZomatoAccount userFourteen = new ZomatoAccount();
        userFourteen.setMobileNumber("9876543223");
        userFourteen.setOtp("455667");
        userFourteen.setName("Karan");
        userFourteen.setEmail("karan.zomato@gmail.com");
        userFourteen.setAddress("BTM Layout, Bengaluru");
        userFourteen.setLocation("Karnataka");
        boolean kr = zomato.createUserAccount(userFourteen);
        System.out.println(kr);
        System.out.println();

        ZomatoAccount userFifteen = new ZomatoAccount();
        userFifteen.setMobileNumber("9876543224");
        userFifteen.setOtp("788900");
        userFifteen.setName("Vikas");
        userFifteen.setEmail("vikas.zomato@gmail.com");
        userFifteen.setAddress("Silk Board, Bengaluru");
        userFifteen.setLocation("Karnataka");
        boolean karan = zomato.createUserAccount(userFifteen);
        System.out.println(karan);
        System.out.println();

        ZomatoAccount userSixteen = new ZomatoAccount();
        userSixteen.setMobileNumber("9876543225");
        userSixteen.setOtp("011223");
        userSixteen.setName("Sameer");
        userSixteen.setEmail("sameer.zomato@gmail.com");
        userSixteen.setAddress("KR Puram, Bengaluru");
        userSixteen.setLocation("Karnataka");
        boolean sm = zomato.createUserAccount(userSixteen);
        System.out.println(sm);
        System.out.println();

        ZomatoAccount userSeventeen = new ZomatoAccount();
        userSeventeen.setMobileNumber("9876543226");
        userSeventeen.setOtp("344556");
        userSeventeen.setName("Tejas");
        userSeventeen.setEmail("tejas.zomato@gmail.com");
        userSeventeen.setAddress("Hebbal, Bengaluru");
        userSeventeen.setLocation("Karnataka");
        boolean tejas = zomato.createUserAccount(userSeventeen);
        System.out.println(tejas);
        System.out.println();

        ZomatoAccount userEighteen = new ZomatoAccount();
        userEighteen.setMobileNumber("9876543227");
        userEighteen.setOtp("677889");
        userEighteen.setName("Nishant");
        userEighteen.setEmail("nishant.zomato@gmail.com");
        userEighteen.setAddress("Sarjapur Road, Bengaluru");
        userEighteen.setLocation("Karnataka");
        boolean nishant = zomato.createUserAccount(userEighteen);
        System.out.println(nishant);
        System.out.println();

        ZomatoAccount userNineteen = new ZomatoAccount();
        userNineteen.setMobileNumber("9876543228");
        userNineteen.setOtp("900112");
        userNineteen.setName("Akshay");
        userNineteen.setEmail("akshay.zomato@gmail.com");
        userNineteen.setAddress("Bellandur, Bengaluru");
        userNineteen.setLocation("Karnataka");
        boolean akshay = zomato.createUserAccount(userNineteen);
        System.out.println(akshay);
        System.out.println();
		
		zomato.getUserDetails();

        
    }
}