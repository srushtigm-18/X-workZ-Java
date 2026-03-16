class Company {
    String companyName;
    int companyId;
    String headquarters;
    String ceo;
    Project project;

    public void getCompanyDetails() {
        System.out.println("Company: " + this.companyName);
        System.out.println("ID: " + this.companyId);
        System.out.println("HQ: " + this.headquarters);
        System.out.println("CEO: " + this.ceo);
        this.project.getProjectDetails();
        System.out.println("\n");
    }
}

