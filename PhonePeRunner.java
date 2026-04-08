class PhonePeRunner {
	
    public static void main(String[] args) {
		
        PhonePe phonePe = new PhonePe();

        PhonePeAccount userOne = new PhonePeAccount();
        userOne.setMobileNo("9876543210");
        userOne.setOtp("123456");
        userOne.setBankAccount("SBI 1234567890");
        userOne.setUpiPin("1234");
        userOne.setName("Sudeep");
        userOne.setEmail("sudeep.phonepe@gmail.com");
        boolean sudeep = phonePe.createUserAccount(userOne);
        System.out.println(sudeep);
        System.out.println();

        PhonePeAccount userTwo = new PhonePeAccount();
        userTwo.setMobileNo("9876543211");
        userTwo.setOtp("654321");
        userTwo.setBankAccount("HDFC 2345678901");
        userTwo.setUpiPin("2233");
        userTwo.setName("Darshan");
        userTwo.setEmail("darshan.phonepe@gmail.com");
        boolean darshan = phonePe.createUserAccount(userTwo);
        System.out.println(darshan);
        System.out.println();

        PhonePeAccount userThree = new PhonePeAccount();
        userThree.setMobileNo("9876543212");
        userThree.setOtp("112233");
        userThree.setBankAccount("ICICI 3456789012");
        userThree.setUpiPin("3344");
        userThree.setName("Punith");
        userThree.setEmail("punith.phonepe@gmail.com");
        boolean punith = phonePe.createUserAccount(userThree);
        System.out.println(punith);
        System.out.println();

        PhonePeAccount userFour = new PhonePeAccount();
        userFour.setMobileNo("9876543213");
        userFour.setOtp("445566");
        userFour.setBankAccount("Axis 4567890123");
        userFour.setUpiPin("4455");
        userFour.setName("Akash");
        userFour.setEmail("akash.phonepe@gmail.com");
        boolean akash = phonePe.createUserAccount(userFour);
        System.out.println(akash);
        System.out.println();

        PhonePeAccount userFive = new PhonePeAccount();
        userFive.setMobileNo("9876543214");
        userFive.setOtp("778899");
        userFive.setBankAccount("Kotak 5678901234");
        userFive.setUpiPin("5566");
        userFive.setName("Abhi");
        userFive.setEmail("abhi.phonepe@gmail.com");
        boolean abhi = phonePe.createUserAccount(userFive);
        System.out.println(abhi);
        System.out.println();

        PhonePeAccount userSix = new PhonePeAccount();
        userSix.setMobileNo("9876543215");
        userSix.setOtp("001122");
        userSix.setBankAccount("PNB 6789012345");
        userSix.setUpiPin("6677");
        userSix.setName("Priya");
        userSix.setEmail("priya.phonepe@gmail.com");
        boolean priya = phonePe.createUserAccount(userSix);
        System.out.println(priya);
        System.out.println();

        PhonePeAccount userSeven = new PhonePeAccount();
        userSeven.setMobileNo("9876543216");
        userSeven.setOtp("334455");
        userSeven.setBankAccount("BOB 7890123456");
        userSeven.setUpiPin("7788");
        userSeven.setName("Sneha");
        userSeven.setEmail("sneha.phonepe@gmail.com");
        boolean sneha = phonePe.createUserAccount(userSeven);
        System.out.println(sneha);
        System.out.println();

        PhonePeAccount userEight = new PhonePeAccount();
        userEight.setMobileNo("9876543217");
        userEight.setOtp("667788");
        userEight.setBankAccount("Canara 8901234567");
        userEight.setUpiPin("8899");
        userEight.setName("Rahul");
        userEight.setEmail("rahul.phonepe@gmail.com");
        boolean rahul = phonePe.createUserAccount(userEight);
        System.out.println(rahul);
        System.out.println();

        PhonePeAccount userNine = new PhonePeAccount();
        userNine.setMobileNo("9876543218");
        userNine.setOtp("990011");
        userNine.setBankAccount("Union 9012345678");
        userNine.setUpiPin("9900");
        userNine.setName("Divya");
        userNine.setEmail("divya.phonepe@gmail.com");
        boolean divya = phonePe.createUserAccount(userNine);
        System.out.println(divya);
        System.out.println();

        PhonePeAccount userTen = new PhonePeAccount();
        userTen.setMobileNo("9876543219");
        userTen.setOtp("122334");
        userTen.setBankAccount("YesBank 0123456789");
        userTen.setUpiPin("0011");
        userTen.setName("Kiran");
        userTen.setEmail("kiran.phonepe@gmail.com");
        boolean kiran = phonePe.createUserAccount(userTen);
        System.out.println(kiran);
        System.out.println();

        PhonePeAccount userEleven = new PhonePeAccount();
        userEleven.setMobileNo("9876543220");
        userEleven.setOtp("455667");
        userEleven.setBankAccount("IndusInd 1234567890");
        userEleven.setUpiPin("1122");
        userEleven.setName("Nisha");
        userEleven.setEmail("nisha.phonepe@gmail.com");
        boolean nisha = phonePe.createUserAccount(userEleven);
        System.out.println(nisha);
        System.out.println();

        PhonePeAccount userTwelve = new PhonePeAccount();
        userTwelve.setMobileNo("9876543221");
        userTwelve.setOtp("788900");
        userTwelve.setBankAccount("Federal 2345678901");
        userTwelve.setUpiPin("2233");
        userTwelve.setName("Tejas");
        userTwelve.setEmail("tejas.phonepe@gmail.com");
        boolean tejas = phonePe.createUserAccount(userTwelve);
        System.out.println(tejas);
        System.out.println();

        PhonePeAccount userThirteen = new PhonePeAccount();
        userThirteen.setMobileNo("9876543222");
        userThirteen.setOtp("011223");
        userThirteen.setBankAccount("RBL 3456789012");
        userThirteen.setUpiPin("3344");
        userThirteen.setName("Lakshmi");
        userThirteen.setEmail("lakshmi.phonepe@gmail.com");
        boolean lakshmi = phonePe.createUserAccount(userThirteen);
        System.out.println(lakshmi);
        System.out.println();

        PhonePeAccount userFourteen = new PhonePeAccount();
        userFourteen.setMobileNo("9876543223");
        userFourteen.setOtp("344556");
        userFourteen.setBankAccount("KarurVysya 4567890123");
        userFourteen.setUpiPin("4455");
        userFourteen.setName("Sameer");
        userFourteen.setEmail("sameer.phonepe@gmail.com");
        boolean sameer = phonePe.createUserAccount(userFourteen);
        System.out.println(sameer);
        System.out.println();

        PhonePeAccount userFifteen = new PhonePeAccount();
        userFifteen.setMobileNo("9876543224");
        userFifteen.setOtp("677889");
        userFifteen.setBankAccount("SouthIndian 5678901234");
        userFifteen.setUpiPin("5566");
        userFifteen.setName("Shruti");
        userFifteen.setEmail("shruti.phonepe@gmail.com");
        boolean shruti = phonePe.createUserAccount(userFifteen);
        System.out.println(shruti);
        System.out.println();

        PhonePeAccount userSixteen = new PhonePeAccount();
        userSixteen.setMobileNo("9876543225");
        userSixteen.setOtp("900112");
        userSixteen.setBankAccount("TamilnaduMerc 6789012345");
        userSixteen.setUpiPin("6677");
        userSixteen.setName("Ankit");
        userSixteen.setEmail("ankit.phonepe@gmail.com");
        boolean ankit = phonePe.createUserAccount(userSixteen);
        System.out.println(ankit);
        System.out.println();

        PhonePeAccount userSeventeen = new PhonePeAccount();
        userSeventeen.setMobileNo("9876543226");
        userSeventeen.setOtp("223344");
        userSeventeen.setBankAccount("DBS 7890123456");
        userSeventeen.setUpiPin("7788");
        userSeventeen.setName("Neha");
        userSeventeen.setEmail("neha.phonepe@gmail.com");
        boolean neha = phonePe.createUserAccount(userSeventeen);
        System.out.println(neha);
        System.out.println();

        PhonePeAccount userEighteen = new PhonePeAccount();
        userEighteen.setMobileNo("9876543227");
        userEighteen.setOtp("556677");
        userEighteen.setBankAccount("Nainital 8901234567");
        userEighteen.setUpiPin("8899");
        userEighteen.setName("Rohan");
        userEighteen.setEmail("rohan.phonepe@gmail.com");
        boolean rohan = phonePe.createUserAccount(userEighteen);
        System.out.println(rohan);
        System.out.println();

        PhonePeAccount userNineteen = new PhonePeAccount();
        userNineteen.setMobileNo("9876543228");
        userNineteen.setOtp("889900");
        userNineteen.setBankAccount("UCO 9012345678");
        userNineteen.setUpiPin("9900");
        userNineteen.setName("Pooja");
        userNineteen.setEmail("pooja.phonepe@gmail.com");
        boolean pooja = phonePe.createUserAccount(userNineteen);
        System.out.println(pooja);
        System.out.println();

        phonePe.getUserDetails();  
}
}