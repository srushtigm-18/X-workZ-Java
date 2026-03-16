class Dance {
    String academyName;
    int academyId;
    String location;
    String founder;
    Form form;

    public void getDanceDetails() {
        System.out.println("Academy: " + this.academyName);
        System.out.println("ID: " + this.academyId);
        System.out.println("Location: " + this.location);
        System.out.println("Founder: " + this.founder);
        this.form.getFormDetails();
        System.out.println("\n");
    }
}


