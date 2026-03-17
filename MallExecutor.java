class MallExecutor {
    public static void main(String[] args) {
        Shop s1 = new Shop(101, "Reliance Trends", "Apparel", 1, 15.5);
        Mall mall1 = new Mall("Phoenix Marketcity", 1, "Bengaluru", "Whitefield", s1);
        mall1.getMallDetails();

        Shop s2 = new Shop(202, "Big Bazaar", "Hypermarket", 2, 22.0);
        Mall mall2 = new Mall("Orion Mall", 2, "Bengaluru", "Rajajinagar", s2);
        mall2.getMallDetails();

        Shop s3 = new Shop(303, "Samsung Store", "Electronics", 3, 18.2);
        Mall mall3 = new Mall("Mantri Square", 3, "Bengaluru", "Malleshwaram", s3);
        mall3.getMallDetails();

        Shop s4 = new Shop(404, "Nike", "Sports", 4, 12.8);
        Mall mall4 = new Mall("Forum Mall", 4, "Bengaluru", "Koramangala", s4);
        mall4.getMallDetails();

        Shop s5 = new Shop(505, "Apple Store", "Electronics", 5, 25.0);
        Mall mall5 = new Mall("UB City", 5, "Bengaluru", "MG Road", s5);
        mall5.getMallDetails();

        Shop s6 = new Shop(606, "Lakme Salon", "Beauty", 6, 14.5);
        Mall mall6 = new Mall("Garuda Mall", 6, "Bengaluru", "Mag Rath", s6);
        mall6.getMallDetails();

        Shop s7 = new Shop(707, "Decathlon", "Sports", 1, 20.1);
        Mall mall7 = new Mall("Soul Space Arena", 7, "Bengaluru", "Kengeri", s7);
        mall7.getMallDetails();

        Shop s8 = new Shop(808, "Zara", "Fashion", 2, 19.8);
        Mall mall8 = new Mall("VR Bengaluru", 8, "Bengaluru", "Bannerghatta Road", s8);
        mall8.getMallDetails();

        Shop s9 = new Shop(909, "Croma", "Electronics", 3, 16.7);
        Mall mall9 = new Mall("Royal Meenakshi Mall", 9, "Bengaluru", "Bannerghatta", s9);
        mall9.getMallDetails();

        Shop s10 = new Shop(1010, "FabIndia", "Ethnic Wear", 4, 13.2);
        Mall mall10 = new Mall("Elements Mall", 10, "Bengaluru", "Thalaghattapura", s10);
        mall10.getMallDetails();

        Shop s11 = new Shop(111, "Westside", "Apparel", 1, 17.5);
        Mall mall11 = new Mall("Phoenix Marketcity", 11, "Pune", "Viman Nagar", s11);
        mall11.getMallDetails();

        Shop s12 = new Shop(1212, "Home Centre", "Home Decor", 2, 21.3);
        Mall mall12 = new Mall("Inorbit Mall", 12, "Mumbai", "Malad", s12);
        mall12.getMallDetails();

        Shop s13 = new Shop(1313, "Life Style", "Fashion", 3, 15.9);
        Mall mall13 = new Mall("Express Avenue", 13, "Chennai", "Royapettah", s13);
        mall13.getMallDetails();

        Shop s14 = new Shop(1414, "Vijay Sales", "Electronics", 4, 18.6);
        Mall mall14 = new Mall("VR Chennai", 14, "Chennai", "Anna Nagar", s14);
        mall14.getMallDetails();

        Shop s15 = new Shop(1515, "Pantaloons", "Apparel", 1, 14.2);
        Mall mall15 = new Mall("South City Mall", 15, "Kolkata", "Prince Anwar Shah Road", s15);
        mall15.getMallDetails();

        Shop s16 = new Shop(1616, "H&M", "Fashion", 2, 23.4);
        Mall mall16 = new Mall("DLF Promenade", 16, "Delhi", "Vasant Kunj", s16);
        mall16.getMallDetails();

        Shop s17 = new Shop(1717, "Reliance Digital", "Electronics", 3, 19.1);
        Mall mall17 = new Mall("Elante Mall", 17, "Chandigarh", "Industrial Area", s17);
        mall17.getMallDetails();

        Shop s18 = new Shop(1818, "Max Fashion", "Apparel", 4, 12.9);
        Mall mall18 = new Mall("World Trade Park", 18, "Jaipur", "Malviya Nagar", s18);
        mall18.getMallDetails();

        Shop s19 = new Shop(1919, "Adidas", "Sports", 5, 16.8);
        Mall mall19 = new Mall("Amanora Mall", 19, "Pune", "Hadapsar", s19);
        mall19.getMallDetails();

        Shop s20 = new Shop(2020, "Manyavar", "Ethnic Wear", 6, 11.7);
        Mall mall20 = new Mall("PVR Logix City", 20, "Noida", "Sector 18", s20);
        mall20.getMallDetails();
    }
}
