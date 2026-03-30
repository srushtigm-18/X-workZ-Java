class SingerExecutor {
public static void main(String[] args) {
Singer singer = new Singer();

        singer.addSinger("Arijit Singh");
        singer.addSinger("Shreya Ghoshal");
        singer.addSinger("Sonu Nigam");
        singer.addSinger("Lata Mangeshkar");
        singer.addSinger("Kumar Sanu");
        singer.addSinger("Alka Yagnik");
        singer.addSinger("Mohit Chauhan");
        singer.addSinger("Neha Kakkar");
        singer.addSinger("Asha Bhosle");
        singer.addSinger("Kishore Kumar");
        singer.addSinger("Rahat Fateh Ali Khan");
        singer.addSinger("Badshah");

        singer.getSingers();
        System.out.println();

        int index = 5;
        String sng = singer.getSingerByIndex(index);
        System.out.println("Singer at index " + index + " is: " + sng);
        System.out.println();

        String searchName = "Mohit Chauhan";
        int i = singer.getIndexBySingerName(searchName);
        System.out.println("Singer '" + searchName + "' is at index: " + i);
        System.out.println();

        String updated = "Mohit Chauhan (Rock Version)";
        boolean ref = singer.updateSinger("Mohit Chauhan", updated);
        singer.getSingers();
        System.out.println();

        String deleting = "Badshah";
        boolean reff = singer.deleteSinger(deleting);
        singer.getSingers();
    }
}
