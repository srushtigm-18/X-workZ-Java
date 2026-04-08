class UdemyAccount {
    private String name;
    private String email;
    private String password;
    private String coursePreference;
    private String otp;
    private String paymentDetails;

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

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }

    public void setCoursePreference(String coursePreference) {
        this.coursePreference = coursePreference;
    }
    public String getCoursePreference() {
        return this.coursePreference;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
    public String getOtp() {
        return this.otp;
    }

    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }
    public String getPaymentDetails() {
        return this.paymentDetails;
    }
}