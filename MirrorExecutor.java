class MirrorExecutor {
    public static void main(String[] args) {
     
     
        Mirror mirror1 = new Mirror("Round", "Wood", "Tempered","IKEA", "Brown","Bedroom");
		
        
        Mirror mirror2 = new Mirror(36.0, 24.0,4.5);
		
        
        Mirror mirror3 = new Mirror( false,false);
		
		
		Mirror mirror4 = new Mirror(1800);
		
		System.out.println("Mirror Shape: " + mirror1.shape);
        System.out.println("Mirror Frame: " + mirror1.frameMaterial);
        System.out.println("Mirror Height: " + mirror2.height);
        System.out.println("Mirror Width: " + mirror2.width);
        System.out.println("Mirror Glass: " + mirror1.glassType);
        System.out.println("Mirror Brand: " + mirror1.brand);
        System.out.println("Mirror WallMount: " + mirror3.wallMount);
        System.out.println("Mirror Weight: " + mirror2.weight);
        System.out.println("Mirror Color: " + mirror1.color);
        System.out.println("Mirror Price: " + mirror4.price);
        System.out.println("Mirror Usage: " + mirror1.usage);
        System.out.println("Mirror Lighted: " + mirror3.lighted);
        System.out.println("");
	}
}
		