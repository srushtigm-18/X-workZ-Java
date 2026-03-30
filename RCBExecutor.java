class RCBExecutor {
    public static void main(String[] args) {
        RCB rcb = new RCB();

        rcb.addPlayer("Faf du Plessis");
        rcb.addPlayer("Virat Kohli");
        rcb.addPlayer("Glenn Maxwell");
        rcb.addPlayer("Rajat Patidar");
        rcb.addPlayer("Mahipal Lomror");
        rcb.addPlayer("Dinesh Karthik");
        rcb.addPlayer("Cameron Green");
        rcb.addPlayer("Mohammed Siraj");
        rcb.addPlayer("Yash Dayal");
        rcb.addPlayer("Josh Hazlewood");
        rcb.addPlayer("Harshal Patel");
        rcb.addPlayer("Reece Topley");
        rcb.addPlayer("Manoj Tiwary");
        rcb.addPlayer("Anuj Rawat");
        rcb.addPlayer("Swastik Chhikara");

        rcb.getPlayers();
        System.out.println();

        int index = 3;
        String player = rcb.getPlayerNameByIndex(index);
        System.out.println("The RCB player at index " + index + " is: " + player);
        System.out.println();

        String playerName = "Yash Dayal";
        int i = rcb.getIndexByPlayerName(playerName);
        System.out.println();

        String updated = "Rajat Patidar";
        boolean ref = rcb.updatePlayer("Rajat Patidar", updated);
        rcb.getPlayers();
        System.out.println();

        String deleting = "Manoj Tiwary";
        boolean reff = rcb.deletePlayer(deleting);
        rcb.getPlayers();
    }
}