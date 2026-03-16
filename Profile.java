class Profile {
    int profileId;
    String jobTitle;
    String company;
    int yearsExp;
    String skills;

    public void getProfileDetails() {
        System.out.println("Profile ID: " + this.profileId);
        System.out.println("Title: " + this.jobTitle);
        System.out.println("Company: " + this.company);
        System.out.println("Experience: " + this.yearsExp + " years");
        System.out.println("Skills: " + this.skills);
    }
}