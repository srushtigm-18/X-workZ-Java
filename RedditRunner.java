class RedditRunner {
	
    public static void main(String[] args) {
		
        Reddit reddit = new Reddit();

        RedditAccount userOne = new RedditAccount();
        userOne.setUserName("Abhilash");
        userOne.setEmail("abhilash@reddit.com");
        userOne.setPassword("abhilashReddit@0");
        userOne.setAge(21);
        userOne.setInterest("Travel");
        userOne.setOtp("308496");
        boolean abhilash = reddit.createUserAccount(userOne);
        System.out.println(abhilash);
        reddit.getUserDetails();
        System.out.println();

        RedditAccount userTwo = new RedditAccount();
        userTwo.setUserName("Rakesh");
        userTwo.setEmail("rakesh@reddit.com");
        userTwo.setPassword("rakeshReddit@1");
        userTwo.setAge(21);
        userTwo.setInterest("Sports");
        userTwo.setOtp("781453");
        boolean rakesh = reddit.createUserAccount(userTwo);
        System.out.println(rakesh);
        reddit.getUserDetails();
        System.out.println();

        RedditAccount userThree = new RedditAccount();
        userThree.setUserName("Sinchana");
        userThree.setEmail("sinchana@reddit.com");
        userThree.setPassword("sinchanaReddit@2");
        userThree.setAge(26);
        userThree.setInterest("Sports");
        userThree.setOtp("671412");
        boolean sinchana = reddit.createUserAccount(userThree);
        System.out.println(sinchana);
        reddit.getUserDetails();
        System.out.println();

        RedditAccount userFour = new RedditAccount();
        userFour.setUserName("Sanjana");
        userFour.setEmail("sanjana@reddit.com");
        userFour.setPassword("sanjanaReddit@3");
        userFour.setAge(27);
        userFour.setInterest("Music");
        userFour.setOtp("331148");
        boolean sanjana = reddit.createUserAccount(userFour);
        System.out.println(sanjana);
        reddit.getUserDetails();
        System.out.println();

        RedditAccount userFive = new RedditAccount();
        userFive.setUserName("Sameeksha");
        userFive.setEmail("sameeksha@reddit.com");
        userFive.setPassword("sameekshaReddit@4");
        userFive.setAge(18);
        userFive.setInterest("Music");
        userFive.setOtp("717889");
        boolean sameeksha = reddit.createUserAccount(userFive);
        System.out.println(sameeksha);
        reddit.getUserDetails();
        System.out.println();

        RedditAccount userSix = new RedditAccount();
        userSix.setUserName("Priya");
        userSix.setEmail("priya@reddit.com");
        userSix.setPassword("priyaReddit@5");
        userSix.setAge(24);
        userSix.setInterest("Programming");
        userSix.setOtp("492817");
        boolean priya = reddit.createUserAccount(userSix);
        System.out.println(priya);
        reddit.getUserDetails();
        System.out.println();

        RedditAccount userSeven = new RedditAccount();
        userSeven.setUserName("Sneha");
        userSeven.setEmail("sneha@reddit.com");
        userSeven.setPassword("snehaReddit@6");
        userSeven.setAge(22);
        userSeven.setInterest("Movies");
        userSeven.setOtp("583920");
        boolean sneha = reddit.createUserAccount(userSeven);
        System.out.println(sneha);
        reddit.getUserDetails();
        System.out.println();

        RedditAccount userEight = new RedditAccount();
        userEight.setUserName("Arjun");
        userEight.setEmail("arjun@reddit.com");
        userEight.setPassword("arjunReddit@7");
        userEight.setAge(25);
        userEight.setInterest("Gaming");
        userEight.setOtp("249381");
        boolean arjun = reddit.createUserAccount(userEight);
        System.out.println(arjun);
        reddit.getUserDetails();
        System.out.println();

        RedditAccount userNine = new RedditAccount();
        userNine.setUserName("Divya");
        userNine.setEmail("divya@reddit.com");
        userNine.setPassword("divyaReddit@8");
        userNine.setAge(23);
        userNine.setInterest("Books");
        userNine.setOtp("736204");
        boolean divya = reddit.createUserAccount(userNine);
        System.out.println(divya);
        reddit.getUserDetails();
        System.out.println();

        RedditAccount userTen = new RedditAccount();
        userTen.setUserName("Kiran");
        userTen.setEmail("kiran@reddit.com");
        userTen.setPassword("kiranReddit@9");
        userTen.setAge(28);
        userTen.setInterest("Technology");
        userTen.setOtp("185742");
        boolean kiran = reddit.createUserAccount(userTen);
        System.out.println(kiran);
        reddit.getUserDetails();
        System.out.println();

        RedditAccount userEleven = new RedditAccount();
        userEleven.setUserName("Nisha");
        userEleven.setEmail("nisha@reddit.com");
        userEleven.setPassword("nishaReddit@10");
        userEleven.setAge(20);
        userEleven.setInterest("Food");
        userEleven.setOtp("927463");
        boolean nisha = reddit.createUserAccount(userEleven);
        System.out.println(nisha);
        reddit.getUserDetails();
        System.out.println();

        RedditAccount userTwelve = new RedditAccount();
        userTwelve.setUserName("Tejas");
        userTwelve.setEmail("tejas@reddit.com");
        userTwelve.setPassword("tejasReddit@11");
        userTwelve.setAge(26);
        userTwelve.setInterest("Photography");
        userTwelve.setOtp("364829");
        boolean tejas = reddit.createUserAccount(userTwelve);
        System.out.println(tejas);
        reddit.getUserDetails();
        System.out.println();

        RedditAccount userThirteen = new RedditAccount();
        userThirteen.setUserName("Lakshmi");
        userThirteen.setEmail("lakshmi@reddit.com");
        userThirteen.setPassword("lakshmiReddit@12");
        userThirteen.setAge(24);
        userThirteen.setInterest("Fitness");
        userThirteen.setOtp("571936");
        boolean lakshmi = reddit.createUserAccount(userThirteen);
        System.out.println(lakshmi);
        reddit.getUserDetails();
        System.out.println();

        RedditAccount userFourteen = new RedditAccount();
        userFourteen.setUserName("Sameer");
        userFourteen.setEmail("sameer@reddit.com");
        userFourteen.setPassword("sameerReddit@13");
        userFourteen.setAge(29);
        userFourteen.setInterest("Business");
        userFourteen.setOtp("813570");
        boolean sameer = reddit.createUserAccount(userFourteen);
        System.out.println(sameer);
        reddit.getUserDetails();
        System.out.println();

        RedditAccount userFifteen = new RedditAccount();
        userFifteen.setUserName("Shruti");
        userFifteen.setEmail("shruti@reddit.com");
        userFifteen.setPassword("shrutiReddit@14");
        userFifteen.setAge(22);
        userFifteen.setInterest("Education");
        userFifteen.setOtp("459281");
        boolean shruti = reddit.createUserAccount(userFifteen);
        System.out.println(shruti);
        reddit.getUserDetails();
        System.out.println();

        RedditAccount userNineteen = new RedditAccount();
        userNineteen.setUserName("Ankit");
        userNineteen.setEmail("ankit@reddit.com");
        userNineteen.setPassword("ankitReddit@18");
        userNineteen.setAge(25);
        userNineteen.setInterest("Science");
        userNineteen.setOtp("726493");
        boolean ankit = reddit.createUserAccount(userNineteen);
        System.out.println(ankit);
        reddit.getUserDetails();
        System.out.println();

        reddit.getUserDetails();  
    }
}