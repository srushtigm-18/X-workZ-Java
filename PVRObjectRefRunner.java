class PVRObjectRefRunner {

    public static void main(String[] movie) {

        Screen screen = new Screen();
        PVR pvr = new PVR(1, screen);
        screen.screenId = 569;
        screen.screenType = "IMAX";
        screen.resolution = "4K";
        screen.seatCapacity = 450;
        screen.soundSystem = "Dolby Atmos";
        pvr.getDetails();

    }
}