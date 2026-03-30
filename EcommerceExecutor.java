class EcommerceExecutor {
    public static void main(String[] args) {
        Ecommerce ecommerce = new Ecommerce();

        ecommerce.addProduct("Smartphone");
        ecommerce.addProduct("Laptop");
        ecommerce.addProduct("Headphones");
        ecommerce.addProduct("Wireless Mouse");
        ecommerce.addProduct("Keyboard");
        ecommerce.addProduct("Monitor");
        ecommerce.addProduct("Webcam");
        ecommerce.addProduct("Router");
        ecommerce.addProduct("Smartwatch");
        ecommerce.addProduct("Bluetooth Speaker");
        ecommerce.addProduct("Power Bank");
        ecommerce.addProduct("USB Cable");
        ecommerce.addProduct("Mouse Pad");
        ecommerce.addProduct("Backpack");
        ecommerce.addProduct("LED Bulb");
        ecommerce.addProduct("Extension Board");
        ecommerce.addProduct("Printer");
        ecommerce.addProduct("TV");
        ecommerce.addProduct("Air Cooler");
        ecommerce.addProduct("Refrigerator");
        ecommerce.addProduct("Washing Machine");
        ecommerce.addProduct("Microwave");
        ecommerce.addProduct("Coffee Maker");
        ecommerce.addProduct("Electric Kettle");
        ecommerce.addProduct("Electric Iron");
        ecommerce.addProduct("Gaming Console");

        ecommerce.getProducts();
        System.out.println();

        int index = 8;
        String product = ecommerce.getProductByIndex(index);
		System.out.println("The product at index " + index + " is: " + product);
        System.out.println();

        String productName = "Refrigerator";
        int i = ecommerce.getIndexByProductName(productName);
        System.out.println("Product '" + productName + "' is at index: " + i);
        System.out.println();

        String updated = "Refrigerator (Double Door)";
        boolean ref = ecommerce.updateProduct("Refrigerator", updated);
        ecommerce.getProducts();
        System.out.println();

        String deleting = "Gaming Console";
        boolean reff = ecommerce.deleteProduct(deleting);
        ecommerce.getProducts();
    }
}
