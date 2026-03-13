class Cricket {
    int cricketId;
    String playerName;
    String teamName;
    int matches;
    double avgScore;
    String battingStyle;
    String role;
    int wickets;
    double economy;
    String country;
    int jerseyNum;
    String format;
    double strikeRate;
    String coachName;
    int runs;
    String position;
    int centuries;
    double battingAvg;
    String ground;
    int age;  
    
    public Cricket() {
        this.cricketId = 0;
        this.playerName = null;
        this.teamName = null;
        this.matches = 0;
        this.avgScore = 0.0;
        this.battingStyle = null;
        this.role = null;
        this.wickets = 0;
        this.economy = 0.0;
        this.country = null;
        this.jerseyNum = 0;
        this.format = null;
        this.strikeRate = 0.0;
        this.coachName = null;
        this.runs = 0;
        this.position = null;
        this.centuries = 0;
        this.battingAvg = 0.0;
        this.ground = null;
        this.age = 0;
    }
    
   public Cricket(int cricketId, String playerName, String teamName, int matches, double avgScore,
                   String battingStyle, String role, int wickets, double economy, String country,
                   int jerseyNum, String format, double strikeRate, String coachName, int runs,
                   String position, int centuries, double battingAvg, String ground, int age) {
        this.cricketId = cricketId;
        this.playerName = playerName;
        this.teamName = teamName;
        this.matches = matches;
        this.avgScore = avgScore;
        this.battingStyle = battingStyle;
        this.role = role;
        this.wickets = wickets;
        this.economy = economy;
        this.country = country;
        this.jerseyNum = jerseyNum;
        this.format = format;
        this.strikeRate = strikeRate;
        this.coachName = coachName;
        this.runs = runs;
        this.position = position;
        this.centuries = centuries;
        this.battingAvg = battingAvg;
        this.ground = ground;
        this.age = age;
    }
}
