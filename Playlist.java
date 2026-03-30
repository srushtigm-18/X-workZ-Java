class Playlist {
private String songNames[] = new String[15];
private int index;
public boolean addSong(String song) {
        boolean isAdded = false;
        if (song != null && !song.isEmpty()) {
            if (index < songNames.length) {
                songNames[index] = song;
                index++;
                isAdded = true;
            } else {
                System.out.println("Playlist is full.");
            }
        } else {
            System.out.println(song + " is invalid.");
        }
        return isAdded;
    }

    public void getSongs() {
        System.out.println("Playlist songs:");
        for (String name : songNames) {
            if (name != null) {
                System.out.println(name);
            }
        }
    }

    public String getSongNameByIndex(int idx) {
        String song = null;
        if (idx >= 0 && idx < songNames.length && songNames[idx] != null) {
            song = songNames[idx];
        } else {
            System.out.println("Invalid index: " + idx);
        }
        return song;
    }


    public int getIndexBySongName(String song) {
        for (int i = 0; i < index; i++) {
            if (songNames[i] != null && songNames[i].equals(song)) {
                return i;
            }
        }
        System.out.println("Song '" + song + "' not found.");
        return 0;
    }

    public boolean updateSong(String existingSong, String newSong) {
        boolean isUpdated = false;
        if (newSong == null && newSong.isEmpty()) {
            System.out.println(newSong + " is invalid.");
            return false;
        }
		
        for (int i = 0; i < index; i++) {
            if (songNames[i] != null && songNames[i].equals(existingSong)) {
                songNames[i] = newSong;
                isUpdated = true;
            }
        }
		
        if (!isUpdated) {
            System.out.println("Song '" + existingSong + "' not found to update.");
        }
        return isUpdated;
    }



    public boolean deleteSong(String deletingSong) {
        boolean isDeleted = false;
        for (int i = 0; i < index; i++) {
            if (songNames[i] != null && songNames[i].equals(deletingSong)) {
                for (int j = i; j < index - 1; j++) {
                    songNames[j] = songNames[j + 1];
                }
                songNames[index - 1] = null;
                index--;
                isDeleted = true;
            }
        }
		
        if (!isDeleted) {
            System.out.println("Song '" + deletingSong + "' not found to delete.");
        }
        return isDeleted;
	}
}