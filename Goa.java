class Goa {

    private String beachNames[] = new String[19];
   int index;

    public boolean addBeach(String beach) {
        boolean isAdded = false;
        if (beach != null && !beach.isEmpty()) {
            if (index < beachNames.length) {
                beachNames[index] = beach;
                index++;
                isAdded = true;
            } else {
                System.out.println("Beach list is full.");
            }
        } else {
            System.out.println(beach + " is invalid.");
        }
        return isAdded;
    }

    public void getBeaches() {
        System.out.println("Beaches in Goa:");
        for (String b : beachNames) {
            if (b != null) {
                System.out.println(b);
            }
        }
    }



    public String getBeachByIndex(int idx) {
        if (idx >= 0 && idx < beachNames.length && beachNames[idx] != null) {
            return beachNames[idx];
        } else {
            System.out.println("Invalid index: " + idx);
            return null;
        }
    }

    public int getIndexByBeachName(String beachName) {
        for (int i = 0; i < index; i++) {
            if (beachNames[i] != null && beachNames[i].equals(beachName)) {
                return i;
            }
        }
        System.out.println("Beach '" + beachName + "' not found.");
        return 0;
    }


    public boolean updateBeach(String existingBeach, String newBeach) {
        boolean isUpdated = false;
        if (newBeach == null && newBeach.isEmpty()) {
            System.out.println(newBeach + " is invalid.");
            return false;
        }
        for (int i = 0; i < index; i++) {
            if (beachNames[i] != null && beachNames[i].equals(existingBeach)) {
                beachNames[i] = newBeach;
                isUpdated = true;
                break;
            }
        }
        if (!isUpdated) {
            System.out.println("Beach '" + existingBeach + "' not found to update.");
        }
        return isUpdated;
    }



    public boolean deleteBeach(String deletingBeach) {
        boolean isDeleted = false;
        for (int i = 0; i < index; i++) {
            if (beachNames[i] != null && beachNames[i].equals(deletingBeach)) {
                for (int j = i; j < index - 1; j++) {
                    beachNames[j] = beachNames[j + 1];
                }
                beachNames[index - 1] = null;
                index--;
                isDeleted = true;
                break;
            }
        }
        if (!isDeleted) {
            System.out.println("Beach '" + deletingBeach + "' not found to delete.");
        }
        return isDeleted;
    }
}
