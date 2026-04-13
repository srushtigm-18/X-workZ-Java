class FreeBusTravelMethodRunner {

    public static void main(String[] args) {

        Aadhaar aadhaar = new Aadhaar();
        aadhaar.aadhaarNumber = 8765432109876L;
        aadhaar.name = "Meghana";
        aadhaar.gender = "Female";
        aadhaar.address = "Koramangala 5th Block, Bengaluru - 560034";
        aadhaar.validity = "Valid for Shakti Scheme";
      
	  FreeBusTravel travel = new FreeBusTravel(2, aadhaar);
        travel.getDetails();
    }
}