class MugExecutor {
    public static void main(String[] args) {
        Mug mug1 = new Mug("Ceramic", "Porcelain", "White", "12oz");
        
        Mug mug2 = new Mug(350, 350, 12);
        
        Mug mug3 = new Mug(true, true);
        
        Mug mug4 = new Mug(8.0, 0.4, 0.3);
        
        System.out.println("Mug Style: " + mug1.style);
        System.out.println("Mug Material: " + mug1.material);
        System.out.println("Mug Price: " + mug2.price);
        System.out.println("Mug Color: " + mug1.color);
        System.out.println("Mug Capacity: " + mug2.capacity);
        System.out.println("Mug Size: " + mug1.size);
        System.out.println("Mug Height: " + mug2.height);
        System.out.println("Mug Width: " + mug4.width);
        System.out.println("Mug MicrowaveSafe: " + mug3.microwaveSafe);
        System.out.println("Mug Weight: " + mug4.weight);
        System.out.println("Mug Thickness: " + mug4.thickness);
        System.out.println("Mug DishwasherSafe: " + mug3.dishwasherSafe);
        System.out.println("");
    }
}
