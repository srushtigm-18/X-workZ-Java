class AbodeRunner {

    public static void main(String[] args) {
	
        Abode abode = new Abode();

        AbodeAccount abodeOne = new AbodeAccount();
        abodeOne.setEmail("sudeep.abode@gmail.com");
        abodeOne.setPassword("sudeep123");
        abodeOne.setFullName("Sudeep Kumar");
        abodeOne.setCountry("India");
        abodeOne.setDateOfBirth("15-08-1995");
        abodeOne.setPhoneNumber("9876543210");

        boolean s = abode.createUserAccount(abodeOne);
        System.out.println(s);
        System.out.println();

        AbodeAccount abodeTwo = new AbodeAccount();
        abodeTwo.setEmail("rakshitha.abode@gmail.com");
        abodeTwo.setPassword("rakshitha@456");
        abodeTwo.setFullName("Rakshitha Reddy");
        abodeTwo.setCountry("India");
        abodeTwo.setDateOfBirth("22-03-1994");
        abodeTwo.setPhoneNumber("9876543211");

        boolean r = abode.createUserAccount(abodeTwo);
        System.out.println(r);
        System.out.println();

        AbodeAccount abodeThree = new AbodeAccount();
        abodeThree.setEmail("nishvika.abode@gmail.com");
        abodeThree.setPassword("nishvika789");
        abodeThree.setFullName("Nishvika Mehta");
        abodeThree.setCountry("India");
        abodeThree.setDateOfBirth("10-06-1996");
        abodeThree.setPhoneNumber("9876543212");

        boolean n = abode.createUserAccount(abodeThree);
        System.out.println(n);
        System.out.println();

        AbodeAccount abodeFour = new AbodeAccount();
        abodeFour.setEmail("prema.abode@gmail.com");
        abodeFour.setPassword("premaQ@1");
        abodeFour.setFullName("Prema Verma");
        abodeFour.setCountry("India");
        abodeFour.setDateOfBirth("05-11-1993");
        abodeFour.setPhoneNumber("9876543213");

        boolean p = abode.createUserAccount(abodeFour);
        System.out.println(p);
        System.out.println();

        AbodeAccount abodeFive = new AbodeAccount();
        abodeFive.setEmail("nishka.abode@gmail.com");
        abodeFive.setPassword("nishkaDev@1");
        abodeFive.setFullName("Nishka Patel");
        abodeFive.setCountry("India");
        abodeFive.setDateOfBirth("18-01-1997");
        abodeFive.setPhoneNumber("9876543214");

        boolean nk = abode.createUserAccount(abodeFive);
        System.out.println(nk);
        System.out.println();

        AbodeAccount abodeSix = new AbodeAccount();
        abodeSix.setEmail("arjun.abode@gmail.com");
        abodeSix.setPassword("arjun@202");
        abodeSix.setFullName("Arjun Singh");
        abodeSix.setCountry("India");
        abodeSix.setDateOfBirth("12-05-1992");
        abodeSix.setPhoneNumber("9876543215");
        boolean as = abode.createUserAccount(abodeSix);
        System.out.println(as);
        System.out.println();

        AbodeAccount abodeSeven = new AbodeAccount();
        abodeSeven.setEmail("priya.abode@gmail.com");
        abodeSeven.setPassword("priya456!");
        abodeSeven.setFullName("Priya Sharma");
        abodeSeven.setCountry("India");
        abodeSeven.setDateOfBirth("28-09-1995");
        abodeSeven.setPhoneNumber("9876543216");
        boolean ps = abode.createUserAccount(abodeSeven);
        System.out.println(ps);
        System.out.println();

        AbodeAccount abodeEight = new AbodeAccount();
        abodeEight.setEmail("vikas.abode@gmail.com");
        abodeEight.setPassword("vikasPro@1");
        abodeEight.setFullName("Vikas Joshi");
        abodeEight.setCountry("India");
        abodeEight.setDateOfBirth("03-12-1994");
        abodeEight.setPhoneNumber("9876543217");
        boolean vj = abode.createUserAccount(abodeEight);
        System.out.println(vj);
        System.out.println();

        AbodeAccount abodeNine = new AbodeAccount();
        abodeNine.setEmail("anita.abode@gmail.com");
        abodeNine.setPassword("anita789#");
        abodeNine.setFullName("Anita Desai");
        abodeNine.setCountry("India");
        abodeNine.setDateOfBirth("19-07-1996");
        abodeNine.setPhoneNumber("9876543218");
        boolean ad = abode.createUserAccount(abodeNine);
        System.out.println(ad);
        System.out.println();

        AbodeAccount abodeTen = new AbodeAccount();
        abodeTen.setEmail("rahul.abode@gmail.com");
        abodeTen.setPassword("rahulDev12");
        abodeTen.setFullName("Rahul Gupta");
        abodeTen.setCountry("India");
        abodeTen.setDateOfBirth("25-02-1993");
        abodeTen.setPhoneNumber("9876543219");
        boolean rg = abode.createUserAccount(abodeTen);
        System.out.println(rg);
        System.out.println();

        AbodeAccount abodeEleven = new AbodeAccount();
        abodeEleven.setEmail("sneha.abode@gmail.com");
        abodeEleven.setPassword("sneha@303");
        abodeEleven.setFullName("Sneha Nair");
        abodeEleven.setCountry("India");
        abodeEleven.setDateOfBirth("14-04-1997");
        abodeEleven.setPhoneNumber("9876543220");
        boolean sn = abode.createUserAccount(abodeEleven);
        System.out.println(sn);
        System.out.println();

        AbodeAccount abodeTwelve = new AbodeAccount();
        abodeTwelve.setEmail("karan.abode@gmail.com");
        abodeTwelve.setPassword("karan456$");
        abodeTwelve.setFullName("Karan Malhotra");
        abodeTwelve.setCountry("India");
        abodeTwelve.setDateOfBirth("07-11-1995");
        abodeTwelve.setPhoneNumber("9876543221");
        boolean km = abode.createUserAccount(abodeTwelve);
        System.out.println(km);
        System.out.println();

        AbodeAccount abodeThirteen = new AbodeAccount();
        abodeThirteen.setEmail("divya.abode@gmail.com");
        abodeThirteen.setPassword("divyaPro!");
        abodeThirteen.setFullName("Divya Iyer");
        abodeThirteen.setCountry("India");
        abodeThirteen.setDateOfBirth("30-08-1994");
        abodeThirteen.setPhoneNumber("9876543222");
        boolean di = abode.createUserAccount(abodeThirteen);
        System.out.println(di);
        System.out.println();

        AbodeAccount abodeFourteen = new AbodeAccount();
        abodeFourteen.setEmail("rohit.abode@gmail.com");
        abodeFourteen.setPassword("rohit@999");
        abodeFourteen.setFullName("Rohit Pawar");
        abodeFourteen.setCountry("India");
        abodeFourteen.setDateOfBirth("21-01-1996");
        abodeFourteen.setPhoneNumber("9876543223");
        boolean rp = abode.createUserAccount(abodeFourteen);
        System.out.println(rp);
        System.out.println();

        AbodeAccount abodeFifteen = new AbodeAccount();
        abodeFifteen.setEmail("meera.abode@gmail.com");
        abodeFifteen.setPassword("meeraDev#2");
        abodeFifteen.setFullName("Meera Rao");
        abodeFifteen.setCountry("India");
        abodeFifteen.setDateOfBirth("09-10-1993");
        abodeFifteen.setPhoneNumber("9876543224");
        boolean mr = abode.createUserAccount(abodeFifteen);
        System.out.println(mr);
        System.out.println();

        AbodeAccount abodeSixteen = new AbodeAccount();
        abodeSixteen.setEmail("sameer.abode@gmail.com");
        abodeSixteen.setPassword("sameer321@");
        abodeSixteen.setFullName("Sameer Khan");
        abodeSixteen.setCountry("India");
        abodeSixteen.setDateOfBirth("16-06-1995");
        abodeSixteen.setPhoneNumber("9876543225");
        boolean sk = abode.createUserAccount(abodeSixteen);
        System.out.println(sk);
        System.out.println();

        AbodeAccount abodeSeventeen = new AbodeAccount();
        abodeSeventeen.setEmail("lakshmi.abode@gmail.com");
        abodeSeventeen.setPassword("lakshmi456");
        abodeSeventeen.setFullName("Lakshmi Menon");
        abodeSeventeen.setCountry("India");
        abodeSeventeen.setDateOfBirth("04-03-1997");
        abodeSeventeen.setPhoneNumber("9876543226");
        boolean lm = abode.createUserAccount(abodeSeventeen);
        System.out.println(lm);
        System.out.println();

        AbodeAccount abodeEighteen = new AbodeAccount();
        abodeEighteen.setEmail("tejas.abode@gmail.com");
        abodeEighteen.setPassword("tejas@777");
        abodeEighteen.setFullName("Tejas More");
        abodeEighteen.setCountry("India");
        abodeEighteen.setDateOfBirth("27-12-1994");
        abodeEighteen.setPhoneNumber("9876543227");
        boolean tm = abode.createUserAccount(abodeEighteen);
        System.out.println(tm);
        System.out.println();

        AbodeAccount abodeNineteen = new AbodeAccount();
        abodeNineteen.setEmail("shruti.abode@gmail.com");
        abodeNineteen.setPassword("shrutiDev1");
        abodeNineteen.setFullName("Shruti Bhat");
        abodeNineteen.setCountry("India");
        abodeNineteen.setDateOfBirth("11-05-1996");
        abodeNineteen.setPhoneNumber("9876543228");
        boolean sb = abode.createUserAccount(abodeNineteen);
        System.out.println(sb);
        System.out.println();

        abode.getUserDetails();
        System.out.println();
    }
}