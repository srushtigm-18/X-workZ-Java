class TrafficSignalObjRefRunner {

public static void main(String[] police) {

        Cop cop = new Cop();
        TrafficSignal signal = new TrafficSignal(1, cop);
       
	   cop.copId = 1001;
        cop.name = "Ravi Kumar";
        cop.badgeNumber = "BP-101";
        cop.shift = "Morning (6AM-2PM)";
        cop.location = "MG Road Junction";
       
	   signal.getDetails();

    }
}