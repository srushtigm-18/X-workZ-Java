class WhatsAppRunner {
	
    public static void main(String[] chats) {
		
        WhatsApp whatsapp = new WhatsApp();

        UserAccount userOne = new UserAccount();
        userOne.setUserId(201);
        userOne.setUserName("Aarav");
        userOne.setEmail("aarav.messages@gmail.com");
        userOne.setPhone("9870123488");
        userOne.setPassword("aarav123");
        userOne.setCreatedOn("01-04-2026");

        UserAccount userTwo = new UserAccount();
        userTwo.setUserId(202);
        userTwo.setUserName("Isha");
        userTwo.setEmail("isha.chat@outlook.com");
        userTwo.setPhone("9981234567");
        userTwo.setPassword("Isha@123");
        userTwo.setCreatedOn("02-04-2026");

        UserAccount userThree = new UserAccount();
        userThree.setUserId(203);
        userThree.setUserName("Vedant");
        userThree.setEmail("vedant.stickers@zmail.com");
        userThree.setPhone("9765432109");
        userThree.setPassword("vedant567");
        userThree.setCreatedOn("03-04-2026");

        UserAccount userFour = new UserAccount();
        userFour.setUserId(204);
        userFour.setUserName("Neha");
        userFour.setEmail("neha.calls@gmail.com");
        userFour.setPhone("9654321987");
        userFour.setPassword("neha@2026");
        userFour.setCreatedOn("04-04-2026");

        UserAccount userFive = new UserAccount();
        userFive.setUserId(205);
        userFive.setUserName("Rohan");
        userFive.setEmail("rohan.status@gmail.com");
        userFive.setPhone("9543218765");
        userFive.setPassword("rohan456");
        userFive.setCreatedOn("05-04-2026");

        UserAccount userSix = new UserAccount();
        userSix.setUserId(206);
        userSix.setUserName("Kavya");
        userSix.setEmail("kavya.group@redmail.com");
        userSix.setPhone("9432198765");
        userSix.setPassword("kavya#789");
        userSix.setCreatedOn("06-04-2026");
		
		boolean aarav = whatsapp.createUserAccount(userOne);
        System.out.println(aarav);
        System.out.println();

        boolean isha = whatsapp.createUserAccount(userTwo);
        System.out.println(isha);
        System.out.println();

        boolean vedant = whatsapp.createUserAccount(userThree);
        System.out.println(vedant);
        System.out.println();

        boolean neha = whatsapp.createUserAccount(userFour);
        System.out.println(neha);
        System.out.println();

        boolean rohan = whatsapp.createUserAccount(userFive);
        System.out.println(rohan);
        System.out.println();

        boolean kavya = whatsapp.createUserAccount(userSix);
        System.out.println(kavya);
        System.out.println();

        UserAccount userSeven = new UserAccount();
        userSeven.setUserId(207);
        userSeven.setUserName("Sita");
        userSeven.setEmail("sita.whatsapp@gmail.com");
        userSeven.setPhone("9321087654");
        userSeven.setPassword("sita@321");
        userSeven.setCreatedOn("07-04-2026");
        boolean sita = whatsapp.createUserAccount(userSeven);
        System.out.println(sita);
        System.out.println();

        UserAccount userEight = new UserAccount();
        userEight.setUserId(208);
        userEight.setUserName("Shreya");
        userEight.setEmail("shreya.msg@ymail.com");
        userEight.setPhone("9210876543");
        userEight.setPassword("shreya456!");
        userEight.setCreatedOn("08-04-2026");
        boolean shreya = whatsapp.createUserAccount(userEight);
        System.out.println(shreya);
        System.out.println();

        UserAccount userNine = new UserAccount();
        userNine.setUserId(209);
        userNine.setUserName("Sunita");
        userNine.setEmail("sunita.chat@gmail.com");
        userNine.setPhone("9108765432");
        userNine.setPassword("sunita789");
        userNine.setCreatedOn("09-04-2026");
        boolean sunita = whatsapp.createUserAccount(userNine);
        System.out.println(sunita);
        System.out.println();

        UserAccount userTen = new UserAccount();
        userTen.setUserId(210);
        userTen.setUserName("Tara");
        userTen.setEmail("tara.voice@zmail.com");
        userTen.setPhone("8997654321");
        userTen.setPassword("tara#2026");
        userTen.setCreatedOn("10-04-2026");
        boolean tara = whatsapp.createUserAccount(userTen);
        System.out.println(tara);
        System.out.println();

        UserAccount userEleven = new UserAccount();
        userEleven.setUserId(211);
        userEleven.setUserName("Usha");
        userEleven.setEmail("usha.groups@gmail.com");
        userEleven.setPhone("8886543210");
        userEleven.setPassword("usha123@");
        userEleven.setCreatedOn("11-04-2026");
        boolean usha = whatsapp.createUserAccount(userEleven);
        System.out.println(usha);
        System.out.println();

        UserAccount userTwelve = new UserAccount();
        userTwelve.setUserId(212);
        userTwelve.setUserName("Vani");
        userTwelve.setEmail("vani.status@outlook.com");
        userTwelve.setPhone("8775432109");
        userTwelve.setPassword("vani567!");
        userTwelve.setCreatedOn("12-04-2026");
        boolean vani = whatsapp.createUserAccount(userTwelve);
        System.out.println(vani);
        System.out.println();

        UserAccount userThirteen = new UserAccount();
        userThirteen.setUserId(213);
        userThirteen.setUserName("Vidya");
        userThirteen.setEmail("vidya.sticker@gmail.com");
        userThirteen.setPhone("8664321987");
        userThirteen.setPassword("vidya890");
        userThirteen.setCreatedOn("13-04-2026");
        boolean vidya = whatsapp.createUserAccount(userThirteen);
        System.out.println(vidya);
        System.out.println();

        UserAccount userFourteen = new UserAccount();
        userFourteen.setUserId(214);
        userFourteen.setUserName("Deepa");
        userFourteen.setEmail("deepa.calls@ymail.com");
        userFourteen.setPhone("8553219876");
        userFourteen.setPassword("deepa@456");
        userFourteen.setCreatedOn("14-04-2026");
        boolean deepa = whatsapp.createUserAccount(userFourteen);
        System.out.println(deepa);
        System.out.println();

        UserAccount userFifteen = new UserAccount();
        userFifteen.setUserId(215);
        userFifteen.setUserName("Divya");
        userFifteen.setEmail("divya.whatsapp@gmail.com");
        userFifteen.setPhone("8442109876");
        userFifteen.setPassword("divya789#");
        userFifteen.setCreatedOn("15-04-2026");
        boolean divya = whatsapp.createUserAccount(userFifteen);
        System.out.println(divya);
        System.out.println();

        UserAccount userSixteen = new UserAccount();
        userSixteen.setUserId(216);
        userSixteen.setUserName("Geeta");
        userSixteen.setEmail("geeta.chat@zmail.com");
        userSixteen.setPhone("8331098765");
        userSixteen.setPassword("geeta123!");
        userSixteen.setCreatedOn("16-04-2026");
        boolean geeta = whatsapp.createUserAccount(userSixteen);
        System.out.println(geeta);
        System.out.println();

        UserAccount userSeventeen = new UserAccount();
        userSeventeen.setUserId(217);
        userSeventeen.setUserName("Hema");
        userSeventeen.setEmail("hema.groups@gmail.com");
        userSeventeen.setPhone("8220987654");
        userSeventeen.setPassword("hema456@");
        userSeventeen.setCreatedOn("17-04-2026");
        boolean hema = whatsapp.createUserAccount(userSeventeen);
        System.out.println(hema);
        System.out.println();

        UserAccount userEighteen = new UserAccount();
        userEighteen.setUserId(218);
        userEighteen.setUserName("Jyoti");
        userEighteen.setEmail("jyoti.status@outlook.com");
        userEighteen.setPhone("8110876543");
        userEighteen.setPassword("jyoti789");
        userEighteen.setCreatedOn("18-04-2026");
        boolean jyoti = whatsapp.createUserAccount(userEighteen);
        System.out.println(jyoti);
        System.out.println();

        UserAccount userNineteen = new UserAccount();
        userNineteen.setUserId(219);
        userNineteen.setUserName("Komal");
        userNineteen.setEmail("komal.sticker@gmail.com");
        userNineteen.setPhone("8009765432");
        userNineteen.setPassword("komal#2026");
        userNineteen.setCreatedOn("19-04-2026");
        boolean komal = whatsapp.createUserAccount(userNineteen);
        System.out.println(komal);
        whatsapp.getUserDetails();
        System.out.println();

        whatsapp.getUserDetails();  
    }
}