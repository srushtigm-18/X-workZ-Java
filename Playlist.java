class Playlist {

    private String songName[] = new String[15];   
    int index;

    public boolean addSong(String song) {
        boolean isAdded = false;

        if (song != null && !song.isEmpty()) {
                songName[index] = song;
                index++;
                isAdded = true;
           
        } else {
            System.out.println(song + " is invalid");
        }
        return isAdded;
    }

    public void getSongs() {
        for (String name : songName) {
                System.out.println(name);
            
        }
    }
}
