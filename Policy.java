class Policy {
    int polId;
    String name;
    String focus;
    String budget;
    String duration;

    public Policy(int polId, String name, String focus, String budget, String duration) {
        this.polId = polId;
        this.name = name;
        this.focus = focus;
        this.budget = budget;
        this.duration = duration;
    }

    public void getPolicyDetails() {
        System.out.println("Policy ID: " + this.polId);
        System.out.println("Name: " + this.name);
        System.out.println("Focus: " + this.focus);
        System.out.println("Budget: " + this.budget);
        System.out.println("Duration: " + this.duration);
    }
}
