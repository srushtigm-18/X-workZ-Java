class IplExecutor {
    public static void main(String[] args) {
        Ipl ipl1 = new Ipl();
        ipl1.teamId = 1; ipl1.teamName = "Chennai Super Kings"; ipl1.homeGround = "MA Chidambaram"; ipl1.captain = "Ruturaj Gaikwad";
        Player p1 = new Player(); p1.playerId = 101; p1.playerName = "MS Dhoni"; p1.role = "Wicketkeeper Batsman"; p1.jerseyNumber = 7; p1.auctionPrice = 12.0;
        ipl1.player = p1; ipl1.getTeamDetails();

        Ipl ipl2 = new Ipl();
        ipl2.teamId = 2; ipl2.teamName = "Mumbai Indians"; ipl2.homeGround = "Wankhede Stadium"; ipl2.captain = "Hardik Pandya";
        Player p2 = new Player(); p2.playerId = 102; p2.playerName = "Rohit Sharma"; p2.role = "Opener"; p2.jerseyNumber = 45; p2.auctionPrice = 16.3;
        ipl2.player = p2; ipl2.getTeamDetails();

        Ipl ipl3 = new Ipl();
        ipl3.teamId = 3; ipl3.teamName = "Kolkata Knight Riders"; ipl3.homeGround = "Eden Gardens"; ipl3.captain = "Venkatesh Iyer";
        Player p3 = new Player(); p3.playerId = 103; p3.playerName = "Andre Russell"; p3.role = "Allrounder"; p3.jerseyNumber = 99; p3.auctionPrice = 12.0;
        ipl3.player = p3; ipl3.getTeamDetails();

        Ipl ipl4 = new Ipl();
        ipl4.teamId = 4; ipl4.teamName = "Royal Challengers Bengaluru"; ipl4.homeGround = "M Chinnaswamy"; ipl4.captain = "Virat Kohli";
        Player p4 = new Player(); p4.playerId = 104; p4.playerName = "Virat Kohli"; p4.role = "Batsman"; p4.jerseyNumber = 18; p4.auctionPrice = 21.0;
        ipl4.player = p4; ipl4.getTeamDetails();

        Ipl ipl5 = new Ipl();
        ipl5.teamId = 5; ipl5.teamName = "Rajasthan Royals"; ipl5.homeGround = "Sawai Mansingh"; ipl5.captain = "Sanju Samson";
        Player p5 = new Player(); p5.playerId = 105; p5.playerName = "Jos Buttler"; p5.role = "Opener"; p5.jerseyNumber = 63; p5.auctionPrice = 15.75;
        ipl5.player = p5; ipl5.getTeamDetails();

        Ipl ipl6 = new Ipl();
        ipl6.teamId = 6; ipl6.teamName = "Sunrisers Hyderabad"; ipl6.homeGround = "Rajiv Gandhi Stadium"; ipl6.captain = "Pat Cummins";
        Player p6 = new Player(); p6.playerId = 106; p6.playerName = "Travis Head"; p6.role = "Opener"; p6.jerseyNumber = 36; p6.auctionPrice = 14.0;
        ipl6.player = p6; ipl6.getTeamDetails();

        Ipl ipl7 = new Ipl();
        ipl7.teamId = 7; ipl7.teamName = "Delhi Capitals"; ipl7.homeGround = "Arun Jaitley Stadium"; ipl7.captain = "Axar Patel";
        Player p7 = new Player(); p7.playerId = 107; p7.playerName = "KL Rahul"; p7.role = "Batsman"; p7.jerseyNumber = 1; p7.auctionPrice = 14.0;
        ipl7.player = p7; ipl7.getTeamDetails();

        Ipl ipl8 = new Ipl();
        ipl8.teamId = 8; ipl8.teamName = "Punjab Kings"; ipl8.homeGround = "PCA Stadium"; ipl8.captain = "Shreyas Iyer";
        Player p8 = new Player(); p8.playerId = 108; p8.playerName = "Shikhar Dhawan"; p8.role = "Opener"; p8.jerseyNumber = 25; p8.auctionPrice = 8.5;
        ipl8.player = p8; ipl8.getTeamDetails();

        Ipl ipl9 = new Ipl();
        ipl9.teamId = 9; ipl9.teamName = "Gujarat Titans"; ipl9.homeGround = "Narendra Modi Stadium"; ipl9.captain = "Shubman Gill";
        Player p9 = new Player(); p9.playerId = 109; p9.playerName = "Rashid Khan"; p9.role = "Spinner"; p9.jerseyNumber = 50; p9.auctionPrice = 18.0;
        ipl9.player = p9; ipl9.getTeamDetails();

        Ipl ipl10 = new Ipl();
        ipl10.teamId = 10; ipl10.teamName = "Lucknow Super Giants"; ipl10.homeGround = "Ekana Stadium"; ipl10.captain = "Rishabh Pant";
        Player p10 = new Player(); p10.playerId = 110; p10.playerName = "Nicholas Pooran"; p10.role = "Wicketkeeper Batsman"; p10.jerseyNumber = 13; p10.auctionPrice = 11.0;
        ipl10.player = p10; ipl10.getTeamDetails();

        Ipl ipl11 = new Ipl();
        ipl11.teamId = 11; ipl11.teamName = "CSK Reserves"; ipl11.homeGround = "MA Chidambaram"; ipl11.captain = "Ravindra Jadeja";
        Player p11 = new Player(); p11.playerId = 111; p11.playerName = "Ravindra Jadeja"; p11.role = "Allrounder"; p11.jerseyNumber = 8; p11.auctionPrice = 12.0;
        ipl11.player = p11; ipl11.getTeamDetails();

        Ipl ipl12 = new Ipl();
        ipl12.teamId = 12; ipl12.teamName = "MI Academy"; ipl12.homeGround = "Wankhede"; ipl12.captain = "Suryakumar Yadav";
        Player p12 = new Player(); p12.playerId = 112; p12.playerName = "Jasprit Bumrah"; p12.role = "Fast Bowler"; p12.jerseyNumber = 93; p12.auctionPrice = 12.0;
        ipl12.player = p12; ipl12.getTeamDetails();

        Ipl ipl13 = new Ipl();
        ipl13.teamId = 13; ipl13.teamName = "KKR Next Gen"; ipl13.homeGround = "Eden Gardens"; ipl13.captain = "Nitish Rana";
        Player p13 = new Player(); p13.playerId = 113; p13.playerName = "Sunil Narine"; p13.role = "Spinner Allrounder"; p13.jerseyNumber = 34; p13.auctionPrice = 10.8;
        ipl13.player = p13; ipl13.getTeamDetails();

        Ipl ipl14 = new Ipl();
        ipl14.teamId = 14; ipl14.teamName = "RCB Stars"; ipl14.homeGround = "Chinnaswamy"; ipl14.captain = "Faf du Plessis";
        Player p14 = new Player(); p14.playerId = 114; p14.playerName = "Glenn Maxwell"; p14.role = "Allrounder"; p14.jerseyNumber = 32; p14.auctionPrice = 10.75;
        ipl14.player = p14; ipl14.getTeamDetails();

        Ipl ipl15 = new Ipl();
        ipl15.teamId = 15; ipl15.teamName = "RR Royals"; ipl15.homeGround = "Sawai Mansingh"; ipl15.captain = "Yashasvi Jaiswal";
        Player p15 = new Player(); p15.playerId = 115; p15.playerName = "Yuzvendra Chahal"; p15.role = "Spinner"; p15.jerseyNumber = 3; p15.auctionPrice = 18.0;
        ipl15.player = p15; ipl15.getTeamDetails();

        Ipl ipl16 = new Ipl();
        ipl16.teamId = 16; ipl16.teamName = "SRH Power"; ipl16.homeGround = "Rajiv Gandhi"; ipl16.captain = "Abhishek Sharma";
        Player p16 = new Player(); p16.playerId = 116; p16.playerName = "Heinrich Klaasen"; p16.role = "Wicketkeeper Batsman"; p16.jerseyNumber = 44; p16.auctionPrice = 9.5;
        ipl16.player = p16; ipl16.getTeamDetails();

        Ipl ipl17 = new Ipl();
        ipl17.teamId = 17; ipl17.teamName = "DC United"; ipl17.homeGround = "Arun Jaitley"; ipl17.captain = "Rishabh Pant";
        Player p17 = new Player(); p17.playerId = 117; p17.playerName = "Tristan Stubbs"; p17.role = "Batsman"; p17.jerseyNumber = 46; p17.auctionPrice = 9.2;
        ipl17.player = p17; ipl17.getTeamDetails();

        Ipl ipl18 = new Ipl();
        ipl18.teamId = 18; ipl18.teamName = "PBKS Kings"; ipl18.homeGround = "PCA Stadium"; ipl18.captain = "Sam Curran";
        Player p18 = new Player(); p18.playerId = 118; p18.playerName = "Sam Curran"; p18.role = "Allrounder"; p18.jerseyNumber = 30; p18.auctionPrice = 18.5;
        ipl18.player = p18; ipl18.getTeamDetails();

        Ipl ipl19 = new Ipl();
        ipl19.teamId = 19; ipl19.teamName = "GT Titans"; ipl19.homeGround = "Narendra Modi"; ipl19.captain = "Mohit Sharma";
        Player p19 = new Player(); p19.playerId = 119; p19.playerName = "Shubman Gill"; p19.role = "Batsman"; p19.jerseyNumber = 7; p19.auctionPrice = 16.5;
        ipl19.player = p19; ipl19.getTeamDetails();

        Ipl ipl20 = new Ipl();
        ipl20.teamId = 20; ipl20.teamName = "LSG Giants"; ipl20.homeGround = "Ekana Stadium"; ipl20.captain = "KL Rahul";
        Player p20 = new Player(); p20.playerId = 120; p20.playerName = "Quinton de Kock"; p20.role = "Opener"; p20.jerseyNumber = 37; p20.auctionPrice = 15.0;
        ipl20.player = p20; ipl20.getTeamDetails();
    }
}
