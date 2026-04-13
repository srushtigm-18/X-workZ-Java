class Map {
    int mapId;
    Location location;
    
    Map(int mapId, Location location) {
        this.mapId = mapId;
        this.location = location;
    }
    
    public void getDetails() {
       
	   System.out.println("Map id is: " + this.mapId);
        System.out.println("Location id is: " + this.location.id);
        System.out.println("Location street is: " + this.location.street);
        System.out.println("Location area is: " + this.location.area);
        System.out.println("Location city is: " + this.location.city);
        System.out.println("Location pincode is: " + this.location.pincode);
    }
}