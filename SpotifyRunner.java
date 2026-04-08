class SpotifyRunner {
	
    public static void main(String[] songs) {
        Spotify spotify = new Spotify();

        SpotifyAccount userOne = new SpotifyAccount();
        userOne.setEmail("zara@spotify.com");
        userOne.setPassword("zara123");
        userOne.setUsername("zaraMusic");
        userOne.setDateOfBirth("05-04-1990");
        userOne.setGender("F");  
        userOne.setCountry("Australia");
        boolean zara = spotify.createUserAccount(userOne);
        System.out.println(zara);
        spotify.getUserDetails();
        System.out.println();

        SpotifyAccount userTwo = new SpotifyAccount();
        userTwo.setEmail("ayaan@spotify.com");
        userTwo.setPassword("ayaan@456");
        userTwo.setUsername("ayaanMusic");
        userTwo.setDateOfBirth("03-04-1990");
        userTwo.setGender("M"); 
        userTwo.setCountry("India");
        boolean ayaan = spotify.createUserAccount(userTwo);
        System.out.println(ayaan);
        spotify.getUserDetails();
        System.out.println();

        SpotifyAccount userThree = new SpotifyAccount();
        userThree.setEmail("advait@spotify.com");
        userThree.setPassword("advait789");
        userThree.setUsername("advaitMusic");
        userThree.setDateOfBirth("01-04-1990");
        userThree.setGender("M");
        userThree.setCountry("USA");
        boolean advait = spotify.createUserAccount(userThree);
        System.out.println(advait);
        spotify.getUserDetails();
        System.out.println();

        SpotifyAccount userFour = new SpotifyAccount();
        userFour.setEmail("shruti@spotify.com");
        userFour.setPassword("shruti2026");
        userFour.setUsername("shrutiMusic");
        userFour.setDateOfBirth("08-04-1990");
        userFour.setGender("F"); 
        userFour.setCountry("Australia");
        boolean shruti = spotify.createUserAccount(userFour);
        System.out.println(shruti);
        spotify.getUserDetails();
        System.out.println();

        SpotifyAccount userFive = new SpotifyAccount();
        userFive.setEmail("rohan@spotify.com");
        userFive.setPassword("rohanDev@1");
        userFive.setUsername("rohanMusic");
        userFive.setDateOfBirth("07-04-1990");
        userFive.setGender("M"); 
        userFive.setCountry("USA");
        boolean rohan = spotify.createUserAccount(userFive);
        System.out.println(rohan);
        spotify.getUserDetails();
        System.out.println();

      
        SpotifyAccount userSix = new SpotifyAccount();
        userSix.setEmail("priya@spotify.com");
        userSix.setPassword("priya456!");
        userSix.setUsername("priyaMusic");
        userSix.setDateOfBirth("02-04-1990");
        userSix.setGender("F");
        userSix.setCountry("India");
        boolean priya = spotify.createUserAccount(userSix);
        System.out.println(priya);
        spotify.getUserDetails();
        System.out.println();

        SpotifyAccount userSeven = new SpotifyAccount();
        userSeven.setEmail("arjun@spotify.com");
        userSeven.setPassword("arjun789#");
        userSeven.setUsername("arjunMusic");
        userSeven.setDateOfBirth("09-04-1990");
        userSeven.setGender("M");
        userSeven.setCountry("Canada");
        boolean arjun = spotify.createUserAccount(userSeven);
        System.out.println(arjun);
        spotify.getUserDetails();
        System.out.println();

        SpotifyAccount userEight = new SpotifyAccount();
        userEight.setEmail("sneha@spotify.com");
        userEight.setPassword("snehaDev12");
        userEight.setUsername("snehaMusic");
        userEight.setDateOfBirth("04-04-1990");
        userEight.setGender("F");
        userEight.setCountry("UK");
        boolean sneha = spotify.createUserAccount(userEight);
        System.out.println(sneha);
        spotify.getUserDetails();
        System.out.println();

        SpotifyAccount userNine = new SpotifyAccount();
        userNine.setEmail("rahul@spotify.com");
        userNine.setPassword("rahul@303");
        userNine.setUsername("rahulMusic");
        userNine.setDateOfBirth("10-04-1990");
        userNine.setGender("M");
        userNine.setCountry("India");
        boolean rahul = spotify.createUserAccount(userNine);
        System.out.println(rahul);
        spotify.getUserDetails();
        System.out.println();

        SpotifyAccount userTen = new SpotifyAccount();
        userTen.setEmail("divya@spotify.com");
        userTen.setPassword("divya456$");
        userTen.setUsername("divyaMusic");
        userTen.setDateOfBirth("06-04-1990");
        userTen.setGender("F");
        userTen.setCountry("USA");
        boolean divya = spotify.createUserAccount(userTen);
        System.out.println(divya);
        spotify.getUserDetails();
        System.out.println();

        SpotifyAccount userEleven = new SpotifyAccount();
        userEleven.setEmail("kiran@spotify.com");
        userEleven.setPassword("kiranPro!");
        userEleven.setUsername("kiranMusic");
        userEleven.setDateOfBirth("11-04-1990");
        userEleven.setGender("M");
        userEleven.setCountry("Germany");
        boolean kiran = spotify.createUserAccount(userEleven);
        System.out.println(kiran);
        spotify.getUserDetails();
        System.out.println();

        SpotifyAccount userTwelve = new SpotifyAccount();
        userTwelve.setEmail("nisha@spotify.com");
        userTwelve.setPassword("nisha@999");
        userTwelve.setUsername("nishaMusic");
        userTwelve.setDateOfBirth("12-04-1990");
        userTwelve.setGender("F");
        userTwelve.setCountry("India");
        boolean nisha = spotify.createUserAccount(userTwelve);
        System.out.println(nisha);
        spotify.getUserDetails();
        System.out.println();

        SpotifyAccount userThirteen = new SpotifyAccount();
        userThirteen.setEmail("tejas@spotify.com");
        userThirteen.setPassword("tejas321@");
        userThirteen.setUsername("tejasMusic");
        userThirteen.setDateOfBirth("13-04-1990");
        userThirteen.setGender("M");
        userThirteen.setCountry("Australia");
        boolean tejas = spotify.createUserAccount(userThirteen);
        System.out.println(tejas);
        spotify.getUserDetails();
        System.out.println();

        SpotifyAccount userFourteen = new SpotifyAccount();
        userFourteen.setEmail("lakshmi@spotify.com");
        userFourteen.setPassword("lakshmiDev#2");
        userFourteen.setUsername("lakshmiMusic");
        userFourteen.setDateOfBirth("14-04-1990");
        userFourteen.setGender("F");
        userFourteen.setCountry("Singapore");
        boolean lakshmi = spotify.createUserAccount(userFourteen);
        System.out.println(lakshmi);
        spotify.getUserDetails();
        System.out.println();

        SpotifyAccount userFifteen = new SpotifyAccount();
        userFifteen.setEmail("sameer@spotify.com");
        userFifteen.setPassword("sameer456");
        userFifteen.setUsername("sameerMusic");
        userFifteen.setDateOfBirth("15-04-1990");
        userFifteen.setGender("M");
        userFifteen.setCountry("USA");
        boolean sameer = spotify.createUserAccount(userFifteen);
        System.out.println(sameer);
        spotify.getUserDetails();
        System.out.println();

        SpotifyAccount userSixteen = new SpotifyAccount();
        userSixteen.setEmail("pooja@spotify.com");
        userSixteen.setPassword("pooja@777");
        userSixteen.setUsername("poojaMusic");
        userSixteen.setDateOfBirth("16-04-1990");
        userSixteen.setGender("F");
        userSixteen.setCountry("India");
        boolean pooja = spotify.createUserAccount(userSixteen);
        System.out.println(pooja);
        spotify.getUserDetails();
        System.out.println();

        SpotifyAccount userSeventeen = new SpotifyAccount();
        userSeventeen.setEmail("ankit@spotify.com");
        userSeventeen.setPassword("ankitDev1");
        userSeventeen.setUsername("ankitMusic");
        userSeventeen.setDateOfBirth("17-04-1990");
        userSeventeen.setGender("M");
        userSeventeen.setCountry("Canada");
        boolean ankit = spotify.createUserAccount(userSeventeen);
        System.out.println(ankit);
        spotify.getUserDetails();
        System.out.println();

        SpotifyAccount userEighteen = new SpotifyAccount();
        userEighteen.setEmail("neha@spotify.com");
        userEighteen.setPassword("neha789!");
        userEighteen.setUsername("nehaMusic");
        userEighteen.setDateOfBirth("18-04-1990");
        userEighteen.setGender("F");
        userEighteen.setCountry("UK");
        boolean neha = spotify.createUserAccount(userEighteen);
        System.out.println(neha);
        spotify.getUserDetails();
        System.out.println();

        SpotifyAccount userNineteen = new SpotifyAccount();
        userNineteen.setEmail("vivek@spotify.com");
        userNineteen.setPassword("vivek@999");
        userNineteen.setUsername("vivekMusic");
        userNineteen.setDateOfBirth("19-04-1990");
        userNineteen.setGender("M");
        userNineteen.setCountry("India");
        boolean vivek = spotify.createUserAccount(userNineteen);
        System.out.println(vivek);
        spotify.getUserDetails();
        System.out.println();

        spotify.getUserDetails();  
    }
}