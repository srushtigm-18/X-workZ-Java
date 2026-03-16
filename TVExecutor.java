class TVExecutor {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.networkId = 1; tv1.networkName = "Star Sports 1"; tv1.language = "Hindi"; tv1.genre = "Sports";
        Channel ch1 = new Channel(); ch1.channelNumber = 401; ch1.programName = "IPL 2026 Live"; ch1.timing = "7:30 PM"; ch1.host = "Mayanti Langer"; ch1.trpRating = 12.5;
        tv1.channel = ch1; tv1.getTVDetails();

        TV tv2 = new TV();
        tv2.networkId = 2; tv2.networkName = "Zee TV"; tv2.language = "Hindi"; tv2.genre = "Entertainment";
        Channel ch2 = new Channel(); ch2.channelNumber = 119; ch2.programName = "DID Dance"; ch2.timing = "9:00 PM"; ch2.host = "Remo D'Souza"; ch2.trpRating = 3.2;
        tv2.channel = ch2; tv2.getTVDetails();

        TV tv3 = new TV();
        tv3.networkId = 3; tv3.networkName = "Colors TV"; tv3.language = "Hindi"; tv3.genre = "GEC";
        Channel ch3 = new Channel(); ch3.channelNumber = 128; ch3.programName = "Bigg Boss 20"; ch3.timing = "9:30 PM"; ch3.host = "Salman Khan"; ch3.trpRating = 8.7;
        tv3.channel = ch3; tv3.getTVDetails();

        TV tv4 = new TV();
        tv4.networkId = 4; tv4.networkName = "Sony SAB"; tv4.language = "Hindi"; tv4.genre = "Comedy";
        Channel ch4 = new Channel(); ch4.channelNumber = 135; ch4.programName = "Taarak Mehta"; ch4.timing = "8:30 PM"; ch4.host = "Dilip Joshi"; ch4.trpRating = 4.1;
        tv4.channel = ch4; tv4.getTVDetails();

        TV tv5 = new TV();
        tv5.networkId = 5; tv5.networkName = "Star Plus"; tv5.language = "Hindi"; tv5.genre = "Fiction";
        Channel ch5 = new Channel(); ch5.channelNumber = 122; ch5.programName = "Yeh Rishta"; ch5.timing = "9:30 PM"; ch5.host = "Harshad Chopda"; ch5.trpRating = 5.8;
        tv5.channel = ch5; tv5.getTVDetails();

        TV tv6 = new TV();
        tv6.networkId = 6; tv6.networkName = "DD National"; tv6.language = "Hindi"; tv6.genre = "Public Service";
        Channel ch6 = new Channel(); ch6.channelNumber = 101; ch6.programName = "Ramayan"; ch6.timing = "7:00 PM"; ch6.host = "Arun Govil"; ch6.trpRating = 6.2;
        tv6.channel = ch6; tv6.getTVDetails();

        TV tv7 = new TV();
        tv7.networkId = 7; tv7.networkName = "NDTV India"; tv7.language = "Hindi"; tv7.genre = "News";
        Channel ch7 = new Channel(); ch7.channelNumber = 481; ch7.programName = "Prime Time"; ch7.timing = "9:00 PM"; ch7.host = "Ravish Kumar"; ch7.trpRating = 2.8;
        tv7.channel = ch7; tv7.getTVDetails();

        TV tv8 = new TV();
        tv8.networkId = 8; tv8.networkName = "Discovery Channel"; tv8.language = "English"; tv8.genre = "Documentary";
        Channel ch8 = new Channel(); ch8.channelNumber = 511; ch8.programName = "Planet Earth"; ch8.timing = "8:00 PM"; ch8.host = "David Attenborough"; ch8.trpRating = 1.9;
        tv8.channel = ch8; tv8.getTVDetails();

        TV tv9 = new TV();
        tv9.networkId = 9; tv9.networkName = "MTV India"; tv9.language = "Hindi"; tv9.genre = "Music";
        Channel ch9 = new Channel(); ch9.channelNumber = 315; ch9.programName = "Roadies 20"; ch9.timing = "7:00 PM"; ch9.host = "Gaelyn Mendonca"; ch9.trpRating = 2.5;
        tv9.channel = ch9; tv9.getTVDetails();

        TV tv10 = new TV();
        tv10.networkId = 10; tv10.networkName = "Nickelodeon"; tv10.language = "Hindi"; tv10.genre = "Kids";
        Channel ch10 = new Channel(); ch10.channelNumber = 208; ch10.programName = "Motu Patlu"; ch10.timing = "6:30 PM"; ch10.host = "Vinay Pathak"; ch10.trpRating = 3.1;
        tv10.channel = ch10; tv10.getTVDetails();

        TV tv11 = new TV();
        tv11.networkId = 11; tv11.networkName = "Sony Max"; tv11.language = "Hindi"; tv11.genre = "Movies";
        Channel ch11 = new Channel(); ch11.channelNumber = 141; ch11.programName = "Pathaan Premiere"; ch11.timing = "8:00 PM"; ch11.host = "Shah Rukh Khan"; ch11.trpRating = 7.4;
        tv11.channel = ch11; tv11.getTVDetails();

        TV tv12 = new TV();
        tv12.networkId = 12; tv12.networkName = "Star Gold"; tv12.language = "Hindi"; tv12.genre = "Movies";
        Channel ch12 = new Channel(); ch12.channelNumber = 125; ch12.programName = "Jawan Premiere"; ch12.timing = "9:00 PM"; ch12.host = "SRK Special"; ch12.trpRating = 6.9;
        tv12.channel = ch12; tv12.getTVDetails();

        TV tv13 = new TV();
        tv13.networkId = 13; tv13.networkName = "Zee News"; tv13.language = "Hindi"; tv13.genre = "News";
        Channel ch13 = new Channel(); ch13.channelNumber = 483; ch13.programName = "DNA Show"; ch13.timing = "10:00 PM"; ch13.host = "Sudhir Chaudhary"; ch13.trpRating = 3.8;
        tv13.channel = ch13; tv13.getTVDetails();

        TV tv14 = new TV();
        tv14.networkId = 14; tv14.networkName = "Animal Planet"; tv14.language = "English"; tv14.genre = "Wildlife";
        Channel ch14 = new Channel(); ch14.channelNumber = 512; ch14.programName = "Tiger Safari"; ch14.timing = "7:30 PM"; ch14.host = "Nigel Marven"; ch14.trpRating = 1.4;
        tv14.channel = ch14; tv14.getTVDetails();

        TV tv15 = new TV();
        tv15.networkId = 15; tv15.networkName = "Cartoon Network"; tv15.language = "Hindi"; tv15.genre = "Animation";
        Channel ch15 = new Channel(); ch15.channelNumber = 209; ch15.programName = "Chhota Bheem"; ch15.timing = "7:00 PM"; ch15.host = "Rajeev Menon"; ch15.trpRating = 4.2;
        tv15.channel = ch15; tv15.getTVDetails();

        TV tv16 = new TV();
        tv16.networkId = 16; tv16.networkName = "History TV18"; tv16.language = "English"; tv16.genre = "History";
        Channel ch16 = new Channel(); ch16.channelNumber = 531; ch16.programName = "Ancient Aliens"; ch16.timing = "10:00 PM"; ch16.host = "Giorgio Tsoukalos"; ch16.trpRating = 1.2;
        tv16.channel = ch16; tv16.getTVDetails();

        TV tv17 = new TV();
        tv17.networkId = 17; tv17.networkName = "Food Food"; tv17.language = "Hindi"; tv17.genre = "Cooking";
        Channel ch17 = new Channel(); ch17.channelNumber = 623; ch17.programName = "Sanjeev Kapoor"; ch17.timing = "8:00 PM"; ch17.host = "Sanjeev Kapoor"; ch17.trpRating = 1.8;
        tv17.channel = ch17; tv17.getTVDetails();

        TV tv18 = new TV();
        tv18.networkId = 18; tv18.networkName = "Aaj Tak"; tv18.language = "Hindi"; tv18.genre = "News";
        Channel ch18 = new Channel(); ch18.channelNumber = 480; ch18.programName = "Special Report"; ch18.timing = "9:00 PM"; ch18.host = "Sudhir Chaudhary"; ch18.trpRating = 4.5;
        tv18.channel = ch18; tv18.getTVDetails();

        TV tv19 = new TV();
        tv19.networkId = 19; tv19.networkName = "Sun TV"; tv19.language = "Tamil"; tv19.genre = "Entertainment";
        Channel ch19 = new Channel(); ch19.channelNumber = 64; ch19.programName = "Neeya Naana"; ch19.timing = "10:00 PM"; ch19.host = "Ramesh Thilak"; ch19.trpRating = 5.3;
        tv19.channel = ch19; tv19.getTVDetails();

        TV tv20 = new TV();
        tv20.networkId = 20; tv20.networkName = "Puthiya Thalaimurai"; tv20.language = "Tamil"; tv20.genre = "News";
        Channel ch20 = new Channel(); ch20.channelNumber = 65; ch20.programName = "News Hour"; ch20.timing = "9:00 PM"; ch20.host = "Arvind"; ch20.trpRating = 3.9;
        tv20.channel = ch20; tv20.getTVDetails();
    }
}
