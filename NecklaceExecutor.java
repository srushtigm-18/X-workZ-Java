class NecklaceExecutor {
    public static void main(String[] args) {
        Necklace n1 = new Necklace();
        n1.necklaceId = 1;
        n1.necklaceName = "Pearl Choker";
        n1.material = "Metal Alloy";
        n1.metalType = "Silver Plated";
        n1.stoneType = "Pearl";
        n1.weightInGrams = 12.0;
        n1.lengthInMM = 380;
        n1.color = "White";
        n1.brand = "Luxe Crafts";
        n1.countryOfOrigin = "India";
        n1.isAdjustable = true;
        n1.isWaterproof = false;
        n1.isHypoallergenic = true;
        n1.designTheme = "Elegant";
        n1.style = "Choker";
        n1.claspType = "Lobster Clasp";
        n1.finish = "Polished";
        n1.priceInInr = 2800;
        n1.warrantyStatus = "1 year";
        n1.isLimitedEdition = false;

        Necklace n2 = new Necklace();
        n2.necklaceId = 2;
        n2.necklaceName = "Ruby Pendant";
        n2.material = "Brass";
        n2.metalType = "Gold Plated";
        n2.stoneType = "Cubic Zirconia";
        n2.weightInGrams = 18.0;
        n2.lengthInMM = 420;
        n2.color = "Gold";
        n2.brand = "Sparkle Art";
        n2.countryOfOrigin = "India";
        n2.isAdjustable = false;
        n2.isWaterproof = false;
        n2.isHypoallergenic = false;
        n2.designTheme = "Traditional";
        n2.style = "Pendant";
        n2.claspType = "Spring Ring";
        n2.finish = "Matte";
        n2.priceInInr = 3700;
        n2.warrantyStatus = "None";
        n2.isLimitedEdition = true;

System.out.println("Necklace n1 (default) ID: " + n1.necklaceId +
                           " Name: " + n1.necklaceName +
                           " Material: " + n1.material +
                           " Metal: " + n1.metalType +
                           " Stone: " + n1.stoneType +
                           " Weight: " + n1.weightInGrams + " g" +
                           " Length: " + n1.lengthInMM + " mm" +
                           " Color: " + n1.color +
                           " Brand: " + n1.brand +
                           " Origin: " + n1.countryOfOrigin +
                           " Adjustable: " + n1.isAdjustable +
                           " Waterproof: " + n1.isWaterproof +
                           " Hypoallergenic: " + n1.isHypoallergenic +
                           " Theme: " + n1.designTheme +
                           " Style: " + n1.style +
                           " Clasp: " + n1.claspType +
                           " Finish: " + n1.finish +
                           " Price: " + n1.priceInInr +
                           " Warranty: " + n1.warrantyStatus +
                           " Limited: " + n1.isLimitedEdition);
System.out.println();

System.out.println("Necklace n2 (default) ID: " + n2.necklaceId +
                           " Name: " + n2.necklaceName +
                           " Material: " + n2.material +
                           " Metal: " + n2.metalType +
                           " Stone: " + n2.stoneType +
                           " Weight: " + n2.weightInGrams + " g" +
                           " Length: " + n2.lengthInMM + " mm" +
                           " Color: " + n2.color +
                           " Brand: " + n2.brand +
                           " Origin: " + n2.countryOfOrigin +
                           " Adjustable: " + n2.isAdjustable +
                           " Waterproof: " + n2.isWaterproof +
                           " Hypoallergenic: " + n2.isHypoallergenic +
                           " Theme: " + n2.designTheme +
                           " Style: " + n2.style +
                           " Clasp: " + n2.claspType +
                           " Finish: " + n2.finish +
                           " Price: " + n2.priceInInr +
                           " Warranty: " + n2.warrantyStatus +
                           " Limited: " + n2.isLimitedEdition);

 System.out.println("\n----------------------------------------------------------\n");

Necklace p1 = new Necklace(3, "Diamond Pendant", "Platinum", "Platinum", "Diamond", 5.5, 450, "White", "Elite Diamonds", "USA", false, false, true, "Luxury", "Pendant", "Spring Ring", "Polished", 45000, "Lifetime", true);

Necklace p2 = new Necklace(4, "Coral Charm", "Gold Alloy", "18K Gold", "Coral", 22.0, 400, "Red", "Royal Gems", "Italy", false, false, true, "Vintage", "Chain", "Lobster Clasp", "Polished", 18000, "2 years", false);


 System.out.println("Necklace p1 (parameterized) ID: " + p1.necklaceId +
                           " Name: " + p1.necklaceName +
                           " Material: " + p1.material +
                           " Metal: " + p1.metalType +
                           " Stone: " + p1.stoneType +
                           " Weight: " + p1.weightInGrams + " g" +
                           " Length: " + p1.lengthInMM + " mm" +
                           " Color: " + p1.color +
                           " Brand: " + p1.brand +
                           " Origin: " + p1.countryOfOrigin +
                           " Adjustable: " + p1.isAdjustable +
                           " Waterproof: " + p1.isWaterproof +
                           " Hypoallergenic: " + p1.isHypoallergenic +
                           " Theme: " + p1.designTheme +
                           " Style: " + p1.style +
                           " Clasp: " + p1.claspType +
                           " Finish: " + p1.finish +
                           " Price: " + p1.priceInInr +
                           " Warranty: " + p1.warrantyStatus +
                           " Limited: " + p1.isLimitedEdition);
System.out.println();

System.out.println("Necklace p2 (parameterized) ID: " + p2.necklaceId +
                           " Name: " + p2.necklaceName +
                           " Material: " + p2.material +
                           " Metal: " + p2.metalType +
                           " Stone: " + p2.stoneType +
                           " Weight: " + p2.weightInGrams + " g" +
                           " Length: " + p2.lengthInMM + " mm" +
                           " Color: " + p2.color +
                           " Brand: " + p2.brand +
                           " Origin: " + p2.countryOfOrigin +
                           " Adjustable: " + p2.isAdjustable +
                           " Waterproof: " + p2.isWaterproof +
                           " Hypoallergenic: " + p2.isHypoallergenic +
                           " Theme: " + p2.designTheme +
                           " Style: " + p2.style +
                           " Clasp: " + p2.claspType +
                           " Finish: " + p2.finish +
                           " Price: " + p2.priceInInr +
                           " Warranty: " + p2.warrantyStatus +
                           " Limited: " + p2.isLimitedEdition);

        System.out.println("\n----------------------------------------------------------");
    }
}
