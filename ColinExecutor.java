class ColinExecutor {
    public static void main(String[] args) {
        Colin order = new Colin();
        order.orderNumber = 303;
        order.orderTotal = 850.25;
        order.isCompleteOrder = false;
        order.isActiveOrder = true;
        order.orderDate = "03/03/2026";
        order.deliveryDate = "10/03/2026";
        order.isDelayed = false;

        System.out.println("Order Number: " + order.orderNumber);
        System.out.println("Order Total: " + order.orderTotal);
        System.out.println("Order Date: " + order.orderDate);
        System.out.println("Delivery Date: " + order.deliveryDate);
    }
}
