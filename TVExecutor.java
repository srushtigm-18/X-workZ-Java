class TVExecutor {
    public static void main(String[] args) {
        Channel ch1 = new Channel(401, "IPL 2026 Live", "7:30 PM", "Mayanti Langer", 12.5);
        TV tv1 = new TV(1, "Star Sports 1", "Hindi", "Sports", ch1);
        tv1.getTVDetails();

        Channel ch2 = new Channel(119, "DID Dance", "9:00 PM", "Remo D'Souza", 3.2);
        TV tv2 = new TV(2, "Zee TV", "Hindi", "Entertainment", ch2);
        tv2.getTVDetails();

        Channel ch3 = new Channel(128, "Bigg Boss 20", "9:30 PM", "Salman Khan", 8.7);
        TV tv3 = new TV(3, "Colors TV", "Hindi", "GEC", ch3);
        tv3.getTVDetails();

        Channel ch4 = new Channel(135, "Taarak Mehta", "8:30 PM", "Dilip Joshi", 4.1);
        TV tv4 = new TV(4, "Sony SAB", "Hindi", "Comedy", ch4);
        tv4.getTVDetails();

        Channel ch5 = new Channel(122, "Yeh Rishta", "9:30 PM", "Harshad Chopda", 5.8);
        TV tv5 = new TV(5, "Star Plus", "Hindi", "Fiction", ch5);
        tv5.getTVDetails();

        Channel ch6 = new Channel(101, "Ramayan", "7:00 PM", "Arun Govil", 6.2);
        TV tv6 = new TV(6, "DD National", "Hindi", "Public Service", ch6);
        tv6.getTVDetails();

        Channel ch7 = new Channel(481, "Prime Time", "9:00 PM", "Ravish Kumar", 2.8);
        TV tv7 = new TV(7, "NDTV India", "Hindi", "News", ch7);
        tv7.getTVDetails();

        Channel ch8 = new Channel(511, "Planet Earth", "8:00 PM", "David Attenborough", 1.9);
        TV tv8 = new TV(8, "Discovery Channel", "English", "Documentary", ch8);
        tv8.getTVDetails();

        Channel ch9 = new Channel(315, "Roadies 20", "7:00 PM", "Gaelyn Mendonca", 2.5);
        TV tv9 = new TV(9, "MTV India", "Hindi", "Music", ch9);
        tv9.getTVDetails();

        Channel ch10 = new Channel(208, "Motu Patlu", "6:30 PM", "Vinay Pathak", 3.1);
        TV tv10 = new TV(10, "Nickelodeon", "Hindi", "Kids", ch10);
        tv10.getTVDetails();

        Channel ch11 = new Channel(141, "Pathaan Premiere", "8:00 PM", "Shah Rukh Khan", 7.4);
        TV tv11 = new TV(11, "Sony Max", "Hindi", "Movies", ch11);
        tv11.getTVDetails();

        Channel ch12 = new Channel(125, "Jawan Premiere", "9:00 PM", "SRK Special", 6.9);
        TV tv12 = new TV(12, "Star Gold", "Hindi", "Movies", ch12);
        tv12.getTVDetails();

        Channel ch13 = new Channel(483, "DNA Show", "10:00 PM", "Sudhir Chaudhary", 3.8);
        TV tv13 = new TV(13, "Zee News", "Hindi", "News", ch13);
        tv13.getTVDetails();

        Channel ch14 = new Channel(512, "Tiger Safari", "7:30 PM", "Nigel Marven", 1.4);
        TV tv14 = new TV(14, "Animal Planet", "English", "Wildlife", ch14);
        tv14.getTVDetails();

        Channel ch15 = new Channel(209, "Chhota Bheem", "7:00 PM", "Rajeev Menon", 4.2);
        TV tv15 = new TV(15, "Cartoon Network", "Hindi", "Animation", ch15);
        tv15.getTVDetails();

        Channel ch16 = new Channel(531, "Ancient Aliens", "10:00 PM", "Giorgio Tsoukalos", 1.2);
        TV tv16 = new TV(16, "History TV18", "English", "History", ch16);
        tv16.getTVDetails();

        Channel ch17 = new Channel(623, "Sanjeev Kapoor", "8:00 PM", "Sanjeev Kapoor", 1.8);
        TV tv17 = new TV(17, "Food Food", "Hindi", "Cooking", ch17);
        tv17.getTVDetails();

        Channel ch18 = new Channel(480, "Special Report", "9:00 PM", "Sudhir Chaudhary", 4.5);
        TV tv18 = new TV(18, "Aaj Tak", "Hindi", "News", ch18);
        tv18.getTVDetails();

        Channel ch19 = new Channel(64, "Neeya Naana", "10:00 PM", "Ramesh Thilak", 5.3);
        TV tv19 = new TV(19, "Sun TV", "Tamil", "Entertainment", ch19);
        tv19.getTVDetails();

        Channel ch20 = new Channel(65, "News Hour", "9:00 PM", "Arvind", 3.9);
        TV tv20 = new TV(20, "Puthiya Thalaimurai", "Tamil", "News", ch20);
        tv20.getTVDetails();
    }
}
