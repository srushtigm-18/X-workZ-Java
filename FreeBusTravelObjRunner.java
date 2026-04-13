class FreeBusTravelObjRunner {

public static void main(String[] bus) {

Aadhaar aadhaar = new Aadhaar();
FreeBusTravel travel = new FreeBusTravel(1, aadhaar);

aadhaar.aadhaarNumber = 9876543210987L;
aadhaar.name = "Srushti";
aadhaar.gender = "Female";
aadhaar.address = "Jayanagar, Bengaluru - 560011";
aadhaar.validity = "Valid for Shakti Scheme";

travel.getDetails();
}
}