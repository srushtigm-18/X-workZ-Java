class FoodExecutor {
    public static void main(String[] args) {
        boolean created1 = Food.createFood("Chicken Biryani", 
                                         "Hyderabadi", 
                                         320.0, 
                                         "25 mins", 
                                         "Medium");
        
        if (created1) {
            System.out.println("Chicken Biryani added to menu successfully!");
            Food.getFoodDetails();
        } else {
            System.out.println("Biryani addition failed!");
        }

     
        boolean created2 = Food.createFood("Masala Dosa", 
                                         "South Indian", 
                                         120.0, 
                                         "15 mins", 
                                         "Mild");
        
        if (created2) {
            System.out.println("Masala Dosa added to menu successfully!");
            Food.getFoodDetails();
        } else {
            System.out.println("Dosa addition failed!");
        }

    }
}
