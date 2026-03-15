class OrganizerExecutor{
    public static void main(String[] args){
        Organizer org1 = new Organizer(1, "Mesh Desktop Organizer", "Multi-Compartment", false, "Steel Mesh", 
                                     12, true, "Black", 16, 13, 10, 
                                     "Office Depot", false, "Pen Storage", 1200.0, 
                                     "Cardiology Admin", false, 50, false, 
                                     "Powder Coat", "Narayana Health", "Durable");
        org1.getOrganizerDetails();

        Organizer org2 = new Organizer(2, "Rotary Organizer", "Rotating", true, "Plastic", 
                                     9, true, "Silver", 5, 8, 8, 
                                     "Officemate", false, "Quick Access", 800.0, 
                                     "Neurology Office", false, 30, true, 
                                     "Gloss Finish", "NIMHANS", "Premium");
        org2.getOrganizerDetails();

        Organizer org3 = new Organizer(3, "Bamboo File Sorter", "Document", false, "Bamboo", 
                                     5, true, "Natural", 8, 8, 6, 
                                     "Srushti Organizers", true, "File Management", 1500.0, 
                                     "Admin Director", true, 40, false, 
                                     "Matte Finish", "Narayana Health", "Eco-Friendly");
        org3.getOrganizerDetails();

        Organizer org4 = new Organizer(4, "Acrylic Pen Holder", "Single", false, "Acrylic", 
                                     6, true, "Clear", 10, 6, 6, 
                                     "Simplehuman", false, "Pen Organization", 600.0, 
                                     "Pharmacy Office", false, 20, false, 
                                     "Polished", "Apollo Hospital", "Modern");
        org4.getOrganizerDetails();

        Organizer org5 = new Organizer(5, "Wooden Desk Tray", "Letter Tray", false, "Walnut Wood", 
                                     3, true, "Brown", 4, 12, 9, 
                                     "IKEA", true, "Paper Storage", 900.0, 
                                     "HR Department", true, 100, false, 
                                     "Natural Finish", "Manipal Hospital", "Classic");
        org5.getOrganizerDetails();

        Organizer org6 = new Organizer(6, "Metal File Organizer", "Vertical", false, "Steel", 
                                     8, true, "Grey", 12, 10, 8, 
                                     "Fellowes", true, "File Folders", 1100.0, 
                                     "Finance Office", false, 60, false, 
                                     "Matte Black", "Fortis Hospital", "Professional");
        org6.getOrganizerDetails();

        Organizer org7 = new Organizer(7, "Monitor Stand Organizer", "Multi-Use", false, "Bamboo", 
                                     4, true, "Natural", 6, 16, 12, 
                                     "Srushti Designs", false, "Cable Management", 1800.0, 
                                     "IT Support", true, 30, true, 
                                     "Oiled Finish", "Sakra Hospital", "Ergonomic");
        org7.getOrganizerDetails();

        Organizer org8 = new Organizer(8, "Drawer Organizer Set", "Modular", true, "Plastic", 
                                     15, true, "White", 3, 15, 10, 
                                     "Container Store", true, "Small Items", 700.0, 
                                     "Billing Center", true, 80, true, 
                                     "Smooth Plastic", "Columbia Asia", "Versatile");
        org8.getOrganizerDetails();

        Organizer org9 = new Organizer(9, "Wall Mounted Organizer", "Wall", false, "Metal", 
                                     7, true, "Bronze", 18, 14, 5, 
                                     "Urban Outfitters", false, "Note Storage", 1400.0, 
                                     "Quality Control", false, 40, false, 
                                     "Brushed Metal", "Aster CMI", "Space Saving");
        org9.getOrganizerDetails();

        Organizer org10 = new Organizer(10, "Executive Desktop Set", "Premium", false, "Leather Wood", 
                                      10, true, "Black Brown", 8, 18, 12, 
                                      "Srushti Executive", false, "CEO Organization", 3500.0, 
                                      "CEO Suite", false, 70, true, 
                                      "Leather Finish", "Narayana Health", "Luxury");
        org10.getOrganizerDetails();
    }
}
