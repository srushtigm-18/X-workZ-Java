class ProductionHouseExecutor {
    public static void main(String[] args) {
        Movie m1 = new Movie(101, "Pathaan", "Siddharth Anand", "Action", 1050.3);
        ProductionHouse ph1 = new ProductionHouse("Yash Raj Films", 1, "Yash Chopra", "Mumbai", m1);
        ph1.getStudioDetails();

        Movie m2 = new Movie(102, "Brahmastra", "Ayan Mukerji", "Fantasy", 431.0);
        ProductionHouse ph2 = new ProductionHouse("Dharma Productions", 2, "Karan Johar", "Mumbai", m2);
        ph2.getStudioDetails();

        Movie m3 = new Movie(103, "Jawan", "Atlee", "Action Thriller", 1150.0);
        ProductionHouse ph3 = new ProductionHouse("Red Chillies Entertainment", 3, "Shah Rukh Khan", "Mumbai", m3);
        ph3.getStudioDetails();

        Movie m4 = new Movie(104, "Gully Boy", "Zoya Akhtar", "Musical Drama", 240.0);
        ProductionHouse ph4 = new ProductionHouse("Excel Entertainment", 4, "Ritesh Sidhwani", "Mumbai", m4);
        ph4.getStudioDetails();

        Movie m5 = new Movie(105, "Pushpa 2", "Sukumar", "Action Drama", 1800.0);
        ProductionHouse ph5 = new ProductionHouse("Mythri Movie Makers", 5, "Naveen Yerneni", "Hyderabad", m5);
        ph5.getStudioDetails();

        Movie m6 = new Movie(106, "Kantara", "Rishab Shetty", "Mythological", 450.0);
        ProductionHouse ph6 = new ProductionHouse("Hombale Films", 6, "Vijay Kiragandur", "Bengaluru", m6);
        ph6.getStudioDetails();

        Movie m7 = new Movie(107, "Stree 2", "Amar Kaushik", "Horror Comedy", 620.0);
        ProductionHouse ph7 = new ProductionHouse("Maddock Films", 7, "Dinesh Vijan", "Mumbai", m7);
        ph7.getStudioDetails();

        Movie m8 = new Movie(108, "Bhool Bhulaiyaa 3", "Anees Bazmee", "Horror Comedy", 380.0);
        ProductionHouse ph8 = new ProductionHouse("T-Series Films", 8, "Bhushan Kumar", "Mumbai", m8);
        ph8.getStudioDetails();

        Movie m9 = new Movie(109, "Leo", "Lokesh Kanagaraj", "Action Thriller", 620.0);
        ProductionHouse ph9 = new ProductionHouse("Lyca Productions", 9, "Kalanithi Maran", "Chennai", m9);
        ph9.getStudioDetails();

        Movie m10 = new Movie(110, "Jailer", "Nelson Dilipkumar", "Action Comedy", 650.0);
        ProductionHouse ph10 = new ProductionHouse("Sun Pictures", 10, "Kalanithi Maran", "Chennai", m10);
        ph10.getStudioDetails();

        Movie m11 = new Movie(111, "Laal Singh Chaddha", "Advait Chandan", "Drama", 58.0);
        ProductionHouse ph11 = new ProductionHouse("Aamir Khan Productions", 11, "Aamir Khan", "Mumbai", m11);
        ph11.getStudioDetails();

        Movie m12 = new Movie(112, "Padmaavat", "Sanjay Leela Bhansali", "Period Drama", 585.0);
        ProductionHouse ph12 = new ProductionHouse("Bhansali Productions", 12, "Sanjay Leela Bhansali", "Mumbai", m12);
        ph12.getStudioDetails();

        Movie m13 = new Movie(113, "Andhadhun", "Sriram Raghavan", "Thriller", 72.0);
        ProductionHouse ph13 = new ProductionHouse("Viacom18 Studios", 13, "Viacom18", "Mumbai", m13);
        ph13.getStudioDetails();

        Movie m14 = new Movie(114, "Prem Ratan Dhan Payo", "Soiujit Sircar", "Family Drama", 405.0);
        ProductionHouse ph14 = new ProductionHouse("Rajshri Productions", 14, "Tarachand Barjatya", "Mumbai", m14);
        ph14.getStudioDetails();

        Movie m15 = new Movie(115, "Dream Girl 2", "Raaj Shaandilyaa", "Comedy", 140.0);
        ProductionHouse ph15 = new ProductionHouse("Balaji Motion Pictures", 15, "Ekta Kapoor", "Mumbai", m15);
        ph15.getStudioDetails();

        Movie m16 = new Movie(116, "Baahubali 2", "S.S. Rajamouli", "Epic", 1810.0);
        ProductionHouse ph16 = new ProductionHouse("Arka Media Works", 16, "D. Suresh Babu", "Hyderabad", m16);
        ph16.getStudioDetails();

        Movie m17 = new Movie(117, "The Greatest of All Time", "Venky Atluri", "Action", 450.0);
        ProductionHouse ph17 = new ProductionHouse("AGS Entertainment", 17, "Archana Kalpathi", "Chennai", m17);
        ph17.getStudioDetails();

        Movie m18 = new Movie(118, "Pushpa The Rise", "Sukumar", "Action Drama", 370.0);
        ProductionHouse ph18 = new ProductionHouse("Geetha Arts", 18, "Allu Aravind", "Hyderabad", m18);
        ph18.getStudioDetails();

        Movie m19 = new Movie(119, "96", "C. Premkumar", "Romance", 125.0);
        ProductionHouse ph19 = new ProductionHouse("Kavithalaya Productions", 19, "K. Balachander", "Chennai", m19);
        ph19.getStudioDetails();

        Movie m20 = new Movie(120, "Housefull 5", "Tarun Mansukhani", "Comedy", 320.0);
        ProductionHouse ph20 = new ProductionHouse("Eros International", 20, "Arjan Lamba", "Mumbai", m20);
        ph20.getStudioDetails();
    }
}
