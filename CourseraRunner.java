class CourseraRunner {
    public static void main(String[] cors) {
        Coursera coursera = new Coursera();
        CourseraAccount userOne = new CourseraAccount();
        userOne.setName("Ayaan");
        userOne.setEmail("ayaan.coursera@gmail.com");
        userOne.setPassword("ayaan123");
        userOne.setCourseInterest("Computer Science");
        userOne.setEducation("B.Tech CSE");
        userOne.setIntOtp(112233);
        
		boolean ayaan = coursera.createUserAccount(userOne);
        System.out.println(ayaan);
        System.out.println();

        CourseraAccount userTwo = new CourseraAccount();
        userTwo.setName("Zara");
        userTwo.setEmail("zara.coursera@gmail.com");
        userTwo.setPassword("zara@456");
        userTwo.setCourseInterest("Data Science");
        userTwo.setEducation("M.Sc Statistics");
        userTwo.setIntOtp(445566);
        
		boolean zara = coursera.createUserAccount(userTwo);
        System.out.println(zara);
        System.out.println();

        CourseraAccount userThree = new CourseraAccount();
        userThree.setName("Advait");
        userThree.setEmail("advait.coursera@gmail.com");
        userThree.setPassword("advait789");
        userThree.setCourseInterest("Artificial Intelligence");
        userThree.setEducation("B.Tech IT");
        userThree.setIntOtp(778899);
        
		boolean advait = coursera.createUserAccount(userThree);
        System.out.println(advait);
        System.out.println();

        CourseraAccount userFour = new CourseraAccount();
        userFour.setName("Shruti");
        userFour.setEmail("shruti.coursera@gmail.com");
        userFour.setPassword("shruti2026");
        userFour.setCourseInterest("Web Development");
        userFour.setEducation("B.E Civil (Self-taught coding)");
        userFour.setIntOtp(123456);
        
		boolean shruti = coursera.createUserAccount(userFour);
        System.out.println(shruti);
        System.out.println();

        CourseraAccount userFive = new CourseraAccount();
        userFive.setName("Rohan");
        userFive.setEmail("rohan.coursera@gmail.com");
        userFive.setPassword("rohanDev@1");
        userFive.setCourseInterest("DevOps & Cloud");
        userFive.setEducation("B.Tech Mechanical");
        userFive.setIntOtp(654321);
        
		boolean rohan = coursera.createUserAccount(userFive);
        System.out.println(rohan);
        coursera.getUserDetails();
        System.out.println();

        CourseraAccount userSix = new CourseraAccount();
        userSix.setName("Priya");
        userSix.setEmail("priya.coursera@gmail.com");
        userSix.setPassword("priya@202");
        userSix.setCourseInterest("Machine Learning");
        userSix.setEducation("M.Tech CSE");
        userSix.setIntOtp(223344);
        
		boolean priya = coursera.createUserAccount(userSix);
        System.out.println(priya);
        System.out.println();

        CourseraAccount userSeven = new CourseraAccount();
        userSeven.setName("Arjun");
        userSeven.setEmail("arjun.coursera@gmail.com");
        userSeven.setPassword("arjun456!");
        userSeven.setCourseInterest("Business Analytics");
        userSeven.setEducation("BBA");
        userSeven.setIntOtp(556677);
        
		boolean arjun = coursera.createUserAccount(userSeven);
        System.out.println(arjun);
        System.out.println();

        CourseraAccount userEight = new CourseraAccount();
        userEight.setName("Sneha");
        userEight.setEmail("sneha.coursera@gmail.com");
        userEight.setPassword("snehaPro@1");
        userEight.setCourseInterest("Digital Marketing");
        userEight.setEducation("B.Com");
        userEight.setIntOtp(889900);
        
		boolean sneha = coursera.createUserAccount(userEight);
        System.out.println(sneha);
        System.out.println();

        CourseraAccount userNine = new CourseraAccount();
        userNine.setName("Rahul");
        userNine.setEmail("rahul.coursera@gmail.com");
        userNine.setPassword("rahul789#");
        userNine.setCourseInterest("Cybersecurity");
        userNine.setEducation("B.Tech ECE");
        userNine.setIntOtp(001122);
       
	   boolean rahul = coursera.createUserAccount(userNine);
        System.out.println(rahul);
        System.out.println();

        CourseraAccount userTen = new CourseraAccount();
        userTen.setName("Divya");
        userTen.setEmail("divya.coursera@gmail.com");
        userTen.setPassword("divyaDev12");
        userTen.setCourseInterest("Project Management");
        userTen.setEducation("MBA");
        userTen.setIntOtp(334455);
       
	   boolean divya = coursera.createUserAccount(userTen);
        System.out.println(divya);
        System.out.println();

        CourseraAccount userEleven = new CourseraAccount();
        userEleven.setName("Kiran");
        userEleven.setEmail("kiran.coursera@gmail.com");
        userEleven.setPassword("kiran@303");
        userEleven.setCourseInterest("Blockchain");
        userEleven.setEducation("M.Tech");
        userEleven.setIntOtp(667788);
       
	   boolean kiran = coursera.createUserAccount(userEleven);
        System.out.println(kiran);
        System.out.println();

        CourseraAccount userTwelve = new CourseraAccount();
        userTwelve.setName("Meera");
        userTwelve.setEmail("meera.coursera@gmail.com");
        userTwelve.setPassword("meera456$");
        userTwelve.setCourseInterest("Financial Analysis");
        userTwelve.setEducation("CA");
        userTwelve.setIntOtp(990011);
        
		boolean meera = coursera.createUserAccount(userTwelve);
        System.out.println(meera);
        System.out.println();

        CourseraAccount userThirteen = new CourseraAccount();
        userThirteen.setName("Vikas");
        userThirteen.setEmail("vikas.coursera@gmail.com");
        userThirteen.setPassword("vikasPro!");
        userThirteen.setCourseInterest("Cloud Computing");
        userThirteen.setEducation("MCA");
        userThirteen.setIntOtp(122334);
        
		boolean vikas = coursera.createUserAccount(userThirteen);
        System.out.println(vikas);
        System.out.println();

        CourseraAccount userFourteen = new CourseraAccount();
        userFourteen.setName("Nisha");
        userFourteen.setEmail("nisha.coursera@gmail.com");
        userFourteen.setPassword("nisha@999");
        userFourteen.setCourseInterest("UX/UI Design");
        userFourteen.setEducation("B.Des");
        userFourteen.setIntOtp(455667);
        
		boolean nisha = coursera.createUserAccount(userFourteen);
        System.out.println(nisha);
        System.out.println();

        CourseraAccount userFifteen = new CourseraAccount();
        userFifteen.setName("Sameer");
        userFifteen.setEmail("sameer.coursera@gmail.com");
        userFifteen.setPassword("sameerDev#2");
        userFifteen.setCourseInterest("Deep Learning");
        userFifteen.setEducation("PhD CSE");
        userFifteen.setIntOtp(788900);
       
	   boolean sameer = coursera.createUserAccount(userFifteen);
        System.out.println(sameer);
        System.out.println();

        CourseraAccount userSixteen = new CourseraAccount();
        userSixteen.setName("Lakshmi");
        userSixteen.setEmail("lakshmi.coursera@gmail.com");
        userSixteen.setPassword("lakshmi321@");
        userSixteen.setCourseInterest("Leadership");
        userSixteen.setEducation("MBA");
        userSixteen.setIntOtp(011223);
       
	   boolean lakshmi = coursera.createUserAccount(userSixteen);
        System.out.println(lakshmi);
        System.out.println();

        CourseraAccount userSeventeen = new CourseraAccount();
        userSeventeen.setName("Tejas");
        userSeventeen.setEmail("tejas.coursera@gmail.com");
        userSeventeen.setPassword("tejas456");
        userSeventeen.setCourseInterest("Game Development");
        userSeventeen.setEducation("B.Tech Game Design");
        userSeventeen.setIntOtp(344556);
      
	  boolean tejas = coursera.createUserAccount(userSeventeen);
        System.out.println(tejas);
        System.out.println();

        CourseraAccount userEighteen = new CourseraAccount();
        userEighteen.setName("Ankit");
        userEighteen.setEmail("ankit.coursera@gmail.com");
        userEighteen.setPassword("ankit@777");
        userEighteen.setCourseInterest("Mobile Development");
        userEighteen.setEducation("B.Tech");
        userEighteen.setIntOtp(677889);
       
	   boolean ankit = coursera.createUserAccount(userEighteen);
        System.out.println(ankit);
        System.out.println();

        CourseraAccount userNineteen = new CourseraAccount();
        userNineteen.setName("Pooja");
        userNineteen.setEmail("pooja.coursera@gmail.com");
        userNineteen.setPassword("poojaDev1");
        userNineteen.setCourseInterest("Business Strategy");
        userNineteen.setEducation("PGDM");
        userNineteen.setIntOtp(900112);
       
	   boolean pooja = coursera.createUserAccount(userNineteen);
        System.out.println(pooja);
        System.out.println();

        coursera.getUserDetails(); 
    }
}