class Airlines {

    private String flightNames[] = new String[30];   
    int index;

    public boolean addFlight(String flight) {
        boolean isAdded = false;

        if (flight != null && !flight.isEmpty()) {
           
                flightNames[index] = flight;
                index++;
                isAdded = true;
           
        } else {
            System.out.println(flight + " is invalid");
        }
        return isAdded;
    }

    public void getFlights() {
        for (String f : flightNames) {
           
                System.out.println(f);
            }
        }
    }

