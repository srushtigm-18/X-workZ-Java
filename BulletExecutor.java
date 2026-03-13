class BulletExecutor {
    public static void main(String[] args) {
        Bullet bullet1 = new Bullet("9mm", "Copper", "Federal");
        
        Bullet bullet2 = new Bullet(115, 1200, 50);
        
        Bullet bullet3 = new Bullet(true, false, false);
        
        Bullet bullet4 = new Bullet(0.355, 0.75, 0.45);
        
        System.out.println("Bullet Caliber: " + bullet1.caliber);
        System.out.println("Bullet Weight: " + bullet2.weightGrains);
        System.out.println("Bullet Jacketed: " + bullet3.jacketed);
        System.out.println("Bullet Diameter: " + bullet4.diameter);
        System.out.println("Bullet Material: " + bullet1.material);
        System.out.println("Bullet Velocity: " + bullet2.velocity);
        System.out.println("Bullet HollowPoint: " + bullet3.hollowPoint);
        System.out.println("Bullet Length: " + bullet4.length);
        System.out.println("Bullet Manufacturer: " + bullet1.manufacturer);
        System.out.println("Bullet Count: " + bullet2.count);
        System.out.println("Bullet ArmorPiercing: " + bullet3.armorPiercing);
        System.out.println("Bullet Price: " + bullet4.pricePerRound);
        System.out.println("");
    }
}