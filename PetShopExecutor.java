class PetShopExecutor {
    public static void main(String[] args) {
        PetShop shop = new PetShop();

        shop.addAccessory("Dog Toy  Ball");
        shop.addAccessory("Chew Bone");
        shop.addAccessory("Pet Carrier");
        shop.addAccessory("Poop Bags");
        shop.addAccessory("Pet Mat");
        shop.addAccessory("Pet ID Tag");
        shop.addAccessory("Pet Sweater");
        shop.addAccessory("Pet Ramp");
        shop.addAccessory("Pet Steps");
        shop.addAccessory("Pet Mouth Guard");
        shop.addAccessory("Dog Leash");
        shop.addAccessory("Pet Collar");
        shop.addAccessory("Pet Harness");
        shop.addAccessory("Pet Bed");
        shop.addAccessory("Pet Bowl");
        shop.addAccessory("Water Bottle with Bowl");
        shop.addAccessory("Pet Grooming Brush");
        shop.addAccessory("Nail Clippers");
        shop.addAccessory("Pet Shampoo");
        shop.addAccessory("Dog Toy  Rope");

        shop.getAccessories();
        System.out.println();

        int index = 8;
        String acc = shop.getAccessoryNameByIndex(index);
        System.out.println("The accessory at index " + index + " is: " + acc);
        System.out.println();

        String accName = "Pet Shampoo";
        int i = shop.getIndexByAccessoryName(accName);
        System.out.println("Accessory '" + accName + "' is at index: " + i);
        System.out.println();

        String updated = "Pet Shampoo (Sensitive Skin)";
        boolean ref = shop.updateAccessory("Pet Shampoo", updated);
        shop.getAccessories();
        System.out.println();

        String deleting = "Pet Steps";
        boolean reff = shop.deleteAccessory(deleting);
        shop.getAccessories();
    }
}