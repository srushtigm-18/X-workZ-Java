class Museum {
private String historicalMonuments[] = new String[16];
int index;
public boolean addMonument(String monument) {
        boolean isAdded = false;
        if (monument != null && !monument.isEmpty()) {
            if (index < historicalMonuments.length) {
                historicalMonuments[index] = monument;
                index++;
                isAdded = true;
            } else {
                System.out.println("Monument list is full.");
            }
        } else {
            System.out.println(monument + " is invalid.");
        }
        return isAdded;
    }


    public void getMonuments() {
        System.out.println("Historical monuments:");
        for (String mon : historicalMonuments) {
            if (mon != null) {
                System.out.println(mon);
            }
        }
    }


    public String getMonumentNameByIndex(int idx) {
        String monument = null;
        if (idx >= 0 && idx < historicalMonuments.length && historicalMonuments[idx] != null) {
            monument = historicalMonuments[idx];
        } else {
            System.out.println("Invalid index: " + idx);
        }
        return monument;
    }


    public int getIndexByMonumentName(String monument) {
        for (int i = 0; i < index; i++) {
            if (historicalMonuments[i] != null && historicalMonuments[i].equals(monument)) {
                return i;
            }
        }
        System.out.println("Monument '" + monument + "' not found.");
        return 0;
    }



    public boolean updateMonument(String existingMonument, String newMonument) {
        boolean isUpdated = false;
        if (newMonument == null && newMonument.isEmpty()) {
            System.out.println(newMonument + " is invalid.");
            return false;
        }
        for (int i = 0; i < index; i++) {
            if (historicalMonuments[i] != null && historicalMonuments[i].equals(existingMonument)) {
                historicalMonuments[i] = newMonument;
                isUpdated = true;
                break;
            }
        }
        if (!isUpdated) {
            System.out.println("Monument '" + existingMonument + "' not found to update.");
        }
        return isUpdated;
    }



    public boolean deleteMonument(String deletingMonument) {
        boolean isDeleted = false;
        for (int i = 0; i < index; i++) {
            if (historicalMonuments[i] != null && historicalMonuments[i].equals(deletingMonument)) {
                for (int j = i; j < index - 1; j++) {
                    historicalMonuments[j] = historicalMonuments[j + 1];
                }
                historicalMonuments[index - 1] = null;
                index--;
                isDeleted = true;
                break;
            }
        }
        if (!isDeleted) {
            System.out.println("Monument '" + deletingMonument + "' not found to delete.");
        }
        return isDeleted;
    }
}