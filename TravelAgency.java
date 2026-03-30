class TravelAgency {

    private String places[] = new String[17];
    private int index;

    public boolean addPlace(String place) {
        boolean isAdded = false;
        if (place != null && !place.isEmpty()) {
            if (index < places.length) {
                places[index] = place;
                index++;
                isAdded = true;
            } else {
                System.out.println("Place list is full.");
            }
        } else {
            System.out.println(place + " is invalid.");
        }
        return isAdded;
    }

    public void getPlaces() {
        System.out.println("Travel destinations:");
        for (String p : places) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }

    public String getPlaceNameByIndex(int idx) {
        String place = null;
        if (idx >= 0 && idx < places.length && places[idx] != null) {
            place = places[idx];
        } else {
            System.out.println("Invalid index: " + idx);
        }
        return place;
    }

    public int getIndexByPlaceName(String location) {
        for (int i = 0; i < index; i++) {
            if (places[i] != null && places[i].equals(location)) {
                return i;
            }
        }
        System.out.println("Place '" + location + "' not found.");
        return 0;
    }

    public boolean updatePlace(String existingPlace, String updatingPlace) {
        boolean isUpdated = false;
        if (updatingPlace == null && updatingPlace.isEmpty()) {
            System.out.println(updatingPlace + " is invalid.");
            return false;
        }
        for (int i = 0; i < index; i++) {
            if (places[i] != null && places[i].equals(existingPlace)) {
                places[i] = updatingPlace;
                isUpdated = true;
            }
        }
        if (!isUpdated) {
            System.out.println("Place '" + existingPlace + "' not found to update.");
        }
        return isUpdated;
    }

    public boolean deletePlace(String deletingPlace) {
        boolean isDeleted = false;
        for (int i = 0; i < index; i++) {
            if (places[i] != null && places[i].equals(deletingPlace)) {
                for (int j = i; j < index - 1; j++) {
                    places[j] = places[j + 1];
                }
                places[index - 1] = null;
                index--;
                isDeleted = true;
            }
        }
        if (!isDeleted) {
            System.out.println("Place '" + deletingPlace + "' not found to delete.");
        }
        return isDeleted;
    }
}