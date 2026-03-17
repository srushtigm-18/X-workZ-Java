class Shop {
    int shopNumber;
    String shopName;
    String category;
    int floorNumber;
    double rent;

    public Shop(int shopNumber, String shopName, String category, int floorNumber, double rent) {
        this.shopNumber = shopNumber;
        this.shopName = shopName;
        this.category = category;
        this.floorNumber = floorNumber;
        this.rent = rent;
    }

    public void getShopDetails() {
        System.out.println("Shop No: " + this.shopNumber);
        System.out.println("Name: " + this.shopName);
        System.out.println("Category: " + this.category);
        System.out.println("Floor: " + this.floorNumber);
        System.out.println("Rent: " + this.rent + "L");
    }
}
