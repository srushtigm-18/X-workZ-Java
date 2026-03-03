class MatExecutor {
    public static void main(String[] args) {
        Mat mattress = new Mat();
        mattress.productNumber = 850;
        mattress.mattressPrice = 18999.99;
        mattress.antiSlipBase = true;
        mattress.available = true;
        mattress.deliveryDate = "10/03/2026";
        mattress.serviceEndDate = "10/03/2029";
        mattress.serviceActive = true;

        System.out.println("Product Number: " + mattress.productNumber);
        System.out.println("Mattress Price: " + mattress.mattressPrice);
        System.out.println("Delivery Date: " + mattress.deliveryDate);
        System.out.println("Service Ends: " + mattress.serviceEndDate);
    }
}