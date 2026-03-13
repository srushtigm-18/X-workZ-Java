class SpriteExecutor {
    public static void main(String[] args) {
        Sprite sprite1 = new Sprite("Square", "Character", "Blue");
        
        Sprite sprite2 = new Sprite(3, 500, 8);
        
        Sprite sprite3 = new Sprite(true, false, true);
        
        Sprite sprite4 = new Sprite(64.0, 64.0, 2.5);
        
        System.out.println("Sprite Shape: " + sprite1.shape);
        System.out.println("Sprite Layers: " + sprite2.layers);
        System.out.println("Sprite Animated: " + sprite3.animated);
        System.out.println("Sprite Height: " + sprite4.height);
        System.out.println("Sprite Type: " + sprite1.spriteType);
        System.out.println("Sprite Price: " + sprite2.price);
        System.out.println("Sprite GlowEffect: " + sprite3.glowEffect);
        System.out.println("Sprite Width: " + sprite4.width);
        System.out.println("Sprite Color: " + sprite1.color);
        System.out.println("Sprite Frames: " + sprite2.frames);
        System.out.println("Sprite Transparent: " + sprite3.transparent);
        System.out.println("Sprite Speed: " + sprite4.speed);
        System.out.println("");
    }
}
