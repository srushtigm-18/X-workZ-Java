class CanvaAccount {
    private String email;
    private String password;
    private String name;
    private String accountType;
    private String otp;
    private String preferences;

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
    public String getOtp() {
        return this.otp;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }
    public String getPreferences() {
        return this.preferences;
    }
}