class UdemyRunner {
	
    public static void main(String[] study) {
		
        Udemy udemy = new Udemy();

       UdemyAccount userOne = new UdemyAccount();
        userOne.setName("Zara");
        userOne.setEmail("zara@udemy.com");
        userOne.setPassword("zara123");
        userOne.setCoursePreference("Python");
        userOne.setOtp("123456");
        userOne.setPaymentDetails("Credit Card");
        boolean zara = udemy.createUserAccount(userOne);
        System.out.println(zara);
        System.out.println();

        UdemyAccount userTwo = new UdemyAccount();
        userTwo.setName("Ayaan");
        userTwo.setEmail("ayaan@udemy.com");
        userTwo.setPassword("ayaan@0");
        userTwo.setCoursePreference("Java Programming");
        userTwo.setOtp("809570");
        userTwo.setPaymentDetails("Apple Pay");
        boolean ayaan = udemy.createUserAccount(userTwo);
        System.out.println(ayaan);
        System.out.println();

        UdemyAccount userThree = new UdemyAccount();
        userThree.setName("Rohan");
        userThree.setEmail("rohan@udemy.com");
        userThree.setPassword("rohan456");
        userThree.setCoursePreference("DevOps");
        userThree.setOtp("191161");
        userThree.setPaymentDetails("UPI");
        boolean rohan = udemy.createUserAccount(userThree);
        System.out.println(rohan);
        System.out.println();

        UdemyAccount userFour = new UdemyAccount();
        userFour.setName("Aanya");
        userFour.setEmail("aanya@udemy.com");
        userFour.setPassword("aanya@9");
        userFour.setCoursePreference("Cybersecurity");
        userFour.setOtp("542417");
        userFour.setPaymentDetails("Paytm");
        boolean aanya = udemy.createUserAccount(userFour);
        System.out.println(aanya);
        System.out.println();

        UdemyAccount userFive = new UdemyAccount();
        userFive.setName("Virat");
        userFive.setEmail("virat@udemy.com");
        userFive.setPassword("viratDev@1");
        userFive.setCoursePreference("UI/UX");
        userFive.setOtp("131244");
        userFive.setPaymentDetails("Net Banking");
        boolean virat = udemy.createUserAccount(userFive);
        System.out.println(virat);
        System.out.println();

        UdemyAccount userSix = new UdemyAccount();
        userSix.setName("Priya");
        userSix.setEmail("priya@udemy.com");
        userSix.setPassword("priya@202");
        userSix.setCoursePreference("ReactJS");
        userSix.setOtp("223344");
        userSix.setPaymentDetails("Debit Card");
        boolean priya = udemy.createUserAccount(userSix);
        System.out.println(priya);
        System.out.println();

        UdemyAccount userSeven = new UdemyAccount();
        userSeven.setName("Arjun");
        userSeven.setEmail("arjun@udemy.com");
        userSeven.setPassword("arjun456!");
        userSeven.setCoursePreference("Data Science");
        userSeven.setOtp("556677");
        userSeven.setPaymentDetails("Google Pay");
        boolean arjun = udemy.createUserAccount(userSeven);
        System.out.println(arjun);
        System.out.println();

        UdemyAccount userEight = new UdemyAccount();
        userEight.setName("Sneha");
        userEight.setEmail("sneha@udemy.com");
        userEight.setPassword("snehaPro@1");
        userEight.setCoursePreference("Machine Learning");
        userEight.setOtp("889900");
        userEight.setPaymentDetails("PhonePe");
        boolean sneha = udemy.createUserAccount(userEight);
        System.out.println(sneha);
        System.out.println();

        UdemyAccount userNine = new UdemyAccount();
        userNine.setName("Rahul");
        userNine.setEmail("rahul@udemy.com");
        userNine.setPassword("rahul789#");
        userNine.setCoursePreference("AWS Cloud");
        userNine.setOtp("001122");
        userNine.setPaymentDetails("Razorpay");
        boolean rahul = udemy.createUserAccount(userNine);
        System.out.println(rahul);
        System.out.println();

        UdemyAccount userTen = new UdemyAccount();
        userTen.setName("Divya");
        userTen.setEmail("divya@udemy.com");
        userTen.setPassword("divyaDev12");
        userTen.setCoursePreference("Digital Marketing");
        userTen.setOtp("334455");
        userTen.setPaymentDetails("PayPal");
        boolean divya = udemy.createUserAccount(userTen);
        System.out.println(divya);
        System.out.println();

        UdemyAccount userEleven = new UdemyAccount();
        userEleven.setName("Kiran");
        userEleven.setEmail("kiran@udemy.com");
        userEleven.setPassword("kiran@303");
        userEleven.setCoursePreference("Full Stack Web");
        userEleven.setOtp("667788");
        userEleven.setPaymentDetails("Amazon Pay");
        boolean kiran = udemy.createUserAccount(userEleven);
        System.out.println(kiran);
        System.out.println();

        UdemyAccount userTwelve = new UdemyAccount();
        userTwelve.setName("Meera");
        userTwelve.setEmail("meera@udemy.com");
        userTwelve.setPassword("meera456$");
        userTwelve.setCoursePreference("Blockchain");
        userTwelve.setOtp("990011");
        userTwelve.setPaymentDetails("Bank Transfer");
        boolean meera = udemy.createUserAccount(userTwelve);
        System.out.println(meera);
        System.out.println();

        UdemyAccount userThirteen = new UdemyAccount();
        userThirteen.setName("Vikas");
        userThirteen.setEmail("vikas@udemy.com");
        userThirteen.setPassword("vikasPro!");
        userThirteen.setCoursePreference("Android Development");
        userThirteen.setOtp("122334");
        userThirteen.setPaymentDetails("Cash App");
        boolean vikas = udemy.createUserAccount(userThirteen);
        System.out.println(vikas);
        System.out.println();

        UdemyAccount userFourteen = new UdemyAccount();
        userFourteen.setName("Nisha");
        userFourteen.setEmail("nisha@udemy.com");
        userFourteen.setPassword("nisha@999");
        userFourteen.setCoursePreference("iOS Development");
        userFourteen.setOtp("455667");
        userFourteen.setPaymentDetails("Stripe");
        boolean nisha = udemy.createUserAccount(userFourteen);
        System.out.println(nisha);
        System.out.println();

        UdemyAccount userFifteen = new UdemyAccount();
        userFifteen.setName("Sameer");
        userFifteen.setEmail("sameer@udemy.com");
        userFifteen.setPassword("sameerDev#2");
        userFifteen.setCoursePreference("SQL Database");
        userFifteen.setOtp("788900");
        userFifteen.setPaymentDetails("Crypto");
        boolean sameer = udemy.createUserAccount(userFifteen);
        System.out.println(sameer);
        System.out.println();

        UdemyAccount userSixteen = new UdemyAccount();
        userSixteen.setName("Lakshmi");
        userSixteen.setEmail("lakshmi@udemy.com");
        userSixteen.setPassword("lakshmi321@");
        userSixteen.setCoursePreference("Excel Mastery");
        userSixteen.setOtp("011223");
        userSixteen.setPaymentDetails("Gift Card");
        boolean lakshmi = udemy.createUserAccount(userSixteen);
        System.out.println(lakshmi);
        System.out.println();

        UdemyAccount userSeventeen = new UdemyAccount();
        userSeventeen.setName("Tejas");
        userSeventeen.setEmail("tejas@udemy.com");
        userSeventeen.setPassword("tejas456");
        userSeventeen.setCoursePreference("Photography");
        userSeventeen.setOtp("344556");
        userSeventeen.setPaymentDetails("Credit Card");
        boolean tejas = udemy.createUserAccount(userSeventeen);
        System.out.println(tejas);
        System.out.println();

        UdemyAccount userEighteen = new UdemyAccount();
        userEighteen.setName("Shruti");
        userEighteen.setEmail("shruti@udemy.com");
        userEighteen.setPassword("shruti@777");
        userEighteen.setCoursePreference("Graphic Design");
        userEighteen.setOtp("677889");
        userEighteen.setPaymentDetails("Apple Pay");
        boolean shruti = udemy.createUserAccount(userEighteen);
        System.out.println(shruti);
        System.out.println();

        UdemyAccount userNineteen = new UdemyAccount();
        userNineteen.setName("Ankit");
        userNineteen.setEmail("ankit@udemy.com");
        userNineteen.setPassword("ankitDev1");
        userNineteen.setCoursePreference("Leadership");
        userNineteen.setOtp("900112");
        userNineteen.setPaymentDetails("UPI");
        boolean ankit = udemy.createUserAccount(userNineteen);
        System.out.println(ankit);
        System.out.println();

        udemy.getUserDetails(); 
    }
}