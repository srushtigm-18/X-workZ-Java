class Box8 {
    public static double search(String itemName) {
        double price = 0.0;
        
        if(itemName.equals("Amritsari Chole Thali")) {
            price = 207.00;
        } else if(itemName.equals("Paneer Tikka Masala Thali")) {
            price = 239.00;
        } else if(itemName.equals("Dilli Rajma Thali")) {
            price = 207.00;
        } else if(itemName.equals("Subz Kadhai Thali")) {
            price = 280.00;
        } else if(itemName.equals("Paneer Makhani Thali")) {
            price = 300.00;
        } else if(itemName.equals("Mushroom Masala Thali")) {
            price = 300.00;
        } else if(itemName.equals("Chicken Tikka Masala Thali")) {
            price = 300.00;
        } else if(itemName.equals("Kadhai Chicken Thali")) {
            price = 300.00;
        } else if(itemName.equals("Mutton Thali")) {
            price = 380.00;
        } else if(itemName.equals("Subz Khazana Biryani")) {
            price = 270.00;
        } else if(itemName.equals("Shahi Paneer Biryani")) {
            price = 300.00;
        } else if(itemName.equals("Murg Dum Biryani")) {
            price = 300.00;
        } else if(itemName.equals("Egg Dum Biryani")) {
            price = 250.00;
        } else if(itemName.equals("Chicken Tikka Biryani")) {
            price = 300.00;
        } else if(itemName.equals("Mutton Dum Biryani")) {
            price = 400.00;
        } else if(itemName.equals("Subz Kadhai Rice Bowl")) {
            price = 240.00;
        } else if(itemName.equals("Paneer Tikka Rice Bowl")) {
            price = 270.00;
        } else if(itemName.equals("Punjabi Kadhi Rice Bowl")) {
            price = 200.00;
        } else if(itemName.equals("Chicken Rice Bowl")) {
            price = 270.00;
        } else if(itemName.equals("Tandoori Chicken Wrap")) {
            price = 230.00;
        } else if(itemName.equals("Paneer Tikka Wrap")) {
            price = 220.00;
        } else if(itemName.equals("Spicy Chicken Mayo Wrap")) {
            price = 230.00;
        } else if(itemName.equals("Spicy Paneer Mayo Wrap")) {
            price = 220.00;
        } else if(itemName.equals("Spicy Mutton Bhuna Wrap")) {
            price = 300.00;
        } else if(itemName.equals("Tandoori Mushroom Wrap")) {
            price = 220.00;
        } else if(itemName.equals("Very Peri Chicken Wings")) {
            price = 230.00;
        } else if(itemName.equals("Tandoori Chicken Tangdi")) {
            price = 250.00;
        } else if(itemName.equals("Peri Peri Chicken Tikka")) {
            price = 290.00;
        } else if(itemName.equals("Tandoori Paneer Tikka")) {
            price = 240.00;
        } else if(itemName.equals("Veggie Delight Sandwich")) {
            price = 130.00;
        } else if(itemName.equals("Spicy Aloo Sandwich")) {
            price = 160.00;
        } else if(itemName.equals("Chicken Tikka Sandwich")) {
            price = 170.00;
        } else if(itemName.equals("Cheese Paneer Sandwich")) {
            price = 230.00;
        } else if(itemName.equals("Double Chicken Sandwich")) {
            price = 260.00;
        } else if(itemName.equals("Subz Kadhai Family Pack")) {
            price = 320.00;
        } else if(itemName.equals("Paneer Tikka Family Pack")) {
            price = 380.00;
        } else if(itemName.equals("Dal Makhani Family Pack")) {
            price = 220.00;
        } else if(itemName.equals("Ghee Dal Khichdi")) {
            price = 159.00;
        } else if(itemName.equals("Subz Handi Mini Meal")) {
            price = 240.00;
        } else if(itemName.equals("Paneer Lababdar Mini Meal")) {
            price = 260.00;
        } else if(itemName.equals("Chicken Mini Meal")) {
            price = 270.00;
        } else if(itemName.equals("Aloo Dum Roll")) {
            price = 160.00;
        } else if(itemName.equals("Peri Peri Aloo")) {
            price = 180.00;
        } else if(itemName.equals("Peri Peri Paneer Tikka")) {
            price = 240.00;
        } else if(itemName.equals("Teekha Meetha Wings")) {
            price = 230.00;
        } else if(itemName.equals("Tandoori Fiery Wings")) {
            price = 230.00;
        } else if(itemName.equals("Peri Peri Chicken Tangdi")) {
            price = 250.00;
        } else if(itemName.equals("Punjabi Kadhi Pakoda")) {
            price = 220.00;
        } else if(itemName.equals("Dilli Chaathouse Roll")) {
            price = 160.00;
        } else if(itemName.equals("Homestyle Egg Curry")) {
            price = 230.00;
        } else if(itemName.equals("Mughlai Chicken Thali")) {
            price = 300.00;
        } else if(itemName.equals("Chicken Labadar Thali")) {
            price = 300.00;
        } else {
            System.out.println("The searched item is not found");
            return 0.0;
        }
        return price;
    }
    
    public static double search(String foodItem, int quantity) {
        if(foodItem.equals("Amritsari Chole Thali")) {
            return 207.00 * quantity;
        } else if(foodItem.equals("Paneer Tikka Masala Thali")) {
            return 239.00 * quantity;
        } else if(foodItem.equals("Dilli Rajma Thali")) {
            return 207.00 * quantity;
        } else if(foodItem.equals("Subz Kadhai Thali")) {
            return 280.00 * quantity;
        } else if(foodItem.equals("Paneer Makhani Thali")) {
            return 300.00 * quantity;
        } else if(foodItem.equals("Mushroom Masala Thali")) {
            return 300.00 * quantity;
        } else if(foodItem.equals("Chicken Tikka Masala Thali")) {
            return 300.00 * quantity;
        } else if(foodItem.equals("Kadhai Chicken Thali")) {
            return 300.00 * quantity;
        } else if(foodItem.equals("Mutton Thali")) {
            return 380.00 * quantity;
        } else if(foodItem.equals("Subz Khazana Biryani")) {
            return 270.00 * quantity;
        } else if(foodItem.equals("Shahi Paneer Biryani")) {
            return 300.00 * quantity;
        } else if(foodItem.equals("Murg Dum Biryani")) {
            return 300.00 * quantity;
        } else if(foodItem.equals("Egg Dum Biryani")) {
            return 250.00 * quantity;
        } else if(foodItem.equals("Chicken Tikka Biryani")) {
            return 300.00 * quantity;
        } else if(foodItem.equals("Mutton Dum Biryani")) {
            return 400.00 * quantity;
        } else if(foodItem.equals("Subz Kadhai Rice Bowl")) {
            return 240.00 * quantity;
        } else if(foodItem.equals("Paneer Tikka Rice Bowl")) {
            return 270.00 * quantity;
        } else if(foodItem.equals("Punjabi Kadhi Rice Bowl")) {
            return 200.00 * quantity;
        } else if(foodItem.equals("Chicken Rice Bowl")) {
            return 270.00 * quantity;
        } else if(foodItem.equals("Tandoori Chicken Wrap")) {
            return 230.00 * quantity;
        } else if(foodItem.equals("Paneer Tikka Wrap")) {
            return 220.00 * quantity;
        } else if(foodItem.equals("Spicy Chicken Mayo Wrap")) {
            return 230.00 * quantity;
        } else if(foodItem.equals("Spicy Paneer Mayo Wrap")) {
            return 220.00 * quantity;
        } else if(foodItem.equals("Spicy Mutton Bhuna Wrap")) {
            return 300.00 * quantity;
        } else if(foodItem.equals("Tandoori Mushroom Wrap")) {
            return 220.00 * quantity;
        } else if(foodItem.equals("Very Peri Chicken Wings")) {
            return 230.00 * quantity;
        } else if(foodItem.equals("Tandoori Chicken Tangdi")) {
            return 250.00 * quantity;
        } else if(foodItem.equals("Peri Peri Chicken Tikka")) {
            return 290.00 * quantity;
        } else if(foodItem.equals("Tandoori Paneer Tikka")) {
            return 240.00 * quantity;
        } else if(foodItem.equals("Veggie Delight Sandwich")) {
            return 130.00 * quantity;
        } else if(foodItem.equals("Spicy Aloo Sandwich")) {
            return 160.00 * quantity;
        } else if(foodItem.equals("Chicken Tikka Sandwich")) {
            return 170.00 * quantity;
        } else if(foodItem.equals("Cheese Paneer Sandwich")) {
            return 230.00 * quantity;
        } else if(foodItem.equals("Double Chicken Sandwich")) {
            return 260.00 * quantity;
        } else if(foodItem.equals("Subz Kadhai Family Pack")) {
            return 320.00 * quantity;
        } else if(foodItem.equals("Paneer Tikka Family Pack")) {
            return 380.00 * quantity;
        } else if(foodItem.equals("Dal Makhani Family Pack")) {
            return 220.00 * quantity;
        } else if(foodItem.equals("Ghee Dal Khichdi")) {
            return 159.00 * quantity;
        } else if(foodItem.equals("Subz Handi Mini Meal")) {
            return 240.00 * quantity;
        } else if(foodItem.equals("Paneer Lababdar Mini Meal")) {
            return 260.00 * quantity;
        } else if(foodItem.equals("Chicken Mini Meal")) {
            return 270.00 * quantity;
        } else if(foodItem.equals("Aloo Dum Roll")) {
            return 160.00 * quantity;
        } else if(foodItem.equals("Peri Peri Aloo")) {
            return 180.00 * quantity;
        } else if(foodItem.equals("Peri Peri Paneer Tikka")) {
            return 240.00 * quantity;
        } else if(foodItem.equals("Teekha Meetha Wings")) {
            return 230.00 * quantity;
        } else if(foodItem.equals("Tandoori Fiery Wings")) {
            return 230.00 * quantity;
        } else if(foodItem.equals("Peri Peri Chicken Tangdi")) {
            return 250.00 * quantity;
        } else if(foodItem.equals("Punjabi Kadhi Pakoda")) {
            return 220.00 * quantity;
        } else if(foodItem.equals("Dilli Chaathouse Roll")) {
            return 160.00 * quantity;
        } else if(foodItem.equals("Homestyle Egg Curry")) {
            return 230.00 * quantity;
        } else if(foodItem.equals("Mughlai Chicken Thali")) {
            return 300.00 * quantity;
        } else if(foodItem.equals("Chicken Labadar Thali")) {
            return 300.00 * quantity;
        } else {
            System.out.println("The searched food item is not found");
            return 0.0;
        }
    }
}
