class LensKart {
    String storeName;
    int storeId;
    String city;
    String manager;
    Frame frame;

    public LensKart(String storeName, int storeId, String city, String manager, Frame frame) {
        this.storeName = storeName;
        this.storeId = storeId;
        this.city = city;
        this.manager = manager;
        this.frame = frame;
    }

    public void getStoreDetails() {
        System.out.println("Store: " + this.storeName);
        System.out.println("ID: " + this.storeId);
        System.out.println("City: " + this.city);
        System.out.println("Manager: " + this.manager);
        this.frame.getFrameDetails();
        System.out.println("\n");
    }
}
