class MuseumExecutor {
    public static void main(String[] args) {
        Diamond d1 = new Diamond(101, "Hope Diamond", 45.52, "Deep Blue", 250.0);
        Museum m1 = new Museum("Smithsonian NMNH", 1, "Washington DC", "Jeffrey Post", d1);
        m1.getMuseumDetails();

        Diamond d2 = new Diamond(102, "Cullinan I", 530.4, "Colorless", 400.0);
        Museum m2 = new Museum("Tower of London", 2, "London", "Keeper of the Jewel House", d2);
        m2.getMuseumDetails();

        Diamond d3 = new Diamond(103, "Lesotho Legend", 910, "Colorless", 40.0);
        Museum m3 = new Museum("Diamant Museum", 3, "Amsterdam", "Laura Soepboer", d3);
        m3.getMuseumDetails();

        Diamond d4 = new Diamond(104, "Pink Star", 59.6, "Vivid Pink", 71.2);
        Museum m4 = new Museum("Almine Rech Gallery", 4, "Paris", "Alexia Fabre", d4);
        m4.getMuseumDetails();

        Diamond d5 = new Diamond(105, "Orlov Diamond", 189.62, "Colorless", 200.0);
        Museum m5 = new Museum("Fersman Mineralogical", 5, "Moscow", "Anna Pustovoitova", d5);
        m5.getMuseumDetails();

        Diamond d6 = new Diamond(106, "Spoonmaker's Diamond", 86, "Colorless", 75.0);
        Museum m6 = new Museum("Topkapi Palace Museum", 6, "Istanbul", "Derya Algül", d6);
        m6.getMuseumDetails();

        Diamond d7 = new Diamond(107, "Great Imperial Crown Diamond", 41.35, "Colorless", 120.0);
        Museum m7 = new Museum("Kremlin Armoury", 7, "Moscow", "Irina Smirnova", d7);
        m7.getMuseumDetails();

        Diamond d8 = new Diamond(108, "Blue Hope Pendant", 33.95, "Fancy Blue", 35.0);
        Museum m8 = new Museum("Royal Ontario Museum", 8, "Toronto", "Lisa Sirianni", d8);
        m8.getMuseumDetails();

        Diamond d9 = new Diamond(109, "Lesedi La Rona", 1111, "Light Pink", 53.0);
        Museum m9 = new Museum("Cape Town Diamond", 9, "Cape Town", "Naomi Smith", d9);
        m9.getMuseumDetails();

        Diamond d10 = new Diamond(110, "Sancy Diamond", 55.23, "Colorless", 80.0);
        Museum m10 = new Museum("Natural History Museum", 10, "Vienna", "Christian Weindl", d10);
        m10.getMuseumDetails();

        Diamond d11 = new Diamond(111, "Regent Diamond", 140.64, "Colorless", 150.0);
        Museum m11 = new Museum("Louvre Museum", 11, "Paris", "Marie-Laure Gutton", d11);
        m11.getMuseumDetails();

        Diamond d12 = new Diamond(112, "Koh-i-Noor Replica", 105.6, "Colorless", 300.0);
        Museum m12 = new Museum("British Museum", 12, "London", "Sarah Faulks", d12);
        m12.getMuseumDetails();

        Diamond d13 = new Diamond(113, "Winston Legacy Pink", 18.18, "Vivid Pink", 50.0);
        Museum m13 = new Museum("Diamond Foundry Exhibit", 13, "New York", "Megan Rapinoe", d13);
        m13.getMuseumDetails();

        Diamond d14 = new Diamond(114, "Graff Venus", 118.78, "Colorless", 60.0);
        Museum m14 = new Museum("GIA Museum", 14, "Carlsbad", "Peter Carl Fabergé", d14);
        m14.getMuseumDetails();

        Diamond d15 = new Diamond(115, "Darya-i-Noor Replica", 186, "Pale Pink", 350.0);
        Museum m15 = new Museum("National Museum Delhi", 15, "New Delhi", "Arundhati Nag", d15);
        m15.getMuseumDetails();

        Diamond d16 = new Diamond(116, "Winston Blue Teal", 12.5, "Deep Teal", 28.0);
        Museum m16 = new Museum("Hershey Museum", 16, "Hershey PA", "Harry Winston Jr", d16);
        m16.getMuseumDetails();

        Diamond d17 = new Diamond(117, "Golden Jubilee", 545.67, "Golden Yellow", 45.0);
        Museum m17 = new Museum("Brunei Royal Museum", 17, "Bandar Seri Begawan", "Pengiran Anak", d17);
        m17.getMuseumDetails();

        Diamond d18 = new Diamond(118, "Grimaldi Peach", 22.4, "Soft Peach", 32.0);
        Museum m18 = new Museum("Monaco Royal Palace", 18, "Monaco", "Princess Caroline", d18);
        m18.getMuseumDetails();

        Diamond d19 = new Diamond(119, "Lesotho Promise", 910, "Colorless", 53.0);
        Museum m19 = new Museum("Qatar Islamic Museum", 19, "Doha", "Sheikha Al Mayassa", d19);
        m19.getMuseumDetails();

        Diamond d20 = new Diamond(120, "Winston Legacy Sapphire", 101.73, "Cornflower Blue", 150.0);
        Museum m20 = new Museum("Harry Winston Gallery", 20, "Washington DC", "Ronald Winston", d20);
        m20.getMuseumDetails();
    }
}
