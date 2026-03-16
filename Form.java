class Form {
    int formId;
    String danceName;
    String originState;
    int durationMinutes;
    double fee;

    public void getFormDetails() {
        System.out.println("Form ID: " + this.formId);
        System.out.println("Dance: " + this.danceName);
        System.out.println("Origin: " + this.originState);
        System.out.println("Duration: " + this.durationMinutes + " min");
        System.out.println("Fee: " + this.fee + "K Rs");
    }
}