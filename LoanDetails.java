class LoanDetails {

    private int loanId;
    private String customerName;
    private String loanType;
    private double loanAmount;
    private double interestRate;
    private int tenureYears;
    private String loanStatus;

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }
    public int getLoanId() {
        return this.loanId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }
    public String getLoanType() {
        return this.loanType;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    public double getLoanAmount() {
        return this.loanAmount;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public double getInterestRate() {
        return this.interestRate;
    }

    public void setTenureYears(int tenureYears) {
        this.tenureYears = tenureYears;
    }
    public int getTenureYears() {
        return this.tenureYears;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }
    public String getLoanStatus() {
        return this.loanStatus;
    }
}