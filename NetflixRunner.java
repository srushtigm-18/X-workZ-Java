class NetflixRunner {
	
    public static void main(String[] net) {
		
		Netflix netflix = new Netflix();

        NetflixAccount userOne = new NetflixAccount();
        userOne.setEmail("arjun.net@outlook.com");
        userOne.setPassword("arjun123");
        userOne.setPlan("Premium");
        userOne.setPayment("Credit Card");
        userOne.setName("Arjun Mehta");
        userOne.setPhoneNumber("9876543210");

        NetflixAccount userTwo = new NetflixAccount();
        userTwo.setEmail("lakshmi.net@gmail.com");
        userTwo.setPassword("lakshmi@456");
        userTwo.setPlan("Standard");
        userTwo.setPayment("Debit Card");
        userTwo.setName("Lakshmi Reddy");
        userTwo.setPhoneNumber("9876543211");

        NetflixAccount userThree = new NetflixAccount();
        userThree.setEmail("rahul.net@yahoo.com");
        userThree.setPassword("rahul789");
        userThree.setPlan("Basic");
        userThree.setPayment("UPI");
        userThree.setName("Rahul Kumar");
        userThree.setPhoneNumber("9876543212");

        NetflixAccount userFour = new NetflixAccount();
        userFour.setEmail("meera.net@zmail.com");
        userFour.setPassword("meera2026");
        userFour.setPlan("Mobile");
        userFour.setPayment("Paytm");
        userFour.setName("Meera Patel");
        userFour.setPhoneNumber("9876543213");

        NetflixAccount userFive = new NetflixAccount();
        userFive.setEmail("vikram.net@redmail.com");
        userFive.setPassword("vikramDev@1");
        userFive.setPlan("Premium");
        userFive.setPayment("Net Banking");
        userFive.setName("Vikram Sharma");
        userFive.setPhoneNumber("9876543214");

        boolean a = netflix.createUserAccount(userOne);
        System.out.println(a);
        System.out.println();

        boolean l = netflix.createUserAccount(userTwo);
        System.out.println(l);
        System.out.println();

        boolean r = netflix.createUserAccount(userThree);
        System.out.println(r);
        System.out.println();

        boolean m = netflix.createUserAccount(userFour);
        System.out.println(m);
        System.out.println();

        boolean v = netflix.createUserAccount(userFive);
        System.out.println(v);
        System.out.println();
		
		 NetflixAccount userSix = new NetflixAccount();
        userSix.setEmail("suresh.net@gmail.com");
        userSix.setPassword("suresh456");
        userSix.setPlan("Standard");
        userSix.setPayment("Google Pay");
        userSix.setName("Suresh Patel");
        userSix.setPhoneNumber("9876543215");
        boolean suresh = netflix.createUserAccount(userSix);
        System.out.println(suresh);
        System.out.println();

        NetflixAccount userSeven = new NetflixAccount();
        userSeven.setEmail("pavan.net@outlook.com");
        userSeven.setPassword("pavan@789");
        userSeven.setPlan("Premium");
        userSeven.setPayment("PhonePe");
        userSeven.setName("Pavan Gupta");
        userSeven.setPhoneNumber("9876543216");
       
	   boolean pavan = netflix.createUserAccount(userSeven);
        System.out.println(pavan);
        System.out.println();
		
		
		NetflixAccount userEight = new NetflixAccount();
        userEight.setEmail("lokesh.net@yahoo.com");
        userEight.setPassword("lokesh123!");
        userEight.setPlan("Basic");
        userEight.setPayment("Amazon Pay");
        userEight.setName("Lokesh Nair");
        userEight.setPhoneNumber("9876543217");
       
	   boolean lokesh = netflix.createUserAccount(userEight);
        System.out.println(lokesh);
        System.out.println();
		
		 NetflixAccount userNine = new NetflixAccount();
        userNine.setEmail("jatin.net@zmail.com");
        userNine.setPassword("jatinDev@1");
        userNine.setPlan("Mobile");
        userNine.setPayment("Credit Card");
        userNine.setName("Jatin Joshi");
        userNine.setPhoneNumber("9876543218");
       
	   boolean jatin = netflix.createUserAccount(userNine);
        System.out.println(jatin);
        System.out.println();

        NetflixAccount userTen = new NetflixAccount();
        userTen.setEmail("harish.net@gmail.com");
        userTen.setPassword("harish456#");
        userTen.setPlan("Premium");
        userTen.setPayment("UPI");
        userTen.setName("Harish Desai");
        userTen.setPhoneNumber("9876543219");
        
		boolean harish = netflix.createUserAccount(userTen);
        System.out.println(harish);
        System.out.println();
		
		 NetflixAccount userEleven = new NetflixAccount();
        userEleven.setEmail("ganesh.net@outlook.com");
        userEleven.setPassword("ganesh@202");
        userEleven.setPlan("Standard");
        userEleven.setPayment("Debit Card");
        userEleven.setName("Ganesh Iyer");
        userEleven.setPhoneNumber("9876543220");
        
		boolean ganesh = netflix.createUserAccount(userEleven);
        System.out.println(ganesh);
        System.out.println();

        NetflixAccount userTwelve = new NetflixAccount();
        userTwelve.setEmail("chirag.net@yahoo.com");
        userTwelve.setPassword("chirag789$");
        userTwelve.setPlan("Basic");
        userTwelve.setPayment("Paytm");
        userTwelve.setName("Chirag Pawar");
        userTwelve.setPhoneNumber("9876543221");
       
	   boolean chirag = netflix.createUserAccount(userTwelve);
        System.out.println(chirag);
        System.out.println();
		
		NetflixAccount userThirteen = new NetflixAccount();
        userThirteen.setEmail("anand.net@zmail.com");
        userThirteen.setPassword("anandPro!");
        userThirteen.setPlan("Premium");
        userThirteen.setPayment("Net Banking");
        userThirteen.setName("Anand Rao");
        userThirteen.setPhoneNumber("9876543222");
        
		boolean anand = netflix.createUserAccount(userThirteen);
        System.out.println(anand);
        System.out.println();

        NetflixAccount userFourteen = new NetflixAccount();
        userFourteen.setEmail("akash.net@gmail.com");
        userFourteen.setPassword("akashDev12");
        userFourteen.setPlan("Mobile");
        userFourteen.setPayment("Google Pay");
        userFourteen.setName("Akash Khan");
        userFourteen.setPhoneNumber("9876543223");
       
	   boolean akash = netflix.createUserAccount(userFourteen);
        System.out.println(akash);
        System.out.println();
		
		 NetflixAccount userFifteen = new NetflixAccount();
        userFifteen.setEmail("ajay.net@outlook.com");
        userFifteen.setPassword("ajay@303");
        userFifteen.setPlan("Standard");
        userFifteen.setPayment("PhonePe");
        userFifteen.setName("Ajay Verma");
        userFifteen.setPhoneNumber("9876543224");
        boolean ajay = netflix.createUserAccount(userFifteen);
        System.out.println(ajay);
        System.out.println();
		
		
		
		 NetflixAccount userSixteen = new NetflixAccount();
        userSixteen.setEmail("yash.net@yahoo.com");
        userSixteen.setPassword("yash456!");
        userSixteen.setPlan("Premium");
        userSixteen.setPayment("Amazon Pay");
        userSixteen.setName("Yash Singh");
        userSixteen.setPhoneNumber("9876543225");
       
	   boolean yash = netflix.createUserAccount(userSixteen);
        System.out.println(yash);
        System.out.println();

        NetflixAccount userSeventeen = new NetflixAccount();
        userSeventeen.setEmail("vivek.net@zmail.com");
        userSeventeen.setPassword("vivek789#");
        userSeventeen.setPlan("Basic");
        userSeventeen.setPayment("Credit Card");
        userSeventeen.setName("Vivek Bhat");
        userSeventeen.setPhoneNumber("9876543226");
        
		
		boolean vivek = netflix.createUserAccount(userSeventeen);
        System.out.println(vivek);
        System.out.println();
		
		
		NetflixAccount userEighteen = new NetflixAccount();
        userEighteen.setEmail("vinay.net@gmail.com");
        userEighteen.setPassword("vinay@999");
        userEighteen.setPlan("Mobile");
        userEighteen.setPayment("UPI");
        userEighteen.setName("Vinay Malhotra");
        userEighteen.setPhoneNumber("9876543227");
       

	   boolean vinay = netflix.createUserAccount(userEighteen);
        System.out.println(vinay);

       netflix.getUserDetails(); 
		

    }
}