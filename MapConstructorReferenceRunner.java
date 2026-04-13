class MapConstructorReferenceRunner {

    public static void main(String[] loc) {
	
        Location location = new Location();
		
        location.id = 420;
        location.street = "ITPL Main Road";
        location.area = "Whitefield";
        location.city = "Bengaluru";
        location.pincode = 560066;
		
        Map map = new Map(3, location);
        map.getDetails();
		
    }
}