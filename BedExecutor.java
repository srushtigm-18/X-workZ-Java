class BedExecutor {
    public static void main(String[] args) {
        Bed bed = new Bed();
		
        bed.addBed("Single Bed");
        bed.addBed("Double Bed");
        bed.addBed("Queen Size Bed");
        bed.addBed("King Size Bed");
        bed.addBed("Storage Bed");
        bed.addBed("Hydraulic Bed");
        bed.addBed("Loft Bed");
        bed.addBed("Bunk Bed");
        bed.addBed("Canopy Bed");
        bed.addBed("Upholstered Bed");
        bed.addBed("Platform Bed");
        bed.addBed("Adjustable Bed");

        bed.getBeds();
        System.out.println();


        int index = 4;
        String b = bed.getBedNameByIndex(index);
        System.out.println("Bed at index " + index + " is: " + b);
        System.out.println(); 
		
        String searchName = "King Size Bed";
        int i = bed.getIndexByBedName(searchName);
        System.out.println("Bed '" + searchName + "' is at index: " + i);
        System.out.println();
        String updated = "King Size Bed (Memory Foam)";
        boolean ref = bed.updateBed("King Size Bed", updated);
        bed.getBeds();
        System.out.println();

       
        String deleting = "Bunk Bed";
        boolean reff = bed.deleteBed(deleting);
		
        bed.getBeds();
    }
}
