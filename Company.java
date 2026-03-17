class Company {
    String companyName;
    int companyId;
    String headquarters;
    String ceo;
    Project project;

    public Company(int companyId,String companyName,  String headquarters, String ceo, Project project) {
        this.companyName = companyName;
        this.companyId = companyId;
        this.headquarters = headquarters;
        this.ceo = ceo;
        this.project = project;
    }

    public void getCompanyDetails() {
        System.out.println("Company: " + this.companyName);
        System.out.println("ID: " + this.companyId);
        System.out.println("HQ: " + this.headquarters);
        System.out.println("CEO: " + this.ceo);
        this.project.getProjectDetails();
        System.out.println("\n");
    }
}
