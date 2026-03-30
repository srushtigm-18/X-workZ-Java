class ArchitectExecutor {
    public static void main(String[] args) {
        Architect arch = new Architect();

        arch.addDesign("Minimal Modern Living Room");
        arch.addDesign("Contemporary Kitchen");
        arch.addDesign("Luxury Bedroom Suite");
        arch.addDesign("Open Plan Office");
        arch.addDesign("Rustic Farmhouse Dining");
        arch.addDesign("Scandinavian Bedroom");
        arch.addDesign("Industrial Loft Lounge");
        arch.addDesign("Boho Chic Study");
        arch.addDesign("Luxury Bathroom Spa");
        arch.addDesign("Children Playroom");
        arch.addDesign("Home Theatre Setup");

        arch.getDesigns();
        System.out.println();

        int index = 6;
        String design = arch.getDesignByIndex(index);
        System.out.println("The design at index " + index + " is: " + design);
        System.out.println();

        String designName = "Boho Chic Study";
        int i = arch.getIndexByDesignName(designName);
        System.out.println("Design '" + designName + "' is at index: " + i);
        System.out.println();

        String updated = "Boho Chic Study ";
        boolean ref = arch.updateDesign("Boho Chic Study", updated);
        arch.getDesigns();
        System.out.println();

        String deleting = "Children Playroom";
        boolean reff = arch.deleteDesign(deleting);
        arch.getDesigns();
    }
}
