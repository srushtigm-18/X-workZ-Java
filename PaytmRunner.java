class PaytmRunner {
	
    public static void main(String[] payment) {
		
        Paytm paytm = new Paytm();

        PaytmAccount userOne = new PaytmAccount();
        userOne.setMobileNo("9876543210");
        userOne.setOtp("123456");
        userOne.setName("Ramya");
        userOne.setEmail("ramya.paytm@gmail.com");
        userOne.setPin("1122");
        userOne.setKycDetails("Aadhaar + PAN");
        userOne.setBankLinking("SBI 1234");
       
	   boolean ramya = paytm.createUserAccount(userOne);
        System.out.println(ramya);
        System.out.println();

        PaytmAccount userTwo = new PaytmAccount();
        userTwo.setMobileNo("9876543211");
        userTwo.setOtp("654321");
        userTwo.setName("Rakshitha");
        userTwo.setEmail("rakshitha.paytm@gmail.com");
        userTwo.setPin("2233");
        userTwo.setKycDetails("Aadhaar");
        userTwo.setBankLinking("HDFC 5678");
        
		boolean rakshitha = paytm.createUserAccount(userTwo);
        System.out.println(rakshitha);
        System.out.println();

        PaytmAccount userThree = new PaytmAccount();
        userThree.setMobileNo("9876543212");
        userThree.setOtp("112233");
        userThree.setName("Nishvika");
        userThree.setEmail("nishvika.paytm@gmail.com");
        userThree.setPin("3344");
        userThree.setKycDetails("Driving Licence");
        userThree.setBankLinking("ICICI 9012");
        boolean nishvika = paytm.createUserAccount(userThree);
        System.out.println(nishvika);
        System.out.println();

        PaytmAccount userFour = new PaytmAccount();
        userFour.setMobileNo("9876543213");
        userFour.setOtp("445566");
        userFour.setName("Prema");
        userFour.setEmail("prema.paytm@gmail.com");
        userFour.setPin("4455");
        userFour.setKycDetails("PAN");
        userFour.setBankLinking("Axis 3456");
        boolean prema = paytm.createUserAccount(userFour);
        System.out.println(prema);
        System.out.println();

        PaytmAccount userFive = new PaytmAccount();
        userFive.setMobileNo("9876543214");
        userFive.setOtp("778899");
        userFive.setName("Nishka");
        userFive.setEmail("nishka.paytm@gmail.com");
        userFive.setPin("5566");
        userFive.setKycDetails("Aadhaar + PAN");
        userFive.setBankLinking("Kotak 7890");
        boolean nishka = paytm.createUserAccount(userFive);
        System.out.println(nishka);
        System.out.println();

        PaytmAccount userSix = new PaytmAccount();
        userSix.setMobileNo("9876543215");
        userSix.setOtp("001122");
        userSix.setName("Uday");
        userSix.setEmail("uday.paytm@gmail.com");
        userSix.setPin("6677");
        userSix.setKycDetails("Aadhaar");
        userSix.setBankLinking("PNB 2345");
        boolean uday = paytm.createUserAccount(userSix);
        System.out.println(uday);
        System.out.println();

        PaytmAccount userSeven = new PaytmAccount();
        userSeven.setMobileNo("9876543216");
        userSeven.setOtp("334455");
        userSeven.setName("Tarun");
        userSeven.setEmail("tarun.paytm@gmail.com");
        userSeven.setPin("7788");
        userSeven.setKycDetails("PAN + Aadhaar");
        userSeven.setBankLinking("BOB 4567");
        boolean tarun = paytm.createUserAccount(userSeven);
        System.out.println(tarun);
        System.out.println();

        PaytmAccount userEight = new PaytmAccount();
        userEight.setMobileNo("9876543217");
        userEight.setOtp("667788");
        userEight.setName("Suraj");
        userEight.setEmail("suraj.paytm@gmail.com");
        userEight.setPin("8899");
        userEight.setKycDetails("Driving Licence");
        userEight.setBankLinking("Canara 6789");
        boolean suraj = paytm.createUserAccount(userEight);
        System.out.println(suraj);
        System.out.println();

        PaytmAccount userNine = new PaytmAccount();
        userNine.setMobileNo("9876543218");
        userNine.setOtp("990011");
        userNine.setName("Sahyam");
        userNine.setEmail("sahyam.paytm@gmail.com");
        userNine.setPin("9900");
        userNine.setKycDetails("PAN");
        userNine.setBankLinking("Union 0123");
        boolean sahyam = paytm.createUserAccount(userNine);
        System.out.println(sahyam);
        System.out.println();

        PaytmAccount userTen = new PaytmAccount();
        userTen.setMobileNo("9876543219");
        userTen.setOtp("122334");
        userTen.setName("Sanjay");
        userTen.setEmail("sanjay.paytm@gmail.com");
        userTen.setPin("0011");
        userTen.setKycDetails("Aadhaar + PAN");
        userTen.setBankLinking("YesBank 3456");
        boolean sanjay = paytm.createUserAccount(userTen);
        System.out.println(sanjay);
        System.out.println();

        PaytmAccount userEleven = new PaytmAccount();
        userEleven.setMobileNo("9876543220");
        userEleven.setOtp("455667");
        userEleven.setName("Rohan");
        userEleven.setEmail("rohan.paytm@gmail.com");
        userEleven.setPin("1122");
        userEleven.setKycDetails("Aadhaar");
        userEleven.setBankLinking("IndusInd 7890");
        boolean rohan = paytm.createUserAccount(userEleven);
        System.out.println(rohan);
        System.out.println();

        PaytmAccount userTwelve = new PaytmAccount();
        userTwelve.setMobileNo("9876543221");
        userTwelve.setOtp("788900");
        userTwelve.setName("Prakash");
        userTwelve.setEmail("prakash.paytm@gmail.com");
        userTwelve.setPin("2233");
        userTwelve.setKycDetails("Driving Licence + PAN");
        userTwelve.setBankLinking("Federal 1234");
        boolean prakash = paytm.createUserAccount(userTwelve);
        System.out.println(prakash);
        System.out.println();

        PaytmAccount userThirteen = new PaytmAccount();
        userThirteen.setMobileNo("9876543222");
        userThirteen.setOtp("011223");
        userThirteen.setName("Om");
        userThirteen.setEmail("om.paytm@gmail.com");
        userThirteen.setPin("3344");
        userThirteen.setKycDetails("Aadhaar");
        userThirteen.setBankLinking("RBL 5678");
        boolean om = paytm.createUserAccount(userThirteen);
        System.out.println(om);
        System.out.println();

        PaytmAccount userFourteen = new PaytmAccount();
        userFourteen.setMobileNo("9876543223");
        userFourteen.setOtp("344556");
        userFourteen.setName("Nikil");
        userFourteen.setEmail("nikil.paytm@gmail.com");
        userFourteen.setPin("4455");
        userFourteen.setKycDetails("PAN");
        userFourteen.setBankLinking("KarurVysya 9012");
        boolean nikil = paytm.createUserAccount(userFourteen);
        System.out.println(nikil);
        System.out.println();

        PaytmAccount userFifteen = new PaytmAccount();
        userFifteen.setMobileNo("9876543224");
        userFifteen.setOtp("677889");
        userFifteen.setName("Naveen");
        userFifteen.setEmail("naveen.paytm@gmail.com");
        userFifteen.setPin("5566");
        userFifteen.setKycDetails("Aadhaar + PAN");
        userFifteen.setBankLinking("SouthIndian 3456");
        boolean naveen = paytm.createUserAccount(userFifteen);
        System.out.println(naveen);
        System.out.println();

        PaytmAccount userSixteen = new PaytmAccount();
        userSixteen.setMobileNo("9876543225");
        userSixteen.setOtp("900112");
        userSixteen.setName("Naresh");
        userSixteen.setEmail("naresh.paytm@gmail.com");
        userSixteen.setPin("6677");
        userSixteen.setKycDetails("Driving Licence");
        userSixteen.setBankLinking("TamilnaduMerc 7890");
        boolean naresh = paytm.createUserAccount(userSixteen);
        System.out.println(naresh);
        System.out.println();

        PaytmAccount userSeventeen = new PaytmAccount();
        userSeventeen.setMobileNo("9876543226");
        userSeventeen.setOtp("223344");
        userSeventeen.setName("Mukesh");
        userSeventeen.setEmail("mukesh.paytm@gmail.com");
        userSeventeen.setPin("7788");
        userSeventeen.setKycDetails("PAN + Aadhaar");
        userSeventeen.setBankLinking("DBS 0123");
        boolean mukesh = paytm.createUserAccount(userSeventeen);
        System.out.println(mukesh);
        System.out.println();

        PaytmAccount userEighteen = new PaytmAccount();
        userEighteen.setMobileNo("9876543227");
        userEighteen.setOtp("556677");
        userEighteen.setName("Mohan");
        userEighteen.setEmail("mohan.paytm@gmail.com");
        userEighteen.setPin("8899");
        userEighteen.setKycDetails("Aadhaar");
        userEighteen.setBankLinking("Nainital 4567");
        boolean mohan = paytm.createUserAccount(userEighteen);
        System.out.println(mohan);
        System.out.println();

        PaytmAccount userNineteen = new PaytmAccount();
        userNineteen.setMobileNo("9876543228");
        userNineteen.setOtp("889900");
        userNineteen.setName("Manoj");
        userNineteen.setEmail("manoj.paytm@gmail.com");
        userNineteen.setPin("9900");
        userNineteen.setKycDetails("PAN");
        userNineteen.setBankLinking("UCO 7890");
        boolean manoj = paytm.createUserAccount(userNineteen);
        System.out.println(manoj);
        System.out.println();

        paytm.getUserDetails();  
    }
}