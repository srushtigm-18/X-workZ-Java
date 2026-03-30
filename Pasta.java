class Pasta {
private String pastaNames[] = new String[15]; 
int index;
public boolean addPasta(String name) {

boolean isAdded = false;
if (name != null && !name.isEmpty()) {

if (index < pastaNames.length) {
pastaNames[index] = name;
index++;
isAdded = true;
} else {
System.out.println("Pasta list is full.");
 }
} else {
System.out.println(name + " is invalid.");
}
return isAdded;
}

public void getPastas() {
for (String p : pastaNames) {
if (p != null) {
System.out.println(p);
            }
        }
    }

public String getPastaNameByIndex(int idx) {
        String pasta = null;
        if (idx < pastaNames.length && pastaNames[idx] != null) {
            pasta = pastaNames[idx];
        } else {
            System.out.println("Invalid index: " + idx);
        }
        return pasta;
    }

public int getIndexByPastaName(String name) {
        for (int i = 0; i < index; i++) {
            if (pastaNames[i] != null && pastaNames[i].equals(name)) {
                return i;
            }
        }
        System.out.println("Pasta '" + name + "' not found.");
        return 0;
    }

 public boolean updatePasta(String existingName, String newName) {
        boolean isUpdated = false;
        if (newName == null && newName.isEmpty()) {
            System.out.println(newName + " is invalid.");
            return false;
        }
		
        for (int i = 0; i < index; i++) {
            if (pastaNames[i] != null && pastaNames[i].equals(existingName)) {
                pastaNames[i] = newName;
                isUpdated = true;
                break;
            }
			
        }
        if (!isUpdated) {
            System.out.println("Pasta '" + existingName + "' not found to update.");
        }
        return isUpdated;
    }

public boolean deletePasta(String deletingName) {
        boolean isDeleted = false;
        for (int i = 0; i < index; i++) {
            if (pastaNames[i] != null && pastaNames[i].equals(deletingName)) {
                for (int j = i; j < index - 1; j++) {
                    pastaNames[j] = pastaNames[j + 1];
                }
                pastaNames[index - 1] = null;
                index--;
                isDeleted = true;
                break;
            }
			
        }
        if (!isDeleted) {
            System.out.println("Pasta '" + deletingName + "' not found to delete.");
        }
        return isDeleted;
 
 
 }
 
}
