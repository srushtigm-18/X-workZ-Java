class QuoraRunner {
	
    public static void main(String[] args) {
		
        Quora quora = new Quora();

        QuoraAccount userOne = new QuoraAccount();
        userOne.setName("Raj");
        userOne.setEmail("raj.quora@gmail.com");
        userOne.setPassword("raj123");
        userOne.setInterest("Programming");
        userOne.setOtp("123456");
        userOne.setLocation("Bengaluru");
        boolean raj = quora.createUserAccount(userOne);
        System.out.println(raj);
        quora.getUserDetails();
        System.out.println();

        QuoraAccount userTwo = new QuoraAccount();
        userTwo.setName("Viraj");
        userTwo.setEmail("viraj.quora@gmail.com");
        userTwo.setPassword("viraj@456");
        userTwo.setInterest("Sports");
        userTwo.setOtp("654321");
        userTwo.setLocation("Mumbai");
        boolean viraj = quora.createUserAccount(userTwo);
        System.out.println(viraj);
        quora.getUserDetails();
        System.out.println();

        QuoraAccount userThree = new QuoraAccount();
        userThree.setName("Vimal");
        userThree.setEmail("vimal.quora@gmail.com");
        userThree.setPassword("vimal789");
        userThree.setInterest("Movies");
        userThree.setOtp("112233");
        userThree.setLocation("Chennai");
        boolean vimal = quora.createUserAccount(userThree);
        System.out.println(vimal);
        quora.getUserDetails();
        System.out.println();

        QuoraAccount userFour = new QuoraAccount();
        userFour.setName("Vishal");
        userFour.setEmail("vishal.quora@gmail.com");
        userFour.setPassword("vishalDev@1");
        userFour.setInterest("Books");
        userFour.setOtp("445566");
        userFour.setLocation("Hyderabad");
        boolean vishal = quora.createUserAccount(userFour);
        System.out.println(vishal);
        quora.getUserDetails();
        System.out.println();

        QuoraAccount userFive = new QuoraAccount();
        userFive.setName("Vikram");
        userFive.setEmail("vikram.quora@gmail.com");
        userFive.setPassword("vikramQ@1");
        userFive.setInterest("Technology");
        userFive.setOtp("778899");
        userFive.setLocation("Delhi");
        boolean vikram = quora.createUserAccount(userFive);
        System.out.println(vikram);
        quora.getUserDetails();
        System.out.println();

        QuoraAccount userSix = new QuoraAccount();
        userSix.setName("Priya");
        userSix.setEmail("priya.quora@gmail.com");
        userSix.setPassword("priya456!");
        userSix.setInterest("Education");
        userSix.setOtp("001122");
        userSix.setLocation("Bengaluru");
        boolean priya = quora.createUserAccount(userSix);
        System.out.println(priya);
        quora.getUserDetails();
        System.out.println();

        QuoraAccount userSeven = new QuoraAccount();
        userSeven.setName("Sneha");
        userSeven.setEmail("sneha.quora@gmail.com");
        userSeven.setPassword("sneha789#");
        userSeven.setInterest("Health");
        userSeven.setOtp("334455");
        userSeven.setLocation("Pune");
        boolean sneha = quora.createUserAccount(userSeven);
        System.out.println(sneha);
        quora.getUserDetails();
        System.out.println();

        QuoraAccount userEight = new QuoraAccount();
        userEight.setName("Arjun");
        userEight.setEmail("arjun.quora@gmail.com");
        userEight.setPassword("arjunDev12");
        userEight.setInterest("Business");
        userEight.setOtp("667788");
        userEight.setLocation("Delhi");
        boolean arjun = quora.createUserAccount(userEight);
        System.out.println(arjun);
        quora.getUserDetails();
        System.out.println();

        QuoraAccount userNine = new QuoraAccount();
        userNine.setName("Divya");
        userNine.setEmail("divya.quora@gmail.com");
        userNine.setPassword("divya@303");
        userNine.setInterest("Travel");
        userNine.setOtp("990011");
        userNine.setLocation("Mumbai");
        boolean divya = quora.createUserAccount(userNine);
        System.out.println(divya);
        quora.getUserDetails();
        System.out.println();

        QuoraAccount userTen = new QuoraAccount();
        userTen.setName("Kiran");
        userTen.setEmail("kiran.quora@gmail.com");
        userTen.setPassword("kiran456$");
        userTen.setInterest("Science");
        userTen.setOtp("122334");
        userTen.setLocation("Hyderabad");
        boolean kiran = quora.createUserAccount(userTen);
        System.out.println(kiran);
        quora.getUserDetails();
        System.out.println();

        QuoraAccount userEleven = new QuoraAccount();
        userEleven.setName("Nisha");
        userEleven.setEmail("nisha.quora@gmail.com");
        userEleven.setPassword("nishaPro!");
        userEleven.setInterest("Music");
        userEleven.setOtp("455667");
        userEleven.setLocation("Chennai");
        boolean nisha = quora.createUserAccount(userEleven);
        System.out.println(nisha);
        quora.getUserDetails();
        System.out.println();

        QuoraAccount userTwelve = new QuoraAccount();
        userTwelve.setName("Tejas");
        userTwelve.setEmail("tejas.quora@gmail.com");
        userTwelve.setPassword("tejas@999");
        userTwelve.setInterest("Gaming");
        userTwelve.setOtp("788900");
        userTwelve.setLocation("Bengaluru");
        boolean tejas = quora.createUserAccount(userTwelve);
        System.out.println(tejas);
        quora.getUserDetails();
        System.out.println();

        QuoraAccount userThirteen = new QuoraAccount();
        userThirteen.setName("Lakshmi");
        userThirteen.setEmail("lakshmi.quora@gmail.com");
        userThirteen.setPassword("lakshmi321@");
        userThirteen.setInterest("Cooking");
        userThirteen.setOtp("011223");
        userThirteen.setLocation("Kochi");
        boolean lakshmi = quora.createUserAccount(userThirteen);
        System.out.println(lakshmi);
        quora.getUserDetails();
        System.out.println();

        QuoraAccount userFourteen = new QuoraAccount();
        userFourteen.setName("Sameer");
        userFourteen.setEmail("sameer.quora@gmail.com");
        userFourteen.setPassword("sameerDev#2");
        userFourteen.setInterest("Photography");
        userFourteen.setOtp("344556");
        userFourteen.setLocation("Ahmedabad");
        boolean sameer = quora.createUserAccount(userFourteen);
        System.out.println(sameer);
        quora.getUserDetails();
        System.out.println();

        quora.getUserDetails(); 
    }
}