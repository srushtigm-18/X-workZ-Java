class FacebookRunner{

public static void main(String[] profiles){
Facebook facebook = new Facebook();

UserAccount userAccountOne = new UserAccount();
userAccountOne.setUserId(11);
userAccountOne.setUserName("Abhi");
userAccountOne.setEmail("abhi987@gmail.com");
userAccountOne.setPhone("9864547655");
userAccountOne.setPassword("@abhi18");
userAccountOne.setCreatedOn("18-12-2005");

boolean a = facebook.createUserAccount(userAccountOne);
System.out.println(a);
System.out.println();

UserAccount userAccountTwo = new UserAccount();
userAccountTwo.setUserId(12);
userAccountTwo.setUserName("Varun");
userAccountTwo.setEmail("varun@bengaluru.in");
userAccountTwo.setPhone("9876543210");
userAccountTwo.setPassword("varun123");
userAccountTwo.setCreatedOn("06-04-2026");

boolean s = facebook.createUserAccount(userAccountTwo);
System.out.println(s);
//facebook.getUserDetails();
       
System.out.println();

UserAccount userAccountThree = new UserAccount();
userAccountThree.setUserId(13);
userAccountThree.setUserName("Kiran");
userAccountThree.setEmail("kiran@tech.com");
userAccountThree.setPhone("9876543211");
userAccountThree.setPassword("kiran456");
userAccountThree.setCreatedOn("07-04-2018");

boolean k = facebook.createUserAccount(userAccountThree);
System.out.println(k);
//facebook.getUserDetails();

System.out.println();
/*
UserAccount userAccountFour = new UserAccount();
userAccountFour.setUserId(14);
userAccountFour.setUserName("Priya");
userAccountFour.setEmail("priya@test.in");
userAccountFour.setPhone("9876543211");  
userAccountFour.setPassword("priya7");
userAccountFour.setCreatedOn("08-04-2026");

boolean p = facebook.createUserAccount(userAccountFour);
System.out.println(p);
//facebook.getUserDetails();

System.out.println();

UserAccount userAccountFive = new UserAccount();
userAccountFive.setUserId(15);
userAccountFive.setUserName("Raj");
userAccountFive.setEmail("raj@bengaluru.com");
userAccountFive.setPhone("9876543212");
userAccountFive.setPassword("raj12");  
userAccountFive.setCreatedOn("09-04-2026");

boolean r = facebook.createUserAccount(userAccountFive);
System.out.println(r);*/

facebook.getUserDetails();

System.out.println();

}
}
