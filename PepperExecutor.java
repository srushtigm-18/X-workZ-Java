class PepperExecutor{
    public static void main(String[] args){
        String[] var1 = {"Panniyur-1", "Karimunda"};
        String[] var2 = {"Tellicherry", "Malabar"};
        String[] var3 = {"Lampong", "Sreekara"};
        String[] var4 = {"Subhakara", "Panniyur-5"};
        String[] var5 = {"Vakkoli", "Kuthirakodi"};
        String[] var6 = {"Kalluvally", "Vadakkan"};
        String[] var7 = {"Thodi", "Perumkodi"};
        String[] var8 = {"Cheenarathu", "Menichoornal"};
        String[] var9 = {"Kallu", "Pee Pee"};
        String[] var10 = {"Iriver", "Pathiricode"};
        
		
        Pepper pepper1 = new Pepper(1, "Black Pepper", "Black", true, "Kerala", "Whole", 
                                   "100g Pouch", 250, 100, 1, 365, true, "Eastern", 
                                   "Pungent", true, 5, "Organic", "Idukki", true, 4200, 13.0, "Premium", var1);
        pepper1.getPepperDetails();

        Pepper pepper2 = new Pepper(2, "Tellicherry", "Dark Brown", false, "Kerala", "Coarse", 
                                   "500g Jar", 1200, 500, 1, 730, true, "Everest", 
                                   "Citrusy", false, 6, "Conventional", "Wayanad", false, 3500, 12.5, "Export", var2);
        pepper2.getPepperDetails();

        Pepper pepper3 = new Pepper(3, "Sreekara", "Black", true, "Karnataka", "Fine Ground", 
                                   "50g Tin", 180, 50, 1, 180, false, "MDH", 
                                   "Spicy", true, 5, "High Yield", "Coorg", true, 2677, 15.4, "Superior", var3);
        pepper3.getPepperDetails();
	 
        Pepper pepper4 = new Pepper(4, "Subhakara", "Black", true, "Kerala", "Crushed", 
                                   "200g Pack", 450, 200, 1, 400, true, "Sunpure", 
                                   "Bold Spicy", true, 4, "High Yield", "Wayanad", true, 2800, 14.2, "ASTA", var4);
        pepper4.getPepperDetails();

        Pepper pepper5 = new Pepper(5, "Vakkoli", "Dark", false, "Tamil Nadu", "Whole Bold", 
                                   "1kg Bag", 2200, 1000, 1, 900, true, "Aachi", 
                                   "Rich Aroma", false, 7, "Traditional", "Coimbatore", false, 3200, 13.8, "Premium", var5);
        pepper5.getPepperDetails();

        Pepper pepper6 = new Pepper(6, "Kalluvally", "Black", true, "Karnataka", "Ground", 
                                   "250g Jar", 650, 250, 1, 300, false, "MTR", 
                                   "Mild Pungent", true, 5, "Organic Shade", "Kodagu", true, 2400, 12.9, "Organic", var6);
        pepper6.getPepperDetails();

        Pepper pepper7 = new Pepper(7, "Thodi Pepper", "Brown", true, "Kerala", "Coarse", 
                                   "100g Tin", 320, 100, 1, 270, true, "Niali", 
                                   "Fruity Notes", true, 6, "Vine Trained", "Thrissur", true, 3800, 14.8, "Gourmet", var7);
        pepper7.getPepperDetails();

        Pepper pepper8 = new Pepper(8, "Cheenarathu", "Black", false, "Andhra Pradesh", "Fine", 
                                   "500g Pouch", 950, 500, 1, 500, false, "Pioneer", 
                                   "Sharp Hot", false, 5, "Open Field", "Guntur", false, 2000, 11.5, "Industrial", var8);
        pepper8.getPepperDetails();

        Pepper pepper9 = new Pepper(9, "Kallu Pepper", "Matte Black", true, "Kerala", "Whole", 
                                   "50g Premium", 280, 50, 1, 500, true, "Kerala Naturals", 
                                   "Intense Aroma", true, 8, "Biodynamic", "Kasargod", true, 4500, 16.2, "Elite", var9);
        pepper9.getPepperDetails();

        Pepper pepper10 = new Pepper(10, "Iriver Bold", "Jet Black", true, "Tamil Nadu", "Extra Bold", 
                                    "1kg Export", 3500, 1000, 1, 730, true, "Eastern Export", 
                                    "Extra Pungent", true, 7, "Terrace Cultivation", "Nilgiris", true, 4200, 15.1, "Super Bold", var10);
        pepper10.getPepperDetails();
    }
}

