class GitHubAccount {
    private String username;
    private String email;
    private String password;
    private String country;
    private boolean verifyEmail;
    private String captcha;

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return this.username;
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

    public void setCountry(String country) {
        this.country = country;
    }
    public String getCountry() {
        return this.country;
    }

    public void setVerifyEmail(boolean verifyEmail) {
        this.verifyEmail = verifyEmail;
    }
    public boolean getVerifyEmail() {
        return this.verifyEmail;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }
    public String getCaptcha() {
        return this.captcha;
    }
}