class PlayerDetails {
    private int playerId;
    private String playerName;
    private String gameTitle;
    private String consoleType;
    private String releaseDate;
    private String versionNumber;
    private String controllerLayout;
    private String lastUpdated;

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
    public int getPlayerId() {
        return this.playerId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public String getPlayerName() {
        return this.playerName;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }
    public String getGameTitle() {
        return this.gameTitle;
    }

    public void setConsoleType(String consoleType) {
        this.consoleType = consoleType;
    }
    public String getConsoleType() {
        return this.consoleType;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    public String getReleaseDate() {
        return this.releaseDate;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }
    public String getVersionNumber() {
        return this.versionNumber;
    }

    public void setControllerLayout(String controllerLayout) {
        this.controllerLayout = controllerLayout;
    }
    public String getControllerLayout() {
        return this.controllerLayout;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public String getLastUpdated() {
        return this.lastUpdated;
    }
}