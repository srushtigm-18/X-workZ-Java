class Profile {
    int profileId;
    String jobTitle;
    String company;
    int yearsExp;
    String skills;

    public Profile(int profileId, String jobTitle, String company, int yearsExp, String skills) {
        this.profileId = profileId;
        this.jobTitle = jobTitle;
        this.company = company;
        this.yearsExp = yearsExp;
        this.skills = skills;
    }

    public void getProfileDetails() {
        System.out.println("Profile ID: " + this.profileId);
        System.out.println("Title: " + this.jobTitle);
        System.out.println("Company: " + this.company);
        System.out.println("Experience: " + this.yearsExp + " years");
        System.out.println("Skills: " + this.skills);
    }
}
