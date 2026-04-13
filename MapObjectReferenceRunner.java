class MapObjectReferenceRunner {

    public static void main(String[] loc) {
	
        System.out.println("main started");
		
        Location location = new Location();
        Map map = new Map(1, location);
		
        location.id = 108;
        location.street = "4th Main";
        location.area = "Jayanagar";
        location.city = "Bengaluru";
        location.pincode = 560011;
		
        map.getDetails();
        System.out.println("Main ended");
    }
}