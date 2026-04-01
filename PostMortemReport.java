class PostMortemReport {

    private int caseId;
    private String deceasedName;
    private String dateOfDeath;
    private String causeOfDeath;
    private String externalInjuries;
    private String internalFindings;
    private String doctorOpinion;

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }
    public int getCaseId() {
        return this.caseId;
    }

    public void setDeceasedName(String deceasedName) {
        this.deceasedName = deceasedName;
    }
    public String getDeceasedName() {
        return this.deceasedName;
    }

    public void setDateOfDeath(String dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }
    public String getDateOfDeath() {
        return this.dateOfDeath;
    }

    public void setCauseOfDeath(String causeOfDeath) {
        this.causeOfDeath = causeOfDeath;
    }
    public String getCauseOfDeath() {
        return this.causeOfDeath;
    }

    public void setExternalInjuries(String externalInjuries) {
        this.externalInjuries = externalInjuries;
    }
    public String getExternalInjuries() {
        return this.externalInjuries;
    }

    public void setInternalFindings(String internalFindings) {
        this.internalFindings = internalFindings;
    }
    public String getInternalFindings() {
        return this.internalFindings;
    }

    public void setDoctorOpinion(String doctorOpinion) {
        this.doctorOpinion = doctorOpinion;
    }
    public String getDoctorOpinion() {
        return this.doctorOpinion;
    }
}