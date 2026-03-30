class CrickBusExecutor {
    public static void main(String[] args) {
        CrickBus cTeams = new CrickBus();

        cTeams.addTeam("Royal Challengers Bangalore");
        cTeams.addTeam("Chennai Super Kings");
        cTeams.addTeam("Mumbai Indians");
        cTeams.addTeam("Kolkata Knight Riders");
        cTeams.addTeam("Delhi Capitals");
        cTeams.addTeam("Sunrisers Hyderabad");
        cTeams.addTeam("Lucknow Super Giants");
        cTeams.addTeam("Gujarat Titans");

        cTeams.getTeams();
        System.out.println();

        int index = 4;
        String team = cTeams.getTeamNameByIndex(index);
        System.out.println("The team at index " + index + " is: " + team);
        System.out.println();

        String teamName = "Mumbai Indians";
        int i = cTeams.getIndexByTeamName(teamName);
        System.out.println("Team '" + teamName + "' is at index: " + i);
        System.out.println();

        String updated = "Mumbai Indians (MI)";
        boolean ref = cTeams.updateTeam("Mumbai Indians", updated);
        cTeams.getTeams();
        System.out.println();

        String deleting = "Lucknow Super Giants";
        boolean reff = cTeams.deleteTeam(deleting);
        cTeams.getTeams();
    }
}
