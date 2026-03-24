class CrickBusExecutor {
    public static void main(String[] args) {
        CrickBus cab = new CrickBus();

        cab.addTeam("Royal Challengers Bangalore");
        cab.addTeam("Chennai Super Kings");
        cab.addTeam("Mumbai Indians");
        cab.addTeam("Kolkata Knight Riders");
        cab.addTeam("Delhi Capitals");
        cab.addTeam("Sunrisers Hyderabad");
        cab.addTeam("Lucknow Super Giants");
        cab.addTeam("Gujarat Titans");

        cab.getTeams();
    }
}
