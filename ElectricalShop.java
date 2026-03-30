class ElectricalShop {

    private String appliances[] = new String[20];
    int index;

    public boolean addAppliance(String appliance) {
        boolean isAdded = false;
        if (appliance != null && !appliance.isEmpty()) {
            if (index < appliances.length) {
                appliances[index] = appliance;
                index++;
                isAdded = true;
            } else {
                System.out.println("Appliance list is full.");
            }
        } else {
            System.out.println(appliance + " is invalid.");
        }
        return isAdded;
    }

    public void getAppliances() {
        System.out.println("Electrical appliances:");
        for (String ap : appliances) {
            if (ap != null) {
                System.out.println(ap);
            }
        }
    }

    public String getApplianceByIndex(int idx) {
        if (idx >= 0 && idx < appliances.length && appliances[idx] != null) {
            return appliances[idx];
        } else {
            System.out.println("Invalid index: " + idx);
            return null;
        }
    }

    public int getIndexByApplianceName(String applianceName) {
        for (int i = 0; i < index; i++) {
            if (appliances[i] != null && appliances[i].equals(applianceName)) {
                return i;
            }
        }
        System.out.println("Appliance '" + applianceName + "' not found.");
        return 0;
    }

    public boolean updateAppliance(String existingAppliance, String newAppliance) {
        boolean isUpdated = false;
        if (newAppliance == null && newAppliance.isEmpty()) {
            System.out.println(newAppliance + " is invalid.");
            return false;
        }
        for (int i = 0; i < index; i++) {
            if (appliances[i] != null && appliances[i].equals(existingAppliance)) {
                appliances[i] = newAppliance;
                isUpdated = true;
                break;
            }
        }
        if (!isUpdated) {
            System.out.println("Appliance '" + existingAppliance + "' not found to update.");
        }
        return isUpdated;
    }

    public boolean deleteAppliance(String deletingAppliance) {
        boolean isDeleted = false;
        for (int i = 0; i < index; i++) {
            if (appliances[i] != null && appliances[i].equals(deletingAppliance)) {
                for (int j = i; j < index - 1; j++) {
                    appliances[j] = appliances[j + 1];
                }
                appliances[index - 1] = null;
                index--;
                isDeleted = true;
                break;
            }
        }
        if (!isDeleted) {
            System.out.println("Appliance '" + deletingAppliance + "' not found to delete.");
        }
        return isDeleted;
    }
}
