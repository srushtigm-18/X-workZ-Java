class ComedyShow {
    String eventName;
    String comedianName;
    double ticketPrice;
    String venue;
    String showType;
    String duration;
    int audienceCapacity;
    String showDate;
    String startTime;
    String bookingId;
    String seatingType;
    double rating;
    String primaryComedian;
    String openingAct;
    String featureAct;
    String headliner;
    String organizer;
    String city;

    public ComedyShow(String eventName, String comedianName, double ticketPrice, String venue, String showType,
                     String duration, int audienceCapacity, String showDate, String startTime,
                     String bookingId, String seatingType, double rating, String primaryComedian, 
                     String openingAct, String featureAct, String headliner, String organizer, 
                     String city) {
        this.eventName = eventName;
        this.comedianName = comedianName;
        this.ticketPrice = ticketPrice;
        this.venue = venue;
        this.showType = showType;
        this.duration = duration;
        this.audienceCapacity = audienceCapacity;
        this.showDate = showDate;
        this.startTime = startTime;
        this.bookingId = bookingId;
        this.seatingType = seatingType;
        this.rating = rating;
        this.primaryComedian = primaryComedian;
        this.openingAct = openingAct;
        this.featureAct = featureAct;
        this.headliner = headliner;
        this.organizer = organizer;
        this.city = city;
    }

    public ComedyShow() {
        this("Laugh Riot 2026", "Kapil Sharma Live", 999.0, "Balewadi High Street", "Stand-up", "90 minutes", 500,
             "2026-04-15", "8:00 PM", "CS001", "Tiered Seating", 4.8, "Kapil Sharma", 
             "Opening Act 1", "Zakir Khan", "Sunil Grover", "Laugh Factory", "Pune");
    }

    public void displayProductInfo() {
        System.out.println("Event: " + eventName);
        System.out.println("Comedian: " + comedianName);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Venue: " + venue);
        System.out.println("Show Type: " + showType);
        System.out.println("Duration: " + duration);
        System.out.println("Capacity: " + audienceCapacity);
        System.out.println("Show Date: " + showDate);
        System.out.println("Start Time: " + startTime);
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Seating: " + seatingType);
        System.out.println("Rating: " + rating + "/5");
        System.out.println("Lineup: " + primaryComedian + ", " + openingAct + 
                          ", " + featureAct + ", " + headliner);
        System.out.println("Organizer: " + organizer);
        System.out.println("City: " + city);
        System.out.println("\n");
    }
}

