class MusicRunner {
    public static void main(String[] args) {
       
        ClassicalMusic classical = new ClassicalMusic();
        classical.setGenre("Beethoven Symphony");
        System.out.println(classical.getMusicInfo());
    }
}