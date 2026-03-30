class Steel {

    private String types[] = new String[15]; 
    int index;

    public boolean addSteel(String type) {
        boolean isAdded = false;
        if (type != null && !type.isEmpty()) {
            if (index < types.length) {
                types[index] = type;
                index++;
                isAdded = true;
            } else {
                System.out.println("Steel types list is full.");
            }
        } else {
            System.out.println(type + " is invalid.");
        }
        return isAdded;
    }

    public void getSteels() {
        System.out.println("Steel types:");
        for (String s : types) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }

    public String getSteelByIndex(int idx) {
        String steel = null;
        if (idx >= 0 && idx < types.length && types[idx] != null) {
            steel = types[idx];
        } else {
            System.out.println("Invalid index: " + idx);
        }
        return steel;
    }

    public int getIndexBySteelName(String name) {
        for (int i = 0; i < index; i++) {
            if (types[i] != null && types[i].equals(name)) {
                return i;
            }
        }
        System.out.println("Steel '" + name + "' not found.");
        return 0;
    }

    public boolean updateSteel(String existingName, String newName) {
        boolean isUpdated = false;
        if (newName == null && newName.isEmpty()) {
            System.out.println(newName + " is invalid.");
            return false;
        }
        for (int i = 0; i < index; i++) {
            if (types[i] != null && types[i].equals(existingName)) {
                types[i] = newName;
                isUpdated = true;
                break;
            }
        }
        if (!isUpdated) {
            System.out.println("Steel '" + existingName + "' not found to update.");
        }
        return isUpdated;
    }

    public boolean deleteSteel(String deletingName) {
        boolean isDeleted = false;
        for (int i = 0; i < index; i++) {
            if (types[i] != null && types[i].equals(deletingName)) {
                for (int j = i; j < index - 1; j++) {
                    types[j] = types[j + 1];
                }
                types[index - 1] = null;
                index--;
                isDeleted = true;
                break;
            }
        }
        if (!isDeleted) {
            System.out.println("Steel '" + deletingName + "' not found to delete.");
        }
        return isDeleted;
    }
}
