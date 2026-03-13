class BraceletExecutor {
    public static void main(String[] args) {
       Bracelet b1 = new Bracelet();
        b1.braceletId = 1;
        b1.braceletName = "Silver Chain Bracelet";
        b1.material = "Alloy";
        b1.metalType = "Silver Plated";
        b1.stoneType = "No Stone";
        b1.weightInGrams = 15.0;
        b1.sizeInMM = 180;
        b1.color = "Silver";
        b1.brand = "Elite Jewelry";
        b1.countryOfOrigin = "India";
        b1.isAdjustable = true;
        b1.isWaterproof = false;
        b1.isHypoallergenic = true;
        b1.designTheme = "Minimal";
        b1.style = "Chain";
        b1.claspType = "Lobster Clasp";
        b1.finish = "Polished";
        b1.priceInRs = 2500;
        b1.warrantyStatus = "6 months";
        b1.isLimitedEdition = false;

        Bracelet b2 = new Bracelet();
        b2.braceletId = 2;
        b2.braceletName = "Ruby Bangles";
        b2.material = "Brass";
        b2.metalType = "Gold Plated";
        b2.stoneType = "Cubic Zirconia";
        b2.weightInGrams = 22.0;
        b2.sizeInMM = 160;
        b2.color = "Gold";
        b2.brand = "Sparkle Art";
        b2.countryOfOrigin = "India";
        b2.isAdjustable = false;
        b2.isWaterproof = false;
        b2.isHypoallergenic = false;
        b2.designTheme = "Traditional";
        b2.style = "Bangle";
        b2.claspType = "No Clasp";
        b2.finish = "Matte";
        b2.priceInRs = 4800;
        b2.warrantyStatus = "None";
        b2.isLimitedEdition = true;

        System.out.println("Bracelet b1 (default) ID: " + b1.braceletId +
                           " Name: " + b1.braceletName +
                           " Material: " + b1.material +
                           " Metal: " + b1.metalType +
                           " Stone: " + b1.stoneType +
                           " Weight: " + b1.weightInGrams + " g" +
                           " Size: " + b1.sizeInMM + " mm" +
                           " Color: " + b1.color +
                           " Brand: " + b1.brand +
                           " Origin: " + b1.countryOfOrigin +
                           " Adjustable: " + b1.isAdjustable +
                           " Waterproof: " + b1.isWaterproof +
                           " Hypoallergenic: " + b1.isHypoallergenic +
                           " Theme: " + b1.designTheme +
                           " Style: " + b1.style +
                           " Clasp: " + b1.claspType +
                           " Finish: " + b1.finish +
                           " Price: " + b1.priceInRs +
                           " Warranty: " + b1.warrantyStatus +
                           " Limited: " + b1.isLimitedEdition);

        System.out.println("Bracelet b2 (default) ID: " + b2.braceletId +
                           " Name: " + b2.braceletName +
                           " Material: " + b2.material +
                           " Metal: " + b2.metalType +
                           " Stone: " + b2.stoneType +
                           " Weight: " + b2.weightInGrams + " g" +
                           " Size: " + b2.sizeInMM + " mm" +
                           " Color: " + b2.color +
                           " Brand: " + b2.brand +
                           " Origin: " + b2.countryOfOrigin +
                           " Adjustable: " + b2.isAdjustable +
                           " Waterproof: " + b2.isWaterproof +
                           " Hypoallergenic: " + b2.isHypoallergenic +
                           " Theme: " + b2.designTheme +
                           " Style: " + b2.style +
                           " Clasp: " + b2.claspType +
                           " Finish: " + b2.finish +
                           " Price: " + b2.priceInRs +
                           " Warranty: " + b2.warrantyStatus +
                           " Limited: " + b2.isLimitedEdition);

        System.out.println("\n----------------------------------------------------------\n");

        Bracelet p1 = new Bracelet(3,"Pearl Bracelet","Metal Alloy","Silver Plated",
            "Pearl",18.5,170,"White","Luxe Crafts","India",true,
            false, true,"Elegant","Chain","Buckle","Polished",
            3200,"1 year",true);

        Bracelet p2 = new Bracelet(4,"Beach Wave Bracelet","Stainless Steel","Steel","None",12.0,190,"Silver","Ocean Gems","Sri Lanka",false,true,true,"Casual","Chain","Lobster Clasp", "Matte",1800,"Lifetime limited",false);

        System.out.println("Bracelet p1 (parameterized) ID: " + p1.braceletId +
                           " Name: " + p1.braceletName +
                           " Material: " + p1.material +
                           " Metal: " + p1.metalType +
                           " Stone: " + p1.stoneType +
                           " Weight: " + p1.weightInGrams + " g" +
                           " Size: " + p1.sizeInMM + " mm" +
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
                           " Price: " + p1.priceInRs +
                           " Warranty: " + p1.warrantyStatus +
                           " Limited: " + p1.isLimitedEdition);

        System.out.println("Bracelet p2 (parameterized) ID: " + p2.braceletId +
                           " Name: " + p2.braceletName +
                           " Material: " + p2.material +
                           " Metal: " + p2.metalType +
                           " Stone: " + p2.stoneType +
                           " Weight: " + p2.weightInGrams + " g" +
                           " Size: " + p2.sizeInMM + " mm" +
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
                           " Price: " + p2.priceInRs +
                           " Warranty: " + p2.warrantyStatus +
                           " Limited: " + p2.isLimitedEdition);

        System.out.println("\n----------------------------------------------------------");
    }
}
