class BigDaddyExecutor {
    public static void main(String[] args) {
        BigDaddy bd1 = new BigDaddy();
        bd1.casinoId = 1; bd1.casinoName = "BigDaddy Galaxy"; bd1.location = "Goa Waters"; bd1.owner = "Delta Corp";
        Cassino c1 = new Cassino(); c1.tableNumber = 101; c1.gameType = "Blackjack"; c1.minBet = 5; c1.maxBet = 500; c1.rake = 2.5;
        bd1.cassino = c1; bd1.getCasinoDetails();

        BigDaddy bd2 = new BigDaddy();
        bd2.casinoId = 2; bd2.casinoName = "Deltin Royale"; bd2.location = "Panaji River"; bd2.owner = "Delta Corp";
        Cassino c2 = new Cassino(); c2.tableNumber = 202; c2.gameType = "Roulette"; c2.minBet = 10; c2.maxBet = 1000; c2.rake = 3.0;
        bd2.cassino = c2; bd2.getCasinoDetails();

        BigDaddy bd3 = new BigDaddy();
        bd3.casinoId = 3; bd3.casinoName = "Casino Pride"; bd3.location = "Mandal Vado"; bd3.owner = "Rajit Mehra";
        Cassino c3 = new Cassino(); c3.tableNumber = 303; c3.gameType = "Poker"; c3.minBet = 25; c3.maxBet = 2000; c3.rake = 5.0;
        bd3.cassino = c3; bd3.getCasinoDetails();

        BigDaddy bd4 = new BigDaddy();
        bd4.casinoId = 4; bd4.casinoName = "Deltin JAQK"; bd4.location = "Goa Island"; bd4.owner = "Delta Corp";
        Cassino c4 = new Cassino(); c4.tableNumber = 404; c4.gameType = "Baccarat"; c4.minBet = 50; c4.maxBet = 5000; c4.rake = 1.5;
        bd4.cassino = c4; bd4.getCasinoDetails();

        BigDaddy bd5 = new BigDaddy();
        bd5.casinoId = 5; bd5.casinoName = "Big Daddy Ship"; bd5.location = "Arabian Sea"; bd5.owner = "Sarathi Group";
        Cassino c5 = new Cassino(); c5.tableNumber = 505; c5.gameType = "Texas Holdem"; c5.minBet = 100; c5.maxBet = 10000; c5.rake = 4.2;
        bd5.cassino = c5; bd5.getCasinoDetails();

        BigDaddy bd6 = new BigDaddy();
        bd6.casinoId = 6; bd6.casinoName = "Crown Casino"; bd6.location = "Goa Beach"; bd6.owner = "Leslie Ltd";
        Cassino c6 = new Cassino(); c6.tableNumber = 606; c6.gameType = "Andar Bahar"; c6.minBet = 20; c6.maxBet = 1500; c6.rake = 2.8;
        bd6.cassino = c6; bd6.getCasinoDetails();

        BigDaddy bd7 = new BigDaddy();
        bd7.casinoId = 7; bd7.casinoName = "Floatel Casino"; bd7.location = "Nerul River"; bd7.owner = "Floatel Group";
        Cassino c7 = new Cassino(); c7.tableNumber = 707; c7.gameType = "Roulette Euro"; c7.minBet = 15; c7.maxBet = 3000; c7.rake = 2.7;
        bd7.cassino = c7; bd7.getCasinoDetails();

        BigDaddy bd8 = new BigDaddy();
        bd8.casinoId = 8; bd8.casinoName = "Golden Goa"; bd8.location = "Baga Beach"; bd8.owner = "Golden Group";
        Cassino c8 = new Cassino(); c8.tableNumber = 808; c8.gameType = "Blackjack VIP"; c8.minBet = 200; c8.maxBet = 25000; c8.rake = 1.8;
        bd8.cassino = c8; bd8.getCasinoDetails();

        BigDaddy bd9 = new BigDaddy();
        bd9.casinoId = 9; bd9.casinoName = "Marathon Casino"; bd9.location = "Panvel Creek"; bd9.owner = "Marathon Corp";
        Cassino c9 = new Cassino(); c9.tableNumber = 909; c9.gameType = "Omaha Poker"; c9.minBet = 75; c9.maxBet = 8000; c9.rake = 4.8;
        bd9.cassino = c9; bd9.getCasinoDetails();

        BigDaddy bd10 = new BigDaddy();
        bd10.casinoId = 10; bd10.casinoName = "King Casino"; bd10.location = "Goa Marina"; bd10.owner = "Royal Group";
        Cassino c10 = new Cassino(); c10.tableNumber = 1010; c10.gameType = "Dragon Tiger"; c10.minBet = 30; c10.maxBet = 4000; c10.rake = 3.2;
        bd10.cassino = c10; bd10.getCasinoDetails();

        BigDaddy bd11 = new BigDaddy();
        bd11.casinoId = 11; bd11.casinoName = "BigDaddy Plaza"; bd11.location = "Goa Central"; bd11.owner = "Delta Corp";
        Cassino c11 = new Cassino(); c11.tableNumber = 111; c11.gameType = "Blackjack"; c11.minBet = 8; c11.maxBet = 750; c11.rake = 2.3;
        bd11.cassino = c11; bd11.getCasinoDetails();

        BigDaddy bd12 = new BigDaddy();
        bd12.casinoId = 12; bd12.casinoName = "Deltin Dreams"; bd12.location = "Mandovi River"; bd12.owner = "Delta Corp";
        Cassino c12 = new Cassino(); c12.tableNumber = 1212; c12.gameType = "Sic Bo"; c12.minBet = 40; c12.maxBet = 6000; c12.rake = 3.5;
        bd12.cassino = c12; bd12.getCasinoDetails();

        BigDaddy bd13 = new BigDaddy();
        bd13.casinoId = 13; bd13.casinoName = "Pride Horizon"; bd13.location = "Goa Horizon"; bd13.owner = "Rajit Group";
        Cassino c13 = new Cassino(); c13.tableNumber = 1313; c13.gameType = "Poker VIP"; c13.minBet = 500; c13.maxBet = 50000; c13.rake = 5.5;
        bd13.cassino = c13; bd13.getCasinoDetails();

        BigDaddy bd14 = new BigDaddy();
        bd14.casinoId = 14; bd14.casinoName = "JAQK Royale"; bd14.location = "Goa Royale"; bd14.owner = "Delta Corp";
        Cassino c14 = new Cassino(); c14.tableNumber = 1414; c14.gameType = "Baccarat VIP"; c14.minBet = 300; c14.maxBet = 30000; c14.rake = 1.2;
        bd14.cassino = c14; bd14.getCasinoDetails();

        BigDaddy bd15 = new BigDaddy();
        bd15.casinoId = 15; bd15.casinoName = "BigDaddy Elite"; bd15.location = "Elite Waters"; bd15.owner = "Sarathi Group";
        Cassino c15 = new Cassino(); c15.tableNumber = 1515; c15.gameType = "Roulette VIP"; c15.minBet = 150; c15.maxBet = 15000; c15.rake = 2.1;
        bd15.cassino = c15; bd15.getCasinoDetails();

        BigDaddy bd16 = new BigDaddy();
        bd16.casinoId = 16; bd16.casinoName = "Crown Legacy"; bd16.location = "Goa Legacy"; bd16.owner = "Leslie Ltd";
        Cassino c16 = new Cassino(); c16.tableNumber = 1616; c16.gameType = "Teen Patti"; c16.minBet = 25; c16.maxBet = 2500; c16.rake = 3.8;
        bd16.cassino = c16; bd16.getCasinoDetails();

        BigDaddy bd17 = new BigDaddy();
        bd17.casinoId = 17; bd17.casinoName = "Floatel Royale"; bd17.location = "Royale Waters"; bd17.owner = "Floatel Group";
        Cassino c17 = new Cassino(); c17.tableNumber = 1717; c17.gameType = "Craps"; c17.minBet = 50; c17.maxBet = 5000; c17.rake = 4.0;
        bd17.cassino = c17; bd17.getCasinoDetails();

        BigDaddy bd18 = new BigDaddy();
        bd18.casinoId = 18; bd18.casinoName = "Golden Legacy"; bd18.location = "Golden Waters"; bd18.owner = "Golden Group";
        Cassino c18 = new Cassino(); c18.tableNumber = 1818; c18.gameType = "Blackjack Euro"; c18.minBet = 100; c18.maxBet = 10000; c18.rake = 2.0;
        bd18.cassino = c18; bd18.getCasinoDetails();

        BigDaddy bd19 = new BigDaddy();
        bd19.casinoId = 19; bd19.casinoName = "Marathon Royale"; bd19.location = "Royale Creek"; bd19.owner = "Marathon Corp";
        Cassino c19 = new Cassino(); c19.tableNumber = 1919; c19.gameType = "Pot Limit Omaha"; c19.minBet = 200; c19.maxBet = 20000; c19.rake = 5.2;
        bd19.cassino = c19; bd19.getCasinoDetails();

        BigDaddy bd20 = new BigDaddy();
        bd20.casinoId = 20; bd20.casinoName = "King of Seas"; bd20.location = "Sea Casino"; bd20.owner = "Royal Group";
        Cassino c20 = new Cassino(); c20.tableNumber = 2020; c20.gameType = "Ultimate Roulette"; c20.minBet = 250; c20.maxBet = 50000; c20.rake = 1.9;
        bd20.cassino = c20; bd20.getCasinoDetails();
    }
}
