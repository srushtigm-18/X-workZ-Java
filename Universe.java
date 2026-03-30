class Universe {

private String galaxies[] = new String[17];
private int index;

public boolean addGalaxy(String galaxy) {
	boolean isAdded = false;
	if (galaxy != null && !galaxy.isEmpty()) {
		if (index < galaxies.length) {
			galaxies[index] = galaxy;
            index++;
            isAdded = true;
			} else {
                System.out.println("Galaxy list is full.");
            }
        } else {
            System.out.println(galaxy + " is invalid.");
        }
        return isAdded;
    }

public void getGalaxies() {
        for (String galaxii: galaxies) {
            if (galaxii != null) {
                System.out.println(galaxii);
            }
        }
    }

    public String getGalaxyByIndex(int idx) {
        String galaxy = null;
        if (idx < galaxies.length && galaxies[idx] != null) {
            galaxy = galaxies[idx];
        } else {
            System.out.println("Invalid index: " + idx);
        }
        return galaxy;
    }

    public int getIndexByGalaxy(String galaxy) {
        int idx = 0;
        for (String g : galaxies) {
            if (g != null && g.equals(galaxy)) {
                return idx;
            }
            idx++;
        }
        return 0;
    }
	
	
	

    public boolean updateGalaxy(String existingGalaxy, String updatingGalaxy) {
        boolean isUpdated = false;
        if (updatingGalaxy == null && updatingGalaxy.isEmpty()) {
            System.out.println(updatingGalaxy + " is invalid.");
            return false;
        }
        for (int i = 0; i < index; i++) {
            if (galaxies[i] != null && galaxies[i].equals(existingGalaxy)) {
                galaxies[i] = updatingGalaxy;
                isUpdated = true;
             
            }
        }
        if (!isUpdated) {
            System.out.println("Galaxy '" + existingGalaxy + "' not found to update.");
        }
        return isUpdated;
    }

    public boolean deleteGalaxy(String deletingGalaxy) {
        boolean isDeleted = false;
        for (int i = 0; i < index; i++) {
            if (galaxies[i] != null && galaxies[i].equals(deletingGalaxy)) {
                for (int j = i; j < index - 1; j++) {
                    galaxies[j] = galaxies[j + 1];
                }
                galaxies[index - 1] = null;
                index--;
                isDeleted = true;
                break;
            }
        }
        if (!isDeleted) {
            System.out.println("Galaxy '" + deletingGalaxy + "' not found to delete.");
        }
        return isDeleted;
    }
}