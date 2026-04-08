class SnapchatRunner {

    public static void main(String[] args) {
	
        Snapchat snapchat = new Snapchat();

        SnapchatAccount userOne = new SnapchatAccount();
        userOne.setName("Sudeep");
        userOne.setUsername("sudeepSnap");
        userOne.setPassword("sudeep123");
        userOne.setEmail("sudeep.snap@gmail.com");
        userOne.setPhoneNumber("9876543210");
        userOne.setDateOfBirth("15-08-1995");

        boolean s = snapchat.createUserAccount(userOne);
        System.out.println(s);
        System.out.println();

        SnapchatAccount userTwo = new SnapchatAccount();
        userTwo.setName("Rakshitha");
        userTwo.setUsername("rakshithaSnap");
        userTwo.setPassword("rakshitha@456");
        userTwo.setEmail("rakshitha.snap@gmail.com");
        userTwo.setPhoneNumber("9876543211");
        userTwo.setDateOfBirth("22-03-1994");

        boolean r = snapchat.createUserAccount(userTwo);
        System.out.println(r);
        System.out.println();

        SnapchatAccount userThree = new SnapchatAccount();
        userThree.setName("Nishvika");
        userThree.setUsername("nishvikaSnap");
        userThree.setPassword("nishvika789");
        userThree.setEmail("nishvika.snap@gmail.com");
        userThree.setPhoneNumber("9876543212");
        userThree.setDateOfBirth("10-06-1996");

        boolean n = snapchat.createUserAccount(userThree);
        System.out.println(n);
        System.out.println();

        SnapchatAccount userFour = new SnapchatAccount();
        userFour.setName("Prema");
        userFour.setUsername("premaSnap");
        userFour.setPassword("premaQ@1");
        userFour.setEmail("prema.snap@gmail.com");
        userFour.setPhoneNumber("9876543213");
        userFour.setDateOfBirth("05-11-1993");

        boolean p = snapchat.createUserAccount(userFour);
        System.out.println(p);
        System.out.println();

        SnapchatAccount userFive = new SnapchatAccount();
        userFive.setName("Nishka");
        userFive.setUsername("nishkaSnap");
        userFive.setPassword("nishkaDev@1");
        userFive.setEmail("nishka.snap@gmail.com");
        userFive.setPhoneNumber("9876543214");
        userFive.setDateOfBirth("18-01-1997");

        boolean nk = snapchat.createUserAccount(userFive);
        System.out.println(nk);
        snapchat.getUserDetails();
        System.out.println();
    }
}