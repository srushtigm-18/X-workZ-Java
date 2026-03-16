class MuseumExecutor {
    public static void main(String[] args) {
        Museum m1 = new Museum();
        m1.museumId = 1; m1.museumName = "Smithsonian NMNH"; m1.city = "Washington DC"; m1.curator = "Jeffrey Post";
        Diamond d1 = new Diamond(); d1.diamondId = 101; d1.name = "Hope Diamond"; d1.carat = 45.52; d1.color = "Deep Blue"; d1.value = 250.0;
        m1.diamond = d1; m1.getMuseumDetails();

        Museum m2 = new Museum();
        m2.museumId = 2; m2.museumName = "Tower of London"; m2.city = "London"; m2.curator = "Keeper of the Jewel House";
        Diamond d2 = new Diamond(); d2.diamondId = 102; d2.name = "Cullinan I"; d2.carat = 530.4; d2.color = "Colorless"; d2.value = 400.0;
        m2.diamond = d2; m2.getMuseumDetails();

        Museum m3 = new Museum();
        m3.museumId = 3; m3.museumName = "Diamant Museum"; m3.city = "Amsterdam"; m3.curator = "Laura Soepboer";
        Diamond d3 = new Diamond(); d3.diamondId = 103; d3.name = "Lesotho Legend"; d3.carat = 910; d3.color = "Colorless"; d3.value = 40.0;
        m3.diamond = d3; m3.getMuseumDetails();

        Museum m4 = new Museum();
        m4.museumId = 4; m4.museumName = "Almine Rech Gallery"; m4.city = "Paris"; m4.curator = "Alexia Fabre";
        Diamond d4 = new Diamond(); d4.diamondId = 104; d4.name = "Pink Star"; d4.carat = 59.6; d4.color = "Vivid Pink"; d4.value = 71.2;
        m4.diamond = d4; m4.getMuseumDetails();

        Museum m5 = new Museum();
        m5.museumId = 5; m5.museumName = "Fersman Mineralogical"; m5.city = "Moscow"; m5.curator = "Anna Pustovoitova";
        Diamond d5 = new Diamond(); d5.diamondId = 105; d5.name = "Orlov Diamond"; d5.carat = 189.62; d5.color = "Colorless"; d5.value = 200.0;
        m5.diamond = d5; m5.getMuseumDetails();

        Museum m6 = new Museum();
        m6.museumId = 6; m6.museumName = "Topkapi Palace Museum"; m6.city = "Istanbul"; m6.curator = "Derya Algül";
        Diamond d6 = new Diamond(); d6.diamondId = 106; d6.name = "Spoonmaker's Diamond"; d6.carat = 86; d6.color = "Colorless"; d6.value = 75.0;
        m6.diamond = d6; m6.getMuseumDetails();

        Museum m7 = new Museum();
        m7.museumId = 7; m7.museumName = "Kremlin Armoury"; m7.city = "Moscow"; m7.curator = "Irina Smirnova";
        Diamond d7 = new Diamond(); d7.diamondId = 107; d7.name = "Great Imperial Crown Diamond"; d7.carat = 41.35; d7.color = "Colorless"; d7.value = 120.0;
        m7.diamond = d7; m7.getMuseumDetails();

        Museum m8 = new Museum();
        m8.museumId = 8; m8.museumName = "Royal Ontario Museum"; m8.city = "Toronto"; m8.curator = "Lisa Sirianni";
        Diamond d8 = new Diamond(); d8.diamondId = 108; d8.name = "Blue Hope Pendant"; d8.carat = 33.95; d8.color = "Fancy Blue"; d8.value = 35.0;
        m8.diamond = d8; m8.getMuseumDetails();

        Museum m9 = new Museum();
        m9.museumId = 9; m9.museumName = "Cape Town Diamond"; m9.city = "Cape Town"; m9.curator = "Naomi Smith";
        Diamond d9 = new Diamond(); d9.diamondId = 109; d9.name = "Lesedi La Rona"; d9.carat = 1111; d9.color = "Light Pink"; d9.value = 53.0;
        m9.diamond = d9; m9.getMuseumDetails();

        Museum m10 = new Museum();
        m10.museumId = 10; m10.museumName = "Natural History Museum"; m10.city = "Vienna"; m10.curator = "Christian Weindl";
        Diamond d10 = new Diamond(); d10.diamondId = 110; d10.name = "Sancy Diamond"; d10.carat = 55.23; d10.color = "Colorless"; d10.value = 80.0;
        m10.diamond = d10; m10.getMuseumDetails();

        Museum m11 = new Museum();
        m11.museumId = 11; m11.museumName = "Louvre Museum"; m11.city = "Paris"; m11.curator = "Marie-Laure Gutton";
        Diamond d11 = new Diamond(); d11.diamondId = 111; d11.name = "Regent Diamond"; d11.carat = 140.64; d11.color = "Colorless"; d11.value = 150.0;
        m11.diamond = d11; m11.getMuseumDetails();

        Museum m12 = new Museum();
        m12.museumId = 12; m12.museumName = "British Museum"; m12.city = "London"; m12.curator = "Sarah Faulks";
        Diamond d12 = new Diamond(); d12.diamondId = 112; d12.name = "Koh-i-Noor Replica"; d12.carat = 105.6; d12.color = "Colorless"; d12.value = 300.0;
        m12.diamond = d12; m12.getMuseumDetails();

        Museum m13 = new Museum();
        m13.museumId = 13; m13.museumName = "Diamond Foundry Exhibit"; m13.city = "New York"; m13.curator = "Megan Rapinoe";
        Diamond d13 = new Diamond(); d13.diamondId = 113; d13.name = "Winston Legacy Pink"; d13.carat = 18.18; d13.color = "Vivid Pink"; d13.value = 50.0;
        m13.diamond = d13; m13.getMuseumDetails();

        Museum m14 = new Museum();
        m14.museumId = 14; m14.museumName = "GIA Museum"; m14.city = "Carlsbad"; m14.curator = "Peter Carl Fabergé";
        Diamond d14 = new Diamond(); d14.diamondId = 114; d14.name = "Graff Venus"; d14.carat = 118.78; d14.color = "Colorless"; d14.value = 60.0;
        m14.diamond = d14; m14.getMuseumDetails();

        Museum m15 = new Museum();
        m15.museumId = 15; m15.museumName = "National Museum Delhi"; m15.city = "New Delhi"; m15.curator = "Arundhati Nag";
        Diamond d15 = new Diamond(); d15.diamondId = 115; d15.name = "Darya-i-Noor Replica"; d15.carat = 186; d15.color = "Pale Pink"; d15.value = 350.0;
        m15.diamond = d15; m15.getMuseumDetails();

        Museum m16 = new Museum();
        m16.museumId = 16; m16.museumName = "Hershey Museum"; m16.city = "Hershey PA"; m16.curator = "Harry Winston Jr";
        Diamond d16 = new Diamond(); d16.diamondId = 116; d16.name = "Winston Blue Teal"; d16.carat = 12.5; d16.color = "Deep Teal"; d16.value = 28.0;
        m16.diamond = d16; m16.getMuseumDetails();

        Museum m17 = new Museum();
        m17.museumId = 17; m17.museumName = "Brunei Royal Museum"; m17.city = "Bandar Seri Begawan"; m17.curator = "Pengiran Anak";
        Diamond d17 = new Diamond(); d17.diamondId = 117; d17.name = "Golden Jubilee"; d17.carat = 545.67; d17.color = "Golden Yellow"; d17.value = 45.0;
        m17.diamond = d17; m17.getMuseumDetails();

        Museum m18 = new Museum();
        m18.museumId = 18; m18.museumName = "Monaco Royal Palace"; m18.city = "Monaco"; m18.curator = "Princess Caroline";
        Diamond d18 = new Diamond(); d18.diamondId = 118; d18.name = "Grimaldi Peach"; d18.carat = 22.4; d18.color = "Soft Peach"; d18.value = 32.0;
        m18.diamond = d18; m18.getMuseumDetails();

        Museum m19 = new Museum();
        m19.museumId = 19; m19.museumName = "Qatar Islamic Museum"; m19.city = "Doha"; m19.curator = "Sheikha Al Mayassa";
        Diamond d19 = new Diamond(); d19.diamondId = 119; d19.name = "Lesotho Promise"; d19.carat = 910; d19.color = "Colorless"; d19.value = 53.0;
        m19.diamond = d19; m19.getMuseumDetails();

        Museum m20 = new Museum();
        m20.museumId = 20; m20.museumName = "Harry Winston Gallery"; m20.city = "Washington DC"; m20.curator = "Ronald Winston";
        Diamond d20 = new Diamond(); d20.diamondId = 120; d20.name = "Winston Legacy Sapphire"; d20.carat = 101.73; d20.color = "Cornflower Blue"; d20.value = 150.0;
        m20.diamond = d20; m20.getMuseumDetails();
    }
}
