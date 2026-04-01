public class Graveyard {
	
    private int graveyardId;
    private String graveyardName;
    private String location;
    private String establishedYear;
    private int totalGraves;
    private String type;
    private String caretaker;

    public void setGraveyardId(int graveyardId) {
        this.graveyardId = graveyardId;
    }
    public int getGraveyardId() {
        return this.graveyardId;
    }

    public void setGraveyardName(String graveyardName) {
        this.graveyardName = graveyardName;
    }
    public String getGraveyardName() {
        return this.graveyardName;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return this.location;
    }

    public void setEstablishedYear(String establishedYear) {
        this.establishedYear = establishedYear;
    }
    public String getEstablishedYear() {
        return this.establishedYear;
    }

    public void setTotalGraves(int totalGraves) {
        this.totalGraves = totalGraves;
    }
    public int getTotalGraves() {
        return this.totalGraves;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return this.type;
    }

    public void setCaretaker(String caretaker) {
        this.caretaker = caretaker;
    }
    public String getCaretaker() {
        return this.caretaker;
    }
}