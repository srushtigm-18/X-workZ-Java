class CourseraAccount {
    private String name;
    private String email;
    private String password;
    private String courseInterest;
    private String education;
    private int intOtp;

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

    public void setCourseInterest(String courseInterest) {
        this.courseInterest = courseInterest;
    }
    public String getCourseInterest() {
        return this.courseInterest;
    }

    public void setEducation(String education) {
        this.education = education;
    }
    public String getEducation() {
        return this.education;
    }

    public void setIntOtp(int intOtp) {
        this.intOtp = intOtp;
    }
    public int getIntOtp() {
        return this.intOtp;
    }
}