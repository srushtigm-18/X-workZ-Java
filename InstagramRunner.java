class InstagramRunner {
public static void main(String[] args) {
Instagram instagram = new Instagram();

AccountUser userOne = new AccountUser();
userOne.setUserId(101);
userOne.setUserName("Virat");
userOne.setEmail("virat@cricket.in");
userOne.setPhone("9876543210");
userOne.setPassword("virat123");
userOne.setCreatedOn("10-01-2020");

AccountUser userTwo = new AccountUser();
userTwo.setUserId(102);
userTwo.setUserName("Rohit");
userTwo.setEmail("rohit@cricket.in");
userTwo.setPhone("9876543211");
userTwo.setPassword("rohit456");
userTwo.setCreatedOn("11-01-2020");

AccountUser userThree = new AccountUser();
userThree.setUserId(103);
userThree.setUserName("Sharma");
userThree.setEmail("sharma@cricket.in");
userThree.setPhone("9458752122");
userThree.setPassword("rohit458");
userThree.setCreatedOn("13-01-2008");

AccountUser userFour = new AccountUser();
userFour.setUserId(104);
userFour.setUserName("Sachin");
userFour.setEmail("sachin@cricket.in");
userFour.setPhone("9876543212");
userFour.setPassword("sachin789");
userFour.setCreatedOn("12-01-2020");

AccountUser userFive = new AccountUser();
userFive.setUserId(105);
userFive.setUserName("Kohli");
userFive.setEmail("kohli@cricket.in");
userFive.setPhone("9876543214");
userFive.setPassword("kohli2011");
userFive.setCreatedOn("14-01-2020");


boolean v = instagram.createAccountUser(userOne);
System.out.println(v);
instagram.getUserDetails();

System.out.println();

boolean r = instagram.createAccountUser(userTwo);
System.out.println(r);
instagram.getUserDetails();

System.out.println();

boolean sh = instagram.createAccountUser(userThree);
System.out.println(sh);
instagram.getUserDetails();

System.out.println();

boolean s = instagram.createAccountUser(userFour);
System.out.println(s);
instagram.getUserDetails();

System.out.println();

boolean k = instagram.createAccountUser(userFive);
System.out.println(k);
instagram.getUserDetails();    
    }
}