class UserAccount1 {
    private int userId;
    private String userName;
    private String userEmail;
    private String phone;
    private String password;
    private String createdOn;

    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getUserId() {
        return this.userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return this.userName;
    }

    public void setEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getEmail() {
        return this.userEmail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return this.phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }
    public String getCreatedOn() {
        return this.createdOn;
    }
}