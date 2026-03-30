class GoaExecutor {
    public static void main(String[] args) {
        Goa goa = new Goa();

        goa.addBeach("Calangute Beach");
        goa.addBeach("Baga Beach");
        goa.addBeach("Anjuna Beach");
        goa.addBeach("Vagator Beach");
        goa.addBeach("Morjim Beach");
        goa.addBeach("Arambol Beach");
        goa.addBeach("Palolem Beach");
        goa.addBeach("Agonda Beach");
        goa.addBeach("Candolim Beach");
        goa.addBeach("Sinquerim Beach");
        goa.addBeach("Colva Beach");
        goa.addBeach("Benaulim Beach");
        goa.addBeach("Cavelossim Beach");
        goa.addBeach("Mobor Beach");
        goa.addBeach("Varca Beach");
        goa.addBeach("Betalbatim Beach");
        goa.addBeach("Butterfly Beach");
        goa.addBeach("Turtle Beach");
        goa.addBeach("Donapaula Beach");

        goa.getBeaches();
        System.out.println();

        int index = 18;
        String beach = goa.getBeachByIndex(index);
        System.out.println("The beach at index " + index + " is: " + beach);
        System.out.println();

        String beachName = "Palolem Beach";
        int i = goa.getIndexByBeachName(beachName);
        System.out.println("Beach '" + beachName + "' is at index: " + i);
        System.out.println();

        String updated = "Palolem Beach (Crescent Bay)";
        boolean ref = goa.updateBeach("Palolem Beach", updated);
        goa.getBeaches();
        System.out.println();

        String deleting = "Turtle Beach";
        boolean reff = goa.deleteBeach(deleting);
        goa.getBeaches();
    }
}
