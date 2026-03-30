class PlaylistExecutor {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addSong("Shape of You");
        playlist.addSong("Blinding Lights");
        playlist.addSong("Levitating");
        playlist.addSong("Peaches");
        playlist.addSong("drivers license");
        playlist.addSong("Stay");
        playlist.addSong("Good 4 U");
        playlist.addSong("As It Was");
        playlist.addSong("Anti-Hero");
        playlist.addSong("Watermelon Sugar");
        playlist.addSong("Bad Guy");
        playlist.addSong("Dynamite");
        playlist.addSong("Rap God");
        playlist.addSong("Someone You Loved");
        playlist.addSong("Happier");

        playlist.getSongs();
        System.out.println();

        int index = 6;
        String song = playlist.getSongNameByIndex(index);
        System.out.println("The song at index " + index + " is: " + song);
        System.out.println();

        String songName = "Shape of You";
        int i = playlist.getIndexBySongName(songName);
        System.out.println();

        String updated = "Levitating (Remix)";
        boolean ref = playlist.updateSong("Levitating", updated);
        playlist.getSongs();
        System.out.println();

        String deleting = "Rap God";
        boolean reff = playlist.deleteSong(deleting);
        playlist.getSongs();
    }
}