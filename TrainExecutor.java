class TrainExecutor {
    public static void main(String[] args) {
        Bogie bogie1 = new Bogie(1, "AC3", 72, "Ravi K");
        Train train1 = new Train(1001, "Rajdhani #1", "Delhi", "Mumbai", bogie1);
        train1.getTrainDetails();

        Bogie bogie2 = new Bogie(2, "SL", 80, "Priya S");
        Train train2 = new Train(1002, "Shatabdi #2", "Mumbai", "Bengaluru", bogie2);
        train2.getTrainDetails();

        Bogie bogie3 = new Bogie(3, "AC2", 68, "Amit P");
        Train train3 = new Train(1003, "Duronto #3", "Bengaluru", "Chennai", bogie3);
        train3.getTrainDetails();

        Bogie bogie4 = new Bogie(4, "AC3", 75, "Neha G");
        Train train4 = new Train(1004, "Garib Rath #4", "Chennai", "Kolkata", bogie4);
        train4.getTrainDetails();

        Bogie bogie5 = new Bogie(5, "AC1", 60, "Rahul S");
        Train train5 = new Train(1005, "Vande Bharat #5", "Kolkata", "Hyderabad", bogie5);
        train5.getTrainDetails();

        Bogie bogie6 = new Bogie(6, "SEATER", 90, "Sita D");
        Train train6 = new Train(1006, "Tejas #6", "Hyderabad", "Pune", bogie6);
        train6.getTrainDetails();

        Bogie bogie7 = new Bogie(7, "SL", 85, "Vikram J");
        Train train7 = new Train(1007, "Humsafar #7", "Pune", "Jaipur", bogie7);
        train7.getTrainDetails();

        Bogie bogie8 = new Bogie(8, "AC3", 78, "Anita R");
        Train train8 = new Train(1008, "Antyodaya #8", "Jaipur", "Delhi", bogie8);
        train8.getTrainDetails();

        Bogie bogie9 = new Bogie(9, "AC2", 70, "Karan M");
        Train train9 = new Train(1009, "Jan Shatabdi #9", "Delhi", "Lucknow", bogie9);
        train9.getTrainDetails();

        Bogie bogie10 = new Bogie(10, "SL", 82, "Lata B");
        Train train10 = new Train(1010, "Rajdhani #10", "Lucknow", "Ahmedabad", bogie10);
        train10.getTrainDetails();

        Bogie bogie11 = new Bogie(11, "AC1", 65, "Ravi K");
        Train train11 = new Train(1011, "Shatabdi #11", "Ahmedabad", "Mumbai", bogie11);
        train11.getTrainDetails();

        Bogie bogie12 = new Bogie(12, "SEATER", 95, "Priya S");
        Train train12 = new Train(1012, "Duronto #12", "Mumbai", "Bengaluru", bogie12);
        train12.getTrainDetails();

        Bogie bogie13 = new Bogie(13, "AC3", 74, "Amit P");
        Train train13 = new Train(1013, "Garib Rath #13", "Bengaluru", "Chennai", bogie13);
        train13.getTrainDetails();

        Bogie bogie14 = new Bogie(14, "SL", 88, "Neha G");
        Train train14 = new Train(1014, "Vande Bharat #14", "Chennai", "Kolkata", bogie14);
        train14.getTrainDetails();

        Bogie bogie15 = new Bogie(15, "AC2", 69, "Rahul S");
        Train train15 = new Train(1015, "Tejas #15", "Kolkata", "Hyderabad", bogie15);
        train15.getTrainDetails();

        Bogie bogie16 = new Bogie(16, "AC1", 62, "Sita D");
        Train train16 = new Train(1016, "Humsafar #16", "Hyderabad", "Pune", bogie16);
        train16.getTrainDetails();

        Bogie bogie17 = new Bogie(17, "SEATER", 92, "Vikram J");
        Train train17 = new Train(1017, "Antyodaya #17", "Pune", "Jaipur", bogie17);
        train17.getTrainDetails();

        Bogie bogie18 = new Bogie(18, "AC3", 76, "Anita R");
        Train train18 = new Train(1018, "Jan Shatabdi #18", "Jaipur", "Delhi", bogie18);
        train18.getTrainDetails();

        Bogie bogie19 = new Bogie(19, "SL", 84, "Karan M");
        Train train19 = new Train(1019, "Rajdhani #19", "Delhi", "Lucknow", bogie19);
        train19.getTrainDetails();

        Bogie bogie20 = new Bogie(20, "AC2", 71, "Lata B");
        Train train20 = new Train(1020, "Shatabdi #20", "Lucknow", "Ahmedabad", bogie20);
        train20.getTrainDetails();
    }
}