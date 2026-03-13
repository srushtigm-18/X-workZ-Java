class BucketExecutor {
    public static void main(String[] args) {
        Bucket d1 = new Bucket();
		d1.bucketId = 8472;
		d1.material = "Plastic"; 
		d1.capacity = 10;
		d1.color = "Blue";
		d1.price = 150.0;
		
        Bucket d2 = new Bucket(); 
		d2.bucketId = 3921; 
		d2.material = "Steel";
		d2.capacity = 20;
		d2.color = "Red"; 
		d2.price = 250.0;
		
        Bucket d3 = new Bucket();
		d3.bucketId = 6754;
		d3.material = "Plastic";
		d3.capacity = 15; 
		d3.color = "Green"; 
		d3.price = 180.0;
		
        Bucket d4 = new Bucket();
		d4.bucketId = 1289;
		d4.material = "Galvanized";
		d4.capacity = 25; 
		d4.color = "Silver"; 
		d4.price = 350.0;
		
        Bucket d5 = new Bucket();
		d5.bucketId = 9437;
		d5.material = "Plastic";
		d5.capacity = 12; 
		d5.color = "Yellow"; 
		d5.price = 160.0;
		
        Bucket d6 = new Bucket(); 
		d6.bucketId = 5612; 
		d6.material = "Steel"; 
		d6.capacity = 18; 
		d6.color = "Black";
		d6.price = 280.0;
		
        Bucket d7 = new Bucket();
		d7.bucketId = 7843; 
		d7.material = "PP"; 
		d7.capacity = 8;
		d7.color = "White";
		d7.price = 120.0;
		
        Bucket d8 = new Bucket(); 
		d8.bucketId = 2198;
		d8.material = "Aluminum"; 
		d8.capacity = 30; 
		d8.color = "Grey";
		d8.price = 450.0;
		
        Bucket d9 = new Bucket(); 
		d9.bucketId = 4567;
		d9.material = "Plastic";
		d9.capacity = 5;
		d9.color = "Orange"; 
		d9.price = 100.0;
		
        Bucket d10 = new Bucket(); 
		d10.bucketId = 7382;
		d10.material = "Steel";
		d10.capacity = 22; 
		d10.color = "Blue";
		d10.price = 320.0;
		
        Bucket d11 = new Bucket(); 
		d11.bucketId = 1954; 
		d11.material = "HDPE";
		d11.capacity = 16;
		d11.color = "Red"; 
		d11.price = 200.0;
		
        Bucket d12 = new Bucket(); 
		d12.bucketId = 8621; 
		d12.material = "Galvanized";
		d12.capacity = 35; 
		d12.color = "Green"; 
		d12.price = 500.0;
		
        Bucket d13 = new Bucket();
		d13.bucketId = 3479;
		d13.material = "Plastic";
		d13.capacity = 9;
		d13.color = "Purple"; 
		d13.price = 140.0;
       
	   Bucket d14 = new Bucket();
	   d14.bucketId = 5926;
	   d14.material = "Stainless";
	   d14.capacity = 28;
	   d14.color = "Silver";
	   d14.price = 650.0;
       
	   Bucket d15 = new Bucket();
	   d15.bucketId = 7148;
	   d15.material = "PP"; 
	   d15.capacity = 14;
	   d15.color = "Pink";
	   d15.price = 170.0;
       
	   Bucket d16 = new Bucket();
	   d16.bucketId = 2835;
	   d16.material = "Plastic"; 
	   d16.capacity = 20; 
	   d16.color = "Brown"; 
	   d16.price = 220.0;
       
	   Bucket d17 = new Bucket(); 
	   d17.bucketId = 9651; 
	   d17.material = "Steel";
	   d17.capacity = 11;
	   d17.color = "Gold";
	   d17.price = 300.0;
       
	   Bucket d18 = new Bucket();
	   d18.bucketId = 4273;
	   d18.material = "HDPE"; 
	   d18.capacity = 24; 
	   d18.color = "Teal";
	   d18.price = 260.0;
       
	   Bucket d19 = new Bucket();
	   d19.bucketId = 6819; 
	   d19.material = "Galvanized"; 
	   d19.capacity = 17;
	   d19.color = "Navy";
	   d19.price = 380.0;
       
	   Bucket d20 = new Bucket();
	   d20.bucketId = 1347;
	   d20.material = "Aluminum"; 
	   d20.capacity = 32;
	   d20.color = "Maroon"; 
	   d20.price = 480.0;
       
	   Bucket d21 = new Bucket();
	   d21.bucketId = 7962; 
	   d21.material = "Plastic"; 
	   d21.capacity = 13; 
	   d21.color = "Lime"; 
	   d21.price = 190.0;
       
	   Bucket d22 = new Bucket(); 
	   d22.bucketId = 4589;
	   d22.material = "Steel"; 
	   d22.capacity = 19; 
	   d22.color = "Cyan"; 
	   d22.price = 290.0;
       
	   Bucket d23 = new Bucket(); 
	   d23.bucketId = 3721;

	   d23.material = "PP"; 
	   d23.capacity = 26; 
	   d23.color = "Magenta";
	   d23.price = 240.0;
       
	   Bucket d24 = new Bucket(); 
	   d24.bucketId = 6194;
	   d24.material = "Stainless";
	   d24.capacity = 7;
	   d24.color = "Beige"; 
	   d24.price = 550.0;
       
	   Bucket d25 = new Bucket();
	   d25.bucketId = 2856;
	   d25.material = "HDPE";
	   d25.capacity = 21;
	   d25.color = "Olive";
	   d25.price = 230.0;
        
        Bucket p1 = new Bucket(8472, "Plastic", 10, "Blue", 150.0);
        Bucket p2 = new Bucket(3921, "Steel", 20, "Red", 250.0);
        Bucket p3 = new Bucket(6754, "Plastic", 15, "Green", 180.0);
        Bucket p4 = new Bucket(1289, "Galvanized", 25, "Silver", 350.0);
        Bucket p5 = new Bucket(9437, "Plastic", 12, "Yellow", 160.0);
        Bucket p6 = new Bucket(5612, "Steel", 18, "Black", 280.0);
        Bucket p7 = new Bucket(7843, "PP", 8, "White", 120.0);
        Bucket p8 = new Bucket(2198, "Aluminum", 30, "Grey", 450.0);
        Bucket p9 = new Bucket(4567, "Plastic", 5, "Orange", 100.0);
        Bucket p10 = new Bucket(7382, "Steel", 22, "Blue", 320.0);
        Bucket p11 = new Bucket(1954, "HDPE", 16, "Red", 200.0);
        Bucket p12 = new Bucket(8621, "Galvanized", 35, "Green", 500.0);
        Bucket p13 = new Bucket(3479, "Plastic", 9, "Purple", 140.0);
        Bucket p14 = new Bucket(5926, "Stainless", 28, "Silver", 650.0);
        Bucket p15 = new Bucket(7148, "PP", 14, "Pink", 170.0);
        Bucket p16 = new Bucket(2835, "Plastic", 20, "Brown", 220.0);
        Bucket p17 = new Bucket(9651, "Steel", 11, "Gold", 300.0);
        Bucket p18 = new Bucket(4273, "HDPE", 24, "Teal", 260.0);
        Bucket p19 = new Bucket(6819, "Galvanized", 17, "Navy", 380.0);
        Bucket p20 = new Bucket(1347, "Aluminum", 32, "Maroon", 480.0);
        Bucket p21 = new Bucket(7962, "Plastic", 13, "Lime", 190.0);
        Bucket p22 = new Bucket(4589, "Steel", 19, "Cyan", 290.0);
        Bucket p23 = new Bucket(3721, "PP", 26, "Magenta", 240.0);
        Bucket p24 = new Bucket(6194, "Stainless", 7, "Beige", 550.0);
        Bucket p25 = new Bucket(2856, "HDPE", 21, "Olive", 230.0);
        
        System.out.println("Bucket d1 ID: " + d1.bucketId + " Material: " + d1.material + " Capacity: " + d1.capacity + "L Color: " + d1.color + " Price: " + d1.price);
        System.out.println("Bucket d2 ID: " + d2.bucketId + " Material: " + d2.material + " Capacity: " + d2.capacity + "L Color: " + d2.color + " Price: " + d2.price);
        System.out.println("Bucket d3 ID: " + d3.bucketId + " Material: " + d3.material + " Capacity: " + d3.capacity + "L Color: " + d3.color + " Price: " + d3.price);
        System.out.println("Bucket d4 ID: " + d4.bucketId + " Material: " + d4.material + " Capacity: " + d4.capacity + "L Color: " + d4.color + " Price: " + d4.price);
        System.out.println("Bucket d5 ID: " + d5.bucketId + " Material: " + d5.material + " Capacity: " + d5.capacity + "L Color: " + d5.color + " Price: " + d5.price);
        System.out.println("Bucket d6 ID: " + d6.bucketId + " Material: " + d6.material + " Capacity: " + d6.capacity + "L Color: " + d6.color + " Price: " + d6.price);
        System.out.println("Bucket d7 ID: " + d7.bucketId + " Material: " + d7.material + " Capacity: " + d7.capacity + "L Color: " + d7.color + " Price: " + d7.price);
        System.out.println("Bucket d8 ID: " + d8.bucketId + " Material: " + d8.material + " Capacity: " + d8.capacity + "L Color: " + d8.color + " Price: " + d8.price);
        System.out.println("Bucket d9 ID: " + d9.bucketId + " Material: " + d9.material + " Capacity: " + d9.capacity + "L Color: " + d9.color + " Price: " + d9.price);
        System.out.println("Bucket d10 ID: " + d10.bucketId + " Material: " + d10.material + " Capacity: " + d10.capacity + "L Color: " + d10.color + " Price: " + d10.price);
        System.out.println("Bucket d11 ID: " + d11.bucketId + " Material: " + d11.material + " Capacity: " + d11.capacity + "L Color: " + d11.color + " Price: " + d11.price);
        System.out.println("Bucket d12 ID: " + d12.bucketId + " Material: " + d12.material + " Capacity: " + d12.capacity + "L Color: " + d12.color + " Price: " + d12.price);
        System.out.println("Bucket d13 ID: " + d13.bucketId + " Material: " + d13.material + " Capacity: " + d13.capacity + "L Color: " + d13.color + " Price: " + d13.price);
        System.out.println("Bucket d14 ID: " + d14.bucketId + " Material: " + d14.material + " Capacity: " + d14.capacity + "L Color: " + d14.color + " Price: " + d14.price);
        System.out.println("Bucket d15 ID: " + d15.bucketId + " Material: " + d15.material + " Capacity: " + d15.capacity + "L Color: " + d15.color + " Price: " + d15.price);
        System.out.println("Bucket d16 ID: " + d16.bucketId + " Material: " + d16.material + " Capacity: " + d16.capacity + "L Color: " + d16.color + " Price: " + d16.price);
        System.out.println("Bucket d17 ID: " + d17.bucketId + " Material: " + d17.material + " Capacity: " + d17.capacity + "L Color: " + d17.color + " Price: " + d17.price);
        System.out.println("Bucket d18 ID: " + d18.bucketId + " Material: " + d18.material + " Capacity: " + d18.capacity + "L Color: " + d18.color + " Price: " + d18.price);
        System.out.println("Bucket d19 ID: " + d19.bucketId + " Material: " + d19.material + " Capacity: " + d19.capacity + "L Color: " + d19.color + " Price: " + d19.price);
        System.out.println("Bucket d20 ID: " + d20.bucketId + " Material: " + d20.material + " Capacity: " + d20.capacity + "L Color: " + d20.color + " Price: " + d20.price);
        System.out.println("Bucket d21 ID: " + d21.bucketId + " Material: " + d21.material + " Capacity: " + d21.capacity + "L Color: " + d21.color + " Price: " + d21.price);
        System.out.println("Bucket d22 ID: " + d22.bucketId + " Material: " + d22.material + " Capacity: " + d22.capacity + "L Color: " + d22.color + " Price: " + d22.price);
        System.out.println("Bucket d23 ID: " + d23.bucketId + " Material: " + d23.material + " Capacity: " + d23.capacity + "L Color: " + d23.color + " Price: " + d23.price);
        System.out.println("Bucket d24 ID: " + d24.bucketId + " Material: " + d24.material + " Capacity: " + d24.capacity + "L Color: " + d24.color + " Price: " + d24.price);
        System.out.println("Bucket d25 ID: " + d25.bucketId + " Material: " + d25.material + " Capacity: " + d25.capacity + "L Color: " + d25.color + " Price: " + d25.price);
        System.out.println("----------------------------------------------------------");
        
        System.out.println("Bucket p1 ID: " + p1.bucketId + " Material: " + p1.material + " Capacity: " + p1.capacity + "L Color: " + p1.color + " Price: " + p1.price);
        System.out.println("Bucket p2 ID: " + p2.bucketId + " Material: " + p2.material + " Capacity: " + p2.capacity + "L Color: " + p2.color + " Price: " + p2.price);
        System.out.println("Bucket p3 ID: " + p3.bucketId + " Material: " + p3.material + " Capacity: " + p3.capacity + "L Color: " + p3.color + " Price: " + p3.price);
        System.out.println("Bucket p4 ID: " + p4.bucketId + " Material: " + p4.material + " Capacity: " + p4.capacity + "L Color: " + p4.color + " Price: " + p4.price);
        System.out.println("Bucket p5 ID: " + p5.bucketId + " Material: " + p5.material + " Capacity: " + p5.capacity + "L Color: " + p5.color + " Price: " + p5.price);
        System.out.println("Bucket p6 ID: " + p6.bucketId + " Material: " + p6.material + " Capacity: " + p6.capacity + "L Color: " + p6.color + " Price: " + p6.price);
        System.out.println("Bucket p7 ID: " + p7.bucketId + " Material: " + p7.material + " Capacity: " + p7.capacity + "L Color: " + p7.color + " Price: " + p7.price);
        System.out.println("Bucket p8 ID: " + p8.bucketId + " Material: " + p8.material + " Capacity: " + p8.capacity + "L Color: " + p8.color + " Price: " + p8.price);
        System.out.println("Bucket p9 ID: " + p9.bucketId + " Material: " + p9.material + " Capacity: " + p9.capacity + "L Color: " + p9.color + " Price: " + p9.price);
        System.out.println("Bucket p10 ID: " + p10.bucketId + " Material: " + p10.material + " Capacity: " + p10.capacity + "L Color: " + p10.color + " Price: " + p10.price);
        System.out.println("Bucket p11 ID: " + p11.bucketId + " Material: " + p11.material + " Capacity: " + p11.capacity + "L Color: " + p11.color + " Price: " + p11.price);
        System.out.println("Bucket p12 ID: " + p12.bucketId + " Material: " + p12.material + " Capacity: " + p12.capacity + "L Color: " + p12.color + " Price: " + p12.price);
        System.out.println("Bucket p13 ID: " + p13.bucketId + " Material: " + p13.material + " Capacity: " + p13.capacity + "L Color: " + p13.color + " Price: " + p13.price);
        System.out.println("Bucket p14 ID: " + p14.bucketId + " Material: " + p14.material + " Capacity: " + p14.capacity + "L Color: " + p14.color + " Price: " + p14.price);
        System.out.println("Bucket p15 ID: " + p15.bucketId + " Material: " + p15.material + " Capacity: " + p15.capacity + "L Color: " + p15.color + " Price: " + p15.price);
        System.out.println("Bucket p16 ID: " + p16.bucketId + " Material: " + p16.material + " Capacity: " + p16.capacity + "L Color: " + p16.color + " Price: " + p16.price);
        System.out.println("Bucket p17 ID: " + p17.bucketId + " Material: " + p17.material + " Capacity: " + p17.capacity + "L Color: " + p17.color + " Price: " + p17.price);
        System.out.println("Bucket p18 ID: " + p18.bucketId + " Material: " + p18.material + " Capacity: " + p18.capacity + "L Color: " + p18.color + " Price: " + p18.price);
        System.out.println("Bucket p19 ID: " + p19.bucketId + " Material: " + p19.material + " Capacity: " + p19.capacity + "L Color: " + p19.color + " Price: " + p19.price);
        System.out.println("Bucket p20 ID: " + p20.bucketId + " Material: " + p20.material + " Capacity: " + p20.capacity + "L Color: " + p20.color + " Price: " + p20.price);
        System.out.println("Bucket p21 ID: " + p21.bucketId + " Material: " + p21.material + " Capacity: " + p21.capacity + "L Color: " + p21.color + " Price: " + p21.price);
        System.out.println("Bucket p22 ID: " + p22.bucketId + " Material: " + p22.material + " Capacity: " + p22.capacity + "L Color: " + p22.color + " Price: " + p22.price);
        System.out.println("Bucket p23 ID: " + p23.bucketId + " Material: " + p23.material + " Capacity: " + p23.capacity + "L Color: " + p23.color + " Price: " + p23.price);
        System.out.println("Bucket p24 ID: " + p24.bucketId + " Material: " + p24.material + " Capacity: " + p24.capacity + "L Color: " + p24.color + " Price: " + p24.price);
        System.out.println("Bucket p25 ID: " + p25.bucketId + " Material: " + p25.material + " Capacity: " + p25.capacity + "L Color: " + p25.color + " Price: " + p25.price);
        System.out.println("----------------------------------------------------------");
    }
}
