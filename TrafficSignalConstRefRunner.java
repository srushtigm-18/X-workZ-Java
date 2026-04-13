class TrafficSignalConstRefRunner {

    public static void main(String[] police) {
	

        Cop cop = new Cop();
        cop.copId = 1003;
        cop.name = "Anil Patel";
        cop.badgeNumber = "BP-103";
        cop.shift = "Night (10PM-6AM)";
        cop.location = "Jayanagar 4th Block";
        TrafficSignal signal = new TrafficSignal(3, cop);
        signal.getDetails();

    }
}