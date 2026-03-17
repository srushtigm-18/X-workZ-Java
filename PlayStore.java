class PlayStore {
    String storeName;
    int storeId;
    String developer;
    String category;
    Application application;

    public PlayStore(int storeId,String storeName,  String developer, String category, Application application) {
        this.storeName = storeName;
        this.storeId = storeId;
        this.developer = developer;
        this.category = category;
        this.application = application;
    }

    public void getStoreDetails() {
        System.out.println("Store: " + this.storeName);
        System.out.println("ID: " + this.storeId);
        System.out.println("Developer: " + this.developer);
        System.out.println("Category: " + this.category);
        this.application.getApplicationDetails();
        System.out.println("\n");
    }
}
