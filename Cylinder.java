class Cylinder {
private String names[] = new String[15]; 
int index;

    public boolean addCylinder(String name) {
        boolean isAdded = false;
        if (name != null && !name.isEmpty()) {
            if (index < names.length) {
                names[index] = name;
                index++;
                isAdded = true;
            } else {
                System.out.println("Cylinder list is full.");
            }
        } else {
            System.out.println(name + " is invalid.");
        }
        return isAdded;
    }



public void getCylinders() {
        System.out.println("Cylinders:");
        for (String clyndr : names) {
            if (clyndr != null) {
                System.out.println(clyndr);
            }
        }
    }


    public String getCylinderNameByIndex(int idx) {
        String name = null;
        if (idx >= 0 && idx < names.length && names[idx] != null) {
            name = names[idx];
        } else {
            System.out.println("Invalid index: " + idx);
        }
        return name;
    }


    public int getIndexByCylinderName(String name) {
        for (int i = 0; i < index; i++) {
            if (names[i] != null && names[i].equals(name)) {
                return i;
            }
        }
        System.out.println("Cylinder '" + name + "' not found.");
        return 0;
    }


    public boolean updateCylinder(String existingName, String updatingName) {
        boolean isUpdated = false;
        if (updatingName == null && updatingName.isEmpty()) {
            System.out.println(updatingName + " is invalid.");
            return false;
        }
        for (int i = 0; i < index; i++) {
            if (names[i] != null && names[i].equals(existingName)) {
                names[i] = updatingName;
                isUpdated = true;
                break;
            }
        }
        if (!isUpdated) {
            System.out.println("Cylinder " + existingName + " not found.");
        }
        return isUpdated;
    }


    public boolean deleteCylinder(String deletingName) {
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
            System.out.println("Cylinder " + deletingName + " not found ");
        }
        return isDeleted;
    }
}
