class SnoodExecutor {
    public static void main(String[] args) {
        Snood snood1 = new Snood("Neck Gaiter", "Cotton", "Grey", "One Size");
        
        Snood snood2 = new Snood(350, 28, 2);
        
        Snood snood3 = new Snood(true, true);
        
        Snood snood4 = new Snood(8.0, 12.0, 0.1);
        
        System.out.println("Snood Style: " + snood1.style);
        System.out.println("Snood Material: " + snood1.material);
        System.out.println("Snood Price: " + snood2.price);
        System.out.println("Snood Color: " + snood1.color);
        System.out.println("Snood Length: " + snood2.length);
        System.out.println("Snood Size: " + snood1.size);
        System.out.println("Snood Thickness: " + snood2.thickness);
        System.out.println("Snood Width: " + snood4.width);
        System.out.println("Snood Height: " + snood4.height);
        System.out.println("Snood AntiMicrobial: " + snood3.antiMicrobial);
        System.out.println("Snood Weight: " + snood4.weight);
        System.out.println("Snood Seamless: " + snood3.seamless);
        System.out.println("");
    }
}