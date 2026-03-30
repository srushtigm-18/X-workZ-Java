class Singer {

private String names[] = new String[15]; 
    int index;

    public boolean addSinger(String name) {
        boolean isAdded = false;
        if (name != null && !name.isEmpty()) {
            if (index < names.length) {
                names[index] = name;
                index++;
                isAdded = true;
            } else {
                System.out.println("Singer list is full.");
            }
        } else {
            System.out.println(name + " is invalid.");
        }
        return isAdded;
    }

    public void getSingers() {
        System.out.println("Singers:");
        for (String s : names) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }

    public String getSingerByIndex(int idx) {
        String singer = null;
        if (idx < names.length && names[idx] != null) {
            singer = names[idx];
        } else {
            System.out.println("Invalid index: " + idx);
        }
        return singer;
    }

    public int getIndexBySingerName(String name) {
        for (int i = 0; i < index; i++) {
            if (names[i] != null && names[i].equals(name)) {
                return i;
            }
        }
        System.out.println("Singer '" + name + "' not found.");
        return 0;
    }

    public boolean updateSinger(String existingName, String newName) {
        boolean isUpdated = false;
        if (newName == null || newName.isEmpty()) {
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
            System.out.println("Singer '" + existingName + "' not found to update.");
        }
        return isUpdated;
    }

    public boolean deleteSinger(String deletingName) {
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
            System.out.println("Singer '" + deletingName + "' not found to delete.");
        }
        return isDeleted;
    }
}
