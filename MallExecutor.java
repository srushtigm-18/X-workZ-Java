class MallExecutor {
    public static void main(String[] args) {
        Mall mall1 = new Mall();
        mall1.mallId = 1; mall1.mallName = "Phoenix Marketcity"; mall1.city = "Bengaluru"; mall1.address = "Whitefield";
        Shop s1 = new Shop(); s1.shopNumber = 101; s1.shopName = "Reliance Trends"; s1.category = "Apparel"; s1.floorNumber = 1; s1.rent = 15.5;
        mall1.shop = s1; mall1.getMallDetails();

        Mall mall2 = new Mall();
        mall2.mallId = 2; mall2.mallName = "Orion Mall"; mall2.city = "Bengaluru"; mall2.address = "Rajajinagar";
        Shop s2 = new Shop(); s2.shopNumber = 202; s2.shopName = "Big Bazaar"; s2.category = "Hypermarket"; s2.floorNumber = 2; s2.rent = 22.0;
        mall2.shop = s2; mall2.getMallDetails();

        Mall mall3 = new Mall();
        mall3.mallId = 3; mall3.mallName = "Mantri Square"; mall3.city = "Bengaluru"; mall3.address = "Malleshwaram";
        Shop s3 = new Shop(); s3.shopNumber = 303; s3.shopName = "Samsung Store"; s3.category = "Electronics"; s3.floorNumber = 3; s3.rent = 18.2;
        mall3.shop = s3; mall3.getMallDetails();

        Mall mall4 = new Mall();
        mall4.mallId = 4; mall4.mallName = "Forum Mall"; mall4.city = "Bengaluru"; mall4.address = "Koramangala";
        Shop s4 = new Shop(); s4.shopNumber = 404; s4.shopName = "Nike"; s4.category = "Sports"; s4.floorNumber = 4; s4.rent = 12.8;
        mall4.shop = s4; mall4.getMallDetails();

        Mall mall5 = new Mall();
        mall5.mallId = 5; mall5.mallName = "UB City"; mall5.city = "Bengaluru"; mall5.address = "MG Road";
        Shop s5 = new Shop(); s5.shopNumber = 505; s5.shopName = "Apple Store"; s5.category = "Electronics"; s5.floorNumber = 5; s5.rent = 25.0;
        mall5.shop = s5; mall5.getMallDetails();

        Mall mall6 = new Mall();
        mall6.mallId = 6; mall6.mallName = "Garuda Mall"; mall6.city = "Bengaluru"; mall6.address = "Mag Rath";
        Shop s6 = new Shop(); s6.shopNumber = 606; s6.shopName = "Lakme Salon"; s6.category = "Beauty"; s6.floorNumber = 6; s6.rent = 14.5;
        mall6.shop = s6; mall6.getMallDetails();

        Mall mall7 = new Mall();
        mall7.mallId = 7; mall7.mallName = "Soul Space Arena"; mall7.city = "Bengaluru"; mall7.address = "Kengeri";
        Shop s7 = new Shop(); s7.shopNumber = 707; s7.shopName = "Decathlon"; s7.category = "Sports"; s7.floorNumber = 1; s7.rent = 20.1;
        mall7.shop = s7; mall7.getMallDetails();

        Mall mall8 = new Mall();
        mall8.mallId = 8; mall8.mallName = "VR Bengaluru"; mall8.city = "Bengaluru"; mall8.address = "Bannerghatta Road";
        Shop s8 = new Shop(); s8.shopNumber = 808; s8.shopName = " Zara"; s8.category = "Fashion"; s8.floorNumber = 2; s8.rent = 19.8;
        mall8.shop = s8; mall8.getMallDetails();

        Mall mall9 = new Mall();
        mall9.mallId = 9; mall9.mallName = "Royal Meenakshi Mall"; mall9.city = "Bengaluru"; mall9.address = "Bannerghatta";
        Shop s9 = new Shop(); s9.shopNumber = 909; s9.shopName = "Croma"; s9.category = "Electronics"; s9.floorNumber = 3; s9.rent = 16.7;
        mall9.shop = s9; mall9.getMallDetails();

        Mall mall10 = new Mall();
        mall10.mallId = 10; mall10.mallName = "Elements Mall"; mall10.city = "Bengaluru"; mall10.address = "Thalaghattapura";
        Shop s10 = new Shop(); s10.shopNumber = 1010; s10.shopName = "FabIndia"; s10.category = "Ethnic Wear"; s10.floorNumber = 4; s10.rent = 13.2;
        mall10.shop = s10; mall10.getMallDetails();

        Mall mall11 = new Mall();
        mall11.mallId = 11; mall11.mallName = "Phoenix Marketcity"; mall11.city = "Pune"; mall11.address = "Viman Nagar";
        Shop s11 = new Shop(); s11.shopNumber = 111; s11.shopName = "Westside"; s11.category = "Apparel"; s11.floorNumber = 1; s11.rent = 17.5;
        mall11.shop = s11; mall11.getMallDetails();

        Mall mall12 = new Mall();
        mall12.mallId = 12; mall12.mallName = "Inorbit Mall"; mall12.city = "Mumbai"; mall12.address = "Malad";
        Shop s12 = new Shop(); s12.shopNumber = 1212; s12.shopName = "Home Centre"; s12.category = "Home Decor"; s12.floorNumber = 2; s12.rent = 21.3;
        mall12.shop = s12; mall12.getMallDetails();

        Mall mall13 = new Mall();
        mall13.mallId = 13; mall13.mallName = "Express Avenue"; mall13.city = "Chennai"; mall13.address = "Royapettah";
        Shop s13 = new Shop(); s13.shopNumber = 1313; s13.shopName = "Life Style"; s13.category = "Fashion"; s13.floorNumber = 3; s13.rent = 15.9;
        mall13.shop = s13; mall13.getMallDetails();

        Mall mall14 = new Mall();
        mall14.mallId = 14; mall14.mallName = "VR Chennai"; mall14.city = "Chennai"; mall14.address = "Anna Nagar";
        Shop s14 = new Shop(); s14.shopNumber = 1414; s14.shopName = "Vijay Sales"; s14.category = "Electronics"; s14.floorNumber = 4; s14.rent = 18.6;
        mall14.shop = s14; mall14.getMallDetails();

        Mall mall15 = new Mall();
        mall15.mallId = 15; mall15.mallName = "South City Mall"; mall15.city = "Kolkata"; mall15.address = "Prince Anwar Shah Road";
        Shop s15 = new Shop(); s15.shopNumber = 1515; s15.shopName = "Pantaloons"; s15.category = "Apparel"; s15.floorNumber = 1; s15.rent = 14.2;
        mall15.shop = s15; mall15.getMallDetails();

        Mall mall16 = new Mall();
        mall16.mallId = 16; mall16.mallName = "DLF Promenade"; mall16.city = "Delhi"; mall16.address = "Vasant Kunj";
        Shop s16 = new Shop(); s16.shopNumber = 1616; s16.shopName = "H&M"; s16.category = "Fashion"; s16.floorNumber = 2; s16.rent = 23.4;
        mall16.shop = s16; mall16.getMallDetails();

        Mall mall17 = new Mall();
        mall17.mallId = 17; mall17.mallName = "Elante Mall"; mall17.city = "Chandigarh"; mall17.address = "Industrial Area";
        Shop s17 = new Shop(); s17.shopNumber = 1717; s17.shopName = "Reliance Digital"; s17.category = "Electronics"; s17.floorNumber = 3; s17.rent = 19.1;
        mall17.shop = s17; mall17.getMallDetails();

        Mall mall18 = new Mall();
        mall18.mallId = 18; mall18.mallName = "World Trade Park"; mall18.city = "Jaipur"; mall18.address = "Malviya Nagar";
        Shop s18 = new Shop(); s18.shopNumber = 1818; s18.shopName = "Max Fashion"; s18.category = "Apparel"; s18.floorNumber = 4; s18.rent = 12.9;
        mall18.shop = s18; mall18.getMallDetails();

        Mall mall19 = new Mall();
        mall19.mallId = 19; mall19.mallName = "Amanora Mall"; mall19.city = "Pune"; mall19.address = "Hadapsar";
        Shop s19 = new Shop(); s19.shopNumber = 1919; s19.shopName = "Adidas"; s19.category = "Sports"; s19.floorNumber = 5; s19.rent = 16.8;
        mall19.shop = s19; mall19.getMallDetails();

        Mall mall20 = new Mall();
        mall20.mallId = 20; mall20.mallName = "PVR Logix City"; mall20.city = "Noida"; mall20.address = "Sector 18";
        Shop s20 = new Shop(); s20.shopNumber = 2020; s20.shopName = "Manyavar"; s20.category = "Ethnic Wear"; s20.floorNumber = 6; s20.rent = 11.7;
        mall20.shop = s20; mall20.getMallDetails();
    }
}
