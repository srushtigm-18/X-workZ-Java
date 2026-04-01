class PassportUser{
    private int userId;
    private String loginId;
    private String password;
    private String emailId;
    private String mobileNumber;
    private String aadhaarNumber;
    private String applicationStatus;

    public void setUserId(int userId){
        this.userId = userId;
    }
    public int getUserId(){
        return this.userId;
    }

    public void setLoginId(String loginId){
        this.loginId = loginId;
    }
    public String getLoginId(){
        return this.loginId;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }

    public void setEmailId(String emailId){
        this.emailId = emailId;
    }
    public String getEmailId(){
        return this.emailId;
    }

    public void setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }
    public String getMobileNumber(){
        return this.mobileNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber){
        this.aadhaarNumber = aadhaarNumber;
    }
    public String getAadhaarNumber(){
        return this.aadhaarNumber;
    }

    public void setApplicationStatus(String applicationStatus){
        this.applicationStatus = applicationStatus;
    }
    public String getApplicationStatus(){
        return this.applicationStatus;
    }
}