class DoorLockExecutor {
    public static void main(String[] args) {
        double price = DoorLock.getPrice();
        String brand = DoorLock.getBrand();
        String specialFeature = DoorLock.getSpecialFeature();
        String lockType = DoorLock.getLockType();
        
        String itemDimensions = DoorLock.getItemDimensions();
        String material = DoorLock.getMaterial();

        System.out.println("Door Lock price is: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Special Feature: " + specialFeature);
        System.out.println("Lock Type: " + lockType);
        
        System.out.println("Item dimensions L x W x H: " + itemDimensions);
        System.out.println("Material: " + material);
    }
}
