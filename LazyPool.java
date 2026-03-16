class LazyPool {
    int poolId;
    String poolName;
    int lengthMeters;
    int capacity;
    double ticketPrice;

    public void getPoolDetails() {
        System.out.println("Pool ID: " + this.poolId);
        System.out.println("Name: " + this.poolName);
        System.out.println("Length: " + this.lengthMeters + "m");
        System.out.println("Capacity: " + this.capacity + " people");
        System.out.println("Price: ₹" + this.ticketPrice);
    }
}
