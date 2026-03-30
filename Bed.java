class Bed {
private String bedNames[] = new String[15]; 
int index;
public boolean addBed(String name) {
        boolean isAdded = false;
        if (name != null && !name.isEmpty()) {
            if (index < bedNames.length) {
                bedNames[index] = name;
                index++;
                isAdded = true;
            } else {
                System.out.println("Bed list is full.");
            }
        } else {
            System.out.println(name + " is invalid.");
        }
        return isAdded;
    }

  public void getBeds() {
  
        for (String bed : bedNames) {
            if (bed != null) {
                System.out.println(bed);
            }
        }
    }



    public String getBedNameByIndex(int idx) {
        String bed = null;
        if (idx < bedNames.length && bedNames[idx] != null) {
            bed = bedNames[idx];
        } else {
            System.out.println("Invalid index: " + idx);
        }
        return bed;
    }

    public int getIndexByBedName(String name) {
        for (int i = 0; i < index; i++) {
            if (bedNames[i] != null && bedNames[i].equals(name)) {
                return i;
            }
			
        }
        System.out.println("Bed '" + name + "' not found.");
        return 0;
    }

    public boolean updateBed(String existingName, String newName) {
        boolean isUpdated = false;
        if (newName == null && newName.isEmpty()) {
            System.out.println(newName + " is invalid.");
            return false;
        }
		
        for (int i = 0; i < index; i++) {
            if (bedNames[i] != null && bedNames[i].equals(existingName)) {
                bedNames[i] = newName;
                isUpdated = true;
                break;
            }
        }
        if (!isUpdated) {
            System.out.println("Bed " + existingName + " not found to update.");
        }
        return isUpdated;
    }


    public boolean deleteBed(String deletingName) {
        boolean isDeleted = false;
        for (int i = 0; i < index; i++) {
            if (bedNames[i] != null && bedNames[i].equals(deletingName)) {
                for (int j = i; j < index - 1; j++) {
                    bedNames[j] = bedNames[j + 1];
                }
                bedNames[index - 1] = null;
                index--;
                isDeleted = true;
                break;
            }
        }
        if (!isDeleted) {
            System.out.println("Bed " + deletingName + " not found ");
        }
        return isDeleted;
    }
}
