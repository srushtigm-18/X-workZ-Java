class Kettle {

private String names[] = new String[15];  
    int index;

    public boolean addKettle(String name) {
        boolean isAdded = false;
        if (name != null && !name.isEmpty()) {
            if (index < names.length) {
                names[index] = name;
                index++;
                isAdded = true;
            } else {
                System.out.println("Kettle list is full.");
            }
        } else {
            System.out.println(name + " is invalid.");
        }
        return isAdded;
    }

    public void getKettles() {
        System.out.println("Kettle types:");
        for (String k : names) {
            if (k != null) {
                System.out.println(k);
            }
        }
    }

    public String getKettleByIndex(int idx) {
        String kettle = null;
        if (idx >= 0 && idx < names.length && names[idx] != null) {
            kettle = names[idx];
        } else {
            System.out.println("Invalid index: " + idx);
        }
        return kettle;
    }

    public int getIndexByKettleName(String name) {
        for (int i = 0; i < index; i++) {
            if (names[i] != null && names[i].equals(name)) {
                return i;
            }
        }
        System.out.println("Kettle '" + name + "' not found.");
        return 0;
    }

    public boolean updateKettle(String existingName, String newName) {
        boolean isUpdated = false;
        if (newName == null && newName.isEmpty()) {
            System.out.println(newName + " is invalid.");
            return false;
        }
        for (int i = 0; i < index; i++) {
            if (names[i] != null && names[i].equals(existingName)) {
                names[i] = newName;
                isUpdated = true;
                break;
            }
        }
        if (!isUpdated) {
            System.out.println("Kettle '" + existingName + "' not found to update.");
        }
        return isUpdated;
    }

    public boolean deleteKettle(String deletingName) {
        boolean isDeleted = false;
        for (int i = 0; i < index; i++) {
            if (names[i] != null && names[i].equals(deletingName)) {
                for (int j = i; j < index - 1; j++) {
                    names[j] = names[j + 1];
                }
                names[index - 1] = null;
                index--;
                isDeleted = true;
                break;
            }
        }
        if (!isDeleted) {
            System.out.println("Kettle '" + deletingName + "' not found to delete.");
        }
        return isDeleted;
    }
}
