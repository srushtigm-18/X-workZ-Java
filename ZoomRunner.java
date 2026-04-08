class ZoomRunner {
	
    public static void main(String[] args) {
		
        Zoom zoom = new Zoom();

        ZoomAccount zoomOne = new ZoomAccount();
        zoomOne.setGmail("sudeep.zoom@gmail.com");
        zoomOne.setPassword("sudeep123");
        zoomOne.setName("Sudeep");
        zoomOne.setDateOfBirth("15-08-1995");
        zoomOne.setOtp("123456");
        zoomOne.setOrganization("TechSchool");

        boolean z = zoom.createUserAccount(zoomOne);
        System.out.println(z);
        System.out.println();

        ZoomAccount zoomTwo = new ZoomAccount();
        zoomTwo.setGmail("rakshitha.zoom@gmail.com");
        zoomTwo.setPassword("rakshitha@456");
        zoomTwo.setName("Rakshitha");
        zoomTwo.setDateOfBirth("22-03-1994");
        zoomTwo.setOtp("654321");
        zoomTwo.setOrganization("EduTech");

        boolean r = zoom.createUserAccount(zoomTwo);
        System.out.println(r);
        System.out.println();

        ZoomAccount zoomThree = new ZoomAccount();
        zoomThree.setGmail("nishvika.zoom@gmail.com");
        zoomThree.setPassword("nishvika789");
        zoomThree.setName("Nishvika");
        zoomThree.setDateOfBirth("10-06-1996");
        zoomThree.setOtp("112233");
        zoomThree.setOrganization("UniLearn");

        boolean nk = zoom.createUserAccount(zoomThree);
        System.out.println(nk);
        System.out.println();

        ZoomAccount zoomFour = new ZoomAccount();
        zoomFour.setGmail("prema.zoom@gmail.com");
        zoomFour.setPassword("premaQ@1");
        zoomFour.setName("Prema");
        zoomFour.setDateOfBirth("05-11-1993");
        zoomFour.setOtp("445566");
        zoomFour.setOrganization("Edupreneur");

        boolean pm = zoom.createUserAccount(zoomFour);
        System.out.println(pm);
        System.out.println();

        ZoomAccount zoomFive = new ZoomAccount();
        zoomFive.setGmail("nishka.zoom@gmail.com");
        zoomFive.setPassword("nishkaDev@1");
        zoomFive.setName("Nishka");
        zoomFive.setDateOfBirth("18-01-1997");
        zoomFive.setOtp("778899");
        zoomFive.setOrganization("SkillHub");

        boolean n = zoom.createUserAccount(zoomFive);
        System.out.println(n);
        System.out.println();

        ZoomAccount zoomSix = new ZoomAccount();
        zoomSix.setGmail("arjun.zoom@gmail.com");
        zoomSix.setPassword("arjun@202");
        zoomSix.setName("Arjun");
        zoomSix.setDateOfBirth("12-05-1992");
        zoomSix.setOtp("223344");
        zoomSix.setOrganization("CodeAcademy");
        boolean a = zoom.createUserAccount(zoomSix);
        System.out.println(a);
        System.out.println();

        ZoomAccount zoomSeven = new ZoomAccount();
        zoomSeven.setGmail("priya.zoom@gmail.com");
        zoomSeven.setPassword("priya456!");
        zoomSeven.setName("Priya");
        zoomSeven.setDateOfBirth("28-09-1995");
        zoomSeven.setOtp("556677");
        zoomSeven.setOrganization("LearnHub");
        boolean p = zoom.createUserAccount(zoomSeven);
        System.out.println(p);
        System.out.println();

        ZoomAccount zoomEight = new ZoomAccount();
        zoomEight.setGmail("vikas.zoom@gmail.com");
        zoomEight.setPassword("vikasPro@1");
        zoomEight.setName("Vikas");
        zoomEight.setDateOfBirth("03-12-1994");
        zoomEight.setOtp("889900");
        zoomEight.setOrganization("TechMentor");
        boolean vikas = zoom.createUserAccount(zoomEight);
        System.out.println(vikas);
        System.out.println();

        ZoomAccount zoomNine = new ZoomAccount();
        zoomNine.setGmail("anita.zoom@gmail.com");
        zoomNine.setPassword("anita789#");
        zoomNine.setName("Anita");
        zoomNine.setDateOfBirth("19-07-1996");
        zoomNine.setOtp("001122");
        zoomNine.setOrganization("EduMasters");
        boolean anita = zoom.createUserAccount(zoomNine);
        System.out.println(anita);
        System.out.println();

        ZoomAccount zoomTen = new ZoomAccount();
        zoomTen.setGmail("rahul.zoom@gmail.com");
        zoomTen.setPassword("rahulDev12");
        zoomTen.setName("Rahul");
        zoomTen.setDateOfBirth("25-02-1993");
        zoomTen.setOtp("334455");
        zoomTen.setOrganization("SkillForge");
        boolean rahul = zoom.createUserAccount(zoomTen);
        System.out.println(rahul);
        System.out.println();

        ZoomAccount zoomEleven = new ZoomAccount();
        zoomEleven.setGmail("sneha.zoom@gmail.com");
        zoomEleven.setPassword("sneha@303");
        zoomEleven.setName("Sneha");
        zoomEleven.setDateOfBirth("14-04-1997");
        zoomEleven.setOtp("667788");
        zoomEleven.setOrganization("ProLearn");
        boolean sneha = zoom.createUserAccount(zoomEleven);
        System.out.println(sneha);
        System.out.println();

        ZoomAccount zoomTwelve = new ZoomAccount();
        zoomTwelve.setGmail("karan.zoom@gmail.com");
        zoomTwelve.setPassword("karan456$");
        zoomTwelve.setName("Karan");
        zoomTwelve.setDateOfBirth("07-11-1995");
        zoomTwelve.setOtp("990011");
        zoomTwelve.setOrganization("EduNexus");
        boolean karan = zoom.createUserAccount(zoomTwelve);
        System.out.println(karan);
        System.out.println();

        ZoomAccount zoomThirteen = new ZoomAccount();
        zoomThirteen.setGmail("divya.zoom@gmail.com");
        zoomThirteen.setPassword("divyaPro!");
        zoomThirteen.setName("Divya");
        zoomThirteen.setDateOfBirth("30-08-1994");
        zoomThirteen.setOtp("122334");
        zoomThirteen.setOrganization("TechTutor");
        boolean divya = zoom.createUserAccount(zoomThirteen);
        System.out.println(divya);
        System.out.println();

        ZoomAccount zoomFourteen = new ZoomAccount();
        zoomFourteen.setGmail("rohit.zoom@gmail.com");
        zoomFourteen.setPassword("rohit@999");
        zoomFourteen.setName("Rohit");
        zoomFourteen.setDateOfBirth("21-01-1996");
        zoomFourteen.setOtp("455667");
        zoomFourteen.setOrganization("LearnPro");
        boolean rohit = zoom.createUserAccount(zoomFourteen);
        System.out.println(rohit);
        System.out.println();

        ZoomAccount zoomFifteen = new ZoomAccount();
        zoomFifteen.setGmail("meera.zoom@gmail.com");
        zoomFifteen.setPassword("meeraDev#2");
        zoomFifteen.setName("Meera");
        zoomFifteen.setDateOfBirth("09-10-1993");
        zoomFifteen.setOtp("788900");
        zoomFifteen.setOrganization("EduSpark");
        boolean meera = zoom.createUserAccount(zoomFifteen);
        System.out.println(meera);
        System.out.println();

        ZoomAccount zoomSixteen = new ZoomAccount();
        zoomSixteen.setGmail("sameer.zoom@gmail.com");
        zoomSixteen.setPassword("sameer321@");
        zoomSixteen.setName("Sameer");
        zoomSixteen.setDateOfBirth("16-06-1995");
        zoomSixteen.setOtp("011223");
        zoomSixteen.setOrganization("CodeMentor");
        boolean sameer = zoom.createUserAccount(zoomSixteen);
        System.out.println(sameer);
        System.out.println();

        ZoomAccount zoomSeventeen = new ZoomAccount();
        zoomSeventeen.setGmail("lakshmi.zoom@gmail.com");
        zoomSeventeen.setPassword("lakshmi456");
        zoomSeventeen.setName("Lakshmi");
        zoomSeventeen.setDateOfBirth("04-03-1997");
        zoomSeventeen.setOtp("344556");
        zoomSeventeen.setOrganization("SkillNest");
        boolean lakshmi = zoom.createUserAccount(zoomSeventeen);
        System.out.println(lakshmi);
        System.out.println();

        ZoomAccount zoomEighteen = new ZoomAccount();
        zoomEighteen.setGmail("tejas.zoom@gmail.com");
        zoomEighteen.setPassword("tejas@777");
        zoomEighteen.setName("Tejas");
        zoomEighteen.setDateOfBirth("27-12-1994");
        zoomEighteen.setOtp("677889");
        zoomEighteen.setOrganization("EduBridge");
        boolean tejas = zoom.createUserAccount(zoomEighteen);
        System.out.println(tejas);
        System.out.println();

        ZoomAccount zoomNineteen = new ZoomAccount();
        zoomNineteen.setGmail("shruti.zoom@gmail.com");
        zoomNineteen.setPassword("shrutiDev1");
        zoomNineteen.setName("Shruti");
        zoomNineteen.setDateOfBirth("11-05-1996");
        zoomNineteen.setOtp("900112");
        zoomNineteen.setOrganization("LearnEdge");
        boolean shruti = zoom.createUserAccount(zoomNineteen);
        System.out.println(shruti);
        System.out.println();

        zoom.getUserDetails();
        System.out.println();
    }
}