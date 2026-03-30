class State {

    private String highways[] = new String[9];
    private int index;

    public boolean addHighway(String highway) {
        boolean isAdded = false;
        if (highway != null && !highway.isEmpty()) {
            if (index < highways.length) {
                highways[index] = highway;
                index++;
                isAdded = true;
            } else {
                System.out.println("Highway list is full.");
            }
        } else {
            System.out.println(highway + " is invalid.");
        }
        return isAdded;
    }

    public void getHighways() {
        System.out.println("National Highways:");
        for (String h : highways) {
            if (h != null) {
                System.out.println(h);
            }
        }
    }

    public String getHighwayNameByIndex(int idx) {
        String highway = null;
        if (idx < highways.length && highways[idx] != null) {
            highway = highways[idx];
        } else {
            System.out.println("Invalid index: " + idx);
        }
        return highway;
    }

    public int getIndexByHighwayName(String highway) {
        for (int i = 0; i < index; i++) {
            if (highways[i] != null && highways[i].equals(highway)) {
                return i;
            }
        }
        System.out.println("Highway '" + highway + "' not found.");
        return 0;
    }

    public boolean updateHighway(String existingHighway, String newHighway) {
        boolean isUpdated = false;
        if (newHighway == null || newHighway.isEmpty()) {
            System.out.println(newHighway + " is invalid.");
            return false;
        }
        for (int i = 0; i < index; i++) {
            if (highways[i] != null && highways[i].equals(existingHighway)) {
                highways[i] = newHighway;
                isUpdated = true;
                break;
            }
        }
        if (!isUpdated) {
            System.out.println("Highway '" + existingHighway + "' not found to update.");
        }
        return isUpdated;
    }

    public boolean deleteHighway(String deletingHighway) {
        boolean isDeleted = false;
        for (int i = 0; i < index; i++) {
            if (highways[i] != null && highways[i].equals(deletingHighway)) {
                for (int j = i; j < index - 1; j++) {
                    highways[j] = highways[j + 1];
                }
                highways[index - 1] = null;
                index--;
                isDeleted = true;
                break;
            }
        }
        if (!isDeleted) {
            System.out.println("Highway '" + deletingHighway + "' not found to delete.");
        }
        return isDeleted;
    }
}