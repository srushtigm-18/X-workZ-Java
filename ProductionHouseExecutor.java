class ProductionHouseExecutor {
    public static void main(String[] args) {
        ProductionHouse ph1 = new ProductionHouse();
        ph1.studioId = 1; ph1.studioName = "Yash Raj Films"; ph1.founder = "Yash Chopra"; ph1.location = "Mumbai";
        Movie m1 = new Movie(); m1.movieId = 101; m1.title = "Pathaan"; m1.director = "Siddharth Anand"; m1.genre = "Action"; m1.boxOfficeCr = 1050.3;
        ph1.movie = m1; ph1.getStudioDetails();

        ProductionHouse ph2 = new ProductionHouse();
        ph2.studioId = 2; ph2.studioName = "Dharma Productions"; ph2.founder = "Karan Johar"; ph2.location = "Mumbai";
        Movie m2 = new Movie(); m2.movieId = 102; m2.title = "Brahmastra"; m2.director = "Ayan Mukerji"; m2.genre = "Fantasy"; m2.boxOfficeCr = 431.0;
        ph2.movie = m2; ph2.getStudioDetails();

        ProductionHouse ph3 = new ProductionHouse();
        ph3.studioId = 3; ph3.studioName = "Red Chillies Entertainment"; ph3.founder = "Shah Rukh Khan"; ph3.location = "Mumbai";
        Movie m3 = new Movie(); m3.movieId = 103; m3.title = "Jawan"; m3.director = "Atlee"; m3.genre = "Action Thriller"; m3.boxOfficeCr = 1150.0;
        ph3.movie = m3; ph3.getStudioDetails();

        ProductionHouse ph4 = new ProductionHouse();
        ph4.studioId = 4; ph4.studioName = "Excel Entertainment"; ph4.founder = "Ritesh Sidhwani"; ph4.location = "Mumbai";
        Movie m4 = new Movie(); m4.movieId = 104; m4.title = "Gully Boy"; m4.director = "Zoya Akhtar"; m4.genre = "Musical Drama"; m4.boxOfficeCr = 240.0;
        ph4.movie = m4; ph4.getStudioDetails();

        ProductionHouse ph5 = new ProductionHouse();
        ph5.studioId = 5; ph5.studioName = "Mythri Movie Makers"; ph5.founder = "Naveen Yerneni"; ph5.location = "Hyderabad";
        Movie m5 = new Movie(); m5.movieId = 105; m5.title = "Pushpa 2"; m5.director = "Sukumar"; m5.genre = "Action Drama"; m5.boxOfficeCr = 1800.0;
        ph5.movie = m5; ph5.getStudioDetails();

        ProductionHouse ph6 = new ProductionHouse();
        ph6.studioId = 6; ph6.studioName = "Hombale Films"; ph6.founder = "Vijay Kiragandur"; ph6.location = "Bengaluru";
        Movie m6 = new Movie(); m6.movieId = 106; m6.title = "Kantara"; m6.director = "Rishab Shetty"; m6.genre = "Mythological"; m6.boxOfficeCr = 450.0;
        ph6.movie = m6; ph6.getStudioDetails();

        ProductionHouse ph7 = new ProductionHouse();
        ph7.studioId = 7; ph7.studioName = "Maddock Films"; ph7.founder = "Dinesh Vijan"; ph7.location = "Mumbai";
        Movie m7 = new Movie(); m7.movieId = 107; m7.title = "Stree 2"; m7.director = "Amar Kaushik"; m7.genre = "Horror Comedy"; m7.boxOfficeCr = 620.0;
        ph7.movie = m7; ph7.getStudioDetails();

        ProductionHouse ph8 = new ProductionHouse();
        ph8.studioId = 8; ph8.studioName = "T-Series Films"; ph8.founder = "Bhushan Kumar"; ph8.location = "Mumbai";
        Movie m8 = new Movie(); m8.movieId = 108; m8.title = "Bhool Bhulaiyaa 3"; m8.director = "Anees Bazmee"; m8.genre = "Horror Comedy"; m8.boxOfficeCr = 380.0;
        ph8.movie = m8; ph8.getStudioDetails();

        ProductionHouse ph9 = new ProductionHouse();
        ph9.studioId = 9; ph9.studioName = "Lyca Productions"; ph9.founder = "Kalanithi Maran"; ph9.location = "Chennai";
        Movie m9 = new Movie(); m9.movieId = 109; m9.title = "Leo"; m9.director = "Lokesh Kanagaraj"; m9.genre = "Action Thriller"; m9.boxOfficeCr = 620.0;
        ph9.movie = m9; ph9.getStudioDetails();

        ProductionHouse ph10 = new ProductionHouse();
        ph10.studioId = 10; ph10.studioName = "Sun Pictures"; ph10.founder = "Kalanithi Maran"; ph10.location = "Chennai";
        Movie m10 = new Movie(); m10.movieId = 110; m10.title = "Jailer"; m10.director = "Nelson Dilipkumar"; m10.genre = "Action Comedy"; m10.boxOfficeCr = 650.0;
        ph10.movie = m10; ph10.getStudioDetails();

        ProductionHouse ph11 = new ProductionHouse();
        ph11.studioId = 11; ph11.studioName = "Aamir Khan Productions"; ph11.founder = "Aamir Khan"; ph11.location = "Mumbai";
        Movie m11 = new Movie(); m11.movieId = 111; m11.title = "Laal Singh Chaddha"; m11.director = "Advait Chandan"; m11.genre = "Drama"; m11.boxOfficeCr = 58.0;
        ph11.movie = m11; ph11.getStudioDetails();

        ProductionHouse ph12 = new ProductionHouse();
        ph12.studioId = 12; ph12.studioName = "Bhansali Productions"; ph12.founder = "Sanjay Leela Bhansali"; ph12.location = "Mumbai";
        Movie m12 = new Movie(); m12.movieId = 112; m12.title = "Padmaavat"; m12.director = "Sanjay Leela Bhansali"; m12.genre = "Period Drama"; m12.boxOfficeCr = 585.0;
        ph12.movie = m12; ph12.getStudioDetails();

        ProductionHouse ph13 = new ProductionHouse();
        ph13.studioId = 13; ph13.studioName = "Viacom18 Studios"; ph13.founder = "Viacom18"; ph13.location = "Mumbai";
        Movie m13 = new Movie(); m13.movieId = 113; m13.title = "Andhadhun"; m13.director = "Sriram Raghavan"; m13.genre = "Thriller"; m13.boxOfficeCr = 72.0;
        ph13.movie = m13; ph13.getStudioDetails();

        ProductionHouse ph14 = new ProductionHouse();
        ph14.studioId = 14; ph14.studioName = "Rajshri Productions"; ph14.founder = "Tarachand Barjatya"; ph14.location = "Mumbai";
        Movie m14 = new Movie(); m14.movieId = 114; m14.title = "Prem Ratan Dhan Payo"; m14.director = "Soiujit Sircar"; m14.genre = "Family Drama"; m14.boxOfficeCr = 405.0;
        ph14.movie = m14; ph14.getStudioDetails();

        ProductionHouse ph15 = new ProductionHouse();
        ph15.studioId = 15; ph15.studioName = "Balaji Motion Pictures"; ph15.founder = "Ekta Kapoor"; ph15.location = "Mumbai";
        Movie m15 = new Movie(); m15.movieId = 115; m15.title = "Dream Girl 2"; m15.director = "Raaj Shaandilyaa"; m15.genre = "Comedy"; m15.boxOfficeCr = 140.0;
        ph15.movie = m15; ph15.getStudioDetails();

        ProductionHouse ph16 = new ProductionHouse();
        ph16.studioId = 16; ph16.studioName = "Arka Media Works"; ph16.founder = "D. Suresh Babu"; ph16.location = "Hyderabad";
        Movie m16 = new Movie(); m16.movieId = 116; m16.title = "Baahubali 2"; m16.director = "S.S. Rajamouli"; m16.genre = "Epic"; m16.boxOfficeCr = 1810.0;
        ph16.movie = m16; ph16.getStudioDetails();

        ProductionHouse ph17 = new ProductionHouse();
        ph17.studioId = 17; ph17.studioName = "AGS Entertainment"; ph17.founder = "Archana Kalpathi"; ph17.location = "Chennai";
        Movie m17 = new Movie(); m17.movieId = 117; m17.title = "The Greatest of All Time"; m17.director = "Venky Atluri"; m17.genre = "Action"; m17.boxOfficeCr = 450.0;
        ph17.movie = m17; ph17.getStudioDetails();

        ProductionHouse ph18 = new ProductionHouse();
        ph18.studioId = 18; ph18.studioName = "Geetha Arts"; ph18.founder = "Allu Aravind"; ph18.location = "Hyderabad";
        Movie m18 = new Movie(); m18.movieId = 118; m18.title = "Pushpa The Rise"; m18.director = "Sukumar"; m18.genre = "Action Drama"; m18.boxOfficeCr = 370.0;
        ph18.movie = m18; ph18.getStudioDetails();

        ProductionHouse ph19 = new ProductionHouse();
        ph19.studioId = 19; ph19.studioName = "Kavithalaya Productions"; ph19.founder = "K. Balachander"; ph19.location = "Chennai";
        Movie m19 = new Movie(); m19.movieId = 119; m19.title = "96"; m19.director = "C. Premkumar"; m19.genre = "Romance"; m19.boxOfficeCr = 125.0;
        ph19.movie = m19; ph19.getStudioDetails();

        ProductionHouse ph20 = new ProductionHouse();
        ph20.studioId = 20; ph20.studioName = "Eros International"; ph20.founder = "Arjan Lamba"; ph20.location = "Mumbai";
        Movie m20 = new Movie(); m20.movieId = 120; m20.title = "Housefull 5"; m20.director = "Tarun Mansukhani"; m20.genre = "Comedy"; m20.boxOfficeCr = 320.0;
        ph20.movie = m20; ph20.getStudioDetails();
    }
}
