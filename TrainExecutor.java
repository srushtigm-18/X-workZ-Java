class TrainExecutor {
    public static void main(String[] args) {
        // Train 1
        Train train1 = new Train();
        train1.trainId = 1001; train1.trainName = "Rajdhani #1"; train1.source = "Delhi"; train1.destination = "Mumbai";
        Bogie bogie1 = new Bogie(); bogie1.bogieNumber = 1; bogie1.type = "AC3"; bogie1.capacity = 72; bogie1.controller = "Ravi K"; bogie1.ac = true;
        train1.bogie = bogie1; train1.getTrainDetails();

        // Train 2
        Train train2 = new Train();
        train2.trainId = 1002; train2.trainName = "Shatabdi #2"; train2.source = "Mumbai"; train2.destination = "Bengaluru";
        Bogie bogie2 = new Bogie(); bogie2.bogieNumber = 2; bogie2.type = "SL"; bogie2.capacity = 80; bogie2.controller = "Priya S"; bogie2.ac = false;
        train2.bogie = bogie2; train2.getTrainDetails();

        // Train 3
        Train train3 = new Train();
        train3.trainId = 1003; train3.trainName = "Duronto #3"; train3.source = "Bengaluru"; train3.destination = "Chennai";
        Bogie bogie3 = new Bogie(); bogie3.bogieNumber = 3; bogie3.type = "AC2"; bogie3.capacity = 68; bogie3.controller = "Amit P"; bogie3.ac = true;
        train3.bogie = bogie3; train3.getTrainDetails();

        // Train 4
        Train train4 = new Train();
        train4.trainId = 1004; train4.trainName = "Garib Rath #4"; train4.source = "Chennai"; train4.destination = "Kolkata";
        Bogie bogie4 = new Bogie(); bogie4.bogieNumber = 4; bogie4.type = "AC3"; bogie4.capacity = 75; bogie4.controller = "Neha G"; bogie4.ac = true;
        train4.bogie = bogie4; train4.getTrainDetails();

        // Train 5
        Train train5 = new Train();
        train5.trainId = 1005; train5.trainName = "Vande Bharat #5"; train5.source = "Kolkata"; train5.destination = "Hyderabad";
        Bogie bogie5 = new Bogie(); bogie5.bogieNumber = 5; bogie5.type = "AC1"; bogie5.capacity = 60; bogie5.controller = "Rahul S"; bogie5.ac = true;
        train5.bogie = bogie5; train5.getTrainDetails();

        // Train 6
        Train train6 = new Train();
        train6.trainId = 1006; train6.trainName = "Tejas #6"; train6.source = "Hyderabad"; train6.destination = "Pune";
        Bogie bogie6 = new Bogie(); bogie6.bogieNumber = 6; bogie6.type = "SEATER"; bogie6.capacity = 90; bogie6.controller = "Sita D"; bogie6.ac = true;
        train6.bogie = bogie6; train6.getTrainDetails();

        // Train 7
        Train train7 = new Train();
        train7.trainId = 1007; train7.trainName = "Humsafar #7"; train7.source = "Pune"; train7.destination = "Jaipur";
        Bogie bogie7 = new Bogie(); bogie7.bogieNumber = 7; bogie7.type = "SL"; bogie7.capacity = 85; bogie7.controller = "Vikram J"; bogie7.ac = false;
        train7.bogie = bogie7; train7.getTrainDetails();

        // Train 8
        Train train8 = new Train();
        train8.trainId = 1008; train8.trainName = "Antyodaya #8"; train8.source = "Jaipur"; train8.destination = "Delhi";
        Bogie bogie8 = new Bogie(); bogie8.bogieNumber = 8; bogie8.type = "AC3"; bogie8.capacity = 78; bogie8.controller = "Anita R"; bogie8.ac = true;
        train8.bogie = bogie8; train8.getTrainDetails();

        // Train 9
        Train train9 = new Train();
        train9.trainId = 1009; train9.trainName = "Jan Shatabdi #9"; train9.source = "Delhi"; train9.destination = "Lucknow";
        Bogie bogie9 = new Bogie(); bogie9.bogieNumber = 9; bogie9.type = "AC2"; bogie9.capacity = 70; bogie9.controller = "Karan M"; bogie9.ac = true;
        train9.bogie = bogie9; train9.getTrainDetails();

        // Train 10
        Train train10 = new Train();
        train10.trainId = 1010; train10.trainName = "Rajdhani #10"; train10.source = "Lucknow"; train10.destination = "Ahmedabad";
        Bogie bogie10 = new Bogie(); bogie10.bogieNumber = 10; bogie10.type = "SL"; bogie10.capacity = 82; bogie10.controller = "Lata B"; bogie10.ac = false;
        train10.bogie = bogie10; train10.getTrainDetails();

        // Train 11-20 (continued pattern - abbreviated for space, full in complete file)
        Train train11 = new Train(); train11.trainId = 1011; train11.trainName = "Shatabdi #11"; train11.source = "Ahmedabad"; train11.destination = "Mumbai";
        Bogie bogie11 = new Bogie(); bogie11.bogieNumber = 11; bogie11.type = "AC1"; bogie11.capacity = 65; bogie11.controller = "Ravi K"; bogie11.ac = true;
        train11.bogie = bogie11; train11.getTrainDetails();

        Train train12 = new Train(); train12.trainId = 1012; train12.trainName = "Duronto #12"; train12.source = "Mumbai"; train12.destination = "Bengaluru";
        Bogie bogie12 = new Bogie(); bogie12.bogieNumber = 12; bogie12.type = "SEATER"; bogie12.capacity = 95; bogie12.controller = "Priya S"; bogie12.ac = true;
        train12.bogie = bogie12; train12.getTrainDetails();

        Train train13 = new Train(); train13.trainId = 1013; train13.trainName = "Garib Rath #13"; train13.source = "Bengaluru"; train13.destination = "Chennai";
        Bogie bogie13 = new Bogie(); bogie13.bogieNumber = 13; bogie13.type = "AC3"; bogie13.capacity = 74; bogie13.controller = "Amit P"; bogie13.ac = true;
        train13.bogie = bogie13; train13.getTrainDetails();

        Train train14 = new Train(); train14.trainId = 1014; train14.trainName = "Vande Bharat #14"; train14.source = "Chennai"; train14.destination = "Kolkata";
        Bogie bogie14 = new Bogie(); bogie14.bogieNumber = 14; bogie14.type = "SL"; bogie14.capacity = 88; bogie14.controller = "Neha G"; bogie14.ac = false;
        train14.bogie = bogie14; train14.getTrainDetails();

        Train train15 = new Train(); train15.trainId = 1015; train15.trainName = "Tejas #15"; train15.source = "Kolkata"; train15.destination = "Hyderabad";
        Bogie bogie15 = new Bogie(); bogie15.bogieNumber = 15; bogie15.type = "AC2"; bogie15.capacity = 69; bogie15.controller = "Rahul S"; bogie15.ac = true;
        train15.bogie = bogie15; train15.getTrainDetails();

        Train train16 = new Train(); train16.trainId = 1016; train16.trainName = "Humsafar #16"; train16.source = "Hyderabad"; train16.destination = "Pune";
        Bogie bogie16 = new Bogie(); bogie16.bogieNumber = 16; bogie16.type = "AC1"; bogie16.capacity = 62; bogie16.controller = "Sita D"; bogie16.ac = true;
        train16.bogie = bogie16; train16.getTrainDetails();

        Train train17 = new Train(); train17.trainId = 1017; train17.trainName = "Antyodaya #17"; train17.source = "Pune"; train17.destination = "Jaipur";
        Bogie bogie17 = new Bogie(); bogie17.bogieNumber = 17; bogie17.type = "SEATER"; bogie17.capacity = 92; bogie17.controller = "Vikram J"; bogie17.ac = true;
        train17.bogie = bogie17; train17.getTrainDetails();

        Train train18 = new Train(); train18.trainId = 1018; train18.trainName = "Jan Shatabdi #18"; train18.source = "Jaipur"; train18.destination = "Delhi";
        Bogie bogie18 = new Bogie(); bogie18.bogieNumber = 18; bogie18.type = "AC3"; bogie18.capacity = 76; bogie18.controller = "Anita R"; bogie18.ac = true;
        train18.bogie = bogie18; train18.getTrainDetails();

        Train train19 = new Train(); train19.trainId = 1019; train19.trainName = "Rajdhani #19"; train19.source = "Delhi"; train19.destination = "Lucknow";
        Bogie bogie19 = new Bogie(); bogie19.bogieNumber = 19; bogie19.type = "SL"; bogie19.capacity = 84; bogie19.controller = "Karan M"; bogie19.ac = false;
        train19.bogie = bogie19; train19.getTrainDetails();

        Train train20 = new Train(); train20.trainId = 1020; train20.trainName = "Shatabdi #20"; train20.source = "Lucknow"; train20.destination = "Ahmedabad";
        Bogie bogie20 = new Bogie(); bogie20.bogieNumber = 20; bogie20.type = "AC2"; bogie20.capacity = 71; bogie20.controller = "Lata B"; bogie20.ac = true;
        train20.bogie = bogie20; train20.getTrainDetails();
    }
}
