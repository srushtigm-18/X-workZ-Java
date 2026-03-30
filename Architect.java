class Architect {

    private String interiorDesignNames[] = new String[11];
    int index;

    public boolean addDesign(String design) {
        boolean isAdded = false;
        if (design != null && !design.isEmpty()) {
            if (index < interiorDesignNames.length) {
                interiorDesignNames[index] = design;
                index++;
                isAdded = true;
            } else {
                System.out.println("Design list is full.");
            }
        } else {
            System.out.println(design + " is invalid.");
        }
        return isAdded;
    }

    public void getDesigns() {
        System.out.println("Interior design styles:");
        for (String design : interiorDesignNames) {
            if (design != null) {
                System.out.println(design);
            }
        }
    }

    public String getDesignByIndex(int idx) {
        String designName = null;
        if (idx < interiorDesignNames.length && interiorDesignNames[idx] != null) {
            designName = interiorDesignNames[idx];
        } else {
            System.out.println("Invalid index: " + idx);
        }
        return designName;
    }

    public int getIndexByDesignName(String designName) {
        for (int i = 0; i < index; i++) {
            if (interiorDesignNames[i] != null && interiorDesignNames[i].equals(designName)) {
                return i;
            }
        }
        System.out.println("Design '" + designName + "' not found.");
        return 0;
    }

    public boolean updateDesign(String existingDesign, String newDesign) {
        boolean isUpdated = false;
        if (newDesign == null && newDesign.isEmpty()) {
            System.out.println(newDesign + " is invalid.");
            return false;
        }
        for (int i = 0; i < index; i++) {
            if (interiorDesignNames[i] != null && interiorDesignNames[i].equals(existingDesign)) {
                interiorDesignNames[i] = newDesign;
                isUpdated = true;
                break;
            }
        }
        if (!isUpdated) {
            System.out.println("Design '" + existingDesign + "' not found to update.");
        }
        return isUpdated;
    }

    public boolean deleteDesign(String deletingDesign) {
        boolean isDeleted = false;
        for (int i = 0; i < index; i++) {
            if (interiorDesignNames[i] != null && interiorDesignNames[i].equals(deletingDesign)) {
                for (int j = i; j < index - 1; j++) {
                    interiorDesignNames[j] = interiorDesignNames[j + 1];
                }
                interiorDesignNames[index - 1] = null;
                index--;
                isDeleted = true;
                break;
            }
        }
        if (!isDeleted) {
            System.out.println("Design '" + deletingDesign + "' not found to delete.");
        }
        return isDeleted;
    }
}
