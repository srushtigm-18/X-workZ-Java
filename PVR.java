class PVR {
    int id;
    String name;
    String type;
    boolean imax;
    String location;
    String seating;
    String soundSystem;
    int price;
    int screens;
    int seats;
    int showsPerDay;
    boolean recliner;
    String brand;
    String format;
    boolean dolbyAtmos;
    int rating;
    String city;
    String amenities;
    boolean goldClass;
    int occupancy;
    double ticketPrice;
    String movieType;
    
    PVR(int id, String name, String type, boolean imax, String location, String seating, 
        String soundSystem, int price, int screens, int seats, int showsPerDay, boolean recliner, 
        String brand, String format, boolean dolbyAtmos, int rating, String city,
        String amenities, boolean goldClass, int occupancy, double ticketPrice, String movieType) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.imax = imax;
        this.location = location;
        this.seating = seating;
        this.soundSystem = soundSystem;
        this.price = price;
        this.screens = screens;
        this.seats = seats;
        this.showsPerDay = showsPerDay;
        this.recliner = recliner;
        this.brand = brand;
        this.format = format;
        this.dolbyAtmos = dolbyAtmos;
        this.rating = rating;
        this.city = city;
        this.amenities = amenities;
        this.goldClass = goldClass;
        this.occupancy = occupancy;
        this.ticketPrice = ticketPrice;
        this.movieType = movieType;
    }
    
    public void getPVRDetails(){
        System.out.println("The PVR id is "+this.id);
        System.out.println("The PVR name is "+this.name);
        System.out.println("The PVR type is "+this.type);
        System.out.println("The PVR has IMAX?.."+this.imax);
        System.out.println("The PVR location is "+this.location);
        System.out.println("The PVR seating is "+this.seating);
        System.out.println("The PVR sound system is "+this.soundSystem);
        System.out.println("The PVR price range is "+this.price);
        System.out.println("The PVR screens count is "+this.screens);
        System.out.println("The PVR seats capacity is "+this.seats);
        System.out.println("The PVR shows per day is "+this.showsPerDay);
        System.out.println("The PVR has recliner?.."+this.recliner);
        System.out.println("The PVR brand is "+this.brand);
        System.out.println("The PVR format is "+this.format);
        System.out.println("The PVR has Dolby Atmos?.."+this.dolbyAtmos);
        System.out.println("The PVR rating is "+this.rating);
        System.out.println("The PVR city is "+this.city);
        System.out.println("The PVR amenities are "+this.amenities);
        System.out.println("The PVR has Gold Class?.."+this.goldClass);
        System.out.println("The PVR occupancy rate is "+this.occupancy);
        System.out.println("The PVR ticket price is "+this.ticketPrice);
        System.out.println("The PVR movie type is "+this.movieType);
        System.out.println("\n");
    }
}


