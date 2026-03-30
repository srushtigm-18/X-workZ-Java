class CrickBus {
private String teamNames[] = new String[8];
    int index;

    public boolean addTeam(String team) {
        boolean isAdded = false;
        if (team != null && !team.isEmpty()) {
            if (index < teamNames.length) {
                teamNames[index] = team;
                index++;
                isAdded = true;
            } else {
                System.out.println("Team list is full.");
            }
        } else {
            System.out.println(team + " is invalid.");
        }
        return isAdded;
    }

    public void getTeams() {
        System.out.println("IPL teams :");
        for (String tm : teamNames) {
            if (tm != null) {
                System.out.println(tm);
            }
        }
    }

    public String getTeamNameByIndex(int idx) {
        String team = null;
        if (idx < teamNames.length && teamNames[idx] != null) {
            team = teamNames[idx];
        } else {
            System.out.println("Invalid index: " + idx);
        }
        return team;
    }

    public int getIndexByTeamName(String teamNameToFind) {
        for (int i = 0; i < index; i++) {
            if (teamNames[i] != null && teamNames[i].equals(teamNameToFind)) {
                return i;
            }
        }
        System.out.println("Team '" + teamNameToFind + "' not found.");
        return 0;
    }

    public boolean updateTeam(String existingTeam, String newTeam) {
        boolean isUpdated = false;
        if (newTeam == null && newTeam.isEmpty()) {
            System.out.println(newTeam + " is invalid.");
            return false;
        }
        for (int i = 0; i < index; i++) {
            if (teamNames[i] != null && teamNames[i].equals(existingTeam)) {
                teamNames[i] = newTeam;
                isUpdated = true;
                break;
            }
        }
        if (!isUpdated) {
            System.out.println("Team '" + existingTeam + "' not found to update.");
        }
        return isUpdated;
    }

    public boolean deleteTeam(String deletingTeam) {
        boolean isDeleted = false;
        for (int i = 0; i < index; i++) {
            if (teamNames[i] != null && teamNames[i].equals(deletingTeam)) {
                for (int j = i; j < index - 1; j++) {
                    teamNames[j] = teamNames[j + 1];
                }
                teamNames[index - 1] = null;
                index--;
                isDeleted = true;
                break;
            }
        }
        if (!isDeleted) {
            System.out.println("Team '" + deletingTeam + "' not found to delete.");
        }
        return isDeleted;
    }
}
