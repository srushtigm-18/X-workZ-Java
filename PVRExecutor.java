class PVRExecutor{
    public static void main(String[] args){
        PVR pvr1 = new PVR(1, "PVR Forum Mall", "Multiplex", false, "Whitefield", "Premium", 
                          "Dolby 7.1", 350, 10, 1200, 24, true, "PVR INOX", 
                          "2K Digital", true, 9, "Bengaluru", "Food Court", true, 85, 280.0, "Hollywood");
        pvr1.getPVRDetails();

        PVR pvr2 = new PVR(2, "PVR IMAX Gold", "IMAX", true, "Forum Shantiniketan", "Luxury Gold", 
                          "IMAX Sound", 1200, 1, 450, 12, true, "PVR INOX", 
                          "IMAX Laser", true, 10, "Bengaluru", "VIP Lounge", true, 92, 850.0, "Blockbuster");
        pvr2.getPVRDetails();

        PVR pvr3 = new PVR(3, "PVR VR Bengaluru", "VR Experience", false, "Malleshwaram", "Recliner", 
                          "Dolby Atmos", 450, 8, 900, 20, true, "PVR INOX", 
                          "4DX Motion", true, 8, "Bengaluru", "Gaming Zone", false, 78, 350.0, "Regional");
        pvr3.getPVRDetails();

        PVR pvr4 = new PVR(4, "PVR Orion Mall", "Multiplex", true, "Rajajinagar", "Plush Recliner", 
                          "Dolby Atmos", 400, 12, 1500, 28, true, "PVR INOX", 
                          "Laser Projection", true, 9, "Bengaluru", "IMAX Lounge", true, 88, 320.0, "Bollywood");
        pvr4.getPVRDetails();

        PVR pvr5 = new PVR(5, "PVR Phoenix Marketcity", "Premium", false, "Whitefield", "Luxury", 
                          "Dolby 7.1", 500, 14, 1800, 30, true, "PVR INOX", 
                          "3D Digital", true, 9, "Bengaluru", "Fine Dining", true, 90, 420.0, "Hollywood");
        pvr5.getPVRDetails();

        PVR pvr6 = new PVR(6, "PVR Imax NGEN", "IMAX", true, "Koramangala", "Gold Class", 
                          "IMAX 12 Channel", 1500, 2, 600, 16, true, "PVR INOX", 
                          "Dual Laser", true, 10, "Bengaluru", "Private Screening", true, 95, 1100.0, "Action");
        pvr6.getPVRDetails();

        PVR pvr7 = new PVR(7, "PVR Garuda Mall", "Multiplex", false, "Magadi Road", "Standard", 
                          "5.1 Surround", 250, 6, 700, 18, false, "PVR INOX", 
                          "2K Projection", false, 7, "Bengaluru", "Food Court", false, 70, 220.0, "Family");
        pvr7.getPVRDetails();

        PVR pvr8 = new PVR(8, "PVR Nexus Mall", "4DX", false, "Rajajinagar", "Motion Seats", 
                          "4DX Effects", 600, 5, 500, 22, true, "PVR INOX", 
                          "4DX Motion", true, 8, "Bengaluru", "Arcade Games", false, 82, 480.0, "Thriller");
        pvr8.getPVRDetails();

        PVR pvr9 = new PVR(9, "PVR Royale", "Luxury", false, "Indiranagar", "Recliner Gold", 
                          "Dolby Atmos", 800, 4, 300, 15, true, "PVR INOX", 
                          "Premium Digital", true, 10, "Bengaluru", "Butler Service", true, 96, 650.0, "Premium");
        pvr9.getPVRDetails();

        PVR pvr10 = new PVR(10, "PVR UB City", "Ultra Premium", true, "MG Road", "Director's Suite", 
                           "Auro 3D", 2000, 3, 250, 12, true, "PVR INOX", 
                           "4K Laser", true, 10, "Bengaluru", "Private Theater", true, 98, 1500.0, "Blockbuster");
        pvr10.getPVRDetails();
    }
}
