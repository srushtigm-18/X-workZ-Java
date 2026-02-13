class JewelleryExecutor {
    public static void main(String[] args) {
        double price = Jewellery.getPrice();
        String brand = Jewellery.getBrand();
        String giftCardRedemptionType = Jewellery.getGiftCardRedemptionType();
        String giftCardValidityPeriod = Jewellery.getGiftCardValidityPeriod();
        
        String manufacturer = Jewellery.getManufacturer();
        String giftCardUsage = Jewellery.getGiftCardUsage();

        System.out.println("Jewellery price is: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Gift Card Redemption Type: " + giftCardRedemptionType);
        System.out.println("Gift Card Validity Period: " + giftCardValidityPeriod);
        
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Gift Card Usage: " + giftCardUsage);
    }
}
