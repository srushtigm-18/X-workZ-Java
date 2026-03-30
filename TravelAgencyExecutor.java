class TravelAgencyExecutor {
    public static void main(String[] args) {
        TravelAgency agency = new TravelAgency();

        agency.addPlace("Goa");
        agency.addPlace("Manali");
        agency.addPlace("Shimla");
        agency.addPlace("Ooty");
        agency.addPlace("Mysore");
        agency.addPlace("Coorg");
        agency.addPlace("Wayanad");
        agency.addPlace("Rishikesh");
        agency.addPlace("Ladakh");
        agency.addPlace("Andaman");
        agency.addPlace("Kerala Backwaters");
        agency.addPlace("Darjeeling");
        agency.addPlace("Leh");
        agency.addPlace("Agra");
        agency.addPlace("Jaipur");
        agency.addPlace("Mumbai");
        agency.addPlace("Bengaluru");

        agency.getPlaces();
        System.out.println();

        int index = 9;
        String place = agency.getPlaceNameByIndex(index);
        System.out.println("The place at index " + index + " is: " + place);
        System.out.println();

        String placeName = "Coorg";
        int i = agency.getIndexByPlaceName(placeName);
        System.out.println();

        String updated = "Leh–Ladakh Combo";
        boolean ref = agency.updatePlace("Ladakh", updated);
        agency.getPlaces();
        System.out.println();

        String deleting = "Rishikesh";
        boolean reff = agency.deletePlace(deleting);
        agency.getPlaces();
    }
}