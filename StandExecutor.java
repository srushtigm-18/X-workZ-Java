class StandExecutor{
    public static void main(String[] args){
        int[] partners1 = {1001, 1002};
        int[] partners2 = {2001, 2002};
        int[] partners3 = {3001, 3002};
        int[] partners4 = {4001, 4002};
        int[] partners5 = {5001, 5002};
        int[] partners6 = {6001, 6002};
        int[] partners7 = {7001, 7002};
        int[] partners8 = {8001, 8002};
        int[] partners9 = {9001, 9002};
        int[] partners10 = {10001, 10002};
        
        Stand stand1 = new Stand(1, "TV Wall Mount", "Wall Mount", true, "Steel", "Black", 
                                "Television", 2500, 60, 3, 50, false, "Godrej", 
                                "Powder Coated", true, 80, "Screw Fixed", "Living Room", 
                                false, 0, 9.5, "Modern", partners1);
        stand1.getStandDetails();

        Stand stand2 = new Stand(2, "Laptop Table Stand", "Tabletop", true, "Aluminium", "Silver", 
                                "Laptop", 1200, 30, 1, 5, true, "Nilkamal", 
                                "Anodized", true, 35, "Tool Free", "Bedroom", 
                                true, 0, 8.8, "Minimalist", partners2);
        stand2.getStandDetails();

        Stand stand3 = new Stand(3, "Bookshelf Stand", "Floor Standing", false, "MDF Board", "Walnut", 
                                "Books Display", 4500, 180, 25, 80, false, "Urban Ladder", 
                                "Laminated", false, 90, "Allen Key", "Study Room", 
                                false, 5, 9.2, "Contemporary", partners3);
        stand3.getStandDetails();

        Stand stand4 = new Stand(4, "Mobile Holder", "Desktop", true, "ABS Plastic", "White", 
                                "Smartphone", 450, 15, 5, 1, true, "Portronics", 
                                "Matte", true, 12, "Snap Fit", "Office Desk", 
                                true, 0, 9.0, "Portable", partners4);
        stand4.getStandDetails();

        Stand stand5 = new Stand(5, "Monitor Arm", "Desk Mount", true, "Aluminium", "Grey", 
                                "Computer Monitor", 3200, 45, 2, 15, false, "Eureka", 
                                "Brush Finish", true, 60, "Clamp Mount", "Workstation", 
                                false, 0, 9.7, "Ergonomic", partners5);
        stand5.getStandDetails();

        Stand stand6 = new Stand(6, "Kitchen Rack", "Wall Mounted", false, "SS 304", "Silver", 
                                "Spices & Utensils", 1800, 120, 8, 25, false, "Kaff", 
                                "Mirror Polish", true, 60, "Wall Screws", "Kitchen", 
                                false, 3, 9.3, "Functional", partners6);
        stand6.getStandDetails();

        Stand stand7 = new Stand(7, "Clothes Drying", "Floor Standing", true, "Steel", "Blue", 
                                "Clothes Drying", 2800, 160, 12, 40, true, "Bajaj", 
                                "Powder Coated", true, 100, "No Tools", "Balcony", 
                                true, 0, 8.9, "Practical", partners7);
        stand7.getStandDetails();

        Stand stand8 = new Stand(8, "Plant Stand", "Tiered", false, "Mild Steel", "Green", 
                                "Indoor Plants", 1500, 90, 6, 20, false, "Home Centre", 
                                "Anti Rust Paint", true, 70, "Bolt Assembly", "Living Room", 
                                false, 4, 9.1, "Rustic", partners8);
        stand8.getStandDetails();

        Stand stand9 = new Stand(9, "Speaker Stand", "Floor", true, "Wood", "Black Oak", 
                                "Bluetooth Speakers", 3800, 75, 15, 10, false, "Zebronics", 
                                "Lacquer Finish", false, 25, "Screw Assembly", "Entertainment Room", 
                                true, 0, 9.4, "Premium Audio", partners9);
        stand9.getStandDetails();

        Stand stand10 = new Stand(10, "Document Stand", "Adjustable", true, "Acrylic", "Clear", 
                                 "Office Documents", 850, 25, 1, 3, true, "Classmate", 
                                 "Polished", true, 35, "Foldable", "Work Desk", 
                                 false, 2, 9.6, "Transparent", partners10);
        stand10.getStandDetails();
    }
}
