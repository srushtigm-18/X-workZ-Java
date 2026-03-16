class WonderlaExecutor {
    public static void main(String[] args) {
        Wonderla w1 = new Wonderla();
        w1.parkId = 1; w1.parkName = "Wonderla Bengaluru"; w1.city = "Bidadi"; w1.theme = "Adventure";
        LazyPool lp1 = new LazyPool(); lp1.poolId = 101; lp1.poolName = "Lazy River"; lp1.lengthMeters = 450; lp1.capacity = 200; lp1.ticketPrice = 999.0;
        w1.lazyPool = lp1; w1.getParkDetails();

        Wonderla w2 = new Wonderla();
        w2.parkId = 2; w2.parkName = "Wonderla Hyderabad"; w2.city = "Neopolis"; w2.theme = "Thrill";
        LazyPool lp2 = new LazyPool(); lp2.poolId = 202; lp2.poolName = "Lazy River"; lp2.lengthMeters = 420; lp2.capacity = 180; lp2.ticketPrice = 1199.0;
        w2.lazyPool = lp2; w2.getParkDetails();

        Wonderla w3 = new Wonderla();
        w3.parkId = 3; w3.parkName = "Wonderla Kochi"; w3.city = "Kakkanad"; w3.theme = "Family";
        LazyPool lp3 = new LazyPool(); lp3.poolId = 303; lp3.poolName = "Lazy River"; lp3.lengthMeters = 380; lp3.capacity = 160; lp3.ticketPrice = 1099.0;
        w3.lazyPool = lp3; w3.getParkDetails();

        Wonderla w4 = new Wonderla();
        w4.parkId = 4; w4.parkName = "Wonderla Bengaluru North"; w4.city = "Devanahalli"; w4.theme = "Water Park";
        LazyPool lp4 = new LazyPool(); lp4.poolId = 404; lp4.poolName = "Lazy River"; lp4.lengthMeters = 500; lp4.capacity = 220; lp4.ticketPrice = 1299.0;
        w4.lazyPool = lp4; w4.getParkDetails();

        Wonderla w5 = new Wonderla();
        w5.parkId = 5; w5.parkName = "Wonderla Hyderabad East"; w5.city = "Patancheru"; w5.theme = "Extreme";
        LazyPool lp5 = new LazyPool(); lp5.poolId = 505; lp5.poolName = "Lazy River"; lp5.lengthMeters = 460; lp5.capacity = 190; lp5.ticketPrice = 1399.0;
        w5.lazyPool = lp5; w5.getParkDetails();

        Wonderla w6 = new Wonderla();
        w6.parkId = 6; w6.parkName = "Wonderla Kochi South"; w6.city = "Aluva"; w6.theme = "Relaxation";
        LazyPool lp6 = new LazyPool(); lp6.poolId = 606; lp6.poolName = "Lazy River"; lp6.lengthMeters = 400; lp6.capacity = 170; lp6.ticketPrice = 999.0;
        w6.lazyPool = lp6; w6.getParkDetails();

        Wonderla w7 = new Wonderla();
        w7.parkId = 7; w7.parkName = "Wonderla Mysore"; w7.city = "Nanjangud"; w7.theme = "Family Fun";
        LazyPool lp7 = new LazyPool(); lp7.poolId = 707; lp7.poolName = "Lazy River"; lp7.lengthMeters = 390; lp7.capacity = 165; lp7.ticketPrice = 899.0;
        w7.lazyPool = lp7; w7.getParkDetails();

        Wonderla w8 = new Wonderla();
        w8.parkId = 8; w8.parkName = "Wonderla Chennai"; w8.city = "Sriperumbudur"; w8.theme = "Adventure";
        LazyPool lp8 = new LazyPool(); lp8.poolId = 808; lp8.poolName = "Lazy River"; lp8.lengthMeters = 470; lp8.capacity = 195; lp8.ticketPrice = 1199.0;
        w8.lazyPool = lp8; w8.getParkDetails();

        Wonderla w9 = new Wonderla();
        w9.parkId = 9; w9.parkName = "Wonderla Pune"; w9.city = "Hinjewadi"; w9.theme = "Thrill";
        LazyPool lp9 = new LazyPool(); lp9.poolId = 909; lp9.poolName = "Lazy River"; lp9.lengthMeters = 430; lp9.capacity = 185; lp9.ticketPrice = 1299.0;
        w9.lazyPool = lp9; w9.getParkDetails();

        Wonderla w10 = new Wonderla();
        w10.parkId = 10; w10.parkName = "Wonderla Hyderabad West"; w10.city = "Shamshabad"; w10.theme = "Water World";
        LazyPool lp10 = new LazyPool(); lp10.poolId = 1010; lp10.poolName = "Lazy River"; lp10.lengthMeters = 510; lp10.capacity = 225; lp10.ticketPrice = 1499.0;
        w10.lazyPool = lp10; w10.getParkDetails();

        Wonderla w11 = new Wonderla();
        w11.parkId = 11; w11.parkName = "Wonderla Bengaluru East"; w11.city = "Hosakote"; w11.theme = "Family";
        LazyPool lp11 = new LazyPool(); lp11.poolId = 111; lp11.poolName = "Lazy River"; lp11.lengthMeters = 410; lp11.capacity = 175; lp11.ticketPrice = 1099.0;
        w11.lazyPool = lp11; w11.getParkDetails();

        Wonderla w12 = new Wonderla();
        w12.parkId = 12; w12.parkName = "Wonderla Kochi North"; w12.city = "Angamaly"; w12.theme = "Relaxation";
        LazyPool lp12 = new LazyPool(); lp12.poolId = 1212; lp12.poolName = "Lazy River"; lp12.lengthMeters = 370; lp12.capacity = 155; lp12.ticketPrice = 999.0;
        w12.lazyPool = lp12; w12.getParkDetails();

        Wonderla w13 = new Wonderla();
        w13.parkId = 13; w13.parkName = "Wonderla Hyderabad Central"; w13.city = "Gachibowli"; w13.theme = "Extreme";
        LazyPool lp13 = new LazyPool(); lp13.poolId = 1313; lp13.poolName = "Lazy River"; lp13.lengthMeters = 480; lp13.capacity = 205; lp13.ticketPrice = 1399.0;
        w13.lazyPool = lp13; w13.getParkDetails();

        Wonderla w14 = new Wonderla();
        w14.parkId = 14; w14.parkName = "Wonderla Chennai North"; w14.city = "Minjur"; w14.theme = "Adventure";
        LazyPool lp14 = new LazyPool(); lp14.poolId = 1414; lp14.poolName = "Lazy River"; lp14.lengthMeters = 440; lp14.capacity = 180; lp14.ticketPrice = 1199.0;
        w14.lazyPool = lp14; w14.getParkDetails();

        Wonderla w15 = new Wonderla();
        w15.parkId = 15; w15.parkName = "Wonderla Pune East"; w15.city = "Kharadi"; w15.theme = "Thrill";
        LazyPool lp15 = new LazyPool(); lp15.poolId = 1515; lp15.poolName = "Lazy River"; lp15.lengthMeters = 490; lp15.capacity = 210; lp15.ticketPrice = 1299.0;
        w15.lazyPool = lp15; w15.getParkDetails();

        Wonderla w16 = new Wonderla();
        w16.parkId = 16; w16.parkName = "Wonderla Mysore South"; w16.city = "Mandya"; w16.theme = "Family Fun";
        LazyPool lp16 = new LazyPool(); lp16.poolId = 1616; lp16.poolName = "Lazy River"; lp16.lengthMeters = 360; lp16.capacity = 150; lp16.ticketPrice = 899.0;
        w16.lazyPool = lp16; w16.getParkDetails();

        Wonderla w17 = new Wonderla();
        w17.parkId = 17; w17.parkName = "Wonderla Kochi East"; w17.city = "Perumbavoor"; w17.theme = "Water Park";
        LazyPool lp17 = new LazyPool(); lp17.poolId = 1717; lp17.poolName = "Lazy River"; lp17.lengthMeters = 395; lp17.capacity = 168; lp17.ticketPrice = 1099.0;
        w17.lazyPool = lp17; w17.getParkDetails();

        Wonderla w18 = new Wonderla();
        w18.parkId = 18; w18.parkName = "Wonderla Bengaluru South"; w18.city = "Anekal"; w18.theme = "Relaxation";
        LazyPool lp18 = new LazyPool(); lp18.poolId = 1818; lp18.poolName = "Lazy River"; lp18.lengthMeters = 455; lp18.capacity = 198; lp18.ticketPrice = 1199.0;
        w18.lazyPool = lp18; w18.getParkDetails();

        Wonderla w19 = new Wonderla();
        w19.parkId = 19; w19.parkName = "Wonderla Hyderabad South"; w19.city = "Shamshabad"; w19.theme = "Adventure";
        LazyPool lp19 = new LazyPool(); lp19.poolId = 1919; lp19.poolName = "Lazy River"; lp19.lengthMeters = 425; lp19.capacity = 182; lp19.ticketPrice = 1299.0;
        w19.lazyPool = lp19; w19.getParkDetails();

        Wonderla w20 = new Wonderla();
        w20.parkId = 20; w20.parkName = "Wonderla Chennai South"; w20.city = "Oragadam"; w20.theme = "Thrill";
        LazyPool lp20 = new LazyPool(); lp20.poolId = 2020; lp20.poolName = "Lazy River"; lp20.lengthMeters = 465; lp20.capacity = 202; lp20.ticketPrice = 1399.0;
        w20.lazyPool = lp20; w20.getParkDetails();
    }
}
