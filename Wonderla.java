class Wonderla {
private String waterGames[] = new String[21];
private int index;
public boolean addWaterGame(String gameName) {
boolean isAdded = false;
	if (gameName != null && !gameName.isEmpty()) {
		if (index < waterGames.length) {
			waterGames[index] = gameName;
            index++;
            isAdded = true;
            } else {
                System.out.println("Water game list is full.");
            }
        } else {
            System.out.println(gameName + " is invalid.");
        }
        return isAdded;
    }
public void getWaterGames() {
        System.out.println("Water games at Wonderla:");
        for (String game : waterGames) {
                System.out.println(game);
            }
        }
public String getWaterGameByIndex(int idx) {
        if ( idx < waterGames.length && waterGames[idx] != null) {
            return waterGames[idx];
        } else {
            System.out.println("Invalid index: " + idx);
            return null;
        }
    }

    public int getIndexByWaterGameName(String gameName) {
        int i = 0;
        for (String game : waterGames) {
            if (game != null && game.equals(gameName)) {
                return i;
            }
            i++;
        }
        System.out.println("Game '" + gameName + "' not found.");
        return 0;
    }

    public boolean updateWaterGame(String existingGame, String newGame) {
        boolean isUpdated = false;
        if (newGame == null && newGame.isEmpty()) {
            System.out.println(newGame + " is invalid.");
            return false;
        }
        for (int i = 0; i < index; i++) {
            if (waterGames[i] != null && waterGames[i].equals(existingGame)) {
                waterGames[i] = newGame;
                isUpdated = true;
            }
        }
if (!isUpdated) {
System.out.println("Game '" + existingGame + "' not found to update.");
}
return isUpdated;
}
public boolean deleteWaterGame(String deletingGame) {
        boolean isDeleted = false;
        for (int i = 0; i < index; i++) {
            if (waterGames[i] != null && waterGames[i].equals(deletingGame)) {
                for (int j = i; j < index - 1; j++) {
                    waterGames[j] = waterGames[j + 1];
                }
                waterGames[index - 1] = null;
                index--;
                isDeleted = true;
            }
        }
if (!isDeleted) {
            System.out.println("Game '" + deletingGame + "' not found to delete.");
        }
        return isDeleted;
    }
}