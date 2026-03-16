class PeriodicTable {
    String periodName;
    int periodNumber;
    String group;
    String block;
    Element element;

    public void getPeriodicDetails() {
        System.out.println("Period: " + this.periodName);
        System.out.println("Number: " + this.periodNumber);
        System.out.println("Group: " + this.group);
        System.out.println("Block: " + this.block);
        this.element.getElementDetails();
        System.out.println("\n");
    }
}

