class PVRConstructorRefRunner {

    public static void main(String[] chalanachitra) {
	
        Screen screen = new Screen();
        screen.screenId = 125;
        screen.screenType = "Regular";
        screen.resolution = "2K";
        screen.seatCapacity = 150;
        screen.soundSystem = "Dolby 7.1";
        PVR pvr = new PVR(3, screen);
        pvr.getDetails();
    }
}