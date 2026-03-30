class CylinderExecutor {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

   
        cylinder.addCylinder("LPG Cylinder 19kg");
        cylinder.addCylinder("CNG Cylinder 10kg");
        cylinder.addCylinder("Oxygen Cylinder 40L");
        cylinder.addCylinder("Nitrogen Cylinder 50L");
        cylinder.addCylinder("Helium Cylinder 10L");
        cylinder.addCylinder("CO2 Cylinder 20L");
        cylinder.addCylinder("Acetylene Cylinder 40L");
        cylinder.addCylinder("Argon Cylinder 50L");
        cylinder.addCylinder("Propane Cylinder 15kg");
        cylinder.addCylinder("Butane Cylinder 13kg");
        cylinder.addCylinder("Air Compressor Cylinder 100L");
        cylinder.addCylinder("Medical Gas Cylinder 50L");

        cylinder.getCylinders();
        System.out.println();

        int index = 3;
        String cyl = cylinder.getCylinderNameByIndex(index);
        System.out.println("Cylinder at index " + index + " is: " + cyl);
        System.out.println();

      
        String searchName = "Oxygen Cylinder 40L";
        int i = cylinder.getIndexByCylinderName(searchName);
        System.out.println("Cylinder " + searchName + " is at index: " + i);
        System.out.println();

       
        String updated = "Oxygen Cylinder 40L (High Pressure)";
        boolean ref = cylinder.updateCylinder("Oxygen Cylinder 40L", updated);
        cylinder.getCylinders();
        System.out.println();

       
        String deleting = "Medical Gas Cylinder 50L";
        boolean reff = cylinder.deleteCylinder(deleting);
        cylinder.getCylinders();
    }
}
