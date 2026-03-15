class MapExecutor{
    public static void main(String[] args){
        Map map1 = new Map(1, "India Political", "Political", false, "Art Paper", "1:2M", 
                          "Education", 250, 70, 100, 1, true, "Bhuvan", 
                          "Mercator", true, 8, "India", "School", false, 7, 1.4, "Political");
        map1.getMapDetails();

        Map map2 = new Map(2, "Trekking Himalayas", "Topographic", true, "Polypropylene", "1:50K", 
                          "Adventure", 1200, 60, 90, 5, false, "MapMyIndia", 
                          "UTM Grid", true, 10, "Himalayas", "Trekking", true, 9, 1.5, "Topo");
        map2.getMapDetails();

        Map map3 = new Map(3, "Karnataka Road", "Road", false, "Gloss Paper", "1:500K", 
                          "Travel", 180, 50, 70, 1, true, "Eicher", 
                          "Albers", false, 7, "Karnataka", "Tourism", false, 6, 1.4, "Road Network");
        map3.getMapDetails();

        Map map4 = new Map(4, "Bengaluru City", "Street", false, "Matte Paper", "1:20K", 
                          "Navigation", 320, 80, 110, 1, true, "Google Maps", 
                          "Orthographic", true, 9, "Bengaluru", "Local Travel", true, 8, 1.38, "Urban");
        map4.getMapDetails();

        Map map5 = new Map(5, "Western Ghats", "Relief", true, "Synthetic", "1:250K", 
                          "Eco Tourism", 950, 75, 105, 3, false, "NatGeo India", 
                          "Conic", true, 9, "Western Ghats", "Hiking", false, 8, 1.4, "Physical");
        map5.getMapDetails();

        Map map6 = new Map(6, "Railway Network India", "Transport", false, "Coated Paper", "1:4M", 
                          "Planning", 450, 90, 120, 2, true, "Indian Railways", 
                          "Cylindrical", false, 7, "India", "Logistics", false, 6, 1.33, "Infrastructure");
        map6.getMapDetails();

        Map map7 = new Map(7, "Tamil Nadu Tourism", "Tourist", false, "Art Card", "1:800K", 
                          "Vacation", 280, 65, 95, 1, true, "TTDC", 
                          "Azimuthal", true, 6, "Tamil Nadu", "Holiday", true, 7, 1.46, "Tourist Map");
        map7.getMapDetails();

        Map map8 = new Map(8, "Goa Beaches", "Recreational", true, "Laminated Paper", "1:100K", 
                          "Beach Guide", 420, 55, 80, 1, false, "Goa Tourism", 
                          "Transverse Mercator", true, 8, "Goa", "Beach Holiday", true, 7, 1.45, "Leisure");
        map8.getMapDetails();

        Map map9 = new Map(9, "Solar Eclipse 2026", "Thematic", false, "Glossy Paper", "1:10M", 
                          "Astronomy", 650, 85, 115, 1, true, "ISRO", 
                          "Equal Area", false, 9, "India", "Science Event", false, 8, 1.35, "Event Specific");
        map9.getMapDetails();

        Map map10 = new Map(10, "Bengaluru Metro", "Transit", false, "Vinyl", "1:25K", 
                           "Public Transport", 220, 60, 85, 2, true, "BMRCL", 
                           "Lambert", true, 8, "Bengaluru", "Metro Guide", true, 7, 1.42, "Transit Network");
        map10.getMapDetails();
    }
}
