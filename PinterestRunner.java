class PinterestRunner {
	
    public static void main(String[] args) {
		
        Pinterest pinterest = new Pinterest();

        PinterestAccount userOne = new PinterestAccount();
        userOne.setId("PT_001");
        userOne.setEmail("meghana.pinterest@gmail.com");
        userOne.setName("Meghana");
        userOne.setPassword("meghana123");
        userOne.setAge(24);
        userOne.setGender("Female");
        userOne.setInterest("Design & Travel");
        boolean meghana = pinterest.createUserAccount(userOne);
        System.out.println(meghana);
        pinterest.getUserDetails();
        System.out.println();

        PinterestAccount userTwo = new PinterestAccount();
        userTwo.setId("PT_002");
        userTwo.setEmail("shreya.pinterest@gmail.com");
        userTwo.setName("Shreya");
        userTwo.setPassword("shreya@456");
        userTwo.setAge(23);
        userTwo.setGender("Female");
        userTwo.setInterest("Food & Fashion");
        boolean shreya = pinterest.createUserAccount(userTwo);
        System.out.println(shreya);
        pinterest.getUserDetails();
        System.out.println();

        PinterestAccount userThree = new PinterestAccount();
        userThree.setId("PT_003");
        userThree.setEmail("bhagya.pinterest@gmail.com");
        userThree.setName("Bhagya");
        userThree.setPassword("bhagyaQ@1");
        userThree.setAge(25);
        userThree.setGender("Female");
        userThree.setInterest("Art & Photography");
        boolean bhagya = pinterest.createUserAccount(userThree);
        System.out.println(bhagya);
        pinterest.getUserDetails();
        System.out.println();

        PinterestAccount userFour = new PinterestAccount();
        userFour.setId("PT_004");
        userFour.setEmail("priya.pinterest@gmail.com");
        userFour.setName("Priya");
        userFour.setPassword("priya456!");
        userFour.setAge(26);
        userFour.setGender("Female");
        userFour.setInterest("Home Decor & Gardening");
        boolean priya = pinterest.createUserAccount(userFour);
        System.out.println(priya);
        pinterest.getUserDetails();
        System.out.println();

        PinterestAccount userFive = new PinterestAccount();
        userFive.setId("PT_005");
        userFive.setEmail("sneha.pinterest@gmail.com");
        userFive.setName("Sneha");
        userFive.setPassword("sneha789#");
        userFive.setAge(22);
        userFive.setGender("Female");
        userFive.setInterest("Beauty & Makeup");
        boolean sneha = pinterest.createUserAccount(userFive);
        System.out.println(sneha);
        pinterest.getUserDetails();
        System.out.println();

        PinterestAccount userSix = new PinterestAccount();
        userSix.setId("PT_006");
        userSix.setEmail("divya.pinterest@gmail.com");
        userSix.setName("Divya");
        userSix.setPassword("divyaDev12");
        userSix.setAge(27);
        userSix.setGender("Female");
        userSix.setInterest("Wedding & Events");
        boolean divya = pinterest.createUserAccount(userSix);
        System.out.println(divya);
        pinterest.getUserDetails();
        System.out.println();

        PinterestAccount userSeven = new PinterestAccount();
        userSeven.setId("PT_007");
        userSeven.setEmail("raksha.pinterest@gmail.com");
        userSeven.setName("Raksha");
        userSeven.setPassword("raksha@303");
        userSeven.setAge(24);
        userSeven.setGender("Female");
        userSeven.setInterest("Fitness & Yoga");
        boolean raksha = pinterest.createUserAccount(userSeven);
        System.out.println(raksha);
        pinterest.getUserDetails();
        System.out.println();

        PinterestAccount userEight = new PinterestAccount();
        userEight.setId("PT_008");
        userEight.setEmail("nisha.pinterest@gmail.com");
        userEight.setName("Nisha");
        userEight.setPassword("nisha456$");
        userEight.setAge(25);
        userEight.setGender("Female");
        userEight.setInterest("Crafts & DIY");
        boolean nisha = pinterest.createUserAccount(userEight);
        System.out.println(nisha);
        pinterest.getUserDetails();
        System.out.println();

        PinterestAccount userNine = new PinterestAccount();
        userNine.setId("PT_009");
        userNine.setEmail("lakshmi.pinterest@gmail.com");
        userNine.setName("Lakshmi");
        userNine.setPassword("lakshmiPro!");
        userNine.setAge(28);
        userNine.setGender("Female");
        userNine.setInterest("Jewelry & Accessories");
        boolean lakshmi = pinterest.createUserAccount(userNine);
        System.out.println(lakshmi);
        pinterest.getUserDetails();
        System.out.println();

        PinterestAccount userTen = new PinterestAccount();
        userTen.setId("PT_010");
        userTen.setEmail("ananya.pinterest@gmail.com");
        userTen.setName("Ananya");
        userTen.setPassword("ananya@999");
        userTen.setAge(23);
        userTen.setGender("Female");
        userTen.setInterest("Books & Quotes");
        boolean ananya = pinterest.createUserAccount(userTen);
        System.out.println(ananya);
        pinterest.getUserDetails();
        System.out.println();

        PinterestAccount userEleven = new PinterestAccount();
        userEleven.setId("PT_011");
        userEleven.setEmail("kavya.pinterest@gmail.com");
        userEleven.setName("Kavya");
        userEleven.setPassword("kavyaDev#2");
        userEleven.setAge(26);
        userEleven.setGender("Female");
        userEleven.setInterest("Pets & Animals");
        boolean kavya = pinterest.createUserAccount(userEleven);
        System.out.println(kavya);
        pinterest.getUserDetails();
        System.out.println();

        PinterestAccount userTwelve = new PinterestAccount();
        userTwelve.setId("PT_012");
        userTwelve.setEmail("pooja.pinterest@gmail.com");
        userTwelve.setName("Pooja");
        userTwelve.setPassword("pooja321@");
        userTwelve.setAge(24);
        userTwelve.setGender("Female");
        userTwelve.setInterest("Cars & Bikes");
        boolean pooja = pinterest.createUserAccount(userTwelve);
        System.out.println(pooja);
        pinterest.getUserDetails();
        System.out.println();

        PinterestAccount userThirteen = new PinterestAccount();
        userThirteen.setId("PT_013");
        userThirteen.setEmail("sruthi.pinterest@gmail.com");
        userThirteen.setName("Sruthi");
        userThirteen.setPassword("sruthi456");
        userThirteen.setAge(25);
        userThirteen.setGender("Female");
        userThirteen.setInterest("Tech & Gadgets");
        boolean sruthi = pinterest.createUserAccount(userThirteen);
        System.out.println(sruthi);
        pinterest.getUserDetails();
        System.out.println();

        PinterestAccount userFourteen = new PinterestAccount();
        userFourteen.setId("PT_014");
        userFourteen.setEmail("neha.pinterest@gmail.com");
        userFourteen.setName("Neha");
        userFourteen.setPassword("neha@777");
        userFourteen.setAge(22);
        userFourteen.setGender("Female");
        userFourteen.setInterest("Movies & TV");
        boolean neha = pinterest.createUserAccount(userFourteen);
        System.out.println(neha);
        pinterest.getUserDetails();
        System.out.println();

        PinterestAccount userFifteen = new PinterestAccount();
        userFifteen.setId("PT_015");
        userFifteen.setEmail("roshni.pinterest@gmail.com");
        userFifteen.setName("Roshni");
        userFifteen.setPassword("roshniDev1");
        userFifteen.setAge(27);
        userFifteen.setGender("Female");
        userFifteen.setInterest("Music & Instruments");
        boolean roshni = pinterest.createUserAccount(userFifteen);
        System.out.println(roshni);
        pinterest.getUserDetails();
        System.out.println();

        PinterestAccount userSixteen = new PinterestAccount();
        userSixteen.setId("PT_016");
        userSixteen.setEmail("ishwarya.pinterest@gmail.com");
        userSixteen.setName("Ishwarya");
        userSixteen.setPassword("ishwarya789!");
        userSixteen.setAge(24);
        userSixteen.setGender("Female");
        userSixteen.setInterest("Architecture");
        boolean ishwarya = pinterest.createUserAccount(userSixteen);
        System.out.println(ishwarya);
        pinterest.getUserDetails();
        System.out.println();

        PinterestAccount userSeventeen = new PinterestAccount();
        userSeventeen.setId("PT_017");
        userSeventeen.setEmail("deepa.pinterest@gmail.com");
        userSeventeen.setName("Deepa");
        userSeventeen.setPassword("deepa@999");
        userSeventeen.setAge(26);
        userSeventeen.setGender("Female");
        userSeventeen.setInterest("Sports");
        boolean deepa = pinterest.createUserAccount(userSeventeen);
        System.out.println(deepa);
        pinterest.getUserDetails();
        System.out.println();

        pinterest.getUserDetails();
    }
}