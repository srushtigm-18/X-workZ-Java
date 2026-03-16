class LensKart {
    String storeName;
    int storeId;
    String city;
    String manager;
    Frame frame;

    public void getStoreDetails() {
        System.out.println("Store: " + this.storeName);
        System.out.println("ID: " + this.storeId);
        System.out.println("City: " + this.city);
        System.out.println("Manager: " + this.manager);
        this.frame.getFrameDetails();
        System.out.println("\n");
    }
}


