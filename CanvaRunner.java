class CanvaRunner {
	
    public static void main(String[] c) {
		
        Canva canva = new Canva();

        CanvaAccount userOne = new CanvaAccount();
        userOne.setEmail("ragini.canva@gmail.com");
        userOne.setPassword("ragini123");
        userOne.setName("Ragini");
        userOne.setAccountType("Pro");
        userOne.setOtp("123456");
        userOne.setPreferences("Dark mode, AI tools enabled");
        boolean ragini = canva.createUserAccount(userOne);
        System.out.println(ragini);
        System.out.println();

        CanvaAccount userTwo = new CanvaAccount();
        userTwo.setEmail("ramya.canva@gmail.com");
        userTwo.setPassword("ramya@456");
        userTwo.setName("Ramya");
        userTwo.setAccountType("Free");
        userTwo.setOtp("654321");
        userTwo.setPreferences("Light theme, notifications on");
        boolean ramya = canva.createUserAccount(userTwo);
        System.out.println(ramya);
        System.out.println();

        CanvaAccount userThree = new CanvaAccount();
        userThree.setEmail("rakshith.canva@gmail.com");
        userThree.setPassword("rakshith789");
        userThree.setName("Rakshith");
        userThree.setAccountType("Pro");
        userThree.setOtp("112233");
        userThree.setPreferences("Minimal UI, templates");
        boolean rakshith = canva.createUserAccount(userThree);
        System.out.println(rakshith);
        System.out.println();

        CanvaAccount userFour = new CanvaAccount();
        userFour.setEmail("rishab.canva@gmail.com");
        userFour.setPassword("rishabQ@1");
        userFour.setName("Rishab");
        userFour.setAccountType("Free");
        userFour.setOtp("445566");
        userFour.setPreferences("All notifications, experimental features");
        boolean rishab = canva.createUserAccount(userFour);
        System.out.println(rishab);
        System.out.println();

        CanvaAccount userFive = new CanvaAccount();
        userFive.setEmail("yuva.canva@gmail.com");
        userFive.setPassword("yuvaDev@1");
        userFive.setName("Yuva");
        userFive.setAccountType("Pro");
        userFive.setOtp("778899");
        userFive.setPreferences("High‑contrast theme, quick export");
        boolean yuva = canva.createUserAccount(userFive);
        System.out.println(yuva);
        System.out.println();

        CanvaAccount userSix = new CanvaAccount();
        userSix.setEmail("priya.canva@gmail.com");
        userSix.setPassword("priya@202");
        userSix.setName("Priya");
        userSix.setAccountType("Pro");
        userSix.setOtp("223344");
        userSix.setPreferences("Color themes, collaboration tools");
        boolean priya = canva.createUserAccount(userSix);
        System.out.println(priya);
        System.out.println();

        CanvaAccount userSeven = new CanvaAccount();
        userSeven.setEmail("arjun.canva@gmail.com");
        userSeven.setPassword("arjun456!");
        userSeven.setName("Arjun");
        userSeven.setAccountType("Free");
        userSeven.setOtp("556677");
        userSeven.setPreferences("Brand kits, team folders");
        boolean arjun = canva.createUserAccount(userSeven);
        System.out.println(arjun);
        System.out.println();

        CanvaAccount userEight = new CanvaAccount();
        userEight.setEmail("sneha.canva@gmail.com");
        userEight.setPassword("snehaPro@1");
        userEight.setName("Sneha");
        userEight.setAccountType("Pro");
        userEight.setOtp("889900");
        userEight.setPreferences("Magic resize, background remover");
        boolean sneha = canva.createUserAccount(userEight);
        System.out.println(sneha);
        System.out.println();

        CanvaAccount userNine = new CanvaAccount();
        userNine.setEmail("rahul.canva@gmail.com");
        userNine.setPassword("rahul789#");
        userNine.setName("Rahul");
        userNine.setAccountType("Free");
        userNine.setOtp("001122");
        userNine.setPreferences("Social media templates, animations");
        boolean rahul = canva.createUserAccount(userNine);
        System.out.println(rahul);
        System.out.println();

        CanvaAccount userTen = new CanvaAccount();
        userTen.setEmail("divya.canva@gmail.com");
        userTen.setPassword("divyaDev12");
        userTen.setName("Divya");
        userTen.setAccountType("Pro");
        userTen.setOtp("334455");
        userTen.setPreferences("Video editor, stock photos");
        boolean divya = canva.createUserAccount(userTen);
        System.out.println(divya);
        System.out.println();

        CanvaAccount userEleven = new CanvaAccount();
        userEleven.setEmail("kiran.canva@gmail.com");
        userEleven.setPassword("kiran@303");
        userEleven.setName("Kiran");
        userEleven.setAccountType("Free");
        userEleven.setOtp("667788");
        userEleven.setPreferences("Presentation mode, charts");
        boolean kiran = canva.createUserAccount(userEleven);
        System.out.println(kiran);
        System.out.println();

        CanvaAccount userTwelve = new CanvaAccount();
        userTwelve.setEmail("meera.canva@gmail.com");
        userTwelve.setPassword("meera456$");
        userTwelve.setName("Meera");
        userTwelve.setAccountType("Pro");
        userTwelve.setOtp("990011");
        userTwelve.setPreferences("Whiteboard, mind maps");
        boolean meera = canva.createUserAccount(userTwelve);
        System.out.println(meera);
        System.out.println();

        CanvaAccount userThirteen = new CanvaAccount();
        userThirteen.setEmail("vikas.canva@gmail.com");
        userThirteen.setPassword("vikasPro!");
        userThirteen.setName("Vikas");
        userThirteen.setAccountType("Free");
        userThirteen.setOtp("122334");
        userThirteen.setPreferences("Custom fonts, logo maker");
        boolean vikas = canva.createUserAccount(userThirteen);
        System.out.println(vikas);
        System.out.println();

        CanvaAccount userFourteen = new CanvaAccount();
        userFourteen.setEmail("nisha.canva@gmail.com");
        userFourteen.setPassword("nisha@999");
        userFourteen.setName("Nisha");
        userFourteen.setAccountType("Pro");
        userFourteen.setOtp("455667");
        userFourteen.setPreferences("Print design, mockups");
        boolean nisha = canva.createUserAccount(userFourteen);
        System.out.println(nisha);
        System.out.println();

        CanvaAccount userFifteen = new CanvaAccount();
        userFifteen.setEmail("sameer.canva@gmail.com");
        userFifteen.setPassword("sameerDev#2");
        userFifteen.setName("Sameer");
        userFifteen.setAccountType("Free");
        userFifteen.setOtp("788900");
        userFifteen.setPreferences("Website builder, QR codes");
        boolean sameer = canva.createUserAccount(userFifteen);
        System.out.println(sameer);
        System.out.println();

        CanvaAccount userSixteen = new CanvaAccount();
        userSixteen.setEmail("lakshmi.canva@gmail.com");
        userSixteen.setPassword("lakshmi321@");
        userSixteen.setName("Lakshmi");
        userSixteen.setAccountType("Pro");
        userSixteen.setOtp("011223");
        userSixteen.setPreferences("Team collaboration, version history");
        boolean lakshmi = canva.createUserAccount(userSixteen);
        System.out.println(lakshmi);
        System.out.println();

        CanvaAccount userSeventeen = new CanvaAccount();
        userSeventeen.setEmail("tejas.canva@gmail.com");
        userSeventeen.setPassword("tejas456");
        userSeventeen.setName("Tejas");
        userSeventeen.setAccountType("Free");
        userSeventeen.setOtp("344556");
        userSeventeen.setPreferences("Mobile app sync, cloud storage");
        boolean tejas = canva.createUserAccount(userSeventeen);
        System.out.println(tejas);
        System.out.println();

        CanvaAccount userEighteen = new CanvaAccount();
        userEighteen.setEmail("shruti.canva@gmail.com");
        userEighteen.setPassword("shruti@777");
        userEighteen.setName("Shruti");
        userEighteen.setAccountType("Pro");
        userEighteen.setOtp("677889");
        userEighteen.setPreferences("AI image generator, bulk create");
        boolean shruti = canva.createUserAccount(userEighteen);
        System.out.println(shruti);
        System.out.println();

        CanvaAccount userNineteen = new CanvaAccount();
        userNineteen.setEmail("ankit.canva@gmail.com");
        userNineteen.setPassword("ankitDev1");
        userNineteen.setName("Ankit");
        userNineteen.setAccountType("Free");
        userNineteen.setOtp("900112");
        userNineteen.setPreferences("Design portfolio, analytics");
        boolean ankit = canva.createUserAccount(userNineteen);
        System.out.println(ankit);
        System.out.println();

        canva.getUserDetails(); 
    }
}