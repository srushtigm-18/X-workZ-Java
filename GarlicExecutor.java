class GarlicExecutor{
    public static void main(String[] args){
        String[] var1 = {"Agrifound White", "Yamuna Safed"};
        String[] var2 = {"G2 Garlic", "Super Shankar"};
        String[] var3 = {"Bhima Purple", "Bhima Omkar"};
        String[] var4 = {"PG Garlic 16", "Hisar Garlic"};
        String[] var5 = {"Bhima Kiran", "Bhatauli"};
        String[] var6 = {"Swat Garlic", "Pusa Garlic"};
        String[] var7 = {"Punjab Garlic 8", "Early Grays"};
        String[] var8 = {"Maharashtra White", "Nashik Hybrid"};
        String[] var9 = {"Rajasthan Red", "Jaisalmer Local"};
        String[] var10 = {"Assam Hill Garlic", "Sikkim Organic"};
        
        Garlic garlic1 = new Garlic(1, "Desi Lahsun", "White Purple", true, "MP", "Desi", 
                                   "Loose 250g", 80, 250, 20, 240, true, "Local", 
                                   "High", false, 6, "Organic", "Indore", false, 45, 65.0, "Grade A", var1);
        garlic1.getGarlicDetails();

        Garlic garlic2 = new Garlic(2, "Kashmir Garlic", "Snow White", false, "J&K", "Hill", 
                                   "500g Net", 220, 500, 12, 270, false, "Kashmir Gold", 
                                   "Mild Rich", true, 5, "High Altitude", "Pulwama", true, 55, 60.0, "Premium", var2);
        garlic2.getGarlicDetails();

        Garlic garlic3 = new Garlic(3, "G2 Export", "Bright White", false, "Gujarat", "Hybrid", 
                                   "1kg Box", 350, 1000, 18, 300, false, "Gujarat Gold", 
                                   "Balanced", false, 7, "Commercial", "Junagadh", true, 50, 62.0, "Super Grade", var3);
        garlic3.getGarlicDetails();
	
        Garlic garlic4 = new Garlic(4, "PG Garlic 16", "White", false, "Punjab", "Variety 16", 
                                   "250g Pack", 120, 250, 22, 210, false, "Punjab Agri", 
                                   "Medium Hot", false, 6, "Rabi Crop", "Patiala", true, 48, 64.0, "Grade A+", var4);
        garlic4.getGarlicDetails();

        Garlic garlic5 = new Garlic(5, "Bhima Kiran", "Purple White", true, "Karnataka", "Bhima Series", 
                                   "500g Mesh", 180, 500, 25, 240, true, "IIHR Bangalore", 
                                   "Strong Pungent", false, 8, "High Yield", "Bengaluru Rural", false, 52, 68.0, "Research", var5);
        garlic5.getGarlicDetails();

        Garlic garlic6 = new Garlic(6, "Swat Garlic", "Pink White", true, "Uttarakhand", "Hill Garlic", 
                                   "200g Premium", 280, 200, 15, 300, true, "Himalayan Gold", 
                                   "Delicate", true, 4, "Organic Terrace", "Pithoragarh", true, 42, 58.0, "Premium Organic", var6);
        garlic6.getGarlicDetails();

        Garlic garlic7 = new Garlic(7, "Punjab Garlic 8", "Creamy White", false, "Punjab", "Variety 8", 
                                   "1kg Carton", 420, 1000, 20, 225, false, "Punjab Hybrid", 
                                   "Balanced Heat", false, 7, "Contract Farming", "Ludhiana", true, 47, 66.0, "Commercial", var7);
        garlic7.getGarlicDetails();

        Garlic garlic8 = new Garlic(8, "Maharashtra White", "Pure White", true, "Maharashtra", "White Hybrid", 
                                   "300g Net Bag", 150, 300, 18, 200, true, "Nashik Fresh", 
                                   "Mild Sweet", false, 5, "Drip Irrigation", "Nashik", false, 46, 62.0, "Table Variety", var8);
        garlic8.getGarlicDetails();

        Garlic garlic9 = new Garlic(9, "Rajasthan Red Garlic", "Red Purple", true, "Rajasthan", "Desi Red", 
                                   "Loose 500g", 95, 500, 28, 180, true, "Jaisalmer Local", 
                                   "Very Hot", false, 9, "Rainfed", "Barmer", false, 40, 70.0, "Local Favorite", var9);
        garlic9.getGarlicDetails();

        Garlic garlic10 = new Garlic(10, "Assam Hill Garlic", "Snow White", true, "Assam", "Hill Organic", 
                                    "100g Gift Pack", 350, 100, 10, 365, true, "Assam Organic", 
                                    "Mild Aromatic", true, 6, "Biodynamic", "Kamrup", true, 38, 55.0, "Gourmet Organic", var10);
        garlic10.getGarlicDetails();
    }
}

