class Ipl {

int iplId;
RCB rcb;
    
Ipl(int iplId, RCB rcb) {
this.iplId = iplId;
this.rcb = rcb;
}
    
public void getDetails() {
System.out.println("IPL id is: " + this.iplId);
System.out.println("RCB team id is: " + this.rcb.teamId);
System.out.println("RCB captain is: " + this.rcb.captain);
System.out.println("RCB coach is: " + this.rcb.coach);
}
}