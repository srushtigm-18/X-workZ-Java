class ProjectorExecutor {
    public static void main(String[] lamp) {
        Projector.switchPower();
        System.out.println("Power status: " + Projector.projectorStatus);
        Projector.increaseBrightness(); 
        Projector.increaseBrightness();
        Projector.decreaseBrightness();
        System.out.println("Final brightness: " + Projector.currentBrightness);
    }
}