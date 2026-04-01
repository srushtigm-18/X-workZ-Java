class PatientDetails {
    private int patientId;
    private String patientName;
    private String email;
    private String phone;
    private String diagnosis;
    private String admittedOn;
    private String status;

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    public int getPatientId() {
        return this.patientId;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public String getPatientName() {
        return this.patientName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return this.phone;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    public String getDiagnosis() {
        return this.diagnosis;
    }

    public void setAdmittedOn(String admittedOn) {
        this.admittedOn = admittedOn;
    }
    public String getAdmittedOn() {
        return this.admittedOn;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return this.status;
    }
}