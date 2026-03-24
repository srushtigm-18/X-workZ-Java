class PetShop {

    private String accessories[] = new String[20];  
    int index;

    public boolean addAccessory(String accessory) {
        boolean isAdded = false;

        if (accessory != null && !accessory.isEmpty()) {
                accessories[index] = accessory;
                index++;
                isAdded = true;
            
        } else {
            System.out.println(accessory + " is invalid");
        }
        return isAdded;
    }

    public void getAccessories() {
        for (String a : accessories) {
                System.out.println(a);
            
        }
    }
}
