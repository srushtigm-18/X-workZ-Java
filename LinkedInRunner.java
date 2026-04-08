class LinkedInRunner {
public static void main(String[] args) {
LinkedIn linkedin = new LinkedIn();

LinkedInAccount userOne = new LinkedInAccount();
userOne.setName("Rahul Kumar");
userOne.setId(801);
userOne.setJobTitle("Software Engineer");
userOne.setEducation("B.Tech Computer Science");
userOne.setEmail("rahulk.cs@gmail.com");
userOne.setPassword("rahul123");
userOne.setLocation("Bengaluru");

boolean r = linkedin.createUserAccount(userOne);
System.out.println(r);
System.out.println();

LinkedInAccount userTwo = new LinkedInAccount();
userTwo.setName("Priya Verma");
userTwo.setId(802);
userTwo.setJobTitle("Product Manager");
userTwo.setEducation("MBA Marketing");
userTwo.setEmail("priya.pm@gmail.com");
userTwo.setPassword("priya@456");
userTwo.setLocation("Hyderabad");

boolean p = linkedin.createUserAccount(userTwo);
System.out.println(p);
System.out.println();

LinkedInAccount userThree = new LinkedInAccount();
userThree.setName("Vikram Reddy");
userThree.setId(803);
userThree.setJobTitle("Data Analyst");
userThree.setEducation("BSc Statistics");
userThree.setEmail("vikram.da@gmail.com");
userThree.setPassword("vikram789");
userThree.setLocation("Chennai");

boolean v3 = linkedin.createUserAccount(userThree);
System.out.println(v3);
System.out.println();


LinkedInAccount userFour = new LinkedInAccount();
userFour.setName("Meera Patel");
userFour.setId(804);
userFour.setJobTitle("UI/UX Designer");
userFour.setEducation("BFA Design");
userFour.setEmail("meera.design@gmail.com");
userFour.setPassword("meera2026");
userFour.setLocation("Mumbai");

boolean m4 = linkedin.createUserAccount(userFour);
System.out.println(m4);
System.out.println();
		

LinkedInAccount userFive = new LinkedInAccount();
userFive.setName("Aryan Mehta");
userFive.setId(805);
userFive.setJobTitle("DevOps Engineer");
userFive.setEducation("B.Tech IT");
userFive.setEmail("aryan.devops@gmail.com");
userFive.setPassword("aryanDev@1");
userFive.setLocation("Pune");
boolean a5 = linkedin.createUserAccount(userFive);
System.out.println(a5);

LinkedInAccount userSix = new LinkedInAccount();
userSix.setName("Sneha Nair");
userSix.setId(806);
userSix.setJobTitle("Full Stack Developer");
userSix.setEducation("B.Tech CSE");
userSix.setEmail("sneha.dev@gmail.com");
userSix.setPassword("sneha456!");
userSix.setLocation("Bengaluru");
boolean sneha = linkedin.createUserAccount(userSix);
System.out.println(sneha);
System.out.println();

LinkedInAccount userSeven = new LinkedInAccount();
userSeven.setName("Arjun Gupta");
userSeven.setId(807);
userSeven.setJobTitle("Data Scientist");
userSeven.setEducation("M.Tech Data Science");
userSeven.setEmail("arjun.ds@gmail.com");
userSeven.setPassword("arjun789#");
userSeven.setLocation("Delhi");
boolean arjun = linkedin.createUserAccount(userSeven);
System.out.println(arjun);
System.out.println();

LinkedInAccount userEight = new LinkedInAccount();
userEight.setName("Divya Joshi");
userEight.setId(808);
userEight.setJobTitle("Business Analyst");
userEight.setEducation("MBA Finance");
userEight.setEmail("divya.ba@gmail.com");
userEight.setPassword("divyaDev12");
userEight.setLocation("Mumbai");
boolean divya = linkedin.createUserAccount(userEight);
System.out.println(divya);
System.out.println();
 
LinkedInAccount userNine = new LinkedInAccount();
userNine.setName("Ravi Sharma");
userNine.setId(809);
userNine.setJobTitle("Cloud Architect");
userNine.setEducation("MCA");
userNine.setEmail("ravi.cloud@gmail.com");
userNine.setPassword("ravi@303");
userNine.setLocation("Hyderabad");
boolean ravi = linkedin.createUserAccount(userNine);
System.out.println(ravi);
System.out.println();

LinkedInAccount userTen = new LinkedInAccount();
userTen.setName("Kiran Iyer");
userTen.setId(810);
userTen.setJobTitle("Frontend Developer");
userTen.setEducation("B.Tech IT");
userTen.setEmail("kiran.front@gmail.com");
userTen.setPassword("kiran456$");
userTen.setLocation("Bengaluru");
boolean kiran = linkedin.createUserAccount(userTen);
System.out.println(kiran);
System.out.println();

LinkedInAccount userEleven = new LinkedInAccount();
userEleven.setName("Nisha Pawar");
userEleven.setId(811);
userEleven.setJobTitle("QA Engineer");
userEleven.setEducation("B.Tech CSE");
userEleven.setEmail("nisha.qa@gmail.com");
userEleven.setPassword("nishaPro!");
userEleven.setLocation("Pune");
boolean nisha = linkedin.createUserAccount(userEleven);
System.out.println(nisha);
System.out.println();

LinkedInAccount userTwelve = new LinkedInAccount();
userTwelve.setName("Tejas More");
userTwelve.setId(812);
userTwelve.setJobTitle("Backend Developer");
userTwelve.setEducation("MCA");
userTwelve.setEmail("tejas.back@gmail.com");
userTwelve.setPassword("tejas@999");
userTwelve.setLocation("Chennai");
boolean tejas = linkedin.createUserAccount(userTwelve);
System.out.println(tejas);
System.out.println();

LinkedInAccount userThirteen = new LinkedInAccount();
userThirteen.setName("Lakshmi Rao");
userThirteen.setId(813);
userThirteen.setJobTitle("HR Manager");
userThirteen.setEducation("MBA HR");
userThirteen.setEmail("lakshmi.hr@gmail.com");
userThirteen.setPassword("lakshmi321@");
userThirteen.setLocation("Delhi");
boolean lakshmi = linkedin.createUserAccount(userThirteen);
System.out.println(lakshmi);
System.out.println();

LinkedInAccount userFourteen = new LinkedInAccount();
userFourteen.setName("Sameer Khan");
userFourteen.setId(814);
userFourteen.setJobTitle("Scrum Master");
userFourteen.setEducation("PMP Certified");
userFourteen.setEmail("sameer.sm@gmail.com");
userFourteen.setPassword("sameerDev#2");
userFourteen.setLocation("Mumbai");
boolean sameer = linkedin.createUserAccount(userFourteen);
System.out.println(sameer);
System.out.println();

LinkedInAccount userFifteen = new LinkedInAccount();
userFifteen.setName("Shruti Bhat");
userFifteen.setId(815);
userFifteen.setJobTitle("Marketing Manager");
userFifteen.setEducation("MBA Marketing");
userFifteen.setEmail("shruti.marketing@gmail.com");
userFifteen.setPassword("shruti456");
userFifteen.setLocation("Bengaluru");
boolean shruti = linkedin.createUserAccount(userFifteen);
System.out.println(shruti);
System.out.println();

LinkedInAccount userSixteen = new LinkedInAccount();
userSixteen.setName("Ankit Desai");
userSixteen.setId(816);
userSixteen.setJobTitle("Salesforce Developer");
userSixteen.setEducation("B.Tech CSE");

userSixteen.setEmail("ankit.sf@gmail.com");
userSixteen.setPassword("ankit@777");
userSixteen.setLocation("Hyderabad");

boolean ankit = linkedin.createUserAccount(userSixteen);

System.out.println(ankit);
System.out.println();

LinkedInAccount userSeventeen = new LinkedInAccount();
userSeventeen.setName("Neha Gupta");
userSeventeen.setId(817);
userSeventeen.setJobTitle("Content Writer");
userSeventeen.setEducation("MA English");
userSeventeen.setEmail("neha.content@gmail.com");
userSeventeen.setPassword("nehaDev1");
userSeventeen.setLocation("Pune");

boolean neha = linkedin.createUserAccount(userSeventeen);
System.out.println(neha);
System.out.println();

LinkedInAccount userEighteen = new LinkedInAccount();
userEighteen.setName("Rohan Joshi");
userEighteen.setId(818);
userEighteen.setJobTitle("Solutions Architect");
userEighteen.setEducation("M.Tech");
userEighteen.setEmail("rohan.arch@gmail.com");
userEighteen.setPassword("rohan789!");
userEighteen.setLocation("Chennai");

boolean rohan = linkedin.createUserAccount(userEighteen);
System.out.println(rohan);
System.out.println();

LinkedInAccount userNineteen = new LinkedInAccount();
userNineteen.setName(" Pooja Nair");
userNineteen.setId(819);
userNineteen.setJobTitle("Project Coordinator");
userNineteen.setEducation("BBA");
userNineteen.setEmail("pooja.coord@gmail.com");
userNineteen.setPassword("pooja@999");
userNineteen.setLocation("Delhi");

boolean pooja = linkedin.createUserAccount(userNineteen);
System.out.println(pooja);
System.out.println();

linkedin.getUserDetails(); 
}
}