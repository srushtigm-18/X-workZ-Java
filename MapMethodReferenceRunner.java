class MapMethodReferenceRunner {
    public static void main(String[] a) {
	
        System.out.println("main started");
		
        Location location = new Location();
        location.id = 110;
        location.street = "80 Feet Road";
        location.area = "Koramangala";
        location.city = "Bengaluru";
        location.pincode = 560034;
		
        Map map = new Map(2, location);
		
        map.getDetails();
        System.out.println("Main ended");
    }
}