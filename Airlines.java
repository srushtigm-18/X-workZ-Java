class Airlines {

    private String flightNames[] = new String[30];
    int index;

    public boolean addFlight(String flight) {
        boolean isAdded = false;
        if (flight != null && !flight.isEmpty()) {
            if (index < flightNames.length) {
                flightNames[index++] = flight;
                isAdded = true;
            } else {
                System.out.println("Flight list is full.");
            }
        } else {
            System.out.println(flight + " is invalid.");
        }
        return isAdded;
    }

    public void getFlights() {
        System.out.println("Airline flights:");
        for (String flt : flightNames) {
            if (flt != null) {
                System.out.println(flt);
            }
        }
    }

    public String getFlightByIndex(int idx) {
        String flightName = null;
        if (idx < flightNames.length && flightNames[idx] != null) {
            flightName = flightNames[idx];
        } else {
            System.out.println("Invalid index: " + idx);
        }
        return flightName;
    }

    public int getIndexByFlightName(String flightName) {
        for (int i = 0; i < index; i++) {
            if (flightNames[i] != null && flightNames[i].equals(flightName)) {
                return i;
            }
        }
        System.out.println("Flight '" + flightName + "' not found.");
        return 0;
    }

    public boolean updateFlight(String existingFlight, String newFlight) {
        boolean isUpdated = false;
        if (newFlight == null && newFlight.isEmpty()) {
            System.out.println(newFlight + " is invalid.");
            return false;
        }
        for (int i = 0; i < index; i++) {
            if (flightNames[i] != null && flightNames[i].equals(existingFlight)) {
                flightNames[i] = newFlight;
                isUpdated = true;
                break;
            }
        }
        if (!isUpdated) {
            System.out.println("Flight '" + existingFlight + "' not found to update.");
        }
        return isUpdated;
    }

    public boolean deleteFlight(String deletingFlight) {
        boolean isDeleted = false;
        for (int i = 0; i < index; i++) {
            if (flightNames[i] != null && flightNames[i].equals(deletingFlight)) {
                for (int j = i; j < index - 1; j++) {
                    flightNames[j] = flightNames[j + 1];
                }
                flightNames[index - 1] = null;
                index--;
                isDeleted = true;
                break;
            }
        }
        if (!isDeleted) {
            System.out.println("Flight '" + deletingFlight + "' not found to delete.");
        }
        return isDeleted;
    }
}
