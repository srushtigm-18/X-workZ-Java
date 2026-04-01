class TicketDetails {
    private int ticketId;
    private String passengerName;
    private String fromStation;
    private String toStation;
    private String travelDate;
    private String bookingDate;
    private String status;

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }
    public int getTicketId() {
        return this.ticketId;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
    public String getPassengerName() {
        return this.passengerName;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }
    public String getFromStation() {
        return this.fromStation;
    }

    public void setToStation(String toStation) {
        this.toStation = toStation;
    }
    public String getToStation() {
        return this.toStation;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }
    public String getTravelDate() {
        return this.travelDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }
    public String getBookingDate() {
        return this.bookingDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return this.status;
    }
}