class XRunner {
	
    public static void main(String[] twitter) {
        X x = new X();

        UserAccount5 userOne = new UserAccount5();
        userOne.setName("Aryan Patel");
        userOne.setId(601);
        userOne.setDateOfBirth("10-05-1996");
        userOne.setCreatedOn("01-04-2026");
        userOne.setEmail("aryan.patel@x.com");
        userOne.setPhoneNumber("9876543210");
        boolean aryan = x.createUserAccount(userOne); 
        System.out.println(aryan);
        System.out.println();

        UserAccount5 userTwo = new UserAccount5();
        userTwo.setName("Tanya Singh");
        userTwo.setId(602);
        userTwo.setDateOfBirth("22-09-1994");
        userTwo.setCreatedOn("02-04-2026");
        userTwo.setEmail("tanya.singh@x.com");
        userTwo.setPhoneNumber("9876543211");
        boolean tanya = x.createUserAccount(userTwo); 
        System.out.println(tanya);
        System.out.println();

        UserAccount5 userThree = new UserAccount5();
        userThree.setName("Rahul Kumar");
        userThree.setId(603);
        userThree.setDateOfBirth("15-12-1992");
        userThree.setCreatedOn("03-04-2026");
        userThree.setEmail("rahul.kumar@x.com");
        userThree.setPhoneNumber("9876543212");
        boolean rahul = x.createUserAccount(userThree);  // Changed: r3 → rahul
        System.out.println(rahul);
        System.out.println();

        UserAccount5 userFour = new UserAccount5();
        userFour.setName("Priya Reddy");
        userFour.setId(604);
        userFour.setDateOfBirth("08-03-1995");
        userFour.setCreatedOn("04-04-2026");
        userFour.setEmail("priya.reddy@x.com");
        userFour.setPhoneNumber("9876543213");
        boolean priya = x.createUserAccount(userFour);  
        System.out.println(priya);
        System.out.println();

        UserAccount5 userFive = new UserAccount5();
        userFive.setName("Vikram Mehta");
        userFive.setId(605);
        userFive.setDateOfBirth("30-01-1993");
        userFive.setCreatedOn("05-04-2026");
        userFive.setEmail("vikram.mehta@x.com");
        userFive.setPhoneNumber("9876543214");
        boolean vikram = x.createUserAccount(userFive); 
        System.out.println(vikram);
        System.out.println();

        UserAccount5 userSix = new UserAccount5();
        userSix.setName("Asha Sharma");
        userSix.setId(606);
        userSix.setDateOfBirth("12-07-1995");
        userSix.setCreatedOn("06-04-2026");
        userSix.setEmail("asha.sharma@x.com");
        userSix.setPhoneNumber("9876543215");
		
        boolean asha = x.createUserAccount(userSix);
        System.out.println(asha);
        System.out.println();

        UserAccount5 userSeven = new UserAccount5();
        userSeven.setName("Anu Desai");
        userSeven.setId(607);
        userSeven.setDateOfBirth("25-11-1994");
        userSeven.setCreatedOn("07-04-2026");
        userSeven.setEmail("anu.desai@x.com");
        userSeven.setPhoneNumber("9876543216");
		
        boolean anu = x.createUserAccount(userSeven);
        System.out.println(anu);
        System.out.println();

        UserAccount5 userEight = new UserAccount5();
        userEight.setName("Aarti Gupta");
        userEight.setId(608);
        userEight.setDateOfBirth("18-02-1996");
        userEight.setCreatedOn("08-04-2026");
        userEight.setEmail("aarti.gupta@x.com");
        userEight.setPhoneNumber("9876543217");
		
        boolean aarti = x.createUserAccount(userEight);
        System.out.println(aarti);
        System.out.println();

        UserAccount5 userNine = new UserAccount5();
        userNine.setName("Anjali Nair");
        userNine.setId(609);
        userNine.setDateOfBirth("05-08-1993");
        userNine.setCreatedOn("09-04-2026");
        userNine.setEmail("anjali.nair@x.com");
        userNine.setPhoneNumber("9876543218");
        boolean anjali = x.createUserAccount(userNine);
        System.out.println(anjali);
        System.out.println();

        UserAccount5 userTen = new UserAccount5();
        userTen.setName("Kavya Iyer");
        userTen.setId(610);
        userTen.setDateOfBirth("14-04-1997");
        userTen.setCreatedOn("10-04-2026");
        userTen.setEmail("kavya.iyer@x.com");
        userTen.setPhoneNumber("9876543219");
        boolean kavya = x.createUserAccount(userTen);
        System.out.println(kavya);
        System.out.println();

        UserAccount5 userEleven = new UserAccount5();
        userEleven.setName("Lata Joshi");
        userEleven.setId(611);
        userEleven.setDateOfBirth("29-10-1992");
        userEleven.setCreatedOn("11-04-2026");
        userEleven.setEmail("lata.joshi@x.com");
        userEleven.setPhoneNumber("9876543220");
        boolean lata = x.createUserAccount(userEleven);
        System.out.println(lata);
        System.out.println();

        UserAccount5 userTwelve = new UserAccount5();
        userTwelve.setName("Meena Pawar");
        userTwelve.setId(612);
        userTwelve.setDateOfBirth("03-06-1995");
        userTwelve.setCreatedOn("12-04-2026");
        userTwelve.setEmail("meena.pawar@x.com");
        userTwelve.setPhoneNumber("9876543221");
        boolean meena = x.createUserAccount(userTwelve);
        System.out.println(meena);
        System.out.println();

        UserAccount5 userThirteen = new UserAccount5();
        userThirteen.setName("Neha Rao");
        userThirteen.setId(613);
        userThirteen.setDateOfBirth("21-12-1994");
        userThirteen.setCreatedOn("13-04-2026");
        userThirteen.setEmail("neha.rao@x.com");
        userThirteen.setPhoneNumber("9876543222");
        boolean neha = x.createUserAccount(userThirteen);
        System.out.println(neha);
        System.out.println();

        UserAccount5 userFourteen = new UserAccount5();
        userFourteen.setName("Nisha Verma");
        userFourteen.setId(614);
        userFourteen.setDateOfBirth("07-09-1996");
        userFourteen.setCreatedOn("14-04-2026");
        userFourteen.setEmail("nisha.verma@x.com");
        userFourteen.setPhoneNumber("9876543223");
        boolean nisha = x.createUserAccount(userFourteen);
        System.out.println(nisha);
        System.out.println();

        UserAccount5 userFifteen = new UserAccount5();
        userFifteen.setName("Pooja Bhat");
        userFifteen.setId(615);
        userFifteen.setDateOfBirth("16-03-1993");
        userFifteen.setCreatedOn("15-04-2026");
        userFifteen.setEmail("pooja.bhat@x.com");
        userFifteen.setPhoneNumber("9876543224");
        boolean pooja = x.createUserAccount(userFifteen);
        System.out.println(pooja);
        System.out.println();

        UserAccount5 userSixteen = new UserAccount5();
        userSixteen.setName("Rani Khan");
        userSixteen.setId(616);
        userSixteen.setDateOfBirth("28-07-1997");
        userSixteen.setCreatedOn("16-04-2026");
        userSixteen.setEmail("rani.khan@x.com");
        userSixteen.setPhoneNumber("9876543225");
        boolean rani = x.createUserAccount(userSixteen);
        System.out.println(rani);
        System.out.println();

        UserAccount5 userSeventeen = new UserAccount5();
        userSeventeen.setName("Rekha Malhotra");
        userSeventeen.setId(617);
        userSeventeen.setDateOfBirth("11-01-1995");
        userSeventeen.setCreatedOn("17-04-2026");
        userSeventeen.setEmail("rekha.malhotra@x.com");
        userSeventeen.setPhoneNumber("9876543226");
        boolean rekha = x.createUserAccount(userSeventeen);
        System.out.println(rekha);
        System.out.println();

        UserAccount5 userEighteen = new UserAccount5();
        userEighteen.setName("Ritu More");
        userEighteen.setId(618);
        userEighteen.setDateOfBirth("19-05-1994");
        userEighteen.setCreatedOn("18-04-2026");
        userEighteen.setEmail("ritu.more@x.com");
        userEighteen.setPhoneNumber("9876543227");
        boolean ritu = x.createUserAccount(userEighteen);
        System.out.println(ritu);
        System.out.println();

        UserAccount5 userNineteen = new UserAccount5();
        userNineteen.setName("Sita Menon");
        userNineteen.setId(619);
        userNineteen.setDateOfBirth("04-11-1992");
        userNineteen.setCreatedOn("19-04-2026");
        userNineteen.setEmail("sita.menon@x.com");
        userNineteen.setPhoneNumber("9876543228");
        boolean sita = x.createUserAccount(userNineteen);
        System.out.println(sita);
        System.out.println();

        x.getUserDetails(); 
    }
}