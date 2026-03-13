class RainbowExecutor {
    public static void main(String[] args) {
        Rainbow rainbow1 = new Rainbow("Natural", "Post-Rain", "Monsoon", "Clear");
        
        Rainbow rainbow2 = new Rainbow(true, false, false, true);
        
        Rainbow rainbow3 = new Rainbow(7, 15, 120, 40);
        
        System.out.println("Rainbow Type: " + rainbow1.type);
        System.out.println("Rainbow Primary: " + rainbow2.primary);
        System.out.println("Rainbow Colors: " + rainbow3.colors);
        System.out.println("Rainbow Location: " + rainbow1.location);
        System.out.println("Rainbow Secondary: " + rainbow2.secondary);
        System.out.println("Rainbow Duration: " + rainbow3.duration);
        System.out.println("Rainbow Season: " + rainbow1.season);
        System.out.println("Rainbow DoubleRainbow: " + rainbow2.doubleRainbow);
        System.out.println("Rainbow Width: " + rainbow3.width);
        System.out.println("Rainbow Visibility: " + rainbow1.visibility);
        System.out.println("Rainbow FullArc: " + rainbow2.fullArc);
        System.out.println("Rainbow Height: " + rainbow3.height);
        System.out.println("");
    }
}