class FanMethodRefRunner {
public static void main(String[] air) {

System.out.println("main started");
Capacitor capacitor = new Capacitor();

capacitor.id = 502;
capacitor.brandName = "Orient Electric";
capacitor.colour = "Black";
capacitor.speed = 1350; 

Fan fan = new Fan(102, capacitor);
fan.getDetails();
System.out.println("Main ended");
}
}