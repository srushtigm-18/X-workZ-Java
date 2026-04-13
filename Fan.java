class Fan {
int fanId;
Capacitor capacitor;
    
Fan(int fanId, Capacitor capacitor) {

this.fanId = fanId;

this.capacitor = capacitor;
}
    
public void getDetails() {
System.out.println("Fan id is: " + this.fanId);
System.out.println("Capacitor id is: " + this.capacitor.id);
System.out.println("Capacitor brandName is: " + this.capacitor.brandName);
System.out.println("Capacitor colour is: " + this.capacitor.colour);
System.out.println("Capacitor speed is: " + this.capacitor.speed);
}
}