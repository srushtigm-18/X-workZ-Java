class DmartAccount {

    private int accountId;
    private String customerName;
    private String phoneNumber;
    private String membershipType;
    private double totalSpend;
    private int pointsEarned;
    private String lastPurchaseDate;

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public int getAccountId() {
        return this.accountId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }
    public String getMembershipType() {
        return this.membershipType;
    }

    public void setTotalSpend(double totalSpend) {
        this.totalSpend = totalSpend;
    }
    public double getTotalSpend() {
        return this.totalSpend;
    }

    public void setPointsEarned(int pointsEarned) {
        this.pointsEarned = pointsEarned;
    }
    public int getPointsEarned() {
        return this.pointsEarned;
    }

    public void setLastPurchaseDate(String lastPurchaseDate) {
        this.lastPurchaseDate = lastPurchaseDate;
    }
    public String getLastPurchaseDate() {
        return this.lastPurchaseDate;
    }
}