class Helmet {
    int helmetId;
    String helmetType;
    String safetyStandard;  

    public Helmet() {
        this.helmetId = 0;
        this.helmetType = null;
        this.safetyStandard = null;
    }

    public Helmet(int helmetId, String helmetType, String safetyStandard) {
        this.helmetId = helmetId;
        this.helmetType = helmetType;
        this.safetyStandard = safetyStandard;
    }
}
