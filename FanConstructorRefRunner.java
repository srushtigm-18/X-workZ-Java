class FanConstructorRefRunner {

public static void main(String[] a) {

System.out.println("main started");
Capacitor capacitor = new Capacitor();

capacitor.id = 548;
capacitor.brandName = "Havells";
capacitor.colour = "Ivory";
capacitor.speed = 1400; 

Fan fan = new Fan(103, capacitor);

fan.getDetails();
System.out.println("Main ended");
    }
}