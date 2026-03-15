class DumbBellExecutor{
    public static void main(String[] args){
        DumbBell db1 = new DumbBell(1, "Fixie Pro 10kg", "Fixed", false, "Cast Iron", "Chrome Knurl", 
                                   10, 15, 40, true, "Fixie", "Black", true, 2500, 
                                   "Strength Training", "Gold's Gym Bengaluru", "Srushti G M", 
                                   true, 12, 15.0, "Bicep Curl", "Premium");
        db1.getDumbBellDetails();

        DumbBell db2 = new DumbBell(2, "PowerMax 15kg", "Fixed", false, "Steel", "Rubber Grip", 
                                   15, 17, 42, true, "PowerMax", "Red", true, 3500, 
                                   "Powerlifting", "Anytime Fitness", "Srushti G M", 
                                   true, 10, 20.0, "Shoulder Press", "Heavy Duty");
        db2.getDumbBellDetails();

        DumbBell db3 = new DumbBell(3, "AdjustaFit 5-25kg", "Adjustable", true, "Steel Plates", "Ergo Grip", 
                                   15, 20, 45, false, "AdjustaFit", "Silver", false, 12000, 
                                   "Home Workout", "Srushti Home Gym", "Srushti G M", 
                                   true, 15, 25.0, "Chest Fly", "Versatile");
        db3.getDumbBellDetails();

        DumbBell db4 = new DumbBell(4, "HexaGrip 20kg", "Fixed", false, "Rubber Hex", "Knurled Steel", 
                                   20, 18, 44, true, "HexaGrip", "Grey", true, 4500, 
                                   "CrossFit", "Cult Fitness Koramangala", "Srushti G M", 
                                   true, 8, 30.0, "Deadlift", "Competition");
        db4.getDumbBellDetails();

        DumbBell db5 = new DumbBell(5, "ProCast 5kg", "Fixed", false, "Cast Iron", "Chrome Grip", 
                                   5, 13, 36, false, "ProCast", "Blue", false, 1200, 
                                   "Beginner Training", "Fitness First Indiranagar", "Srushti G M", 
                                   true, 20, 8.0, "Lateral Raise", "Standard");
        db5.getDumbBellDetails();

        DumbBell db6 = new DumbBell(6, "Rubber Octo 25kg", "Fixed", false, "Steel Core", "Contoured", 
                                   25, 20, 48, true, "OctoFit", "Yellow", false, 5500, 
                                   "Olympic Lifting", "Gold's Gym Whitefield", "Srushti G M", 
                                   true, 6, 35.0, "Goblet Squat", "Professional");
        db6.getDumbBellDetails();

        DumbBell db7 = new DumbBell(7, "PowerBlock 3-41kg", "Adjustable", true, "Steel Blocks", "Foam Grip", 
                                   20, 16, 50, false, "PowerBlock", "Orange", false, 25000, 
                                   "Home Powerlifting", "Srushti Home Gym", "Srushti G M", 
                                   true, 10, 40.0, "Bench Press", "Elite");
        db7.getDumbBellDetails();

        DumbBell db8 = new DumbBell(8, "Vinyl Hex 8kg", "Fixed", false, "Steel/Vinyl", "Plastic Grip", 
                                   8, 14, 38, true, "VinylFit", "Pink", true, 1800, 
                                   "Body Toning", "Women's Fitness Rajajinagar", "Srushti G M", 
                                   true, 18, 12.0, "Tricep Extension", "Aesthetic");
        db8.getDumbBellDetails();

        DumbBell db9 = new DumbBell(9, "Competition 30kg", "Fixed", false, "Calibrated Steel", "Knurled Pro", 
                                   30, 19, 46, false, "CompBell", "Chrome", false, 8000, 
                                   "Weightlifting Comp", "National Games Bengaluru", "Srushti G M", 
                                   true, 5, 45.0, "Clean & Press", "Olympic");
        db9.getDumbBellDetails();

        DumbBell db10 = new DumbBell(10, "Selectorized 2-32kg", "Adjustable", true, "Steel Plates", "Ergo Rubber", 
                                    24, 22, 52, true, "SelectaWeight", "Black/Gold", true, 18000, 
                                    "Functional Training", "CrossFit Bengaluru", "Srushti G M", 
                                    true, 12, 32.0, "Renegade Row", "Advanced");
        db10.getDumbBellDetails();
    }
}
