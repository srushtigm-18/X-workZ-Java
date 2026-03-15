class PaperExecutor{
    public static void main(String[] args){
        String[] manu1 = {"JK Paper", "BILT"};
        String[] manu2 = {"TNPL", "Ballarpur"};
        String[] manu3 = {"ITC", "Seshasayee"};
		String[] manu4 = {"Nav Bharat", "Sirpur"};
        String[] manu5 = {"AP Paper Mills", "Mysore Paper"};
        String[] manu6 = {"West Coast", "South India Paper"};
        String[] manu7 = {"Tamil Newsprint", "Premier Paper"};
        String[] manu8 = {"Kuantum Papers", "Shree Ajit Pulp"};
        String[] manu9 = {"NR Agarwal", "Narmada Papers"};
        String[] manu10 = {"Ruchira Papers", "Modi Paper"};
        
        
        Paper paper1 = new Paper(1, "A4 Copier", "Copier", false, "Virgin Pulp", "80 GSM", 
                                "Matte", 250, 500, 80, 210, true, "JK Easy Copier", 
                                "High", false, 92, "Chemical Pulp", "Office", false, 92, 0.1, "White", manu1);
        paper1.getPaperDetails();

        Paper paper2 = new Paper(2, "Art Card", "Coated", false, "Wood Free", "250 GSM", 
                                "Glossy", 1200, 250, 250, 0, false, "TNPL", 
                                "Premium", false, 95, "Bleached Kraft", "Printing", true, 95, 0.3, "White", manu2);
        paper2.getPaperDetails();

        Paper paper3 = new Paper(3, "Maplitho", "Writing", true, "Recycled", "70 GSM", 
                                "Uncoated", 200, 500, 70, 210, true, "BILT", 
                                "Standard", false, 88, "Mechanical Pulp", "Notebooks", false, 88, 0.08, "Natural White", manu3);
        paper3.getPaperDetails();
  
        Paper paper4 = new Paper(4, "Gloss Art Paper", "Coated Art", false, "Eucalyptus", "130 GSM", 
                                "High Gloss", 850, 1000, 130, 0, false, "Nav Bharat", 
                                "Super High", false, 96, "Hardwood Pulp", "Magazines", true, 96, 0.18, "Bright White", manu4);
        paper4.getPaperDetails();

        Paper paper5 = new Paper(5, "Bond Paper", "Writing", true, "Bagasse", "100 GSM", 
                                "Matte", 450, 500, 100, 297, true, "AP Paper Mills", 
                                "Office Grade", false, 90, "Bagasse Pulp", "Letterhead", false, 90, 0.12, "Ivory", manu5);
        paper5.getPaperDetails();

        Paper paper6 = new Paper(6, "Newsprint", "Newsprint", true, "Recycled + Softwood", "45 GSM", 
                                "Newsprint", 180, 1000, 45, 0, false, "West Coast", 
                                "Standard", false, 82, "Thermo Mechanical", "Newspapers", false, 82, 0.05, "Off-White", manu6);
        paper6.getPaperDetails();

        Paper paper7 = new Paper(7, "Duplex Board", "Board", false, "Recycled + Virgin", "400 GSM", 
                                "Coated One Side", 3200, 100, 400, 0, false, "Tamil Newsprint", 
                                "Board Grade", true, 85, "Mixed Pulp", "Packaging", true, 85, 0.6, "Grey Back", manu7);
        paper7.getPaperDetails();

        Paper paper8 = new Paper(8, "Tissue Paper", "Tissue", true, "Virgin Softwood", "18 GSM", 
                                "Soft", 120, 5000, 18, 0, true, "Kuantum Papers", 
                                "Tissue Grade", false, 78, "Chemical Softwood", "Wrapping", false, 78, 0.03, "White", manu8);
        paper8.getPaperDetails();

        Paper paper9 = new Paper(9, "Kraft Paper", "Kraft", false, "Pine + Bamboo", "120 GSM", 
                                "Rough", 650, 1000, 120, 0, false, "NR Agarwal", 
                                "Brown Kraft", false, 75, "Unbleached Kraft", "Sacks", false, 75, 0.15, "Brown", manu9);
        paper9.getPaperDetails();

        Paper paper10 = new Paper(10, "Label Paper", "Self-Adhesive", false, "Wood Free", "80 GSM", 
                                 "Glossy Coated", 950, 1000, 80, 0, true, "Ruchira Papers", 
                                 "Label Grade", true, 92, "FBB Pulp", "Labels", true, 92, 0.09, "White", manu10);
        paper10.getPaperDetails();
    }
}
