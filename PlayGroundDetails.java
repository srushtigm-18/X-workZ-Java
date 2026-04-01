class PlayGroundDetails {

    private int playgroundId;
    private String playgroundName;
    private String location;
    private String surfaceType;
    private int areaSqFt;
    private String facilities;
    private String timing;

    public void setPlaygroundId(int playgroundId) {
        this.playgroundId = playgroundId;
    }
    public int getPlaygroundId() {
        return this.playgroundId;
    }

    public void setPlaygroundName(String playgroundName) {
        this.playgroundName = playgroundName;
    }
    public String getPlaygroundName() {
        return this.playgroundName;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return this.location;
    }

    public void setSurfaceType(String surfaceType) {
        this.surfaceType = surfaceType;
    }
    public String getSurfaceType() {
        return this.surfaceType;
    }

    public void setAreaSqFt(int areaSqFt) {
        this.areaSqFt = areaSqFt;
    }
    public int getAreaSqFt() {
        return this.areaSqFt;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }
    public String getFacilities() {
        return this.facilities;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }
    public String getTiming() {
        return this.timing;
    }
}