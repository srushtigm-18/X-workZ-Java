class PillowExecutor {
    public static void main(String[] args) {
        Pillow pillow = new Pillow();
        pillow.itemCode = 750;
        pillow.unitPrice = 1299.99;
        pillow.hypoAllergenic = true;
        pillow.inStock = true;
        pillow.purchaseDate = "25/02/2026";
        pillow.warrantyEnd = "25/02/2028";
        pillow.warrantyValid = true;

        System.out.println("Item Code: " + pillow.itemCode);
        System.out.println("Unit Price:" + pillow.unitPrice);
        System.out.println("Purchase Date: " + pillow.purchaseDate);
        System.out.println("Warranty Ends: " + pillow.warrantyEnd);
    }
}