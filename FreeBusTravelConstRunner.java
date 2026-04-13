class FreeBusTravelConstRunner {

public static void main(String[] args) {
Aadhaar aadhaar = new Aadhaar();

aadhaar.aadhaarNumber = 7654321098765L;
aadhaar.name = "Akshatha";
aadhaar.gender = "Female";
aadhaar.address = "Whitefield, Bengaluru - 560066";
aadhaar.validity = "Valid for Shakti Scheme";

FreeBusTravel travel = new FreeBusTravel(3, aadhaar);
travel.getDetails();


}
}