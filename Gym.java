class Gym {
private String equipments[] = new String[16];
 int index;

    public boolean addEquipment(String equipmentName) {
        boolean isAdded = false;
        if (equipmentName != null && !equipmentName.isEmpty()) {
            if (index < equipments.length) {
                equipments[index] = equipmentName;
                index++;
                isAdded = true;
            } else {
                System.out.println("Equipment list is full.");
            }
        } else {
            System.out.println(equipmentName + " is invalid.");
        }
        return isAdded;
    }

    public void getEquipment() {
        System.out.println("Gym equipment:");
        for (String eqp : equipments) {
            if (eqp != null) {
                System.out.println(eqp);
            }
        }
    }

    public String getEquipmentNameByIndex(int idx) {
        String equipment = null;
        if (idx >= 0 && idx < equipments.length && equipments[idx] != null) {
            equipment = equipments[idx];
        } else {
            System.out.println("Invalid index: " + idx);
        }
        return equipment;
    }

    public int getIndexByEquipmentName(String equipment) {
        for (int i = 0; i < index; i++) {
            if (equipments[i] != null && equipments[i].equals(equipment)) {
                return i;
            }
        }
        System.out.println("Equipment " + equipment + " not found.");
        return 0;
    }

    public boolean updateEquipment(String existingEquipment, String newEquipment) {
        boolean isUpdated = false;
        if (newEquipment == null && newEquipment.isEmpty()) {
            System.out.println(newEquipment + " is invalid.");
            return false;
        }
        for (int i = 0; i < index; i++) {
            if (equipments[i] != null && equipments[i].equals(existingEquipment)) {
                equipments[i] = newEquipment;
                isUpdated = true;
                break;
            }
        }
        if (!isUpdated) {
            System.out.println("Equipment " + existingEquipment + " not found to update.");
        }
        return isUpdated;
    }

    public boolean deleteEquipment(String deletingEquipment) {
        boolean isDeleted = false;
        for (int i = 0; i < index; i++) {
            if (equipments[i] != null && equipments[i].equals(deletingEquipment)) {
                for (int j = i; j < index - 1; j++) {
                    equipments[j] = equipments[j + 1];
                }
                equipments[index - 1] = null;
                index--;
                isDeleted = true;
                break;
            }
        }
        if (!isDeleted) {
            System.out.println("Equipment " + deletingEquipment + " not found");
        }
        return isDeleted;
    }
}