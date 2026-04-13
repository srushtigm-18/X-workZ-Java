class TrafficSignalMethodRefRunner {

    public static void main(String[] police) {


        Cop cop = new Cop();
        cop.copId = 1002;
        cop.name = "Priya Sharma";
        cop.badgeNumber = "BP-102";
        cop.shift = "Afternoon (2PM-10PM)";
        cop.location = "Brigade Road";
        TrafficSignal signal = new TrafficSignal(2, cop);
        signal.getDetails();


    }
}