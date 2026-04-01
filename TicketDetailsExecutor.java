class TicketDetailsExecutor {
    public static void main(String[] args) {
        
        TicketDetails ticket1 = new TicketDetails();
        ticket1.setTicketId(5001); 
        ticket1.setPassengerName("srushti");
        ticket1.setFromStation("Bengaluru");
        ticket1.setToStation("Mumbai"); 
        ticket1.setTravelDate("2026-04-05"); 
        ticket1.setBookingDate("2026-03-31"); 
        ticket1.setStatus("confirmed");

        System.out.println("Ticket id is " + ticket1.getTicketId());
        System.out.println("Passenger name is " + ticket1.getPassengerName());
        System.out.println("From station is " + ticket1.getFromStation());
        System.out.println("To station is " + ticket1.getToStation());
        System.out.println("Travel date is " + ticket1.getTravelDate());
        System.out.println("Booking date is " + ticket1.getBookingDate());
        System.out.println("Status is " + ticket1.getStatus());
        System.out.println();

        TicketDetails ticket2 = new TicketDetails();
        ticket2.setTicketId(5002); 
        ticket2.setPassengerName("rahul"); 
        ticket2.setFromStation("Delhi");
        ticket2.setToStation("Chennai");
        ticket2.setTravelDate("2026-04-06");
        ticket2.setBookingDate("2026-03-31");
        ticket2.setStatus("waitlisted");

        System.out.println("Ticket id is " + ticket2.getTicketId());
        System.out.println("Passenger name is " + ticket2.getPassengerName());
        System.out.println("From station is " + ticket2.getFromStation());
        System.out.println("To station is " + ticket2.getToStation());
        System.out.println("Travel date is " + ticket2.getTravelDate());
        System.out.println("Booking date is " + ticket2.getBookingDate());
        System.out.println("Status is " + ticket2.getStatus());
        System.out.println();

        TicketDetails ticket3 = new TicketDetails();
        ticket3.setTicketId(5003); 
        ticket3.setPassengerName("priya"); 
        ticket3.setFromStation("Bengaluru");
        ticket3.setToStation("Hyderabad");
        ticket3.setTravelDate("2026-04-07");
        ticket3.setBookingDate("2026-03-31");
        ticket3.setStatus("confirmed");

        System.out.println("Ticket id is " + ticket3.getTicketId());
        System.out.println("Passenger name is " + ticket3.getPassengerName());
        System.out.println("From station is " + ticket3.getFromStation());
        System.out.println("To station is " + ticket3.getToStation());
        System.out.println("Travel date is " + ticket3.getTravelDate());
        System.out.println("Booking date is " + ticket3.getBookingDate());
        System.out.println("Status is " + ticket3.getStatus());
        System.out.println();

        TicketDetails ticket4 = new TicketDetails();
        ticket4.setTicketId(5004); 
        ticket4.setPassengerName("arjun"); 
        ticket4.setFromStation("Mumbai");
        ticket4.setToStation("Delhi");
        ticket4.setTravelDate("2026-04-08");
        ticket4.setBookingDate("2026-03-31");
        ticket4.setStatus("RAC");

        System.out.println("Ticket id is " + ticket4.getTicketId());
        System.out.println("Passenger name is " + ticket4.getPassengerName());
        System.out.println("From station is " + ticket4.getFromStation());
        System.out.println("To station is " + ticket4.getToStation());
        System.out.println("Travel date is " + ticket4.getTravelDate());
        System.out.println("Booking date is " + ticket4.getBookingDate());
        System.out.println("Status is " + ticket4.getStatus());
        System.out.println();

        TicketDetails ticket5 = new TicketDetails();
        ticket5.setTicketId(5005); 
        ticket5.setPassengerName("neha"); 
        ticket5.setFromStation("Chennai");
        ticket5.setToStation("Kolkata");
        ticket5.setTravelDate("2026-04-09");
        ticket5.setStatus("waitlisted");

        System.out.println("Ticket id is " + ticket5.getTicketId());
        System.out.println("Passenger name is " + ticket5.getPassengerName());
        System.out.println("From station is " + ticket5.getFromStation());
        System.out.println("To station is " + ticket5.getToStation());
        System.out.println("Travel date is " + ticket5.getTravelDate());
        System.out.println("Booking date is " + ticket5.getBookingDate());
        System.out.println("Status is " + ticket5.getStatus());
        System.out.println();
		
		TicketDetails ticket6 = new TicketDetails();
        ticket6.setTicketId(5006); 
        ticket6.setPassengerName("vikas"); 
        ticket6.setFromStation("Hyderabad");
        ticket6.setToStation("Bengaluru");
        ticket6.setTravelDate("2026-04-10");
        ticket6.setBookingDate("2026-03-31");
        ticket6.setStatus("confirmed");

        System.out.println("Ticket id is " + ticket6.getTicketId());
        System.out.println("Passenger name is " + ticket6.getPassengerName());
        System.out.println("From station is " + ticket6.getFromStation());
        System.out.println("To station is " + ticket6.getToStation());
        System.out.println("Travel date is " + ticket6.getTravelDate());
        System.out.println("Booking date is " + ticket6.getBookingDate());
        System.out.println("Status is " + ticket6.getStatus());
        System.out.println();

        TicketDetails ticket7 = new TicketDetails();
        ticket7.setTicketId(5007); 
        ticket7.setPassengerName("anita"); 
        ticket7.setFromStation("Kolkata");
        ticket7.setToStation("Delhi");
        ticket7.setTravelDate("2026-04-11");
        ticket7.setBookingDate("2026-03-31");
        ticket7.setStatus("cancelled");

        System.out.println("Ticket id is " + ticket7.getTicketId());
        System.out.println("Passenger name is " + ticket7.getPassengerName());
        System.out.println("From station is " + ticket7.getFromStation());
        System.out.println("To station is " + ticket7.getToStation());
        System.out.println("Travel date is " + ticket7.getTravelDate());
        System.out.println("Booking date is " + ticket7.getBookingDate());
        System.out.println("Status is " + ticket7.getStatus());
        System.out.println();

        TicketDetails ticket8 = new TicketDetails();
        ticket8.setTicketId(5008); 
        ticket8.setPassengerName("kiran"); 
        ticket8.setFromStation("Pune");
        ticket8.setToStation("Chennai");
        ticket8.setTravelDate("2026-04-12");
        ticket8.setStatus("RAC");

        System.out.println("Ticket id is " + ticket8.getTicketId());
        System.out.println("Passenger name is " + ticket8.getPassengerName());
        System.out.println("From station is " + ticket8.getFromStation());
        System.out.println("To station is " + ticket8.getToStation());
        System.out.println("Travel date is " + ticket8.getTravelDate());
        System.out.println("Booking date is " + ticket8.getBookingDate());
        System.out.println("Status is " + ticket8.getStatus());
        System.out.println();
		
		
		TicketDetails ticket9 = new TicketDetails();
        ticket9.setTicketId(5009); 
        ticket9.setPassengerName("meera"); 
        ticket9.setFromStation("Delhi");
        ticket9.setToStation("Bengaluru");
        ticket9.setTravelDate("2026-04-13");
        ticket9.setBookingDate("2026-03-31");
        ticket9.setStatus("confirmed");

        System.out.println("Ticket id is " + ticket9.getTicketId());
        System.out.println("Passenger name is " + ticket9.getPassengerName());
        System.out.println("From station is " + ticket9.getFromStation());
        System.out.println("To station is " + ticket9.getToStation());
        System.out.println("Travel date is " + ticket9.getTravelDate());
        System.out.println("Booking date is " + ticket9.getBookingDate());
        System.out.println("Status is " + ticket9.getStatus());
        System.out.println();

        TicketDetails ticket10 = new TicketDetails();
        ticket10.setTicketId(5010); 
        ticket10.setPassengerName("rohit"); 
        ticket10.setFromStation("Mumbai");
        ticket10.setToStation("Kolkata");
        ticket10.setTravelDate("2026-04-14");
        ticket10.setBookingDate("2026-03-31");
        ticket10.setStatus("waitlisted");

        System.out.println("Ticket id is " + ticket10.getTicketId());
        System.out.println("Passenger name is " + ticket10.getPassengerName());
        System.out.println("From station is " + ticket10.getFromStation());
        System.out.println("To station is " + ticket10.getToStation());
        System.out.println("Travel date is " + ticket10.getTravelDate());
        System.out.println("Booking date is " + ticket10.getBookingDate());
        System.out.println("Status is " + ticket10.getStatus());
        System.out.println();

        TicketDetails ticket11 = new TicketDetails();
        ticket11.setTicketId(5011); 
        ticket11.setPassengerName("divya"); 
        ticket11.setFromStation("Chennai");
        ticket11.setToStation("Hyderabad");
        ticket11.setTravelDate("2026-04-15");
        ticket11.setBookingDate("2026-03-31");
        ticket11.setStatus("RAC");

        System.out.println("Ticket id is " + ticket11.getTicketId());
        System.out.println("Passenger name is " + ticket11.getPassengerName());
        System.out.println("From station is " + ticket11.getFromStation());
        System.out.println("To station is " + ticket11.getToStation());
        System.out.println("Travel date is " + ticket11.getTravelDate());
        System.out.println("Booking date is " + ticket11.getBookingDate());
        System.out.println("Status is " + ticket11.getStatus());
        System.out.println();
		
		TicketDetails ticket12 = new TicketDetails();
        ticket12.setTicketId(5012); 
        ticket12.setPassengerName("sameer"); 
        ticket12.setFromStation("Hyderabad");
        ticket12.setToStation("Pune");
        ticket12.setTravelDate("2026-04-16");
        ticket12.setBookingDate("2026-03-31");
        ticket12.setStatus("confirmed");

        System.out.println("Ticket id is " + ticket12.getTicketId());
        System.out.println("Passenger name is " + ticket12.getPassengerName());
        System.out.println("From station is " + ticket12.getFromStation());
        System.out.println("To station is " + ticket12.getToStation());
        System.out.println("Travel date is " + ticket12.getTravelDate());
        System.out.println("Booking date is " + ticket12.getBookingDate());
        System.out.println("Status is " + ticket12.getStatus());
        System.out.println();

        TicketDetails ticket13 = new TicketDetails();
        ticket13.setTicketId(5013); 
        ticket13.setPassengerName("lata"); 
        ticket13.setFromStation("Kolkata");
        ticket13.setToStation("Mumbai");
        ticket13.setTravelDate("2026-04-17");
        ticket13.setBookingDate("2026-03-31");
        ticket13.setStatus("waitlisted");

        System.out.println("Ticket id is " + ticket13.getTicketId());
        System.out.println("Passenger name is " + ticket13.getPassengerName());
        System.out.println("From station is " + ticket13.getFromStation());
        System.out.println("To station is " + ticket13.getToStation());
        System.out.println("Travel date is " + ticket13.getTravelDate());
        System.out.println("Booking date is " + ticket13.getBookingDate());
        System.out.println("Status is " + ticket13.getStatus());
        System.out.println();

        TicketDetails ticket14 = new TicketDetails();
        ticket14.setTicketId(5014); 
        ticket14.setPassengerName("nikhil"); 
        ticket14.setFromStation("Delhi");
        ticket14.setToStation("Chennai");
        ticket14.setTravelDate("2026-04-18");
        ticket14.setBookingDate("2026-03-31");
        ticket14.setStatus("RAC");

        System.out.println("Ticket id is " + ticket14.getTicketId());
        System.out.println("Passenger name is " + ticket14.getPassengerName());
        System.out.println("From station is " + ticket14.getFromStation());
        System.out.println("To station is " + ticket14.getToStation());
        System.out.println("Travel date is " + ticket14.getTravelDate());
        System.out.println("Booking date is " + ticket14.getBookingDate());
        System.out.println("Status is " + ticket14.getStatus());
        System.out.println();

        TicketDetails ticket15 = new TicketDetails();
        ticket15.setTicketId(5015); 
        ticket15.setPassengerName("shweta"); 
        ticket15.setFromStation("Bengaluru");
        ticket15.setToStation("Kolkata");
        ticket15.setTravelDate("2026-04-19");
        ticket15.setBookingDate("2026-03-31");
        ticket15.setStatus("cancelled");

        System.out.println("Ticket id is " + ticket15.getTicketId());
        System.out.println("Passenger name is " + ticket15.getPassengerName());
        System.out.println("From station is " + ticket15.getFromStation());
        System.out.println("To station is " + ticket15.getToStation());
        System.out.println("Travel date is " + ticket15.getTravelDate());
        System.out.println("Booking date is " + ticket15.getBookingDate());
        System.out.println("Status is " + ticket15.getStatus());
        System.out.println();

        TicketDetails ticket16 = new TicketDetails();
        ticket16.setTicketId(5016); 
        ticket16.setPassengerName("gopal"); 
        ticket16.setFromStation("Pune");
        ticket16.setToStation("Hyderabad");
        ticket16.setTravelDate("2026-04-20");
        ticket16.setBookingDate("2026-03-31");
        ticket16.setStatus("confirmed");

        System.out.println("Ticket id is " + ticket16.getTicketId());
        System.out.println("Passenger name is " + ticket16.getPassengerName());
        System.out.println("From station is " + ticket16.getFromStation());
        System.out.println("To station is " + ticket16.getToStation());
        System.out.println("Travel date is " + ticket16.getTravelDate());
        System.out.println("Booking date is " + ticket16.getBookingDate());
        System.out.println("Status is " + ticket16.getStatus());
        System.out.println();
		
		TicketDetails ticket17 = new TicketDetails();
        ticket17.setTicketId(5017); 
        ticket17.setPassengerName("rani"); 
        ticket17.setFromStation("Mumbai");
        ticket17.setToStation("Bengaluru");
        ticket17.setTravelDate("2026-04-21");
        ticket17.setBookingDate("2026-03-31");
        ticket17.setStatus("confirmed");

        System.out.println("Ticket id is " + ticket17.getTicketId());
        System.out.println("Passenger name is " + ticket17.getPassengerName());
        System.out.println("From station is " + ticket17.getFromStation());
        System.out.println("To station is " + ticket17.getToStation());
        System.out.println("Travel date is " + ticket17.getTravelDate());
        System.out.println("Booking date is " + ticket17.getBookingDate());
        System.out.println("Status is " + ticket17.getStatus());
        System.out.println();

        TicketDetails ticket18 = new TicketDetails();
        ticket18.setTicketId(5018); 
        ticket18.setPassengerName("tejas"); 
        ticket18.setFromStation("Delhi");
        ticket18.setToStation("Pune");
        ticket18.setTravelDate("2026-04-22");
        ticket18.setBookingDate("2026-03-31");
        ticket18.setStatus("waitlisted");

        System.out.println("Ticket id is " + ticket18.getTicketId());
        System.out.println("Passenger name is " + ticket18.getPassengerName());
        System.out.println("From station is " + ticket18.getFromStation());
        System.out.println("To station is " + ticket18.getToStation());
        System.out.println("Travel date is " + ticket18.getTravelDate());
        System.out.println("Booking date is " + ticket18.getBookingDate());
        System.out.println("Status is " + ticket18.getStatus());
        System.out.println();

        TicketDetails ticket19 = new TicketDetails();
        ticket19.setTicketId(5019); 
        ticket19.setPassengerName("uma"); 
        ticket19.setFromStation("Chennai");
        ticket19.setToStation("Kolkata");
        ticket19.setTravelDate("2026-04-23");
        ticket19.setBookingDate("2026-03-31");
        ticket19.setStatus("RAC");

        System.out.println("Ticket id is " + ticket19.getTicketId());
        System.out.println("Passenger name is " + ticket19.getPassengerName());
        System.out.println("From station is " + ticket19.getFromStation());
        System.out.println("To station is " + ticket19.getToStation());
        System.out.println("Travel date is " + ticket19.getTravelDate());
        System.out.println("Booking date is " + ticket19.getBookingDate());
        System.out.println("Status is " + ticket19.getStatus());
        System.out.println();

        TicketDetails ticket20 = new TicketDetails();
        ticket20.setTicketId(5020); 
        ticket20.setPassengerName("varun"); 
        ticket20.setFromStation("Hyderabad");
        ticket20.setToStation("Delhi");
        ticket20.setTravelDate("2026-04-24");
        ticket20.setBookingDate("2026-03-31");
        ticket20.setStatus("cancelled");

        System.out.println("Ticket id is " + ticket20.getTicketId());
        System.out.println("Passenger name is " + ticket20.getPassengerName());
        System.out.println("From station is " + ticket20.getFromStation());
        System.out.println("To station is " + ticket20.getToStation());
        System.out.println("Travel date is " + ticket20.getTravelDate());
        System.out.println("Booking date is " + ticket20.getBookingDate());
        System.out.println("Status is " + ticket20.getStatus());
        System.out.println();
		
		
		TicketDetails ticket21 = new TicketDetails();
        ticket21.setTicketId(5021); 
        ticket21.setPassengerName("yamini"); 
        ticket21.setFromStation("Bengaluru");
        ticket21.setToStation("Delhi");
        ticket21.setTravelDate("2026-04-25");
        ticket21.setBookingDate("2026-03-31");
        ticket21.setStatus("confirmed");

        System.out.println("Ticket id is " + ticket21.getTicketId());
        System.out.println("Passenger name is " + ticket21.getPassengerName());
        System.out.println("From station is " + ticket21.getFromStation());
        System.out.println("To station is " + ticket21.getToStation());
        System.out.println("Travel date is " + ticket21.getTravelDate());
        System.out.println("Booking date is " + ticket21.getBookingDate());
        System.out.println("Status is " + ticket21.getStatus());
        System.out.println();

        TicketDetails ticket22 = new TicketDetails();
        ticket22.setTicketId(5022); 
        ticket22.setPassengerName("zara"); 
        ticket22.setFromStation("Mumbai");
        ticket22.setToStation("Chennai");
        ticket22.setTravelDate("2026-04-26");
        ticket22.setBookingDate("2026-03-31");
        ticket22.setStatus("waitlisted");

        System.out.println("Ticket id is " + ticket22.getTicketId());
        System.out.println("Passenger name is " + ticket22.getPassengerName());
        System.out.println("From station is " + ticket22.getFromStation());
        System.out.println("To station is " + ticket22.getToStation());
        System.out.println("Travel date is " + ticket22.getTravelDate());
        System.out.println("Booking date is " + ticket22.getBookingDate());
        System.out.println("Status is " + ticket22.getStatus());
        System.out.println();

        TicketDetails ticket23 = new TicketDetails();
        ticket23.setTicketId(5023); 
        ticket23.setPassengerName("ajay"); 
        ticket23.setFromStation("Kolkata");
        ticket23.setToStation("Hyderabad");
        ticket23.setTravelDate("2026-04-27");
        ticket23.setBookingDate("2026-03-31");
        ticket23.setStatus("RAC");

        System.out.println("Ticket id is " + ticket23.getTicketId());
        System.out.println("Passenger name is " + ticket23.getPassengerName());
        System.out.println("From station is " + ticket23.getFromStation());
        System.out.println("To station is " + ticket23.getToStation());
        System.out.println("Travel date is " + ticket23.getTravelDate());
        System.out.println("Booking date is " + ticket23.getBookingDate());
        System.out.println("Status is " + ticket23.getStatus());
        System.out.println();

        TicketDetails ticket24 = new TicketDetails();
        ticket24.setTicketId(5024); 
        ticket24.setPassengerName("bindu"); 
        ticket24.setFromStation("Pune");
        ticket24.setToStation("Bengaluru");
        ticket24.setTravelDate("2026-04-28");
        ticket24.setBookingDate("2026-03-31");
        ticket24.setStatus("cancelled");

        System.out.println("Ticket id is " + ticket24.getTicketId());
        System.out.println("Passenger name is " + ticket24.getPassengerName());
        System.out.println("From station is " + ticket24.getFromStation());
        System.out.println("To station is " + ticket24.getToStation());
        System.out.println("Travel date is " + ticket24.getTravelDate());
        System.out.println("Booking date is " + ticket24.getBookingDate());
        System.out.println("Status is " + ticket24.getStatus());
        System.out.println();
		
		TicketDetails ticket25 = new TicketDetails();
        ticket25.setTicketId(5025); 
        ticket25.setPassengerName("chandu"); 
        ticket25.setFromStation("Delhi");
        ticket25.setToStation("Mumbai");
        ticket25.setTravelDate("2026-04-29");
        ticket25.setBookingDate("2026-03-31");
        ticket25.setStatus("confirmed");

        System.out.println("Ticket id is " + ticket25.getTicketId());
        System.out.println("Passenger name is " + ticket25.getPassengerName());
        System.out.println("From station is " + ticket25.getFromStation());
        System.out.println("To station is " + ticket25.getToStation());
        System.out.println("Travel date is " + ticket25.getTravelDate());
        System.out.println("Booking date is " + ticket25.getBookingDate());
        System.out.println("Status is " + ticket25.getStatus());
        System.out.println();

        TicketDetails ticket26 = new TicketDetails();
        ticket26.setTicketId(5026); 
        ticket26.setPassengerName("deepa"); 
        ticket26.setFromStation("Chennai");
        ticket26.setToStation("Pune");
        ticket26.setTravelDate("2026-04-30");
        ticket26.setBookingDate("2026-03-31");
        ticket26.setStatus("waitlisted");

        System.out.println("Ticket id is " + ticket26.getTicketId());
        System.out.println("Passenger name is " + ticket26.getPassengerName());
        System.out.println("From station is " + ticket26.getFromStation());
        System.out.println("To station is " + ticket26.getToStation());
        System.out.println("Travel date is " + ticket26.getTravelDate());
        System.out.println("Booking date is " + ticket26.getBookingDate());
        System.out.println("Status is " + ticket26.getStatus());
        System.out.println();

        TicketDetails ticket27 = new TicketDetails();
        ticket27.setTicketId(5027); 
        ticket27.setPassengerName("ekta"); 
        ticket27.setFromStation("Kolkata");
        ticket27.setToStation("Bengaluru");
        ticket27.setTravelDate("2026-05-01");
        ticket27.setBookingDate("2026-03-31");
        ticket27.setStatus("RAC");

        System.out.println("Ticket id is " + ticket27.getTicketId());
        System.out.println("Passenger name is " + ticket27.getPassengerName());
        System.out.println("From station is " + ticket27.getFromStation());
        System.out.println("To station is " + ticket27.getToStation());
        System.out.println("Travel date is " + ticket27.getTravelDate());
        System.out.println("Booking date is " + ticket27.getBookingDate());
        System.out.println("Status is " + ticket27.getStatus());
        System.out.println();

        TicketDetails ticket28 = new TicketDetails();
        ticket28.setTicketId(5028); 
        ticket28.setPassengerName("farhan"); 
        ticket28.setFromStation("Hyderabad");
        ticket28.setToStation("Chennai");
        ticket28.setTravelDate("2026-05-02");
        ticket28.setBookingDate("2026-03-31");
        ticket28.setStatus("cancelled");

        System.out.println("Ticket id is " + ticket28.getTicketId());
        System.out.println("Passenger name is " + ticket28.getPassengerName());
        System.out.println("From station is " + ticket28.getFromStation());
        System.out.println("To station is " + ticket28.getToStation());
        System.out.println("Travel date is " + ticket28.getTravelDate());
        System.out.println("Booking date is " + ticket28.getBookingDate());
        System.out.println("Status is " + ticket28.getStatus());
        System.out.println();

        TicketDetails ticket29 = new TicketDetails();
        ticket29.setTicketId(5029); 
        ticket29.setPassengerName("gayatri"); 
        ticket29.setFromStation("Pune");
        ticket29.setToStation("Delhi");
        ticket29.setTravelDate("2026-05-03");
        ticket29.setBookingDate("2026-03-31");
        ticket29.setStatus("confirmed");

        System.out.println("Ticket id is " + ticket29.getTicketId());
        System.out.println("Passenger name is " + ticket29.getPassengerName());
        System.out.println("From station is " + ticket29.getFromStation());
        System.out.println("To station is " + ticket29.getToStation());
        System.out.println("Travel date is " + ticket29.getTravelDate());
        System.out.println("Booking date is " + ticket29.getBookingDate());
        System.out.println("Status is " + ticket29.getStatus());
        System.out.println();
    }
}