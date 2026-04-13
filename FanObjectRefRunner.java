class FanObjectRefRunner {

public static void main(String[] air) {

Capacitor capacitor = new Capacitor();
Fan fan = new Fan(176, capacitor);

capacitor.id = 156;
capacitor.brandName = "Crompton";
capacitor.colour = "White";
capacitor.speed = 380;  
fan.getDetails();

System.out.println("Main ended");
}
}