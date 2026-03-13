class Sprite {
    String shape;
    int layers;
    boolean animated;
    double height;
    String spriteType;
    int price;
    boolean glowEffect;
    double width;
    String color;
    int frames;
    boolean transparent;
    double speed;
    
    Sprite(String shape, String spriteType, String color) {
        this.shape = shape;
        this.spriteType = spriteType;
        this.color = color;
    }
    
    Sprite(int layers, int price, int frames) {
        this.layers = layers;
        this.price = price;
        this.frames = frames;
    }
    
    Sprite(boolean animated, boolean glowEffect, boolean transparent) {
        this.animated = animated;
        this.glowEffect = glowEffect;
        this.transparent = transparent;
    }
    
    Sprite(double height, double width, double speed) {
        this.height = height;
        this.width = width;
        this.speed = speed;
    }
}

