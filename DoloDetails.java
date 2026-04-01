class DoloDetails {
    private int medicineId;
    private String brandName;
    private String activeIngredient;
    private String strength;
    private String primaryUse;
    private String secondaryUse;
    private String status;

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }
    public int getMedicineId() {
        return this.medicineId;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public String getBrandName() {
        return this.brandName;
    }

    public void setActiveIngredient(String activeIngredient) {
        this.activeIngredient = activeIngredient;
    }
    public String getActiveIngredient() {
        return this.activeIngredient;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }
    public String getStrength() {
        return this.strength;
    }

    public void setPrimaryUse(String primaryUse) {
        this.primaryUse = primaryUse;
    }
    public String getPrimaryUse() {
        return this.primaryUse;
    }

    public void setSecondaryUse(String secondaryUse) {
        this.secondaryUse = secondaryUse;
    }
    public String getSecondaryUse() {
        return this.secondaryUse;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return this.status;
    }
}