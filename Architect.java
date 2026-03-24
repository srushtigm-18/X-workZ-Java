class Architect {

    private String interiorDesignName[] = new String[11];   
    int index;

    public boolean addDesign(String design) {
        boolean isAdded = false;

        if (design != null && !design.isEmpty()) {
                interiorDesignName[index] = design;
                index++;
                isAdded = true;
           
        } else {
            System.out.println(design + " is invalid");
        }
        return isAdded;
    }

    public void getDesigns() {
        for (String d : interiorDesignName) {
                System.out.println(d);
            }
         }
}
