class SubscriptionDetails {
    private int subscriptionId;
    private String userId;
    private String planType;
    private String startDate;
    private String endDate;
    private double price;
    private String currency;
    private String status;
    private int manualAccessLimit;

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }
    public int getSubscriptionId() {
        return this.subscriptionId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserId() {
        return this.userId;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }
    public String getPlanType() {
        return this.planType;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return this.price;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getCurrency() {
        return this.currency;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return this.status;
    }

    public void setManualAccessLimit(int manualAccessLimit) {
        this.manualAccessLimit = manualAccessLimit;
    }
    public int getManualAccessLimit() {
        return this.manualAccessLimit;
    }
}
