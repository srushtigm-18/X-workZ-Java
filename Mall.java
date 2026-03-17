class Mall {
    String mallName;
    int mallId;
    String city;
    String address;
    Shop shop;

    public Mall(String mallName, int mallId, String city, String address, Shop shop) {
        this.mallName = mallName;
        this.mallId = mallId;
        this.city = city;
        this.address = address;
        this.shop = shop;
    }

    public void getMallDetails() {
        System.out.println("Mall: " + this.mallName);
        System.out.println("ID: " + this.mallId);
        System.out.println("City: " + this.city);
        System.out.println("Address: " + this.address);
        this.shop.getShopDetails();
        System.out.println("\n");
    }
}
