class Museum {
    String museumName;
    int museumId;
    String city;
    String curator;
    Diamond diamond;

    public Museum(String museumName, int museumId, String city, String curator, Diamond diamond) {
        this.museumName = museumName;
        this.museumId = museumId;
        this.city = city;
        this.curator = curator;
        this.diamond = diamond;
    }

    public void getMuseumDetails() {
        System.out.println("Museum: " + this.museumName);
        System.out.println("ID: " + this.museumId);
        System.out.println("City: " + this.city);
        System.out.println("Curator: " + this.curator);
        this.diamond.getDiamondDetails();
        System.out.println("\n");
    }
}
