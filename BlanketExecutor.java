class BlanketExecutor {
    public static void main(String[] args) {
       Blanket b1 = new Blanket();
        b1.blanketId = 1;
        b1.blanketType = "Cotton Throw";
        b1.material = "Cotton";
        b1.color = "Beige";
        b1.sizeInches = 60;
        b1.isWaterproof = false;

        Blanket b2 = new Blanket();
        b2.blanketId = 2;
        b2.blanketType = "Fleece Blanket";
        b2.material = "Polyester";
        b2.color = "Blue";
        b2.sizeInches = 80;
        b2.isWaterproof = true;

        Blanket b3 = new Blanket();
        b3.blanketId = 3;
        b3.blanketType = "Wool Blanket";
        b3.material = "Wool";
        b3.color = "Brown";
        b3.sizeInches = 70;
        b3.isWaterproof = false;

System.out.println("Default");
        System.out.println("Blanket b1 ID: " + b1.blanketId +
                           " Type: " + b1.blanketType +
                           " Material: " + b1.material +
                           " Color: " + b1.color +
                           " Size: " + b1.sizeInches + " inches" +
                           " Waterproof: " + b1.isWaterproof);

        System.out.println("Blanket b2  ID: " + b2.blanketId +
                           " Type: " + b2.blanketType +
                           " Material: " + b2.material +
                           " Color: " + b2.color +
                           " Size: " + b2.sizeInches + " inches" +
                           " Waterproof: " + b2.isWaterproof);

        System.out.println("Blanket b3  ID: " + b3.blanketId +
                           " Type: " + b3.blanketType +
                           " Material: " + b3.material +
                           " Color: " + b3.color +
                           " Size: " + b3.sizeInches + " inches" +
                           " Waterproof: " + b3.isWaterproof);

        System.out.println("----------------------------------------------------------");

System.out.println("Parameterized");
       Blanket p1 = new Blanket(4, "Quilted Blanket", "Cotton", "Pink", 65, false);
        Blanket p2 = new Blanket(5, "Electric Blanket", "Microfiber", "White", 90, false);
        Blanket p3 = new Blanket(6, "Kids Blanket", "Flannel", "Red", 50, false);

        System.out.println("Blanket p1  ID: " + p1.blanketId +
                           " Type: " + p1.blanketType +
                           " Material: " + p1.material +
                           " Color: " + p1.color +
                           " Size: " + p1.sizeInches + " inches" +
                           " Waterproof: " + p1.isWaterproof);

        System.out.println("Blanket p2  ID: " + p2.blanketId +
                           " Type: " + p2.blanketType +
                           " Material: " + p2.material +
                           " Color: " + p2.color +
                           " Size: " + p2.sizeInches + " inches" +
                           " Waterproof: " + p2.isWaterproof);

        System.out.println("Blanket p3  ID: " + p3.blanketId +
                           " Type: " + p3.blanketType +
                           " Material: " + p3.material +
                           " Color: " + p3.color +
                           " Size: " + p3.sizeInches + " inches" +
                           " Waterproof: " + p3.isWaterproof);

        System.out.println("----------------------------------------------------------");
    }
}
