class FreeBusTravel {

int travelId;

Aadhaar aadhaar;
    
FreeBusTravel(int travelId, Aadhaar aadhaar) {

this.travelId = travelId;
this.aadhaar = aadhaar;
}
    
public void getDetails() {

System.out.println("FreeBusTravel id is: " + this.travelId);
System.out.println("Aadhaar number is: " + this.aadhaar.aadhaarNumber);
System.out.println("Aadhaar name is: " + this.aadhaar.name);
System.out.println("Aadhaar gender is: " + this.aadhaar.gender);
System.out.println("Aadhaar address is: " + this.aadhaar.address);
System.out.println("Aadhaar validity is: " + this.aadhaar.validity);
}
}