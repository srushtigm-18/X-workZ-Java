class GitHubRunner {
    public static void main(String[] repos) {
		
        GitHub github = new GitHub();

        GitHubAccount githubOne = new GitHubAccount();
        githubOne.setUsername("codeRaj");
        githubOne.setEmail("raj.github@gmail.com");
        githubOne.setPassword("rajDev123");
        githubOne.setCountry("India");
        githubOne.setVerifyEmail(true);
        githubOne.setCaptcha("AB12CD");
        
		boolean raj = github.createUserAccount(githubOne);
        System.out.println(raj);
        System.out.println();

        GitHubAccount githubTwo = new GitHubAccount();
        githubTwo.setUsername("virajCoder");
        githubTwo.setEmail("viraj.github@gmail.com");
        githubTwo.setPassword("viraj@456");
        githubTwo.setCountry("India");
        githubTwo.setVerifyEmail(true);
        githubTwo.setCaptcha("XY98ZW");
        
		boolean viraj = github.createUserAccount(githubTwo);
        System.out.println(viraj);
        System.out.println();

        GitHubAccount githubThree = new GitHubAccount();
        githubThree.setUsername("vimalGit");
        githubThree.setEmail("vimal.github@gmail.com");
        githubThree.setPassword("vimal789");
        githubThree.setCountry("India");
        githubThree.setVerifyEmail(true);
        githubThree.setCaptcha("MN56OP");
        
		boolean vimal = github.createUserAccount(githubThree);
        System.out.println(vimal);
        System.out.println();

        GitHubAccount githubFour = new GitHubAccount();
        githubFour.setUsername("vishalRepo");
        githubFour.setEmail("vishal.github@gmail.com");
        githubFour.setPassword("vishalDev@1");
        githubFour.setCountry("India");
        githubFour.setVerifyEmail(true);
        githubFour.setCaptcha("QR78ST");
        boolean vishal = github.createUserAccount(githubFour);
        System.out.println(vishal);
        System.out.println();

        GitHubAccount githubFive = new GitHubAccount();
        githubFive.setUsername("vikramMerge");
        githubFive.setEmail("vikram.github@gmail.com");
        githubFive.setPassword("vikramG@1");
        githubFive.setCountry("India");
        githubFive.setVerifyEmail(true);
        githubFive.setCaptcha("UV34WX");
        
		boolean vikram = github.createUserAccount(githubFive);
        System.out.println(vikram);
        System.out.println();

        GitHubAccount githubSix = new GitHubAccount();
        githubSix.setUsername("priyaCode");
        githubSix.setEmail("priya.github@gmail.com");
        githubSix.setPassword("priya@202");
        githubSix.setCountry("India");
        githubSix.setVerifyEmail(true);
        githubSix.setCaptcha("EF56GH");
        boolean priya = github.createUserAccount(githubSix);
        System.out.println(priya);
        System.out.println();

        GitHubAccount githubSeven = new GitHubAccount();
        githubSeven.setUsername("arjunDev");
        githubSeven.setEmail("arjun.github@gmail.com");
        githubSeven.setPassword("arjun456!");
        githubSeven.setCountry("India");
        githubSeven.setVerifyEmail(true);
        githubSeven.setCaptcha("IJ90KL");
        boolean arjun = github.createUserAccount(githubSeven);
        System.out.println(arjun);
        System.out.println();

        GitHubAccount githubEight = new GitHubAccount();
        githubEight.setUsername("snehaRepo");
        githubEight.setEmail("sneha.github@gmail.com");
        githubEight.setPassword("snehaPro@1");
        githubEight.setCountry("India");
        githubEight.setVerifyEmail(true);
        githubEight.setCaptcha("NO12PQ");
        boolean sneha = github.createUserAccount(githubEight);
        System.out.println(sneha);
        System.out.println();

        GitHubAccount githubNine = new GitHubAccount();
        githubNine.setUsername("rahulFork");
        githubNine.setEmail("rahul.github@gmail.com");
        githubNine.setPassword("rahul789#");
        githubNine.setCountry("India");
        githubNine.setVerifyEmail(true);
        githubNine.setCaptcha("RS34TU");
        boolean rahul = github.createUserAccount(githubNine);
        System.out.println(rahul);
        System.out.println();

        GitHubAccount githubTen = new GitHubAccount();
        githubTen.setUsername("divyaPull");
        githubTen.setEmail("divya.github@gmail.com");
        githubTen.setPassword("divyaDev12");
        githubTen.setCountry("India");
        githubTen.setVerifyEmail(true);
        githubTen.setCaptcha("VW78XY");
        boolean divya = github.createUserAccount(githubTen);
        System.out.println(divya);
        System.out.println();

        GitHubAccount githubEleven = new GitHubAccount();
        githubEleven.setUsername("kiranPush");
        githubEleven.setEmail("kiran.github@gmail.com");
        githubEleven.setPassword("kiran@303");
        githubEleven.setCountry("India");
        githubEleven.setVerifyEmail(true);
        githubEleven.setCaptcha("ZA45BC");
        
		boolean kiran = github.createUserAccount(githubEleven);
        System.out.println(kiran);
        System.out.println();

        GitHubAccount githubTwelve = new GitHubAccount();
        githubTwelve.setUsername("meeraBranch");
        githubTwelve.setEmail("meera.github@gmail.com");
        githubTwelve.setPassword("meera456$");
        githubTwelve.setCountry("India");
        githubTwelve.setVerifyEmail(true);
        githubTwelve.setCaptcha("DE67FG");
        
		boolean meera = github.createUserAccount(githubTwelve);
        System.out.println(meera);
        System.out.println();

        GitHubAccount githubThirteen = new GitHubAccount();
        githubThirteen.setUsername("vikasCommit");
        githubThirteen.setEmail("vikas.github@gmail.com");
        githubThirteen.setPassword("vikasPro!");
        githubThirteen.setCountry("India");
        githubThirteen.setVerifyEmail(true);
        githubThirteen.setCaptcha("HI90JK");
        boolean vikasExtra = github.createUserAccount(githubThirteen);  // 'vikas' already used
        System.out.println(vikasExtra);
        System.out.println();

        GitHubAccount githubFourteen = new GitHubAccount();
        githubFourteen.setUsername("nishaIssue");
        githubFourteen.setEmail("nisha.github@gmail.com");
        githubFourteen.setPassword("nisha@999");
        githubFourteen.setCountry("India");
        githubFourteen.setVerifyEmail(true);
        githubFourteen.setCaptcha("LM12NO");
        boolean nisha = github.createUserAccount(githubFourteen);
        System.out.println(nisha);
        System.out.println();

        GitHubAccount githubFifteen = new GitHubAccount();
        githubFifteen.setUsername("sameerStar");
        githubFifteen.setEmail("sameer.github@gmail.com");
        githubFifteen.setPassword("sameerDev#2");
        githubFifteen.setCountry("India");
        githubFifteen.setVerifyEmail(true);
        githubFifteen.setCaptcha("PQ45RS");
        boolean sameer = github.createUserAccount(githubFifteen);
        System.out.println(sameer);
        System.out.println();

        GitHubAccount githubSixteen = new GitHubAccount();
        githubSixteen.setUsername("lakshmiTag");
        githubSixteen.setEmail("lakshmi.github@gmail.com");
        githubSixteen.setPassword("lakshmi321@");
        githubSixteen.setCountry("India");
        githubSixteen.setVerifyEmail(true);
        githubSixteen.setCaptcha("TU78VW");
        
		boolean lakshmi = github.createUserAccount(githubSixteen);
        System.out.println(lakshmi);
        System.out.println();

        GitHubAccount githubSeventeen = new GitHubAccount();
        githubSeventeen.setUsername("tejasWiki");
        githubSeventeen.setEmail("tejas.github@gmail.com");
        githubSeventeen.setPassword("tejas456");
        githubSeventeen.setCountry("India");
        githubSeventeen.setVerifyEmail(true);
        githubSeventeen.setCaptcha("WX01YZ");
        
		boolean tejas = github.createUserAccount(githubSeventeen);
        System.out.println(tejas);
        System.out.println();

        GitHubAccount githubEighteen = new GitHubAccount();
        githubEighteen.setUsername("shrutiGist");
        githubEighteen.setEmail("shruti.github@gmail.com");
        githubEighteen.setPassword("shruti@777");
        githubEighteen.setCountry("India");
        githubEighteen.setVerifyEmail(true);
        githubEighteen.setCaptcha("AB23CD");
        
		boolean shruti = github.createUserAccount(githubEighteen);
        System.out.println(shruti);
        System.out.println();

        GitHubAccount githubNineteen = new GitHubAccount();
        githubNineteen.setUsername("ankitPages");
        githubNineteen.setEmail("ankit.github@gmail.com");
        githubNineteen.setPassword("ankitDev1");
        githubNineteen.setCountry("India");
        githubNineteen.setVerifyEmail(true);
        githubNineteen.setCaptcha("EF56GH");
       
	   boolean ankit = github.createUserAccount(githubNineteen);
        System.out.println(ankit);
        System.out.println();

        github.getUserDetails();  
    }
}