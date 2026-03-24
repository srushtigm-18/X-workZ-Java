class CrickBus {

    private String teamName[] = new String[8];  
    int index;

    public boolean addTeam(String team) {
        boolean isAdded = false;

        if (team != null && !team.isEmpty()) {
                teamName[index] = team;
                index++;
                isAdded = true;
            
        } else {
            System.out.println(team + " is invalid");
        }
        return isAdded;
    }

    public void getTeams() {
        for (String tm : teamName) {
           
                System.out.println(tm);
            
        }
    }
}
