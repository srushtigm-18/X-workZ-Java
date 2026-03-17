class PeriodicTable {
    String periodName;
    int periodNumber;
    String group;
    String block;
    Element element;

    public PeriodicTable(int periodNumber,String periodName,  String group, String block, Element element) {
        this.periodName = periodName;
        this.periodNumber = periodNumber;
        this.group = group;
        this.block = block;
        this.element = element;
    }

    public void getPeriodicDetails() {
        System.out.println("Period: " + this.periodName);
        System.out.println("Number: " + this.periodNumber);
        System.out.println("Group: " + this.group);
        System.out.println("Block: " + this.block);
        this.element.getElementDetails();
        System.out.println("\n");
    }
}
