class PhonePe {

    private String insurance[] = new String[27];
     int index;

    public boolean addInsurance(String planName) {
        boolean isAdded = false;
        if (planName != null && !planName.isEmpty()) {
            if (index < insurance.length) {
                insurance[index] = planName;
                index++;
                isAdded = true;
            } else {
                System.out.println("Insurance list is full.");
            }
        } else {
            System.out.println(planName + " is invalid.");
        }
        return isAdded;
    }

    public void getInsurance() {
        System.out.println("PhonePe insurance plans:");
        for (String plan : insurance) {
            if (plan != null) {
                System.out.println(plan);
            }
        }
    }

    public String getInsuranceNameByIndex(int idx) {
        String plan = null;
        if ( idx < insurance.length && insurance[idx] != null) {
            plan = insurance[idx];
        } else {
            System.out.println("Invalid index: " + idx);
        }
        return plan;
    }

    public int getIndexByInsuranceName(String planName) {
        for (int i = 0; i < index; i++) {
            if (insurance[i] != null && insurance[i].equals(planName)) {
                return i;
            }
        }
        System.out.println("Insurance plan '" + planName + "' not found.");
        return 0;
    }

    public boolean updateInsurance(String existingPlan, String newPlan) {
        boolean isUpdated = false;
        if (newPlan == null && newPlan.isEmpty()) {
            System.out.println(newPlan + " is invalid.");
            return false;
        }
        for (int i = 0; i < index; i++) {
            if (insurance[i] != null && insurance[i].equals(existingPlan)) {
                insurance[i] = newPlan;
                isUpdated = true;
                break;
            }
        }
        if (!isUpdated) {
            System.out.println("Insurance '" + existingPlan + "' not found to update.");
        }
        return isUpdated;
    }

    public boolean deleteInsurance(String deletingPlan) {
        boolean isDeleted = false;
        for (int i = 0; i < index; i++) {
            if (insurance[i] != null && insurance[i].equals(deletingPlan)) {
                for (int j = i; j < index - 1; j++) {
                    insurance[j] = insurance[j + 1];
                }
                insurance[index - 1] = null;
                index--;
                isDeleted = true;
            }
        }
        if (!isDeleted) {
            System.out.println("Insurance '" + deletingPlan + "' not found to delete.");
        }
        return isDeleted;
    }
}