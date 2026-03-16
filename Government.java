class Government {
    String stateName;
    int policyId;
    String cmName;
    String dept;
    Policy policy;

    public void getGovDetails() {
        System.out.println("State: " + this.stateName);
        System.out.println("Policy ID: " + this.policyId);
        System.out.println("CM: " + this.cmName);
        System.out.println("Department: " + this.dept);
        this.policy.getPolicyDetails();
        System.out.println("\n");
    }
}

