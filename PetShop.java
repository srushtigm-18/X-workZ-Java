class PetShop {

    private String accessories[] = new String[20];
    int index;

    public boolean addAccessory(String accessory) {
        boolean isAdded = false;
        if (accessory != null && !accessory.isEmpty()) {
            if (index < accessories.length) {
                accessories[index++] = accessory;
                isAdded = true;
            } else {
                System.out.println("Accessory list is full.");
            }
        } else {
            System.out.println(accessory + " is invalid.");
        }
        return isAdded;
    }

    public void getAccessories() {
        System.out.println("Pet shop accessories:");
        for (String acc : accessories) {
            if (acc != null) {
                System.out.println(acc);
            }
        }
    }

    public String getAccessoryNameByIndex(int idx) {
        String accessory = null;
        if (idx < accessories.length && accessories[idx] != null) {
            accessory = accessories[idx];
        } else {
            System.out.println("Invalid index: " + idx);
        }
        return accessory;
    }

    public int getIndexByAccessoryName(String accessory) {
        for (int i = 0; i < index; i++) {
            if (accessories[i] != null && accessories[i].equals(accessory)) {
                return i;
            }
        }
        System.out.println("Accessory '" + accessory + "' not found.");
        return 0;
    }

    public boolean updateAccessory(String existingAccessory, String newAccessory) {
        boolean isUpdated = false;
        if (newAccessory == null || newAccessory.isEmpty()) {
            System.out.println(newAccessory + " is invalid.");
            return false;
        }
        for (int i = 0; i < index; i++) {
            if (accessories[i] != null && accessories[i].equals(existingAccessory)) {
                accessories[i] = newAccessory;
                isUpdated = true;
            }
        }
        if (!isUpdated) {
            System.out.println("Accessory '" + existingAccessory + "' not found to update.");
        }
        return isUpdated;
    }

    public boolean deleteAccessory(String deletingAccessory) {
        boolean isDeleted = false;
        for (int i = 0; i < index; i++) {
            if (accessories[i] != null && accessories[i].equals(deletingAccessory)) {
                for (int j = i; j < index - 1; j++) {
                    accessories[j] = accessories[j + 1];
                }
                accessories[index - 1] = null;
                index--;
                isDeleted = true;
            }
        }
        if (!isDeleted) {
            System.out.println("Accessory '" + deletingAccessory + "' not found to delete.");
        }
        return isDeleted;
    }
}