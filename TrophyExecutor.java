class TrophyExecutor{
    public static void main(String[] args){
        Trophy trophy1 = new Trophy(1, "Ranji Trophy", "Cricket", true, "Domestic Cricket", "First Class", 
                                  "Silver Gilt", 15, 24, 1934, true, "BCCI", 
                                  "Wicket Design", false, 50000, "Mumbai", "Mumbai Indians", 
                                  true, 1, 250000.0, "Cricket", "National");
        trophy1.getTrophyDetails();

        Trophy trophy2 = new Trophy(2, "Santosh Trophy", "Football", false, "National Football", "Senior Men", 
                                  "Silver Cup", 12, 20, 1967, true, "AIFF", 
                                  "Football Shape", false, 30000, "Kolkata", "Services SC", 
                                  true, 1, 150000.0, "Football", "National");
        trophy2.getTrophyDetails();

        Trophy trophy3 = new Trophy(3, "Toddler Open Gold", "Tennis", true, "National Junior", "U12 Boys", 
                                  "Gold Plated", 8, 18, 2025, true, "AITA", 
                                  "Racket Design", false, 10000, "Bengaluru", "Srushti G M", 
                                  false, 1, 50000.0, "Tennis", "Junior");
        trophy3.getTrophyDetails();

        Trophy trophy4 = new Trophy(4, "Khelo India Gold", "Badminton", true, "National Youth", "U16 Girls", 
                                  "Gold Crystal", 6, 16, 2026, true, "SAI", 
                                  "Shuttle Design", true, 15000, "New Delhi", "Srushti G M", 
                                  false, 1, 75000.0, "Badminton", "Youth");
        trophy4.getTrophyDetails();

        Trophy trophy5 = new Trophy(5, "Nehru Cup", "Hockey", false, "National Hockey", "Senior Men", 
                                  "Silver Shield", 20, 28, 1928, true, "IHF", 
                                  "Stick Design", false, 40000, "Delhi", "Punjab", 
                                  true, 1, 200000.0, "Hockey", "National");
        trophy5.getTrophyDetails();

        Trophy trophy6 = new Trophy(6, "Subroto Cup", "Football", true, "School Football", "U17 Boys", 
                                  "Gold Cup", 10, 22, 1960, true, "Indian Air Force", 
                                  "Eagle Design", false, 25000, "New Delhi", "Odisha School", 
                                  true, 1, 120000.0, "Football", "School");
        trophy6.getTrophyDetails();

        Trophy trophy7 = new Trophy(7, "Durand Cup", "Football", false, "Oldest Football", "Senior Club", 
                                  "Silver Trophy", 18, 25, 1888, true, "Indian Army", 
                                  "Cup Design", false, 60000, "Kolkata", "Mohun Bagan", 
                                  true, 1, 300000.0, "Football", "Historic");
        trophy7.getTrophyDetails();

        Trophy trophy8 = new Trophy(8, "Federation Cup", "Athletics", true, "National Athletics", "100m Sprint", 
                                  "Gold Medal", 5, 12, 1990, true, "AFI", 
                                  "Runner Design", false, 20000, "Bengaluru", "Srushti G M", 
                                  false, 1, 80000.0, "Athletics", "National");
        trophy8.getTrophyDetails();

        Trophy trophy9 = new Trophy(9, "Harilela Trophy", "Tennis", false, "Davis Cup Asia", "Davis Cup Playoff", 
                                  "Silver Plate", 14, 20, 1980, true, "AITA", 
                                  "Net Design", false, 35000, "Mumbai", "India Davis Cup", 
                                  true, 1, 180000.0, "Tennis", "International");
        trophy9.getTrophyDetails();

        Trophy trophy10 = new Trophy(10, "Beighton Cup", "Hockey", true, "Club Hockey", "Premier Division", 
                                   "Gold Shield", 22, 30, 1896, true, "Bengal Hockey", 
                                   "Polo Design", false, 45000, "Kolkata", "Mohun Bagan", 
                                   true, 1, 220000.0, "Hockey", "Club");
        trophy10.getTrophyDetails();
    }
}
