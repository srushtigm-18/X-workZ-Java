class Project {
    int projectId;
    String projectName;
    String technology;
    int teamSize;
    double budget;

    public Project(int projectId, String projectName, String technology, int teamSize, double budget) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.technology = technology;
        this.teamSize = teamSize;
        this.budget = budget;
    }

    public void getProjectDetails() {
        System.out.println("Project ID: " + this.projectId);
        System.out.println("Name: " + this.projectName);
        System.out.println("Tech: " + this.technology);
        System.out.println("Team: " + this.teamSize);
        System.out.println("Budget: " + this.budget + "Cr");
    }
}
