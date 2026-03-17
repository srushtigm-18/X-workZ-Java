class Wonderla {
    String parkName;
    int parkId;
    String city;
    String theme;
    LazyPool lazyPool;

    public Wonderla(int parkId, String parkName, String city, String theme, LazyPool lazyPool) {
        this.parkId = parkId;
        this.parkName = parkName;
        this.city = city;
        this.theme = theme;
        this.lazyPool = lazyPool;
    }

    public void getParkDetails() {
        System.out.println("Park: " + this.parkName);
        System.out.println("ID: " + this.parkId);
        System.out.println("City: " + this.city);
        System.out.println("Theme: " + this.theme);
        this.lazyPool.getPoolDetails();
        System.out.println("\n");
    }
}
