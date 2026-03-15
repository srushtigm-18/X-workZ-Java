class WallPaperExecutor{
    public static void main(String[] args){
        String[] manu1 = {"Asian Paints", "Nerolac"};
        
        WallPaper wallpaper1 = new WallPaper(101, "Floral Dream", "Pink", true, "Vinyl", "Floral", 
                                            "Matte", 1500, 20, 10, 50, true, "Asian Paints", 
                                            "Smooth", true, 2, "Paste the Paper", "Bedroom", 
                                            false, 100, 4.5, "Modern", manu1);
        wallpaper1.getWallPaperDetails();
		
		String[] manu2 = {"Dulux", "Berger"};
        WallPaper wallpaper2 = new WallPaper(102, "Geometric Blue", "Blue", true, "Non-Woven", "Geometric", 
                                            "Glossy", 2200, 27, 13, 33, true, "Dulux", 
                                            "Textured", true, 3, "Paste the Wall", "Living Room", 
                                            true, 90, 4.8, "Contemporary", manu2);
        wallpaper2.getWallPaperDetails();


        String[] manu3 = {"Jotun", "Kazani"};
        WallPaper wallpaper3 = new WallPaper(103, "Classic Stripe", "Cream", false, "Paper", "Stripe", 
                                            "Satin", 1200, 21, 10, 49, false, "Berger", 
                                            "Embossed", false, 1, "Traditional", "Dining Room", 
                                            false, 105, 4.2, "Traditional", manu3);
        wallpaper3.getWallPaperDetails();

        String[] manu4 = {"Sherwin Williams", "PPG"};
       
        WallPaper wallpaper4 = new WallPaper(104, "Tropical Paradise", "Green", true, "Vinyl", "Palm Leaves", 
                                            "Satin", 1800, 24, 12, 45, true, "Sherwin Williams", 
                                            "Textured", true, 2, "Paste the Paper", "Kitchen", 
                                            true, 110, 4.6, "Tropical", manu4);
        wallpaper4.getWallPaperDetails();

 String[] manu5 = {"Graham Brown", "Sanderson"};
        
        WallPaper wallpaper5 = new WallPaper(105, "Minimalist Grey", "Grey", true, "Non-Woven", "Solid", 
                                            "Matte", 1400, 20, 10, 52, true, "Graham Brown", 
                                            "Smooth", true, 1, "Paste the Wall", "Office", 
                                            false, 105, 4.7, "Modern", manu5);
        wallpaper5.getWallPaperDetails();

 String[] manu6 = {"Scandinavian Designs", "Farrow Ball"};
        
        WallPaper wallpaper6 = new WallPaper(106, "Victorian Floral", "Gold", false, "Silk", "Damask", 
                                            "Glossy", 3200, 28, 14, 33, false, "Farrow Ball", 
                                            "Embossed", false, 4, "Traditional", "Drawing Room", 
                                            false, 95, 4.9, "Luxury", manu6);
        wallpaper6.getWallPaperDetails();

String[] manu7 = {"WallPops", "NuWallpaper"};
      
        WallPaper wallpaper7 = new WallPaper(107, "Peel Stick Dots", "White", true, "Vinyl Peel", "Polka Dot", 
                                            "Matte", 950, 18, 9, 60, true, "WallPops", 
                                            "Smooth", true, 1, "Self-Adhesive", "Nursery", 
                                            true, 85, 4.3, "Playful", manu7);
        wallpaper7.getWallPaperDetails();

  String[] manu8 = {"Brewster", "York"};
        WallPaper wallpaper8 = new WallPaper(108, "Marble Effect", "Black", true, "Vinyl", "Marble", 
                                            "Glossy", 2100, 26, 13, 40, true, "Brewster", 
                                            "Textured", true, 3, "Paste the Paper", "Bathroom", 
                                            false, 105, 4.8, "Elegant", manu8);
        wallpaper8.getWallPaperDetails();

 String[] manu9 = {"Phillip Jeffries", "Cole Son"};
        
        WallPaper wallpaper9 = new WallPaper(109, "Grasscloth Texture", "Beige", true, "Grasscloth", "Texture", 
                                            "Matte", 2800, 30, 15, 30, false, "Phillip Jeffries", 
                                            "Natural", true, 5, "Professional Install", "Living Room", 
                                            false, 90, 4.9, "Luxury", manu9);
        wallpaper9.getWallPaperDetails();

 String[] manu10 = {"Zara Home", "IKEA"};
      
        WallPaper wallpaper10 = new WallPaper(110, "Scandinavian Forest", "Blue", true, "Non-Woven", "Pine Trees", 
                                             "Matte", 1650, 22, 11, 48, true, "IKEA", 
                                             "Smooth", true, 2, "Paste the Wall", "Bedroom", 
                                             true, 100, 4.6, "Nordic", manu10);
        wallpaper10.getWallPaperDetails();
    }
}
