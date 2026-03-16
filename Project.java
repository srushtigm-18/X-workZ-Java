class Project {
    int projectId;
    String projectName;
    String technology;
    int teamSize;
    double budget;

    public void getProjectDetails() {
        System.out.println("Project ID: " + this.projectId);
        System.out.println("Name: " + this.projectName);
        System.out.println("Tech: " + this.technology);
        System.out.println("Team: " + this.teamSize);
        System.out.println("Budget: ₹" + this.budget + "Cr");
    }
}
