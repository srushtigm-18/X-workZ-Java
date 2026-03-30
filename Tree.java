class Tree {

    private String names[] = new String[15]; 
    private int index;

    public boolean addTree(String name) {
        boolean isAdded = false;
        if (name != null && !name.isEmpty()) {
            if (index < names.length) {
                names[index] = name;
                index++;
                isAdded = true;
            } else {
                System.out.println("Tree list is full.");
            }
        } else {
            System.out.println(name + " is invalid.");
        }
        return isAdded;
    }

    public void getTrees() {
        System.out.println("Tree types:");
        for (String t : names) {
            if (t != null) {
                System.out.println(t);
            }
        }
    }

    public String getTreeByIndex(int idx) {
        String tree = null;
        if (idx >= 0 && idx < names.length && names[idx] != null) {
            tree = names[idx];
        } else {
            System.out.println("Invalid index: " + idx);
        }
        return tree;
    }

    public int getIndexByTreeName(String name) {
        for (int i = 0; i < index; i++) {
            if (names[i] != null && names[i].equals(name)) {
                return i;
            }
        }
        System.out.println("Tree '" + name + "' not found.");
        return 0;
    }

    public boolean updateTree(String existingName, String newName) {
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
            System.out.println("Tree '" + existingName + "' not found to update.");
        }
        return isUpdated;
    }

    public boolean deleteTree(String deletingName) {
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
            System.out.println("Tree '" + deletingName + "' not found to delete.");
        }
        return isDeleted;
    }
}
