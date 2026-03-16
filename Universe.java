class Universe {
    String structureName;
    int structureId;
    String scale;
    String contains;
    Earth earth;

    public void getUniverseDetails() {
        System.out.println("Structure: " + this.structureName);
        System.out.println("ID: " + this.structureId);
        System.out.println("Scale: " + this.scale);
        System.out.println("Contains: " + this.contains);
        this.earth.getEarthDetails();
        System.out.println("\n");
    }
}


