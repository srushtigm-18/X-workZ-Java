class FoodStreet {
    int streetId;
    Stall stall;
    
    FoodStreet(int streetId, Stall stall) {
        this.streetId = streetId;
        this.stall = stall;
    }
    
    public void getDetails() {
	
        System.out.println("FoodStreet id is: " + this.streetId);
        System.out.println("Stall id is: " + this.stall.stallId);
        System.out.println("Stall name is: " + this.stall.stallName);
        System.out.println("Stall foodType is: " + this.stall.foodType);
        System.out.println("Stall price is: " + this.stall.price);
        System.out.println("Stall location is: " + this.stall.location);
    }
}