class Crop {

    int cropId;
    Season season;
    
    Crop(int cropId, Season season) {
	
        this.cropId = cropId;
        this.season = season;
    }
    
    public void getDetails() {
	
        System.out.println("Crop id is: " + this.cropId);
        System.out.println("Season id is: " + this.season.seasonId);
        System.out.println("Season name is: " + this.season.seasonName);
        System.out.println("Season cropType is: " + this.season.cropType);
        System.out.println("Season duration is: " + this.season.duration);
        System.out.println("Season yield is: " + this.season.yield + " tons/ha");
}
}