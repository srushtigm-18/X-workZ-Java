class Nasa {
    private int id;
    private String projectName;
    private String releaseDate;
    private String projectLead;
    private long revenue;
    private int members;
    private String destination;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    public String getReleaseDate() {
        return this.releaseDate;
    }

    public void setProjectLead(String projectLead) {
        this.projectLead = projectLead;
    }
    public String getProjectLead() {
        return this.projectLead;
    }

    public void setRevenue(long revenue) {
        this.revenue = revenue;
    }
    public long getRevenue() {
        return this.revenue;
    }

    public void setMembers(int members) {
        this.members = members;
    }
    public int getMembers() {
        return this.members;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getDestination() {
        return this.destination;
    }
}

