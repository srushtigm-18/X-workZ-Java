class ShoeLaceExecutor {
    public static void main(String[] args) {
       ShoeLace l1 = new ShoeLace();
        l1.laceId = 1;
        l1.laceName = "Sport Flat Lace";
        l1.material = "Cotton";
        l1.color = "Black";
        l1.lengthInInches = 48;
        l1.style = "Flat";
        l1.pattern = "Solid";
        l1.isElastic = false;
        l1.brand = "FitStep";
        l1.countryOfOrigin = "India";

        ShoeLace l2 = new ShoeLace();
        l2.laceId = 2;
        l2.laceName = "Running Round Lace";
        l2.material = "Synthetic";
        l2.color = "White";
        l2.lengthInInches = 54;
        l2.style = "Round";
        l2.pattern = "Striped";
        l2.isElastic = false;
        l2.brand = "RunFast";
        l2.countryOfOrigin = "China";

        ShoeLace l3 = new ShoeLace();
        l3.laceId = 3;
        l3.laceName = "Kids Colored Lace";
        l3.material = "Fiber";
        l3.color = "Rainbow";
        l3.lengthInInches = 40;
        l3.style = "Flat";
        l3.pattern = "Solid";
        l3.isElastic = false;
        l3.brand = "FunKids";
        l3.countryOfOrigin = "Vietnam";

        ShoeLace l4 = new ShoeLace();
        l4.laceId = 4;
        l4.laceName = "Boot Lace";
        l4.material = "Wax Cotton";
        l4.color = "Brown";
        l4.lengthInInches = 60;
        l4.style = "Round";
        l4.pattern = "Solid";
        l4.isElastic = false;
        l4.brand = "RuggedGear";
        l4.countryOfOrigin = "USA";

        ShoeLace l5 = new ShoeLace();
        l5.laceId = 5;
        l5.laceName = "Elastic Shoe Lace";
        l5.material = "Elastic";
        l5.color = "Black";
        l5.lengthInInches = 45;
        l5.style = "Round";
        l5.pattern = "Plain";
        l5.isElastic = true;
        l5.brand = "EasyStep";
        l5.countryOfOrigin = "Indonesia";

      System.out.println("ShoeLace l1 ID: " + l1.laceId + " Name: " + l1.laceName + " Material: " + l1.material + " Color: " + l1.color + " Length: " + l1.lengthInInches + " in Style: " + l1.style + " Pattern: " + l1.pattern + " Elastic: " + l1.isElastic + " Brand: " + l1.brand + " Origin: " + l1.countryOfOrigin);
        System.out.println("ShoeLace l2 ID: " + l2.laceId + " Name: " + l2.laceName + " Material: " + l2.material + " Color: " + l2.color + " Length: " + l2.lengthInInches + " in Style: " + l2.style + " Pattern: " + l2.pattern + " Elastic: " + l2.isElastic + " Brand: " + l2.brand + " Origin: " + l2.countryOfOrigin);
        System.out.println("ShoeLace l3 ID: " + l3.laceId + " Name: " + l3.laceName + " Material: " + l3.material + " Color: " + l3.color + " Length: " + l3.lengthInInches + " in Style: " + l3.style + " Pattern: " + l3.pattern + " Elastic: " + l3.isElastic + " Brand: " + l3.brand + " Origin: " + l3.countryOfOrigin);
        System.out.println("ShoeLace l4 ID: " + l4.laceId + " Name: " + l4.laceName + " Material: " + l4.material + " Color: " + l4.color + " Length: " + l4.lengthInInches + " in Style: " + l4.style + " Pattern: " + l4.pattern + " Elastic: " + l4.isElastic + " Brand: " + l4.brand + " Origin: " + l4.countryOfOrigin);
        System.out.println("ShoeLace l5 ID: " + l5.laceId + " Name: " + l5.laceName + " Material: " + l5.material + " Color: " + l5.color + " Length: " + l5.lengthInInches + " in Style: " + l5.style + " Pattern: " + l5.pattern + " Elastic: " + l5.isElastic + " Brand: " + l5.brand + " Origin: " + l5.countryOfOrigin);
        System.out.println("----------------------------------------------------------");

       ShoeLace p1 = new ShoeLace(6, "Woven Sneaker Lace", "Cotton Blend", "Red", 48, "Flat", "Woven", false, "StreetStyle", "China");
        ShoeLace p2 = new ShoeLace(7, "Parachute Lace", "Nylon", "Blue", 50, "Round", "Solid", false, "SkyRig", "Thailand");
        ShoeLace p3 = new ShoeLace(8, "Lace with Loops", "Synthetic", "Gray", 46, "Flat", "Solid", false, "Stylo", "India");
        ShoeLace p4 = new ShoeLace(9, "High Gloss Lace", "Polyester", "White", 52, "Round", "Shiny", false, "GlamShoe", "Italy");
        ShoeLace p5 = new ShoeLace(10, "Round Workout Lace", "Nylon", "Green", 54, "Round", "Solid", false, "PowerFit", "China");

       System.out.println("ShoeLace p1 ID: " + p1.laceId + " Name: " + p1.laceName + " Material: " + p1.material + " Color: " + p1.color + " Length: " + p1.lengthInInches + " in Style: " + p1.style + " Pattern: " + p1.pattern + " Elastic: " + p1.isElastic + " Brand: " + p1.brand + " Origin: " + p1.countryOfOrigin);
        System.out.println("ShoeLace p2 ID: " + p2.laceId + " Name: " + p2.laceName + " Material: " + p2.material + " Color: " + p2.color + " Length: " + p2.lengthInInches + " in Style: " + p2.style + " Pattern: " + p2.pattern + " Elastic: " + p2.isElastic + " Brand: " + p2.brand + " Origin: " + p2.countryOfOrigin);
        System.out.println("ShoeLace p3 ID: " + p3.laceId + " Name: " + p3.laceName + " Material: " + p3.material + " Color: " + p3.color + " Length: " + p3.lengthInInches + " in Style: " + p3.style + " Pattern: " + p3.pattern + " Elastic: " + p3.isElastic + " Brand: " + p3.brand + " Origin: " + p3.countryOfOrigin);
        System.out.println("ShoeLace p4 ID: " + p4.laceId + " Name: " + p4.laceName + " Material: " + p4.material + " Color: " + p4.color + " Length: " + p4.lengthInInches + " in Style: " + p4.style + " Pattern: " + p4.pattern + " Elastic: " + p4.isElastic + " Brand: " + p4.brand + " Origin: " + p4.countryOfOrigin);
        System.out.println("ShoeLace p5 ID: " + p5.laceId + " Name: " + p5.laceName + " Material: " + p5.material + " Color: " + p5.color + " Length: " + p5.lengthInInches + " in Style: " + p5.style + " Pattern: " + p5.pattern + " Elastic: " + p5.isElastic + " Brand: " + p5.brand + " Origin: " + p5.countryOfOrigin);
        System.out.println("----------------------------------------------------------");
    }
}
