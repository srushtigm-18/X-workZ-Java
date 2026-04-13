class PVRMethodRefRunner {

    public static void main(String[] movie) {

        Screen screen = new Screen();
        screen.screenId = 102;
        screen.screenType = "PXL";
        screen.resolution = "4K Laser";
        screen.seatCapacity = 210;
        screen.soundSystem = "Dolby Atmos";
        PVR pvr = new PVR(2, screen);
        pvr.getDetails();

    }
}