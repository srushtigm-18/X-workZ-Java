class BlenderExecutor {
    public static void main(String[] motor) {
        Blender.switchPower();
        System.out.println("Power status: " + Blender.motorStatus);
        Blender.increaseSpeed(); 
        Blender.increaseSpeed();
        Blender.decreaseSpeed();
        System.out.println("Final speed: " + Blender.currentSpeed);
    }
}