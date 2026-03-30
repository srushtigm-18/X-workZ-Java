class Turbine {

    private String names[] = new String[15]; 
    private int index;

    public boolean addTurbine(String name) {
        boolean isAdded = false;
        if (name != null && !name.isEmpty()) {
            if (index < names.length) {
                names[index] = name;
                index++;
                isAdded = true;
            } else {
                System.out.println("Turbine list is full.");
            }
        } else {
            System.out.println(name + " is invalid.");
        }
        return isAdded;
    }

    public void getTurbines() {
        System.out.println("Turbine types:");
        for (String t : names) {
            if (t != null) {
                System.out.println(t);
            }
        }
    }

    public String getTurbineByIndex(int idx) {
        String turbine = null;
        if (idx >= 0 && idx < names.length && names[idx] != null) {
            turbine = names[idx];
        } else {
            System.out.println("Invalid index: " + idx);
        }
        return turbine;
    }

    public int getIndexByTurbineName(String name) {
        for (int i = 0; i < index; i++) {
            if (names[i] != null && names[i].equals(name)) {
                return i;
            }
        }
        System.out.println("Turbine '" + name + "' not found.");
        return 0;
    }

    public boolean updateTurbine(String existingName, String newName) {
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
            System.out.println("Turbine '" + existingName + "' not found to update.");
        }
        return isUpdated;
    }

    public boolean deleteTurbine(String deletingName) {
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
            System.out.println("Turbine '" + deletingName + "' not found to delete.");
        }
        return isDeleted;
    }
}
