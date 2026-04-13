class PVR {

    int pvrId;
    Screen screen;
    
    PVR(int pvrId, Screen screen) {
        this.pvrId = pvrId;
        this.screen = screen;
    }
    
    public void getDetails() {
	
        System.out.println("PVR id is: " + this.pvrId);
        System.out.println("Screen id is: " + this.screen.screenId);
        System.out.println("Screen type is: " + this.screen.screenType);
        System.out.println("Screen resolution is: " + this.screen.resolution);
        System.out.println("Screen seat capacity is: " + this.screen.seatCapacity);
        System.out.println("Screen sound system is: " + this.screen.soundSystem);
    }
}