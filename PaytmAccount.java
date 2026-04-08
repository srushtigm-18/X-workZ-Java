class PaytmAccount {

    private String mobileNo;
    private String otp;
    private String name;
    private String email;
    private String pin;
    private String kycDetails;
    private String bankLinking;

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public String getMobileNo() {
        return this.mobileNo;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
    public String getOtp() {
        return this.otp;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
    public String getPin() {
        return this.pin;
    }

    public void setKycDetails(String kycDetails) {
        this.kycDetails = kycDetails;
    }
    public String getKycDetails() {
        return this.kycDetails;
    }

    public void setBankLinking(String bankLinking) {
        this.bankLinking = bankLinking;
    }
    public String getBankLinking() {
        return this.bankLinking;
    }
}