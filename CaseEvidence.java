class CaseEvidence {
    private int caseId;
    private String caseType;
    private String evidenceType;
    private String description;
    private String collectedOn;
    private String status;
    private String location;

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }
    public int getCaseId() {
        return this.caseId;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }
    public String getCaseType() {
        return this.caseType;
    }

    public void setEvidenceType(String evidenceType) {
        this.evidenceType = evidenceType;
    }
    public String getEvidenceType() {
        return this.evidenceType;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }

    public void setCollectedOn(String collectedOn) {
        this.collectedOn = collectedOn;
    }
    public String getCollectedOn() {
        return this.collectedOn;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return this.status;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return this.location;
    }
}