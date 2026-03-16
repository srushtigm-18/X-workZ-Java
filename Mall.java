class Mall {
    String mallName;
    int mallId;
    String city;
    String address;
    Shop shop;

    public void getMallDetails() {
        System.out.println("Mall: " + this.mallName);
        System.out.println("ID: " + this.mallId);
        System.out.println("City: " + this.city);
        System.out.println("Address: " + this.address);
        this.shop.getShopDetails();
        System.out.println("\n");
    }
}

