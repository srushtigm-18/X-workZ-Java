class TelegramAccount {

    private String mobile;
    private String otp;
    private String name;
    private String username;
    private boolean contactPermission;
    private String profilePhoto;

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getMobile() {
        return this.mobile;
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

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return this.username;
    }

    public void setContactPermission(boolean contactPermission) {
        this.contactPermission = contactPermission;
    }
    public boolean getContactPermission() {
        return this.contactPermission;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }
    public String getProfilePhoto() {
        return this.profilePhoto;
    }
}