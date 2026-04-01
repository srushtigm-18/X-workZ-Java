class BankDetails {
    private int accountId;
    private String accountHolder;
    private String accountNumber;
    private String bankName;
    private String branchName;
    private double balance;
    private String accountType;
    private String ifscCode;
    private String createdOn;
    private String status;

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public int getAccountId() {
        return this.accountId;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public String getAccountHolder() {
        return this.accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getBankName() {
        return this.bankName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }
    public String getIfscCode() {
        return this.ifscCode;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }
    public String getCreatedOn() {
        return this.createdOn;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return this.status;
    }
}
