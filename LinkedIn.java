class LinkedIn {
    String platformName;
    int platformId;
    String founded;
    String ceo;
    Profile profile;

    public LinkedIn(String platformName, int platformId, String founded, String ceo, Profile profile) {
        this.platformName = platformName;
        this.platformId = platformId;
        this.founded = founded;
        this.ceo = ceo;
        this.profile = profile;
    }

    public void getLinkedInDetails() {
        System.out.println("Platform: " + this.platformName);
        System.out.println("ID: " + this.platformId);
        System.out.println("Founded: " + this.founded);
        System.out.println("CEO: " + this.ceo);
        this.profile.getProfileDetails();
        System.out.println("\n");
    }
}
