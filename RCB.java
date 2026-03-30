class RCB {

    private String playerNames[] = new String[15];
    private int index;

    public boolean addPlayer(String player) {
        boolean isAdded = false;
        if (player != null && !player.isEmpty()) {
            if (index < playerNames.length) {
                playerNames[index] = player;
                index++;
                isAdded = true;
            } else {
                System.out.println("Squad list is full.");
            }
        } else {
            System.out.println(player + " is invalid.");
        }
        return isAdded;
    }

    public void getPlayers() {
        System.out.println("RCB players:");
        for (String player : playerNames) {
            if (player != null) {
                System.out.println(player);
            }
        }
    }

    public String getPlayerNameByIndex(int idx) {
        String player = null;
        if (idx >= 0 && idx < playerNames.length && playerNames[idx] != null) {
            player = playerNames[idx];
        } else {
            System.out.println("Invalid index: " + idx);
        }
        return player;
    }

    public int getIndexByPlayerName(String player) {
        for (int i = 0; i < index; i++) {
            if (playerNames[i] != null && playerNames[i].equals(player)) {
                return i;
            }
        }
        System.out.println("Player " + player + " not found.");
        return 0;
    }
	
	
	

    public boolean updatePlayer(String existingPlayer, String newPlayer) {
        boolean isUpdated = false;
        if (newPlayer == null || newPlayer.isEmpty()) {
            System.out.println(newPlayer + " is invalid.");
            return false;
        }
        for (int i = 0; i < index; i++) {
            if (playerNames[i] != null && playerNames[i].equals(existingPlayer)) {
                playerNames[i] = newPlayer;
                isUpdated = true;
            }
        }
        if (!isUpdated) {
            System.out.println("Player " + existingPlayer + " not found to update.");
        }
        return isUpdated;
    }
	
	
	

    public boolean deletePlayer(String deletingPlayer) {
        boolean isDeleted = false;
        for (int i = 0; i < index; i++) {
            if (playerNames[i] != null && playerNames[i].equals(deletingPlayer)) {
                for (int j = i; j < index - 1; j++) {
                    playerNames[j] = playerNames[j + 1];
                }
                playerNames[index - 1] = null;
                index--;
                isDeleted = true;
            }
        }
        if (!isDeleted) {
            System.out.println("Player " + deletingPlayer + " not found to delete.");
        }
        return isDeleted;
    }
}